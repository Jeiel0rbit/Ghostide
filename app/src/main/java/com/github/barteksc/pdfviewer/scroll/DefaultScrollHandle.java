package com.github.barteksc.pdfviewer.scroll;

import android.content.res.ColorStateList;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.shape.CornerFamily;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
//import pdf.view.R;
import ir.ninjacoder.ghostide.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.util.Util;

import static com.google.android.material.R.attr.colorSurface;
import static com.google.android.material.R.attr.colorOnPrimary;
import static com.google.android.material.R.attr.colorPrimary;

public class DefaultScrollHandle extends RelativeLayout implements ScrollHandle {

    private final static int HANDLE_LONG = 65;
    private final static int HANDLE_SHORT = 40;
    private final static int DEFAULT_TEXT_SIZE = 16;
    protected TextView textView;
    protected Context context;
    private float relativeHandlerMiddle = 0f;
    private boolean inverted;
    private PDFView pdfView;
    private float currentPos;

    private Handler handler = new Handler();
    private Runnable hidePageScrollerRunnable = new Runnable() {
        @Override
        public void run() {
            hide();
        }
    };

    public DefaultScrollHandle(Context context) {
        this(context, false);
    }

    public DefaultScrollHandle(Context context, boolean inverted) {
        super(context);
        this.context = context;
        this.inverted = inverted;
        textView = new TextView(context);
        setVisibility(INVISIBLE);
        setTextColor(MaterialColors.getColor(textView, colorPrimary));
        setTextSize(DEFAULT_TEXT_SIZE);
    }

    @Override
    public void setupLayout(PDFView pdfView) {
        int align, width, height;
        Drawable background;
        // determine handler position, default is right (when scrolling vertically) or bottom (when scrolling horizontally)
        if (pdfView.isSwipeVertical()) {
            width = HANDLE_LONG;
            height = HANDLE_SHORT;
            if (inverted) { // left
                align = ALIGN_PARENT_LEFT;
                background = ContextCompat.getDrawable(context, R.drawable.default_scroll_handle_left);
            } else { // right
                align = ALIGN_PARENT_RIGHT;
                background = ContextCompat.getDrawable(context, R.drawable.default_scroll_handle_right);
            }
        } else {
            width = HANDLE_SHORT;
            height = HANDLE_LONG;
            if (inverted) { // top
                align = ALIGN_PARENT_TOP;
                background = ContextCompat.getDrawable(context, R.drawable.default_scroll_handle_top);
            } else { // bottom

                align = ALIGN_PARENT_BOTTOM;
                background = ContextCompat.getDrawable(context, R.drawable.default_scroll_handle_bottom);
            }
        }
        var shaps = new MaterialShapeDrawable(ShapeAppearanceModel.builder().setTopLeftCorner(CornerFamily.ROUNDED, 30f).setBottomLeftCorner(CornerFamily.ROUNDED, 30f).build());
        shaps.setFillColor(ColorStateList.valueOf(MaterialColors.getColor(getContext(), colorSurface, 0)));
        shaps.setStroke(2, ColorStateList.valueOf(MaterialColors.getColor(getContext(), colorPrimary, 0)));
        setBackground(shaps);

        LayoutParams lp = new LayoutParams(Util.getDP(context, width), Util.getDP(context, height));
        lp.setMargins(0, 0, 0, 0);

        LayoutParams tvlp = new LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        tvlp.addRule(RelativeLayout.CENTER_IN_PARENT, RelativeLayout.TRUE);

        addView(textView, tvlp);

        lp.addRule(align);
        pdfView.addView(this, lp);

        this.pdfView = pdfView;
    }

    @Override
    public void destroyLayout() {
        pdfView.removeView(this);
    }

    @Override
    public void setScroll(float position) {
        if (!shown()) {
            show();
        } else {
            handler.removeCallbacks(hidePageScrollerRunnable);
        }
        setPosition((pdfView.isSwipeVertical() ? pdfView.getHeight() : pdfView.getWidth()) * position);
    }

    private void setPosition(float pos) {
        if (Float.isInfinite(pos) || Float.isNaN(pos)) {
            return;
        }
        float pdfViewSize;
        if (pdfView.isSwipeVertical()) {
            pdfViewSize = pdfView.getHeight();
        } else {
            pdfViewSize = pdfView.getWidth();
        }
        pos -= relativeHandlerMiddle;

        if (pos < 0) {
            pos = 0;
        } else if (pos > pdfViewSize - Util.getDP(context, HANDLE_SHORT)) {
            pos = pdfViewSize - Util.getDP(context, HANDLE_SHORT);
        }

        if (pdfView.isSwipeVertical()) {
            setY(pos);
        } else {
            setX(pos);
        }

        calculateMiddle();
        invalidate();
    }

    private void calculateMiddle() {
        float pos, viewSize, pdfViewSize;
        if (pdfView.isSwipeVertical()) {
            pos = getY();
            viewSize = getHeight();
            pdfViewSize = pdfView.getHeight();
        } else {
            pos = getX();
            viewSize = getWidth();
            pdfViewSize = pdfView.getWidth();
        }
        relativeHandlerMiddle = ((pos + relativeHandlerMiddle) / pdfViewSize) * viewSize;
    }

    @Override
    public void hideDelayed() {
        handler.postDelayed(hidePageScrollerRunnable, 1000);
    }

    @Override
    public void setPageNum(int pageNum) {
        String text = String.valueOf(pageNum);
        if (!textView.getText().equals(text)) {
            textView.setText(text);
        }
    }

    @Override
    public boolean shown() {
        return getVisibility() == VISIBLE;
    }

    @Override
    public void show() {
        setVisibility(VISIBLE);
    }

    @Override
    public void hide() {
        setVisibility(INVISIBLE);
    }

    public void setTextColor(int color) {
        textView.setTextColor(color);
    }

    /**
     * @param size text size in dp
     */
    public void setTextSize(int size) {
        textView.setTextSize(TypedValue.COMPLEX_UNIT_DIP, size);
    }

    private boolean isPDFViewReady() {
        return pdfView != null && pdfView.getPageCount() > 0 && !pdfView.documentFitsView();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        if (!isPDFViewReady()) {
            return super.onTouchEvent(event);
        }

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
            case MotionEvent.ACTION_POINTER_DOWN:
                pdfView.stopFling();
                handler.removeCallbacks(hidePageScrollerRunnable);
                if (pdfView.isSwipeVertical()) {
                    currentPos = event.getRawY() - getY();
                } else {
                    currentPos = event.getRawX() - getX();
                }
            case MotionEvent.ACTION_MOVE:
                if (pdfView.isSwipeVertical()) {
                    setPosition(event.getRawY() - currentPos + relativeHandlerMiddle);
                    pdfView.setPositionOffset(relativeHandlerMiddle / (float) getHeight(), false);
                } else {
                    setPosition(event.getRawX() - currentPos + relativeHandlerMiddle);
                    pdfView.setPositionOffset(relativeHandlerMiddle / (float) getWidth(), false);
                }
                return true;
            case MotionEvent.ACTION_CANCEL:
            case MotionEvent.ACTION_UP:
            case MotionEvent.ACTION_POINTER_UP:
                hideDelayed();
                return true;
        }

        return super.onTouchEvent(event);
    }
}
