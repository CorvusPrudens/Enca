// Generated from /Users/corvus/Documents/GitHub/Corvassembly_cpp/src/grammars/Enca.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EncaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, COMMENT=16, 
		COMMENT_BLOCK=17, REGISTER=18, STACK=19, BASE=20, NAME=21, DEC=22, HEX=23, 
		BIN=24, OCT=25, FLT=26, SCI=27, WHITESPACE=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "COMMENT", "COMMENT_BLOCK", 
			"REGISTER", "STACK", "BASE", "NAME", "DEC", "HEX", "BIN", "OCT", "FLT", 
			"FD", "SCI", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'->'", "'zero'", "'carry'", "'negative'", "'equal'", "'greater'", 
			"'less'", "':'", "'{'", "'}'", "'('", "','", "')'", "'['", "']'", null, 
			null, null, "'sp'", "'bp'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "COMMENT", "COMMENT_BLOCK", "REGISTER", "STACK", 
			"BASE", "NAME", "DEC", "HEX", "BIN", "OCT", "FLT", "SCI", "WHITESPACE"
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


	public EncaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Enca.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u0121\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\21\3\21\7\21|\n\21\f\21\16\21\177\13\21\3"+
		"\21\5\21\u0082\n\21\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u008a\n\22\f\22"+
		"\16\22\u008d\13\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\7\23\u0097"+
		"\n\23\f\23\16\23\u009a\13\23\3\23\5\23\u009d\n\23\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\26\3\26\7\26\u00a7\n\26\f\26\16\26\u00aa\13\26\3\27\3\27"+
		"\7\27\u00ae\n\27\f\27\16\27\u00b1\13\27\3\27\5\27\u00b4\n\27\3\30\3\30"+
		"\3\30\3\30\3\30\7\30\u00bb\n\30\f\30\16\30\u00be\13\30\3\31\3\31\3\31"+
		"\3\31\3\31\7\31\u00c5\n\31\f\31\16\31\u00c8\13\31\3\32\3\32\6\32\u00cc"+
		"\n\32\r\32\16\32\u00cd\3\33\3\33\7\33\u00d2\n\33\f\33\16\33\u00d5\13\33"+
		"\3\33\5\33\u00d8\n\33\3\33\3\33\3\33\7\33\u00dd\n\33\f\33\16\33\u00e0"+
		"\13\33\3\33\5\33\u00e3\n\33\3\34\3\34\7\34\u00e7\n\34\f\34\16\34\u00ea"+
		"\13\34\3\34\5\34\u00ed\n\34\3\34\5\34\u00f0\n\34\3\34\3\34\7\34\u00f4"+
		"\n\34\f\34\16\34\u00f7\13\34\3\34\5\34\u00fa\n\34\3\34\3\34\3\34\7\34"+
		"\u00ff\n\34\f\34\16\34\u0102\13\34\3\34\5\34\u0105\n\34\3\34\3\34\3\34"+
		"\7\34\u010a\n\34\f\34\16\34\u010d\13\34\3\34\5\34\u0110\n\34\5\34\u0112"+
		"\n\34\3\35\3\35\3\35\5\35\u0117\n\35\3\35\6\35\u011a\n\35\r\35\16\35\u011b"+
		"\3\36\3\36\3\36\3\36\3\u008b\2\37\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\29\35;\36\3\2\17\4\2\f\f\17\17\4\3\f\f\17\17\3\2"+
		"\63;\4\2\62;aa\5\2C\\aac|\6\2\62;C\\aac|\5\2\62;CHch\6\2\62;CHaach\3\2"+
		"\62\63\4\2\62\63aa\3\2\629\3\2\62;\5\2\13\f\17\17\"\"\2\u013a\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\3=\3\2\2\2\5@\3"+
		"\2\2\2\7E\3\2\2\2\tK\3\2\2\2\13T\3\2\2\2\rZ\3\2\2\2\17b\3\2\2\2\21g\3"+
		"\2\2\2\23i\3\2\2\2\25k\3\2\2\2\27m\3\2\2\2\31o\3\2\2\2\33q\3\2\2\2\35"+
		"s\3\2\2\2\37u\3\2\2\2!w\3\2\2\2#\u0085\3\2\2\2%\u0093\3\2\2\2\'\u009e"+
		"\3\2\2\2)\u00a1\3\2\2\2+\u00a4\3\2\2\2-\u00b3\3\2\2\2/\u00b5\3\2\2\2\61"+
		"\u00bf\3\2\2\2\63\u00c9\3\2\2\2\65\u00d7\3\2\2\2\67\u0111\3\2\2\29\u0113"+
		"\3\2\2\2;\u011d\3\2\2\2=>\7/\2\2>?\7@\2\2?\4\3\2\2\2@A\7|\2\2AB\7g\2\2"+
		"BC\7t\2\2CD\7q\2\2D\6\3\2\2\2EF\7e\2\2FG\7c\2\2GH\7t\2\2HI\7t\2\2IJ\7"+
		"{\2\2J\b\3\2\2\2KL\7p\2\2LM\7g\2\2MN\7i\2\2NO\7c\2\2OP\7v\2\2PQ\7k\2\2"+
		"QR\7x\2\2RS\7g\2\2S\n\3\2\2\2TU\7g\2\2UV\7s\2\2VW\7w\2\2WX\7c\2\2XY\7"+
		"n\2\2Y\f\3\2\2\2Z[\7i\2\2[\\\7t\2\2\\]\7g\2\2]^\7c\2\2^_\7v\2\2_`\7g\2"+
		"\2`a\7t\2\2a\16\3\2\2\2bc\7n\2\2cd\7g\2\2de\7u\2\2ef\7u\2\2f\20\3\2\2"+
		"\2gh\7<\2\2h\22\3\2\2\2ij\7}\2\2j\24\3\2\2\2kl\7\177\2\2l\26\3\2\2\2m"+
		"n\7*\2\2n\30\3\2\2\2op\7.\2\2p\32\3\2\2\2qr\7+\2\2r\34\3\2\2\2st\7]\2"+
		"\2t\36\3\2\2\2uv\7_\2\2v \3\2\2\2wx\7\61\2\2xy\7\61\2\2y}\3\2\2\2z|\n"+
		"\2\2\2{z\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0081\3\2\2\2\177}"+
		"\3\2\2\2\u0080\u0082\t\3\2\2\u0081\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
		"\u0084\b\21\2\2\u0084\"\3\2\2\2\u0085\u0086\7\61\2\2\u0086\u0087\7,\2"+
		"\2\u0087\u008b\3\2\2\2\u0088\u008a\13\2\2\2\u0089\u0088\3\2\2\2\u008a"+
		"\u008d\3\2\2\2\u008b\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008e\3\2"+
		"\2\2\u008d\u008b\3\2\2\2\u008e\u008f\7,\2\2\u008f\u0090\7\61\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u0092\b\22\2\2\u0092$\3\2\2\2\u0093\u009c\7t\2\2"+
		"\u0094\u0098\t\4\2\2\u0095\u0097\t\5\2\2\u0096\u0095\3\2\2\2\u0097\u009a"+
		"\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009d\3\2\2\2\u009a"+
		"\u0098\3\2\2\2\u009b\u009d\7\62\2\2\u009c\u0094\3\2\2\2\u009c\u009b\3"+
		"\2\2\2\u009d&\3\2\2\2\u009e\u009f\7u\2\2\u009f\u00a0\7r\2\2\u00a0(\3\2"+
		"\2\2\u00a1\u00a2\7d\2\2\u00a2\u00a3\7r\2\2\u00a3*\3\2\2\2\u00a4\u00a8"+
		"\t\6\2\2\u00a5\u00a7\t\7\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8"+
		"\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9,\3\2\2\2\u00aa\u00a8\3\2\2\2"+
		"\u00ab\u00af\t\4\2\2\u00ac\u00ae\t\5\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1"+
		"\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b4\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b2\u00b4\7\62\2\2\u00b3\u00ab\3\2\2\2\u00b3\u00b2\3"+
		"\2\2\2\u00b4.\3\2\2\2\u00b5\u00b6\7\62\2\2\u00b6\u00b7\7z\2\2\u00b7\u00b8"+
		"\3\2\2\2\u00b8\u00bc\t\b\2\2\u00b9\u00bb\t\t\2\2\u00ba\u00b9\3\2\2\2\u00bb"+
		"\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\60\3\2\2"+
		"\2\u00be\u00bc\3\2\2\2\u00bf\u00c0\7\62\2\2\u00c0\u00c1\7d\2\2\u00c1\u00c2"+
		"\3\2\2\2\u00c2\u00c6\t\n\2\2\u00c3\u00c5\t\13\2\2\u00c4\u00c3\3\2\2\2"+
		"\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\62"+
		"\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00cb\7\62\2\2\u00ca\u00cc\t\f\2\2"+
		"\u00cb\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce"+
		"\3\2\2\2\u00ce\64\3\2\2\2\u00cf\u00d3\t\4\2\2\u00d0\u00d2\t\5\2\2\u00d1"+
		"\u00d0\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2"+
		"\2\2\u00d4\u00d8\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d8\7\62\2\2\u00d7"+
		"\u00cf\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00e2\7\60"+
		"\2\2\u00da\u00de\t\4\2\2\u00db\u00dd\t\5\2\2\u00dc\u00db\3\2\2\2\u00dd"+
		"\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e3\3\2"+
		"\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e3\7\62\2\2\u00e2\u00da\3\2\2\2\u00e2"+
		"\u00e1\3\2\2\2\u00e3\66\3\2\2\2\u00e4\u00e8\t\4\2\2\u00e5\u00e7\t\r\2"+
		"\2\u00e6\u00e5\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9"+
		"\3\2\2\2\u00e9\u00ed\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ed\7\62\2\2"+
		"\u00ec\u00e4\3\2\2\2\u00ec\u00eb\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00f0"+
		"\7\60\2\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u0112\3\2\2\2"+
		"\u00f1\u00f5\t\4\2\2\u00f2\u00f4\t\r\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f7"+
		"\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00fa\3\2\2\2\u00f7"+
		"\u00f5\3\2\2\2\u00f8\u00fa\7\62\2\2\u00f9\u00f1\3\2\2\2\u00f9\u00f8\3"+
		"\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u0104\7\60\2\2\u00fc\u0100\t\4\2\2\u00fd"+
		"\u00ff\t\r\2\2\u00fe\u00fd\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2"+
		"\2\2\u0100\u0101\3\2\2\2\u0101\u0105\3\2\2\2\u0102\u0100\3\2\2\2\u0103"+
		"\u0105\7\62\2\2\u0104\u00fc\3\2\2\2\u0104\u0103\3\2\2\2\u0105\u0112\3"+
		"\2\2\2\u0106\u010f\7\60\2\2\u0107\u010b\t\4\2\2\u0108\u010a\t\r\2\2\u0109"+
		"\u0108\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2"+
		"\2\2\u010c\u0110\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u0110\7\62\2\2\u010f"+
		"\u0107\3\2\2\2\u010f\u010e\3\2\2\2\u0110\u0112\3\2\2\2\u0111\u00ec\3\2"+
		"\2\2\u0111\u00f9\3\2\2\2\u0111\u0106\3\2\2\2\u01128\3\2\2\2\u0113\u0114"+
		"\5\67\34\2\u0114\u0116\7g\2\2\u0115\u0117\7/\2\2\u0116\u0115\3\2\2\2\u0116"+
		"\u0117\3\2\2\2\u0117\u0119\3\2\2\2\u0118\u011a\t\r\2\2\u0119\u0118\3\2"+
		"\2\2\u011a\u011b\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		":\3\2\2\2\u011d\u011e\t\16\2\2\u011e\u011f\3\2\2\2\u011f\u0120\b\36\3"+
		"\2\u0120<\3\2\2\2\36\2}\u0081\u008b\u0098\u009c\u00a8\u00af\u00b3\u00bc"+
		"\u00c6\u00cd\u00d3\u00d7\u00de\u00e2\u00e8\u00ec\u00ef\u00f5\u00f9\u0100"+
		"\u0104\u010b\u010f\u0111\u0116\u011b\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}