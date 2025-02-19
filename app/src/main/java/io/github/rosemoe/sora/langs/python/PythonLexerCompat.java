// Generated from /storage/emulated/0/AndroidIDEProjects/Ghost-web-ide2/app/src/main/java/io/github/rosemoe/sora/langs/python/PythonLexerCompat.g4 by ANTLR 4.13.1
package io.github.rosemoe.sora.langs.python;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class PythonLexerCompat extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LPAR=1, LSQB=2, LBRACE=3, RPAR=4, RSQB=5, RBRACE=6, DOT=7, COLON=8, COMMA=9, 
		SEMI=10, PLUS=11, MINUS=12, STAR=13, SLASH=14, VBAR=15, AMPER=16, LESS=17, 
		GREATER=18, EQUAL=19, PERCENT=20, EQEQUAL=21, NOTEQUAL=22, LESSEQUAL=23, 
		GREATEREQUAL=24, TILDE=25, CIRCUMFLEX=26, LEFTSHIFT=27, RIGHTSHIFT=28, 
		DOUBLESTAR=29, PLUSEQUAL=30, MINEQUAL=31, STAREQUAL=32, SLASHEQUAL=33, 
		PERCENTEQUAL=34, AMPEREQUAL=35, VBAREQUAL=36, CIRCUMFLEXEQUAL=37, LEFTSHIFTEQUAL=38, 
		RIGHTSHIFTEQUAL=39, DOUBLESTAREQUAL=40, DOUBLESLASH=41, DOUBLESLASHEQUAL=42, 
		AT=43, ATEQUAL=44, RARROW=45, ELLIPSIS=46, COLONEQUAL=47, EXCLAMATION=48, 
		FALSE=49, AWAIT=50, ELSE=51, IMPORT=52, PASS=53, NONE=54, BREAK=55, EXCEPT=56, 
		IN=57, RAISE=58, TRUE=59, CLASS=60, FINALLY=61, IS=62, RETURN=63, AND=64, 
		CONTINUE=65, FOR=66, LAMBDA=67, TRY=68, AS=69, DEF=70, FROM=71, NONLOCAL=72, 
		WHILE=73, ASSERT=74, DEL=75, GLOBAL=76, NOT=77, WITH=78, ASYNC=79, ELIF=80, 
		IF=81, OR=82, YIELD=83, NAME_OR_TYPE=84, NAME_OR_MATCH=85, NAME_OR_CASE=86, 
		NAME_OR_WILDCARD=87, STRING=88, NUMBER=89, FSTRING=90, NEWLINE=91, COMMENT=92, 
		WS=93, ERRORTOKEN=94, IDENTIFIER=95;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LPAR", "LSQB", "LBRACE", "RPAR", "RSQB", "RBRACE", "DOT", "COLON", "COMMA", 
			"SEMI", "PLUS", "MINUS", "STAR", "SLASH", "VBAR", "AMPER", "LESS", "GREATER", 
			"EQUAL", "PERCENT", "EQEQUAL", "NOTEQUAL", "LESSEQUAL", "GREATEREQUAL", 
			"TILDE", "CIRCUMFLEX", "LEFTSHIFT", "RIGHTSHIFT", "DOUBLESTAR", "PLUSEQUAL", 
			"MINEQUAL", "STAREQUAL", "SLASHEQUAL", "PERCENTEQUAL", "AMPEREQUAL", 
			"VBAREQUAL", "CIRCUMFLEXEQUAL", "LEFTSHIFTEQUAL", "RIGHTSHIFTEQUAL", 
			"DOUBLESTAREQUAL", "DOUBLESLASH", "DOUBLESLASHEQUAL", "AT", "ATEQUAL", 
			"RARROW", "ELLIPSIS", "COLONEQUAL", "EXCLAMATION", "FALSE", "AWAIT", 
			"ELSE", "IMPORT", "PASS", "NONE", "BREAK", "EXCEPT", "IN", "RAISE", "TRUE", 
			"CLASS", "FINALLY", "IS", "RETURN", "AND", "CONTINUE", "FOR", "LAMBDA", 
			"TRY", "AS", "DEF", "FROM", "NONLOCAL", "WHILE", "ASSERT", "DEL", "GLOBAL", 
			"NOT", "WITH", "ASYNC", "ELIF", "IF", "OR", "YIELD", "NAME_OR_TYPE", 
			"NAME_OR_MATCH", "NAME_OR_CASE", "NAME_OR_WILDCARD", "STRING", "Digits", 
			"NUMBER", "FSTRING", "NEWLINE", "COMMENT", "WS", "ERRORTOKEN", "IDENTIFIER", 
			"LetterOrDigit", "Letter"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "'['", "'{'", "')'", "']'", "'}'", "'.'", "':'", "','", 
			"';'", "'+'", "'-'", "'*'", "'/'", "'|'", "'&'", "'<'", "'>'", "'='", 
			"'%'", "'=='", "'!='", "'<='", "'>='", "'~'", "'^'", "'<<'", "'>>'", 
			"'**'", "'+='", "'-='", "'*='", "'/='", "'%='", "'&='", "'|='", "'^='", 
			"'<<='", "'>>='", "'**='", "'//'", "'//='", "'@'", "'@='", "'->'", "'...'", 
			"':='", "'!'", "'False'", "'await'", "'else'", "'import'", "'pass'", 
			"'None'", "'break'", "'except'", "'in'", "'raise'", "'True'", "'class'", 
			"'finally'", "'is'", "'return'", "'and'", "'continue'", "'for'", "'lambda'", 
			"'try'", "'as'", "'def'", "'from'", "'nonlocal'", "'while'", "'assert'", 
			"'del'", "'global'", "'not'", "'with'", "'async'", "'elif'", "'if'", 
			"'or'", "'yield'", "'type'", "'match'", "'case'", "'_'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LPAR", "LSQB", "LBRACE", "RPAR", "RSQB", "RBRACE", "DOT", "COLON", 
			"COMMA", "SEMI", "PLUS", "MINUS", "STAR", "SLASH", "VBAR", "AMPER", "LESS", 
			"GREATER", "EQUAL", "PERCENT", "EQEQUAL", "NOTEQUAL", "LESSEQUAL", "GREATEREQUAL", 
			"TILDE", "CIRCUMFLEX", "LEFTSHIFT", "RIGHTSHIFT", "DOUBLESTAR", "PLUSEQUAL", 
			"MINEQUAL", "STAREQUAL", "SLASHEQUAL", "PERCENTEQUAL", "AMPEREQUAL", 
			"VBAREQUAL", "CIRCUMFLEXEQUAL", "LEFTSHIFTEQUAL", "RIGHTSHIFTEQUAL", 
			"DOUBLESTAREQUAL", "DOUBLESLASH", "DOUBLESLASHEQUAL", "AT", "ATEQUAL", 
			"RARROW", "ELLIPSIS", "COLONEQUAL", "EXCLAMATION", "FALSE", "AWAIT", 
			"ELSE", "IMPORT", "PASS", "NONE", "BREAK", "EXCEPT", "IN", "RAISE", "TRUE", 
			"CLASS", "FINALLY", "IS", "RETURN", "AND", "CONTINUE", "FOR", "LAMBDA", 
			"TRY", "AS", "DEF", "FROM", "NONLOCAL", "WHILE", "ASSERT", "DEL", "GLOBAL", 
			"NOT", "WITH", "ASYNC", "ELIF", "IF", "OR", "YIELD", "NAME_OR_TYPE", 
			"NAME_OR_MATCH", "NAME_OR_CASE", "NAME_OR_WILDCARD", "STRING", "NUMBER", 
			"FSTRING", "NEWLINE", "COMMENT", "WS", "ERRORTOKEN", "IDENTIFIER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public PythonLexerCompat(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PythonLexerCompat.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000_\u0281\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u0007"+
		"5\u00026\u00076\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007"+
		":\u0002;\u0007;\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007"+
		"?\u0002@\u0007@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007"+
		"D\u0002E\u0007E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007"+
		"I\u0002J\u0007J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007"+
		"N\u0002O\u0007O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007"+
		"S\u0002T\u0007T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007"+
		"X\u0002Y\u0007Y\u0002Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007"+
		"]\u0002^\u0007^\u0002_\u0007_\u0002`\u0007`\u0002a\u0007a\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001"+
		"!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001$\u0001"+
		"$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001"+
		")\u0001*\u0001*\u0001+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001-\u0001"+
		"-\u0001-\u0001-\u0001.\u0001.\u0001.\u0001/\u0001/\u00010\u00010\u0001"+
		"0\u00010\u00010\u00010\u00011\u00011\u00011\u00011\u00011\u00011\u0001"+
		"2\u00012\u00012\u00012\u00012\u00013\u00013\u00013\u00013\u00013\u0001"+
		"3\u00013\u00014\u00014\u00014\u00014\u00014\u00015\u00015\u00015\u0001"+
		"5\u00015\u00016\u00016\u00016\u00016\u00016\u00016\u00017\u00017\u0001"+
		"7\u00017\u00017\u00017\u00017\u00018\u00018\u00018\u00019\u00019\u0001"+
		"9\u00019\u00019\u00019\u0001:\u0001:\u0001:\u0001:\u0001:\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001<\u0001<\u0001<\u0001<\u0001<\u0001"+
		"<\u0001<\u0001<\u0001=\u0001=\u0001=\u0001>\u0001>\u0001>\u0001>\u0001"+
		">\u0001>\u0001>\u0001?\u0001?\u0001?\u0001?\u0001@\u0001@\u0001@\u0001"+
		"@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001A\u0001A\u0001A\u0001A\u0001"+
		"B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001C\u0001C\u0001C\u0001"+
		"C\u0001D\u0001D\u0001D\u0001E\u0001E\u0001E\u0001E\u0001F\u0001F\u0001"+
		"F\u0001F\u0001F\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001I\u0001I\u0001"+
		"I\u0001I\u0001I\u0001I\u0001I\u0001J\u0001J\u0001J\u0001J\u0001K\u0001"+
		"K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001L\u0001L\u0001L\u0001L\u0001"+
		"M\u0001M\u0001M\u0001M\u0001M\u0001N\u0001N\u0001N\u0001N\u0001N\u0001"+
		"N\u0001O\u0001O\u0001O\u0001O\u0001O\u0001P\u0001P\u0001P\u0001Q\u0001"+
		"Q\u0001Q\u0001R\u0001R\u0001R\u0001R\u0001R\u0001R\u0001S\u0001S\u0001"+
		"S\u0001S\u0001S\u0001T\u0001T\u0001T\u0001T\u0001T\u0001T\u0001U\u0001"+
		"U\u0001U\u0001U\u0001U\u0001V\u0001V\u0001W\u0001W\u0005W\u0215\bW\nW"+
		"\fW\u0218\tW\u0001W\u0001W\u0001W\u0001W\u0001W\u0001W\u0005W\u0220\b"+
		"W\nW\fW\u0223\tW\u0001W\u0001W\u0001W\u0001W\u0001W\u0001W\u0001W\u0001"+
		"W\u0005W\u022d\bW\nW\fW\u0230\tW\u0001W\u0001W\u0001W\u0001W\u0001W\u0005"+
		"W\u0237\bW\nW\fW\u023a\tW\u0001W\u0003W\u023d\bW\u0001X\u0001X\u0005X"+
		"\u0241\bX\nX\fX\u0244\tX\u0001X\u0003X\u0247\bX\u0001Y\u0001Y\u0001Z\u0001"+
		"Z\u0001Z\u0005Z\u024e\bZ\nZ\fZ\u0251\tZ\u0001Z\u0001Z\u0001Z\u0001Z\u0001"+
		"Z\u0001Z\u0001Z\u0001[\u0003[\u025b\b[\u0001[\u0001[\u0001\\\u0001\\\u0005"+
		"\\\u0261\b\\\n\\\f\\\u0264\t\\\u0001\\\u0001\\\u0001]\u0004]\u0269\b]"+
		"\u000b]\f]\u026a\u0001]\u0001]\u0001^\u0001^\u0001_\u0001_\u0005_\u0273"+
		"\b_\n_\f_\u0276\t_\u0001`\u0001`\u0003`\u027a\b`\u0001a\u0001a\u0001a"+
		"\u0001a\u0003a\u0280\ba\u0005\u0216\u0221\u022e\u0238\u024f\u0000b\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/"+
		"\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f? A!C\"E#G$I%K"+
		"&M\'O(Q)S*U+W,Y-[.]/_0a1c2e3g4i5k6m7o8q9s:u;w<y={>}?\u007f@\u0081A\u0083"+
		"B\u0085C\u0087D\u0089E\u008bF\u008dG\u008fH\u0091I\u0093J\u0095K\u0097"+
		"L\u0099M\u009bN\u009dO\u009fP\u00a1Q\u00a3R\u00a5S\u00a7T\u00a9U\u00ab"+
		"V\u00adW\u00afX\u00b1\u0000\u00b3Y\u00b5Z\u00b7[\u00b9\\\u00bb]\u00bd"+
		"^\u00bf_\u00c1\u0000\u00c3\u0000\u0001\u0000\b\u0001\u000009\u0002\u0000"+
		"09__\u0002\u0000\n\n\r\r\u0003\u0000\t\t\f\f  \u0002\u0000AZaz\u0002\u0000"+
		"\u0000\u007f\u8000\ud800\u8000\udbff\u0001\u0000\u8000\ud800\u8000\udbff"+
		"\u0001\u0000\u8000\udc00\u8000\udfff\u028e\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001"+
		"\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000"+
		"\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000"+
		"\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001"+
		"\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000"+
		"\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000"+
		"\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?"+
		"\u0001\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000"+
		"\u0000\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000"+
		"\u0000I\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000\u0000M"+
		"\u0001\u0000\u0000\u0000\u0000O\u0001\u0000\u0000\u0000\u0000Q\u0001\u0000"+
		"\u0000\u0000\u0000S\u0001\u0000\u0000\u0000\u0000U\u0001\u0000\u0000\u0000"+
		"\u0000W\u0001\u0000\u0000\u0000\u0000Y\u0001\u0000\u0000\u0000\u0000["+
		"\u0001\u0000\u0000\u0000\u0000]\u0001\u0000\u0000\u0000\u0000_\u0001\u0000"+
		"\u0000\u0000\u0000a\u0001\u0000\u0000\u0000\u0000c\u0001\u0000\u0000\u0000"+
		"\u0000e\u0001\u0000\u0000\u0000\u0000g\u0001\u0000\u0000\u0000\u0000i"+
		"\u0001\u0000\u0000\u0000\u0000k\u0001\u0000\u0000\u0000\u0000m\u0001\u0000"+
		"\u0000\u0000\u0000o\u0001\u0000\u0000\u0000\u0000q\u0001\u0000\u0000\u0000"+
		"\u0000s\u0001\u0000\u0000\u0000\u0000u\u0001\u0000\u0000\u0000\u0000w"+
		"\u0001\u0000\u0000\u0000\u0000y\u0001\u0000\u0000\u0000\u0000{\u0001\u0000"+
		"\u0000\u0000\u0000}\u0001\u0000\u0000\u0000\u0000\u007f\u0001\u0000\u0000"+
		"\u0000\u0000\u0081\u0001\u0000\u0000\u0000\u0000\u0083\u0001\u0000\u0000"+
		"\u0000\u0000\u0085\u0001\u0000\u0000\u0000\u0000\u0087\u0001\u0000\u0000"+
		"\u0000\u0000\u0089\u0001\u0000\u0000\u0000\u0000\u008b\u0001\u0000\u0000"+
		"\u0000\u0000\u008d\u0001\u0000\u0000\u0000\u0000\u008f\u0001\u0000\u0000"+
		"\u0000\u0000\u0091\u0001\u0000\u0000\u0000\u0000\u0093\u0001\u0000\u0000"+
		"\u0000\u0000\u0095\u0001\u0000\u0000\u0000\u0000\u0097\u0001\u0000\u0000"+
		"\u0000\u0000\u0099\u0001\u0000\u0000\u0000\u0000\u009b\u0001\u0000\u0000"+
		"\u0000\u0000\u009d\u0001\u0000\u0000\u0000\u0000\u009f\u0001\u0000\u0000"+
		"\u0000\u0000\u00a1\u0001\u0000\u0000\u0000\u0000\u00a3\u0001\u0000\u0000"+
		"\u0000\u0000\u00a5\u0001\u0000\u0000\u0000\u0000\u00a7\u0001\u0000\u0000"+
		"\u0000\u0000\u00a9\u0001\u0000\u0000\u0000\u0000\u00ab\u0001\u0000\u0000"+
		"\u0000\u0000\u00ad\u0001\u0000\u0000\u0000\u0000\u00af\u0001\u0000\u0000"+
		"\u0000\u0000\u00b3\u0001\u0000\u0000\u0000\u0000\u00b5\u0001\u0000\u0000"+
		"\u0000\u0000\u00b7\u0001\u0000\u0000\u0000\u0000\u00b9\u0001\u0000\u0000"+
		"\u0000\u0000\u00bb\u0001\u0000\u0000\u0000\u0000\u00bd\u0001\u0000\u0000"+
		"\u0000\u0000\u00bf\u0001\u0000\u0000\u0000\u0001\u00c5\u0001\u0000\u0000"+
		"\u0000\u0003\u00c7\u0001\u0000\u0000\u0000\u0005\u00c9\u0001\u0000\u0000"+
		"\u0000\u0007\u00cb\u0001\u0000\u0000\u0000\t\u00cd\u0001\u0000\u0000\u0000"+
		"\u000b\u00cf\u0001\u0000\u0000\u0000\r\u00d1\u0001\u0000\u0000\u0000\u000f"+
		"\u00d3\u0001\u0000\u0000\u0000\u0011\u00d5\u0001\u0000\u0000\u0000\u0013"+
		"\u00d7\u0001\u0000\u0000\u0000\u0015\u00d9\u0001\u0000\u0000\u0000\u0017"+
		"\u00db\u0001\u0000\u0000\u0000\u0019\u00dd\u0001\u0000\u0000\u0000\u001b"+
		"\u00df\u0001\u0000\u0000\u0000\u001d\u00e1\u0001\u0000\u0000\u0000\u001f"+
		"\u00e3\u0001\u0000\u0000\u0000!\u00e5\u0001\u0000\u0000\u0000#\u00e7\u0001"+
		"\u0000\u0000\u0000%\u00e9\u0001\u0000\u0000\u0000\'\u00eb\u0001\u0000"+
		"\u0000\u0000)\u00ed\u0001\u0000\u0000\u0000+\u00f0\u0001\u0000\u0000\u0000"+
		"-\u00f3\u0001\u0000\u0000\u0000/\u00f6\u0001\u0000\u0000\u00001\u00f9"+
		"\u0001\u0000\u0000\u00003\u00fb\u0001\u0000\u0000\u00005\u00fd\u0001\u0000"+
		"\u0000\u00007\u0100\u0001\u0000\u0000\u00009\u0103\u0001\u0000\u0000\u0000"+
		";\u0106\u0001\u0000\u0000\u0000=\u0109\u0001\u0000\u0000\u0000?\u010c"+
		"\u0001\u0000\u0000\u0000A\u010f\u0001\u0000\u0000\u0000C\u0112\u0001\u0000"+
		"\u0000\u0000E\u0115\u0001\u0000\u0000\u0000G\u0118\u0001\u0000\u0000\u0000"+
		"I\u011b\u0001\u0000\u0000\u0000K\u011e\u0001\u0000\u0000\u0000M\u0122"+
		"\u0001\u0000\u0000\u0000O\u0126\u0001\u0000\u0000\u0000Q\u012a\u0001\u0000"+
		"\u0000\u0000S\u012d\u0001\u0000\u0000\u0000U\u0131\u0001\u0000\u0000\u0000"+
		"W\u0133\u0001\u0000\u0000\u0000Y\u0136\u0001\u0000\u0000\u0000[\u0139"+
		"\u0001\u0000\u0000\u0000]\u013d\u0001\u0000\u0000\u0000_\u0140\u0001\u0000"+
		"\u0000\u0000a\u0142\u0001\u0000\u0000\u0000c\u0148\u0001\u0000\u0000\u0000"+
		"e\u014e\u0001\u0000\u0000\u0000g\u0153\u0001\u0000\u0000\u0000i\u015a"+
		"\u0001\u0000\u0000\u0000k\u015f\u0001\u0000\u0000\u0000m\u0164\u0001\u0000"+
		"\u0000\u0000o\u016a\u0001\u0000\u0000\u0000q\u0171\u0001\u0000\u0000\u0000"+
		"s\u0174\u0001\u0000\u0000\u0000u\u017a\u0001\u0000\u0000\u0000w\u017f"+
		"\u0001\u0000\u0000\u0000y\u0185\u0001\u0000\u0000\u0000{\u018d\u0001\u0000"+
		"\u0000\u0000}\u0190\u0001\u0000\u0000\u0000\u007f\u0197\u0001\u0000\u0000"+
		"\u0000\u0081\u019b\u0001\u0000\u0000\u0000\u0083\u01a4\u0001\u0000\u0000"+
		"\u0000\u0085\u01a8\u0001\u0000\u0000\u0000\u0087\u01af\u0001\u0000\u0000"+
		"\u0000\u0089\u01b3\u0001\u0000\u0000\u0000\u008b\u01b6\u0001\u0000\u0000"+
		"\u0000\u008d\u01ba\u0001\u0000\u0000\u0000\u008f\u01bf\u0001\u0000\u0000"+
		"\u0000\u0091\u01c8\u0001\u0000\u0000\u0000\u0093\u01ce\u0001\u0000\u0000"+
		"\u0000\u0095\u01d5\u0001\u0000\u0000\u0000\u0097\u01d9\u0001\u0000\u0000"+
		"\u0000\u0099\u01e0\u0001\u0000\u0000\u0000\u009b\u01e4\u0001\u0000\u0000"+
		"\u0000\u009d\u01e9\u0001\u0000\u0000\u0000\u009f\u01ef\u0001\u0000\u0000"+
		"\u0000\u00a1\u01f4\u0001\u0000\u0000\u0000\u00a3\u01f7\u0001\u0000\u0000"+
		"\u0000\u00a5\u01fa\u0001\u0000\u0000\u0000\u00a7\u0200\u0001\u0000\u0000"+
		"\u0000\u00a9\u0205\u0001\u0000\u0000\u0000\u00ab\u020b\u0001\u0000\u0000"+
		"\u0000\u00ad\u0210\u0001\u0000\u0000\u0000\u00af\u023c\u0001\u0000\u0000"+
		"\u0000\u00b1\u023e\u0001\u0000\u0000\u0000\u00b3\u0248\u0001\u0000\u0000"+
		"\u0000\u00b5\u024a\u0001\u0000\u0000\u0000\u00b7\u025a\u0001\u0000\u0000"+
		"\u0000\u00b9\u025e\u0001\u0000\u0000\u0000\u00bb\u0268\u0001\u0000\u0000"+
		"\u0000\u00bd\u026e\u0001\u0000\u0000\u0000\u00bf\u0270\u0001\u0000\u0000"+
		"\u0000\u00c1\u0279\u0001\u0000\u0000\u0000\u00c3\u027f\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c6\u0005(\u0000\u0000\u00c6\u0002\u0001\u0000\u0000\u0000"+
		"\u00c7\u00c8\u0005[\u0000\u0000\u00c8\u0004\u0001\u0000\u0000\u0000\u00c9"+
		"\u00ca\u0005{\u0000\u0000\u00ca\u0006\u0001\u0000\u0000\u0000\u00cb\u00cc"+
		"\u0005)\u0000\u0000\u00cc\b\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005"+
		"]\u0000\u0000\u00ce\n\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005}\u0000"+
		"\u0000\u00d0\f\u0001\u0000\u0000\u0000\u00d1\u00d2\u0005.\u0000\u0000"+
		"\u00d2\u000e\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005:\u0000\u0000\u00d4"+
		"\u0010\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005,\u0000\u0000\u00d6\u0012"+
		"\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005;\u0000\u0000\u00d8\u0014\u0001"+
		"\u0000\u0000\u0000\u00d9\u00da\u0005+\u0000\u0000\u00da\u0016\u0001\u0000"+
		"\u0000\u0000\u00db\u00dc\u0005-\u0000\u0000\u00dc\u0018\u0001\u0000\u0000"+
		"\u0000\u00dd\u00de\u0005*\u0000\u0000\u00de\u001a\u0001\u0000\u0000\u0000"+
		"\u00df\u00e0\u0005/\u0000\u0000\u00e0\u001c\u0001\u0000\u0000\u0000\u00e1"+
		"\u00e2\u0005|\u0000\u0000\u00e2\u001e\u0001\u0000\u0000\u0000\u00e3\u00e4"+
		"\u0005&\u0000\u0000\u00e4 \u0001\u0000\u0000\u0000\u00e5\u00e6\u0005<"+
		"\u0000\u0000\u00e6\"\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005>\u0000"+
		"\u0000\u00e8$\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005=\u0000\u0000\u00ea"+
		"&\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005%\u0000\u0000\u00ec(\u0001"+
		"\u0000\u0000\u0000\u00ed\u00ee\u0005=\u0000\u0000\u00ee\u00ef\u0005=\u0000"+
		"\u0000\u00ef*\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005!\u0000\u0000\u00f1"+
		"\u00f2\u0005=\u0000\u0000\u00f2,\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005"+
		"<\u0000\u0000\u00f4\u00f5\u0005=\u0000\u0000\u00f5.\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f7\u0005>\u0000\u0000\u00f7\u00f8\u0005=\u0000\u0000\u00f8"+
		"0\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005~\u0000\u0000\u00fa2\u0001"+
		"\u0000\u0000\u0000\u00fb\u00fc\u0005^\u0000\u0000\u00fc4\u0001\u0000\u0000"+
		"\u0000\u00fd\u00fe\u0005<\u0000\u0000\u00fe\u00ff\u0005<\u0000\u0000\u00ff"+
		"6\u0001\u0000\u0000\u0000\u0100\u0101\u0005>\u0000\u0000\u0101\u0102\u0005"+
		">\u0000\u0000\u01028\u0001\u0000\u0000\u0000\u0103\u0104\u0005*\u0000"+
		"\u0000\u0104\u0105\u0005*\u0000\u0000\u0105:\u0001\u0000\u0000\u0000\u0106"+
		"\u0107\u0005+\u0000\u0000\u0107\u0108\u0005=\u0000\u0000\u0108<\u0001"+
		"\u0000\u0000\u0000\u0109\u010a\u0005-\u0000\u0000\u010a\u010b\u0005=\u0000"+
		"\u0000\u010b>\u0001\u0000\u0000\u0000\u010c\u010d\u0005*\u0000\u0000\u010d"+
		"\u010e\u0005=\u0000\u0000\u010e@\u0001\u0000\u0000\u0000\u010f\u0110\u0005"+
		"/\u0000\u0000\u0110\u0111\u0005=\u0000\u0000\u0111B\u0001\u0000\u0000"+
		"\u0000\u0112\u0113\u0005%\u0000\u0000\u0113\u0114\u0005=\u0000\u0000\u0114"+
		"D\u0001\u0000\u0000\u0000\u0115\u0116\u0005&\u0000\u0000\u0116\u0117\u0005"+
		"=\u0000\u0000\u0117F\u0001\u0000\u0000\u0000\u0118\u0119\u0005|\u0000"+
		"\u0000\u0119\u011a\u0005=\u0000\u0000\u011aH\u0001\u0000\u0000\u0000\u011b"+
		"\u011c\u0005^\u0000\u0000\u011c\u011d\u0005=\u0000\u0000\u011dJ\u0001"+
		"\u0000\u0000\u0000\u011e\u011f\u0005<\u0000\u0000\u011f\u0120\u0005<\u0000"+
		"\u0000\u0120\u0121\u0005=\u0000\u0000\u0121L\u0001\u0000\u0000\u0000\u0122"+
		"\u0123\u0005>\u0000\u0000\u0123\u0124\u0005>\u0000\u0000\u0124\u0125\u0005"+
		"=\u0000\u0000\u0125N\u0001\u0000\u0000\u0000\u0126\u0127\u0005*\u0000"+
		"\u0000\u0127\u0128\u0005*\u0000\u0000\u0128\u0129\u0005=\u0000\u0000\u0129"+
		"P\u0001\u0000\u0000\u0000\u012a\u012b\u0005/\u0000\u0000\u012b\u012c\u0005"+
		"/\u0000\u0000\u012cR\u0001\u0000\u0000\u0000\u012d\u012e\u0005/\u0000"+
		"\u0000\u012e\u012f\u0005/\u0000\u0000\u012f\u0130\u0005=\u0000\u0000\u0130"+
		"T\u0001\u0000\u0000\u0000\u0131\u0132\u0005@\u0000\u0000\u0132V\u0001"+
		"\u0000\u0000\u0000\u0133\u0134\u0005@\u0000\u0000\u0134\u0135\u0005=\u0000"+
		"\u0000\u0135X\u0001\u0000\u0000\u0000\u0136\u0137\u0005-\u0000\u0000\u0137"+
		"\u0138\u0005>\u0000\u0000\u0138Z\u0001\u0000\u0000\u0000\u0139\u013a\u0005"+
		".\u0000\u0000\u013a\u013b\u0005.\u0000\u0000\u013b\u013c\u0005.\u0000"+
		"\u0000\u013c\\\u0001\u0000\u0000\u0000\u013d\u013e\u0005:\u0000\u0000"+
		"\u013e\u013f\u0005=\u0000\u0000\u013f^\u0001\u0000\u0000\u0000\u0140\u0141"+
		"\u0005!\u0000\u0000\u0141`\u0001\u0000\u0000\u0000\u0142\u0143\u0005F"+
		"\u0000\u0000\u0143\u0144\u0005a\u0000\u0000\u0144\u0145\u0005l\u0000\u0000"+
		"\u0145\u0146\u0005s\u0000\u0000\u0146\u0147\u0005e\u0000\u0000\u0147b"+
		"\u0001\u0000\u0000\u0000\u0148\u0149\u0005a\u0000\u0000\u0149\u014a\u0005"+
		"w\u0000\u0000\u014a\u014b\u0005a\u0000\u0000\u014b\u014c\u0005i\u0000"+
		"\u0000\u014c\u014d\u0005t\u0000\u0000\u014dd\u0001\u0000\u0000\u0000\u014e"+
		"\u014f\u0005e\u0000\u0000\u014f\u0150\u0005l\u0000\u0000\u0150\u0151\u0005"+
		"s\u0000\u0000\u0151\u0152\u0005e\u0000\u0000\u0152f\u0001\u0000\u0000"+
		"\u0000\u0153\u0154\u0005i\u0000\u0000\u0154\u0155\u0005m\u0000\u0000\u0155"+
		"\u0156\u0005p\u0000\u0000\u0156\u0157\u0005o\u0000\u0000\u0157\u0158\u0005"+
		"r\u0000\u0000\u0158\u0159\u0005t\u0000\u0000\u0159h\u0001\u0000\u0000"+
		"\u0000\u015a\u015b\u0005p\u0000\u0000\u015b\u015c\u0005a\u0000\u0000\u015c"+
		"\u015d\u0005s\u0000\u0000\u015d\u015e\u0005s\u0000\u0000\u015ej\u0001"+
		"\u0000\u0000\u0000\u015f\u0160\u0005N\u0000\u0000\u0160\u0161\u0005o\u0000"+
		"\u0000\u0161\u0162\u0005n\u0000\u0000\u0162\u0163\u0005e\u0000\u0000\u0163"+
		"l\u0001\u0000\u0000\u0000\u0164\u0165\u0005b\u0000\u0000\u0165\u0166\u0005"+
		"r\u0000\u0000\u0166\u0167\u0005e\u0000\u0000\u0167\u0168\u0005a\u0000"+
		"\u0000\u0168\u0169\u0005k\u0000\u0000\u0169n\u0001\u0000\u0000\u0000\u016a"+
		"\u016b\u0005e\u0000\u0000\u016b\u016c\u0005x\u0000\u0000\u016c\u016d\u0005"+
		"c\u0000\u0000\u016d\u016e\u0005e\u0000\u0000\u016e\u016f\u0005p\u0000"+
		"\u0000\u016f\u0170\u0005t\u0000\u0000\u0170p\u0001\u0000\u0000\u0000\u0171"+
		"\u0172\u0005i\u0000\u0000\u0172\u0173\u0005n\u0000\u0000\u0173r\u0001"+
		"\u0000\u0000\u0000\u0174\u0175\u0005r\u0000\u0000\u0175\u0176\u0005a\u0000"+
		"\u0000\u0176\u0177\u0005i\u0000\u0000\u0177\u0178\u0005s\u0000\u0000\u0178"+
		"\u0179\u0005e\u0000\u0000\u0179t\u0001\u0000\u0000\u0000\u017a\u017b\u0005"+
		"T\u0000\u0000\u017b\u017c\u0005r\u0000\u0000\u017c\u017d\u0005u\u0000"+
		"\u0000\u017d\u017e\u0005e\u0000\u0000\u017ev\u0001\u0000\u0000\u0000\u017f"+
		"\u0180\u0005c\u0000\u0000\u0180\u0181\u0005l\u0000\u0000\u0181\u0182\u0005"+
		"a\u0000\u0000\u0182\u0183\u0005s\u0000\u0000\u0183\u0184\u0005s\u0000"+
		"\u0000\u0184x\u0001\u0000\u0000\u0000\u0185\u0186\u0005f\u0000\u0000\u0186"+
		"\u0187\u0005i\u0000\u0000\u0187\u0188\u0005n\u0000\u0000\u0188\u0189\u0005"+
		"a\u0000\u0000\u0189\u018a\u0005l\u0000\u0000\u018a\u018b\u0005l\u0000"+
		"\u0000\u018b\u018c\u0005y\u0000\u0000\u018cz\u0001\u0000\u0000\u0000\u018d"+
		"\u018e\u0005i\u0000\u0000\u018e\u018f\u0005s\u0000\u0000\u018f|\u0001"+
		"\u0000\u0000\u0000\u0190\u0191\u0005r\u0000\u0000\u0191\u0192\u0005e\u0000"+
		"\u0000\u0192\u0193\u0005t\u0000\u0000\u0193\u0194\u0005u\u0000\u0000\u0194"+
		"\u0195\u0005r\u0000\u0000\u0195\u0196\u0005n\u0000\u0000\u0196~\u0001"+
		"\u0000\u0000\u0000\u0197\u0198\u0005a\u0000\u0000\u0198\u0199\u0005n\u0000"+
		"\u0000\u0199\u019a\u0005d\u0000\u0000\u019a\u0080\u0001\u0000\u0000\u0000"+
		"\u019b\u019c\u0005c\u0000\u0000\u019c\u019d\u0005o\u0000\u0000\u019d\u019e"+
		"\u0005n\u0000\u0000\u019e\u019f\u0005t\u0000\u0000\u019f\u01a0\u0005i"+
		"\u0000\u0000\u01a0\u01a1\u0005n\u0000\u0000\u01a1\u01a2\u0005u\u0000\u0000"+
		"\u01a2\u01a3\u0005e\u0000\u0000\u01a3\u0082\u0001\u0000\u0000\u0000\u01a4"+
		"\u01a5\u0005f\u0000\u0000\u01a5\u01a6\u0005o\u0000\u0000\u01a6\u01a7\u0005"+
		"r\u0000\u0000\u01a7\u0084\u0001\u0000\u0000\u0000\u01a8\u01a9\u0005l\u0000"+
		"\u0000\u01a9\u01aa\u0005a\u0000\u0000\u01aa\u01ab\u0005m\u0000\u0000\u01ab"+
		"\u01ac\u0005b\u0000\u0000\u01ac\u01ad\u0005d\u0000\u0000\u01ad\u01ae\u0005"+
		"a\u0000\u0000\u01ae\u0086\u0001\u0000\u0000\u0000\u01af\u01b0\u0005t\u0000"+
		"\u0000\u01b0\u01b1\u0005r\u0000\u0000\u01b1\u01b2\u0005y\u0000\u0000\u01b2"+
		"\u0088\u0001\u0000\u0000\u0000\u01b3\u01b4\u0005a\u0000\u0000\u01b4\u01b5"+
		"\u0005s\u0000\u0000\u01b5\u008a\u0001\u0000\u0000\u0000\u01b6\u01b7\u0005"+
		"d\u0000\u0000\u01b7\u01b8\u0005e\u0000\u0000\u01b8\u01b9\u0005f\u0000"+
		"\u0000\u01b9\u008c\u0001\u0000\u0000\u0000\u01ba\u01bb\u0005f\u0000\u0000"+
		"\u01bb\u01bc\u0005r\u0000\u0000\u01bc\u01bd\u0005o\u0000\u0000\u01bd\u01be"+
		"\u0005m\u0000\u0000\u01be\u008e\u0001\u0000\u0000\u0000\u01bf\u01c0\u0005"+
		"n\u0000\u0000\u01c0\u01c1\u0005o\u0000\u0000\u01c1\u01c2\u0005n\u0000"+
		"\u0000\u01c2\u01c3\u0005l\u0000\u0000\u01c3\u01c4\u0005o\u0000\u0000\u01c4"+
		"\u01c5\u0005c\u0000\u0000\u01c5\u01c6\u0005a\u0000\u0000\u01c6\u01c7\u0005"+
		"l\u0000\u0000\u01c7\u0090\u0001\u0000\u0000\u0000\u01c8\u01c9\u0005w\u0000"+
		"\u0000\u01c9\u01ca\u0005h\u0000\u0000\u01ca\u01cb\u0005i\u0000\u0000\u01cb"+
		"\u01cc\u0005l\u0000\u0000\u01cc\u01cd\u0005e\u0000\u0000\u01cd\u0092\u0001"+
		"\u0000\u0000\u0000\u01ce\u01cf\u0005a\u0000\u0000\u01cf\u01d0\u0005s\u0000"+
		"\u0000\u01d0\u01d1\u0005s\u0000\u0000\u01d1\u01d2\u0005e\u0000\u0000\u01d2"+
		"\u01d3\u0005r\u0000\u0000\u01d3\u01d4\u0005t\u0000\u0000\u01d4\u0094\u0001"+
		"\u0000\u0000\u0000\u01d5\u01d6\u0005d\u0000\u0000\u01d6\u01d7\u0005e\u0000"+
		"\u0000\u01d7\u01d8\u0005l\u0000\u0000\u01d8\u0096\u0001\u0000\u0000\u0000"+
		"\u01d9\u01da\u0005g\u0000\u0000\u01da\u01db\u0005l\u0000\u0000\u01db\u01dc"+
		"\u0005o\u0000\u0000\u01dc\u01dd\u0005b\u0000\u0000\u01dd\u01de\u0005a"+
		"\u0000\u0000\u01de\u01df\u0005l\u0000\u0000\u01df\u0098\u0001\u0000\u0000"+
		"\u0000\u01e0\u01e1\u0005n\u0000\u0000\u01e1\u01e2\u0005o\u0000\u0000\u01e2"+
		"\u01e3\u0005t\u0000\u0000\u01e3\u009a\u0001\u0000\u0000\u0000\u01e4\u01e5"+
		"\u0005w\u0000\u0000\u01e5\u01e6\u0005i\u0000\u0000\u01e6\u01e7\u0005t"+
		"\u0000\u0000\u01e7\u01e8\u0005h\u0000\u0000\u01e8\u009c\u0001\u0000\u0000"+
		"\u0000\u01e9\u01ea\u0005a\u0000\u0000\u01ea\u01eb\u0005s\u0000\u0000\u01eb"+
		"\u01ec\u0005y\u0000\u0000\u01ec\u01ed\u0005n\u0000\u0000\u01ed\u01ee\u0005"+
		"c\u0000\u0000\u01ee\u009e\u0001\u0000\u0000\u0000\u01ef\u01f0\u0005e\u0000"+
		"\u0000\u01f0\u01f1\u0005l\u0000\u0000\u01f1\u01f2\u0005i\u0000\u0000\u01f2"+
		"\u01f3\u0005f\u0000\u0000\u01f3\u00a0\u0001\u0000\u0000\u0000\u01f4\u01f5"+
		"\u0005i\u0000\u0000\u01f5\u01f6\u0005f\u0000\u0000\u01f6\u00a2\u0001\u0000"+
		"\u0000\u0000\u01f7\u01f8\u0005o\u0000\u0000\u01f8\u01f9\u0005r\u0000\u0000"+
		"\u01f9\u00a4\u0001\u0000\u0000\u0000\u01fa\u01fb\u0005y\u0000\u0000\u01fb"+
		"\u01fc\u0005i\u0000\u0000\u01fc\u01fd\u0005e\u0000\u0000\u01fd\u01fe\u0005"+
		"l\u0000\u0000\u01fe\u01ff\u0005d\u0000\u0000\u01ff\u00a6\u0001\u0000\u0000"+
		"\u0000\u0200\u0201\u0005t\u0000\u0000\u0201\u0202\u0005y\u0000\u0000\u0202"+
		"\u0203\u0005p\u0000\u0000\u0203\u0204\u0005e\u0000\u0000\u0204\u00a8\u0001"+
		"\u0000\u0000\u0000\u0205\u0206\u0005m\u0000\u0000\u0206\u0207\u0005a\u0000"+
		"\u0000\u0207\u0208\u0005t\u0000\u0000\u0208\u0209\u0005c\u0000\u0000\u0209"+
		"\u020a\u0005h\u0000\u0000\u020a\u00aa\u0001\u0000\u0000\u0000\u020b\u020c"+
		"\u0005c\u0000\u0000\u020c\u020d\u0005a\u0000\u0000\u020d\u020e\u0005s"+
		"\u0000\u0000\u020e\u020f\u0005e\u0000\u0000\u020f\u00ac\u0001\u0000\u0000"+
		"\u0000\u0210\u0211\u0005_\u0000\u0000\u0211\u00ae\u0001\u0000\u0000\u0000"+
		"\u0212\u0216\u0005\"\u0000\u0000\u0213\u0215\t\u0000\u0000\u0000\u0214"+
		"\u0213\u0001\u0000\u0000\u0000\u0215\u0218\u0001\u0000\u0000\u0000\u0216"+
		"\u0217\u0001\u0000\u0000\u0000\u0216\u0214\u0001\u0000\u0000\u0000\u0217"+
		"\u0219\u0001\u0000\u0000\u0000\u0218\u0216\u0001\u0000\u0000\u0000\u0219"+
		"\u023d\u0005\"\u0000\u0000\u021a\u021b\u0005\"\u0000\u0000\u021b\u021c"+
		"\u0005\"\u0000\u0000\u021c\u021d\u0005\"\u0000\u0000\u021d\u0221\u0001"+
		"\u0000\u0000\u0000\u021e\u0220\t\u0000\u0000\u0000\u021f\u021e\u0001\u0000"+
		"\u0000\u0000\u0220\u0223\u0001\u0000\u0000\u0000\u0221\u0222\u0001\u0000"+
		"\u0000\u0000\u0221\u021f\u0001\u0000\u0000\u0000\u0222\u0224\u0001\u0000"+
		"\u0000\u0000\u0223\u0221\u0001\u0000\u0000\u0000\u0224\u0225\u0005\"\u0000"+
		"\u0000\u0225\u0226\u0005\"\u0000\u0000\u0226\u023d\u0005\"\u0000\u0000"+
		"\u0227\u0228\u0005\'\u0000\u0000\u0228\u0229\u0005\'\u0000\u0000\u0229"+
		"\u022a\u0005\'\u0000\u0000\u022a\u022e\u0001\u0000\u0000\u0000\u022b\u022d"+
		"\t\u0000\u0000\u0000\u022c\u022b\u0001\u0000\u0000\u0000\u022d\u0230\u0001"+
		"\u0000\u0000\u0000\u022e\u022f\u0001\u0000\u0000\u0000\u022e\u022c\u0001"+
		"\u0000\u0000\u0000\u022f\u0231\u0001\u0000\u0000\u0000\u0230\u022e\u0001"+
		"\u0000\u0000\u0000\u0231\u0232\u0005\'\u0000\u0000\u0232\u0233\u0005\'"+
		"\u0000\u0000\u0233\u023d\u0005\'\u0000\u0000\u0234\u0238\u0005\'\u0000"+
		"\u0000\u0235\u0237\t\u0000\u0000\u0000\u0236\u0235\u0001\u0000\u0000\u0000"+
		"\u0237\u023a\u0001\u0000\u0000\u0000\u0238\u0239\u0001\u0000\u0000\u0000"+
		"\u0238\u0236\u0001\u0000\u0000\u0000\u0239\u023b\u0001\u0000\u0000\u0000"+
		"\u023a\u0238\u0001\u0000\u0000\u0000\u023b\u023d\u0005\'\u0000\u0000\u023c"+
		"\u0212\u0001\u0000\u0000\u0000\u023c\u021a\u0001\u0000\u0000\u0000\u023c"+
		"\u0227\u0001\u0000\u0000\u0000\u023c\u0234\u0001\u0000\u0000\u0000\u023d"+
		"\u00b0\u0001\u0000\u0000\u0000\u023e\u0246\u0007\u0000\u0000\u0000\u023f"+
		"\u0241\u0007\u0001\u0000\u0000\u0240\u023f\u0001\u0000\u0000\u0000\u0241"+
		"\u0244\u0001\u0000\u0000\u0000\u0242\u0240\u0001\u0000\u0000\u0000\u0242"+
		"\u0243\u0001\u0000\u0000\u0000\u0243\u0245\u0001\u0000\u0000\u0000\u0244"+
		"\u0242\u0001\u0000\u0000\u0000\u0245\u0247\u0007\u0000\u0000\u0000\u0246"+
		"\u0242\u0001\u0000\u0000\u0000\u0246\u0247\u0001\u0000\u0000\u0000\u0247"+
		"\u00b2\u0001\u0000\u0000\u0000\u0248\u0249\u0003\u00b1X\u0000\u0249\u00b4"+
		"\u0001\u0000\u0000\u0000\u024a\u024b\u0005f\u0000\u0000\u024b\u024f\u0005"+
		"\'\u0000\u0000\u024c\u024e\t\u0000\u0000\u0000\u024d\u024c\u0001\u0000"+
		"\u0000\u0000\u024e\u0251\u0001\u0000\u0000\u0000\u024f\u0250\u0001\u0000"+
		"\u0000\u0000\u024f\u024d\u0001\u0000\u0000\u0000\u0250\u0252\u0001\u0000"+
		"\u0000\u0000\u0251\u024f\u0001\u0000\u0000\u0000\u0252\u0253\u0005$\u0000"+
		"\u0000\u0253\u0254\u0005{\u0000\u0000\u0254\u0255\u0001\u0000\u0000\u0000"+
		"\u0255\u0256\u0003\u00bf_\u0000\u0256\u0257\u0005}\u0000\u0000\u0257\u0258"+
		"\u0005\'\u0000\u0000\u0258\u00b6\u0001\u0000\u0000\u0000\u0259\u025b\u0005"+
		"\r\u0000\u0000\u025a\u0259\u0001\u0000\u0000\u0000\u025a\u025b\u0001\u0000"+
		"\u0000\u0000\u025b\u025c\u0001\u0000\u0000\u0000\u025c\u025d\u0005\n\u0000"+
		"\u0000\u025d\u00b8\u0001\u0000\u0000\u0000\u025e\u0262\u0005#\u0000\u0000"+
		"\u025f\u0261\b\u0002\u0000\u0000\u0260\u025f\u0001\u0000\u0000\u0000\u0261"+
		"\u0264\u0001\u0000\u0000\u0000\u0262\u0260\u0001\u0000\u0000\u0000\u0262"+
		"\u0263\u0001\u0000\u0000\u0000\u0263\u0265\u0001\u0000\u0000\u0000\u0264"+
		"\u0262\u0001\u0000\u0000\u0000\u0265\u0266\u0006\\\u0000\u0000\u0266\u00ba"+
		"\u0001\u0000\u0000\u0000\u0267\u0269\u0007\u0003\u0000\u0000\u0268\u0267"+
		"\u0001\u0000\u0000\u0000\u0269\u026a\u0001\u0000\u0000\u0000\u026a\u0268"+
		"\u0001\u0000\u0000\u0000\u026a\u026b\u0001\u0000\u0000\u0000\u026b\u026c"+
		"\u0001\u0000\u0000\u0000\u026c\u026d\u0006]\u0000\u0000\u026d\u00bc\u0001"+
		"\u0000\u0000\u0000\u026e\u026f\t\u0000\u0000\u0000\u026f\u00be\u0001\u0000"+
		"\u0000\u0000\u0270\u0274\u0003\u00c3a\u0000\u0271\u0273\u0003\u00c1`\u0000"+
		"\u0272\u0271\u0001\u0000\u0000\u0000\u0273\u0276\u0001\u0000\u0000\u0000"+
		"\u0274\u0272\u0001\u0000\u0000\u0000\u0274\u0275\u0001\u0000\u0000\u0000"+
		"\u0275\u00c0\u0001\u0000\u0000\u0000\u0276\u0274\u0001\u0000\u0000\u0000"+
		"\u0277\u027a\u0003\u00c3a\u0000\u0278\u027a\u0007\u0000\u0000\u0000\u0279"+
		"\u0277\u0001\u0000\u0000\u0000\u0279\u0278\u0001\u0000\u0000\u0000\u027a"+
		"\u00c2\u0001\u0000\u0000\u0000\u027b\u0280\u0007\u0004\u0000\u0000\u027c"+
		"\u0280\b\u0005\u0000\u0000\u027d\u027e\u0007\u0006\u0000\u0000\u027e\u0280"+
		"\u0007\u0007\u0000\u0000\u027f\u027b\u0001\u0000\u0000\u0000\u027f\u027c"+
		"\u0001\u0000\u0000\u0000\u027f\u027d\u0001\u0000\u0000\u0000\u0280\u00c4"+
		"\u0001\u0000\u0000\u0000\u000f\u0000\u0216\u0221\u022e\u0238\u023c\u0242"+
		"\u0246\u024f\u025a\u0262\u026a\u0274\u0279\u027f\u0001\u0000\u0001\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}