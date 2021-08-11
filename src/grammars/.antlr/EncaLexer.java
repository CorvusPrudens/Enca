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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		COMMENT=18, COMMENT_BLOCK=19, REGISTER=20, STACK=21, BASE=22, NAME=23, 
		DEC=24, HEX=25, BIN=26, OCT=27, FLT=28, SCI=29, WHITESPACE=30;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"COMMENT", "COMMENT_BLOCK", "REGISTER", "STACK", "BASE", "NAME", "DEC", 
			"HEX", "BIN", "OCT", "FLT", "FD", "SCI", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'->'", "'zero'", "'carry'", "'negative'", "'equal'", "'greater'", 
			"'less'", "':'", "'{'", "'}'", "'['", "']'", "'('", "','", "')'", "'='", 
			"'&'", null, null, null, "'sp'", "'bp'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "COMMENT", "COMMENT_BLOCK", "REGISTER", 
			"STACK", "BASE", "NAME", "DEC", "HEX", "BIN", "OCT", "FLT", "SCI", "WHITESPACE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u0129\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\7\23"+
		"\u0084\n\23\f\23\16\23\u0087\13\23\3\23\5\23\u008a\n\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\7\24\u0092\n\24\f\24\16\24\u0095\13\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\7\25\u009f\n\25\f\25\16\25\u00a2\13\25\3\25"+
		"\5\25\u00a5\n\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\7\30\u00af\n"+
		"\30\f\30\16\30\u00b2\13\30\3\31\3\31\7\31\u00b6\n\31\f\31\16\31\u00b9"+
		"\13\31\3\31\5\31\u00bc\n\31\3\32\3\32\3\32\3\32\3\32\7\32\u00c3\n\32\f"+
		"\32\16\32\u00c6\13\32\3\33\3\33\3\33\3\33\3\33\7\33\u00cd\n\33\f\33\16"+
		"\33\u00d0\13\33\3\34\3\34\6\34\u00d4\n\34\r\34\16\34\u00d5\3\35\3\35\7"+
		"\35\u00da\n\35\f\35\16\35\u00dd\13\35\3\35\5\35\u00e0\n\35\3\35\3\35\3"+
		"\35\7\35\u00e5\n\35\f\35\16\35\u00e8\13\35\3\35\5\35\u00eb\n\35\3\36\3"+
		"\36\7\36\u00ef\n\36\f\36\16\36\u00f2\13\36\3\36\5\36\u00f5\n\36\3\36\5"+
		"\36\u00f8\n\36\3\36\3\36\7\36\u00fc\n\36\f\36\16\36\u00ff\13\36\3\36\5"+
		"\36\u0102\n\36\3\36\3\36\3\36\7\36\u0107\n\36\f\36\16\36\u010a\13\36\3"+
		"\36\5\36\u010d\n\36\3\36\3\36\3\36\7\36\u0112\n\36\f\36\16\36\u0115\13"+
		"\36\3\36\5\36\u0118\n\36\5\36\u011a\n\36\3\37\3\37\3\37\5\37\u011f\n\37"+
		"\3\37\6\37\u0122\n\37\r\37\16\37\u0123\3 \3 \3 \3 \3\u0093\2!\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\2=\37? \3\2"+
		"\17\4\2\f\f\17\17\4\3\f\f\17\17\3\2\63;\4\2\62;aa\5\2C\\aac|\6\2\62;C"+
		"\\aac|\5\2\62;CHch\6\2\62;CHaach\3\2\62\63\4\2\62\63aa\3\2\629\3\2\62"+
		";\5\2\13\f\17\17\"\"\2\u0142\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\3A\3\2\2\2\5D\3\2\2\2\7I"+
		"\3\2\2\2\tO\3\2\2\2\13X\3\2\2\2\r^\3\2\2\2\17f\3\2\2\2\21k\3\2\2\2\23"+
		"m\3\2\2\2\25o\3\2\2\2\27q\3\2\2\2\31s\3\2\2\2\33u\3\2\2\2\35w\3\2\2\2"+
		"\37y\3\2\2\2!{\3\2\2\2#}\3\2\2\2%\177\3\2\2\2\'\u008d\3\2\2\2)\u009b\3"+
		"\2\2\2+\u00a6\3\2\2\2-\u00a9\3\2\2\2/\u00ac\3\2\2\2\61\u00bb\3\2\2\2\63"+
		"\u00bd\3\2\2\2\65\u00c7\3\2\2\2\67\u00d1\3\2\2\29\u00df\3\2\2\2;\u0119"+
		"\3\2\2\2=\u011b\3\2\2\2?\u0125\3\2\2\2AB\7/\2\2BC\7@\2\2C\4\3\2\2\2DE"+
		"\7|\2\2EF\7g\2\2FG\7t\2\2GH\7q\2\2H\6\3\2\2\2IJ\7e\2\2JK\7c\2\2KL\7t\2"+
		"\2LM\7t\2\2MN\7{\2\2N\b\3\2\2\2OP\7p\2\2PQ\7g\2\2QR\7i\2\2RS\7c\2\2ST"+
		"\7v\2\2TU\7k\2\2UV\7x\2\2VW\7g\2\2W\n\3\2\2\2XY\7g\2\2YZ\7s\2\2Z[\7w\2"+
		"\2[\\\7c\2\2\\]\7n\2\2]\f\3\2\2\2^_\7i\2\2_`\7t\2\2`a\7g\2\2ab\7c\2\2"+
		"bc\7v\2\2cd\7g\2\2de\7t\2\2e\16\3\2\2\2fg\7n\2\2gh\7g\2\2hi\7u\2\2ij\7"+
		"u\2\2j\20\3\2\2\2kl\7<\2\2l\22\3\2\2\2mn\7}\2\2n\24\3\2\2\2op\7\177\2"+
		"\2p\26\3\2\2\2qr\7]\2\2r\30\3\2\2\2st\7_\2\2t\32\3\2\2\2uv\7*\2\2v\34"+
		"\3\2\2\2wx\7.\2\2x\36\3\2\2\2yz\7+\2\2z \3\2\2\2{|\7?\2\2|\"\3\2\2\2}"+
		"~\7(\2\2~$\3\2\2\2\177\u0080\7\61\2\2\u0080\u0081\7\61\2\2\u0081\u0085"+
		"\3\2\2\2\u0082\u0084\n\2\2\2\u0083\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2"+
		"\2\2\u0088\u008a\t\3\2\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u008c\b\23\2\2\u008c&\3\2\2\2\u008d\u008e\7\61\2\2\u008e\u008f\7,\2\2"+
		"\u008f\u0093\3\2\2\2\u0090\u0092\13\2\2\2\u0091\u0090\3\2\2\2\u0092\u0095"+
		"\3\2\2\2\u0093\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0096\3\2\2\2\u0095"+
		"\u0093\3\2\2\2\u0096\u0097\7,\2\2\u0097\u0098\7\61\2\2\u0098\u0099\3\2"+
		"\2\2\u0099\u009a\b\24\2\2\u009a(\3\2\2\2\u009b\u00a4\7t\2\2\u009c\u00a0"+
		"\t\4\2\2\u009d\u009f\t\5\2\2\u009e\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0"+
		"\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a5\3\2\2\2\u00a2\u00a0\3\2"+
		"\2\2\u00a3\u00a5\7\62\2\2\u00a4\u009c\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5"+
		"*\3\2\2\2\u00a6\u00a7\7u\2\2\u00a7\u00a8\7r\2\2\u00a8,\3\2\2\2\u00a9\u00aa"+
		"\7d\2\2\u00aa\u00ab\7r\2\2\u00ab.\3\2\2\2\u00ac\u00b0\t\6\2\2\u00ad\u00af"+
		"\t\7\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0"+
		"\u00b1\3\2\2\2\u00b1\60\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b7\t\4\2"+
		"\2\u00b4\u00b6\t\5\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5"+
		"\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00bc\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba"+
		"\u00bc\7\62\2\2\u00bb\u00b3\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc\62\3\2\2"+
		"\2\u00bd\u00be\7\62\2\2\u00be\u00bf\7z\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c4"+
		"\t\b\2\2\u00c1\u00c3\t\t\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4"+
		"\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\64\3\2\2\2\u00c6\u00c4\3\2\2"+
		"\2\u00c7\u00c8\7\62\2\2\u00c8\u00c9\7d\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00ce"+
		"\t\n\2\2\u00cb\u00cd\t\13\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00d0\3\2\2\2"+
		"\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\66\3\2\2\2\u00d0\u00ce"+
		"\3\2\2\2\u00d1\u00d3\7\62\2\2\u00d2\u00d4\t\f\2\2\u00d3\u00d2\3\2\2\2"+
		"\u00d4\u00d5\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d68\3"+
		"\2\2\2\u00d7\u00db\t\4\2\2\u00d8\u00da\t\5\2\2\u00d9\u00d8\3\2\2\2\u00da"+
		"\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00e0\3\2"+
		"\2\2\u00dd\u00db\3\2\2\2\u00de\u00e0\7\62\2\2\u00df\u00d7\3\2\2\2\u00df"+
		"\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00ea\7\60\2\2\u00e2\u00e6\t"+
		"\4\2\2\u00e3\u00e5\t\5\2\2\u00e4\u00e3\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6"+
		"\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00eb\3\2\2\2\u00e8\u00e6\3\2"+
		"\2\2\u00e9\u00eb\7\62\2\2\u00ea\u00e2\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb"+
		":\3\2\2\2\u00ec\u00f0\t\4\2\2\u00ed\u00ef\t\r\2\2\u00ee\u00ed\3\2\2\2"+
		"\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f5"+
		"\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f5\7\62\2\2\u00f4\u00ec\3\2\2\2"+
		"\u00f4\u00f3\3\2\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f8\7\60\2\2\u00f7\u00f6"+
		"\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u011a\3\2\2\2\u00f9\u00fd\t\4\2\2\u00fa"+
		"\u00fc\t\r\2\2\u00fb\u00fa\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2"+
		"\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0102\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100"+
		"\u0102\7\62\2\2\u0101\u00f9\3\2\2\2\u0101\u0100\3\2\2\2\u0102\u0103\3"+
		"\2\2\2\u0103\u010c\7\60\2\2\u0104\u0108\t\4\2\2\u0105\u0107\t\r\2\2\u0106"+
		"\u0105\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2"+
		"\2\2\u0109\u010d\3\2\2\2\u010a\u0108\3\2\2\2\u010b\u010d\7\62\2\2\u010c"+
		"\u0104\3\2\2\2\u010c\u010b\3\2\2\2\u010d\u011a\3\2\2\2\u010e\u0117\7\60"+
		"\2\2\u010f\u0113\t\4\2\2\u0110\u0112\t\r\2\2\u0111\u0110\3\2\2\2\u0112"+
		"\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0118\3\2"+
		"\2\2\u0115\u0113\3\2\2\2\u0116\u0118\7\62\2\2\u0117\u010f\3\2\2\2\u0117"+
		"\u0116\3\2\2\2\u0118\u011a\3\2\2\2\u0119\u00f4\3\2\2\2\u0119\u0101\3\2"+
		"\2\2\u0119\u010e\3\2\2\2\u011a<\3\2\2\2\u011b\u011c\5;\36\2\u011c\u011e"+
		"\7g\2\2\u011d\u011f\7/\2\2\u011e\u011d\3\2\2\2\u011e\u011f\3\2\2\2\u011f"+
		"\u0121\3\2\2\2\u0120\u0122\t\r\2\2\u0121\u0120\3\2\2\2\u0122\u0123\3\2"+
		"\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124>\3\2\2\2\u0125\u0126"+
		"\t\16\2\2\u0126\u0127\3\2\2\2\u0127\u0128\b \3\2\u0128@\3\2\2\2\36\2\u0085"+
		"\u0089\u0093\u00a0\u00a4\u00b0\u00b7\u00bb\u00c4\u00ce\u00d5\u00db\u00df"+
		"\u00e6\u00ea\u00f0\u00f4\u00f7\u00fd\u0101\u0108\u010c\u0113\u0117\u0119"+
		"\u011e\u0123\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}