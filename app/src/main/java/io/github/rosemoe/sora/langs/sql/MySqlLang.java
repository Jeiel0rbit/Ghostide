package io.github.rosemoe.sora.langs.sql;

import io.github.rosemoe.sora.interfaces.AutoCompleteProvider;
import io.github.rosemoe.sora.interfaces.CodeAnalyzer;
import io.github.rosemoe.sora.interfaces.EditorLanguage;
import io.github.rosemoe.sora.widget.SymbolPairMatch;
import io.github.rosemoe.sora.interfaces.NewlineHandler;

public class MySqlLang implements EditorLanguage {

  @Override
  public CharSequence format(CharSequence text) {
    try {
      return JSQLFormatter.format(text.toString());
    } catch (Exception err) {
      
    }
    return text;
  }

  @Override
  public CodeAnalyzer getAnalyzer() {
    return new MySqlCodeAnalyzer();
  }

  @Override
  public AutoCompleteProvider getAutoCompleteProvider() {
    return null;
  }

  @Override
  public int getIndentAdvance(String content) {
    return 0;
  }

  @Override
  public NewlineHandler[] getNewlineHandlers() {
    return null;
  }

  @Override
  public SymbolPairMatch getSymbolPairs() {
    return new SymbolPairMatch.DefaultSymbolPairs();
  }

  @Override
  public boolean isAutoCompleteChar(char ch) {
    return false;
  }

  @Override
  public boolean useTab() {
    return true;
  }
}
