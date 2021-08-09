// Generated from /Users/corvus/Documents/GitHub/Corvassembly_cpp/src/grammars/Enca.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EncaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, COMMENT=17, 
		COMMENT_BLOCK=18, REGISTER=19, STACK=20, BASE=21, NAME=22, DEC=23, HEX=24, 
		BIN=25, OCT=26, FLT=27, SCI=28, WHITESPACE=29;
	public static final int
		RULE_parse = 0, RULE_statement = 1, RULE_instruction = 2, RULE_conditional = 3, 
		RULE_condition = 4, RULE_label = 5, RULE_data = 6, RULE_storage = 7, RULE_dimension = 8, 
		RULE_specifier_list = 9, RULE_specifier = 10, RULE_data_list = 11, RULE_data_element = 12, 
		RULE_operands = 13, RULE_operand = 14, RULE_reg = 15, RULE_number = 16, 
		RULE_mnemonic = 17, RULE_variable = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "statement", "instruction", "conditional", "condition", "label", 
			"data", "storage", "dimension", "specifier_list", "specifier", "data_list", 
			"data_element", "operands", "operand", "reg", "number", "mnemonic", "variable"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'->'", "'zero'", "'carry'", "'negative'", "'equal'", "'greater'", 
			"'less'", "':'", "'{'", "'}'", "'['", "']'", "'('", "','", "')'", "'&'", 
			null, null, null, "'sp'", "'bp'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "COMMENT", "COMMENT_BLOCK", "REGISTER", 
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

	@Override
	public String getGrammarFileName() { return "Enca.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EncaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAME) {
				{
				{
				setState(38);
				statement();
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StatLabContext extends StatementContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public StatLabContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class StatInstrContext extends StatementContext {
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public StatInstrContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class StatDataContext extends StatementContext {
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public StatDataContext(StatementContext ctx) { copyFrom(ctx); }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new StatInstrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				instruction();
				}
				break;
			case 2:
				_localctx = new StatDataContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				data();
				}
				break;
			case 3:
				_localctx = new StatLabContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				label();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstructionContext extends ParserRuleContext {
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	 
		public InstructionContext() { }
		public void copyFrom(InstructionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InstrCondContext extends InstructionContext {
		public MnemonicContext mnemonic() {
			return getRuleContext(MnemonicContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public InstrCondContext(InstructionContext ctx) { copyFrom(ctx); }
	}
	public static class InstrContext extends InstructionContext {
		public MnemonicContext mnemonic() {
			return getRuleContext(MnemonicContext.class,0);
		}
		public InstrContext(InstructionContext ctx) { copyFrom(ctx); }
	}
	public static class InstrOperContext extends InstructionContext {
		public MnemonicContext mnemonic() {
			return getRuleContext(MnemonicContext.class,0);
		}
		public OperandsContext operands() {
			return getRuleContext(OperandsContext.class,0);
		}
		public InstrOperContext(InstructionContext ctx) { copyFrom(ctx); }
	}
	public static class InstrOperCondContext extends InstructionContext {
		public MnemonicContext mnemonic() {
			return getRuleContext(MnemonicContext.class,0);
		}
		public OperandsContext operands() {
			return getRuleContext(OperandsContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public InstrOperCondContext(InstructionContext ctx) { copyFrom(ctx); }
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruction);
		try {
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new InstrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				mnemonic();
				}
				break;
			case 2:
				_localctx = new InstrOperContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				mnemonic();
				setState(51);
				operands();
				}
				break;
			case 3:
				_localctx = new InstrCondContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(53);
				mnemonic();
				setState(54);
				conditional();
				}
				break;
			case 4:
				_localctx = new InstrOperCondContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(56);
				mnemonic();
				setState(57);
				operands();
				setState(58);
				conditional();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(T__0);
			setState(63);
			condition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(EncaParser.NAME, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(NAME);
			setState(68);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataContext extends ParserRuleContext {
		public DataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data; }
	 
		public DataContext() { }
		public void copyFrom(DataContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DataSingleContext extends DataContext {
		public StorageContext storage() {
			return getRuleContext(StorageContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public DataSingleContext(DataContext ctx) { copyFrom(ctx); }
	}
	public static class DataArryContext extends DataContext {
		public StorageContext storage() {
			return getRuleContext(StorageContext.class,0);
		}
		public Data_listContext data_list() {
			return getRuleContext(Data_listContext.class,0);
		}
		public DataArryContext(DataContext ctx) { copyFrom(ctx); }
	}

	public final DataContext data() throws RecognitionException {
		DataContext _localctx = new DataContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_data);
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new DataArryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				storage();
				setState(71);
				match(T__8);
				setState(72);
				data_list();
				setState(73);
				match(T__9);
				}
				break;
			case 2:
				_localctx = new DataSingleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				storage();
				setState(76);
				number();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StorageContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(EncaParser.NAME, 0); }
		public DimensionContext dimension() {
			return getRuleContext(DimensionContext.class,0);
		}
		public Specifier_listContext specifier_list() {
			return getRuleContext(Specifier_listContext.class,0);
		}
		public StorageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storage; }
	}

	public final StorageContext storage() throws RecognitionException {
		StorageContext _localctx = new StorageContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_storage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(NAME);
			setState(81);
			dimension();
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(82);
				specifier_list();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimensionContext extends ParserRuleContext {
		public DimensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimension; }
	 
		public DimensionContext() { }
		public void copyFrom(DimensionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DimEmptyContext extends DimensionContext {
		public DimEmptyContext(DimensionContext ctx) { copyFrom(ctx); }
	}
	public static class DimNumberContext extends DimensionContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public DimNumberContext(DimensionContext ctx) { copyFrom(ctx); }
	}

	public final DimensionContext dimension() throws RecognitionException {
		DimensionContext _localctx = new DimensionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_dimension);
		try {
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new DimEmptyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				match(T__10);
				setState(86);
				match(T__11);
				}
				break;
			case 2:
				_localctx = new DimNumberContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				match(T__10);
				setState(88);
				number();
				setState(89);
				match(T__11);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Specifier_listContext extends ParserRuleContext {
		public List<SpecifierContext> specifier() {
			return getRuleContexts(SpecifierContext.class);
		}
		public SpecifierContext specifier(int i) {
			return getRuleContext(SpecifierContext.class,i);
		}
		public Specifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specifier_list; }
	}

	public final Specifier_listContext specifier_list() throws RecognitionException {
		Specifier_listContext _localctx = new Specifier_listContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_specifier_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(T__12);
			setState(94);
			specifier();
			setState(99);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(95);
					match(T__13);
					setState(96);
					specifier();
					}
					} 
				}
				setState(101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(102);
				match(T__13);
				}
			}

			setState(105);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpecifierContext extends ParserRuleContext {
		public SpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specifier; }
	 
		public SpecifierContext() { }
		public void copyFrom(SpecifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SpecNumContext extends SpecifierContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public SpecNumContext(SpecifierContext ctx) { copyFrom(ctx); }
	}
	public static class SpecNameContext extends SpecifierContext {
		public TerminalNode NAME() { return getToken(EncaParser.NAME, 0); }
		public SpecNameContext(SpecifierContext ctx) { copyFrom(ctx); }
	}

	public final SpecifierContext specifier() throws RecognitionException {
		SpecifierContext _localctx = new SpecifierContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_specifier);
		try {
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				_localctx = new SpecNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(NAME);
				}
				break;
			case DEC:
			case HEX:
			case BIN:
			case OCT:
			case FLT:
			case SCI:
				_localctx = new SpecNumContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				number();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Data_listContext extends ParserRuleContext {
		public List<Data_elementContext> data_element() {
			return getRuleContexts(Data_elementContext.class);
		}
		public Data_elementContext data_element(int i) {
			return getRuleContext(Data_elementContext.class,i);
		}
		public Data_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_list; }
	}

	public final Data_listContext data_list() throws RecognitionException {
		Data_listContext _localctx = new Data_listContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_data_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			data_element();
			setState(116);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(112);
					match(T__13);
					setState(113);
					data_element();
					}
					} 
				}
				setState(118);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(119);
				match(T__13);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Data_elementContext extends ParserRuleContext {
		public Data_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_element; }
	 
		public Data_elementContext() { }
		public void copyFrom(Data_elementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DataNumberContext extends Data_elementContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public DataNumberContext(Data_elementContext ctx) { copyFrom(ctx); }
	}
	public static class DataVariableContext extends Data_elementContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public DataVariableContext(Data_elementContext ctx) { copyFrom(ctx); }
	}

	public final Data_elementContext data_element() throws RecognitionException {
		Data_elementContext _localctx = new Data_elementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_data_element);
		try {
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEC:
			case HEX:
			case BIN:
			case OCT:
			case FLT:
			case SCI:
				_localctx = new DataNumberContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				number();
				}
				break;
			case T__15:
			case NAME:
				_localctx = new DataVariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperandsContext extends ParserRuleContext {
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public OperandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operands; }
	}

	public final OperandsContext operands() throws RecognitionException {
		OperandsContext _localctx = new OperandsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_operands);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			operand();
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(127);
				match(T__13);
				setState(128);
				operand();
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperandContext extends ParserRuleContext {
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
	 
		public OperandContext() { }
		public void copyFrom(OperandContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OpRegContext extends OperandContext {
		public RegContext reg() {
			return getRuleContext(RegContext.class,0);
		}
		public OpRegContext(OperandContext ctx) { copyFrom(ctx); }
	}
	public static class OpNumContext extends OperandContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public OpNumContext(OperandContext ctx) { copyFrom(ctx); }
	}
	public static class OpVarContext extends OperandContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public OpVarContext(OperandContext ctx) { copyFrom(ctx); }
	}
	public static class OpCondContext extends OperandContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public OpCondContext(OperandContext ctx) { copyFrom(ctx); }
	}
	public static class OpRelContext extends OperandContext {
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public OpRelContext(OperandContext ctx) { copyFrom(ctx); }
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_operand);
		int _la;
		try {
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				_localctx = new OpRelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				match(T__10);
				setState(135);
				operand();
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(136);
					match(T__13);
					setState(137);
					number();
					}
				}

				setState(140);
				match(T__11);
				}
				break;
			case REGISTER:
			case STACK:
			case BASE:
				_localctx = new OpRegContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				reg();
				}
				break;
			case DEC:
			case HEX:
			case BIN:
			case OCT:
			case FLT:
			case SCI:
				_localctx = new OpNumContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(143);
				number();
				}
				break;
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
				_localctx = new OpCondContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(144);
				condition();
				}
				break;
			case T__15:
			case NAME:
				_localctx = new OpVarContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(145);
				variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegContext extends ParserRuleContext {
		public RegContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reg; }
	 
		public RegContext() { }
		public void copyFrom(RegContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RegStandardContext extends RegContext {
		public TerminalNode REGISTER() { return getToken(EncaParser.REGISTER, 0); }
		public RegStandardContext(RegContext ctx) { copyFrom(ctx); }
	}
	public static class RegStackContext extends RegContext {
		public TerminalNode STACK() { return getToken(EncaParser.STACK, 0); }
		public RegStackContext(RegContext ctx) { copyFrom(ctx); }
	}
	public static class RegBaseContext extends RegContext {
		public TerminalNode BASE() { return getToken(EncaParser.BASE, 0); }
		public RegBaseContext(RegContext ctx) { copyFrom(ctx); }
	}

	public final RegContext reg() throws RecognitionException {
		RegContext _localctx = new RegContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_reg);
		try {
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REGISTER:
				_localctx = new RegStandardContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				match(REGISTER);
				}
				break;
			case STACK:
				_localctx = new RegStackContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				match(STACK);
				}
				break;
			case BASE:
				_localctx = new RegBaseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
				match(BASE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumFltContext extends NumberContext {
		public TerminalNode FLT() { return getToken(EncaParser.FLT, 0); }
		public NumFltContext(NumberContext ctx) { copyFrom(ctx); }
	}
	public static class NumOctContext extends NumberContext {
		public TerminalNode OCT() { return getToken(EncaParser.OCT, 0); }
		public NumOctContext(NumberContext ctx) { copyFrom(ctx); }
	}
	public static class NumDecContext extends NumberContext {
		public TerminalNode DEC() { return getToken(EncaParser.DEC, 0); }
		public NumDecContext(NumberContext ctx) { copyFrom(ctx); }
	}
	public static class NumBinContext extends NumberContext {
		public TerminalNode BIN() { return getToken(EncaParser.BIN, 0); }
		public NumBinContext(NumberContext ctx) { copyFrom(ctx); }
	}
	public static class NumSciContext extends NumberContext {
		public TerminalNode SCI() { return getToken(EncaParser.SCI, 0); }
		public NumSciContext(NumberContext ctx) { copyFrom(ctx); }
	}
	public static class NumHexContext extends NumberContext {
		public TerminalNode HEX() { return getToken(EncaParser.HEX, 0); }
		public NumHexContext(NumberContext ctx) { copyFrom(ctx); }
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_number);
		try {
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEC:
				_localctx = new NumDecContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				match(DEC);
				}
				break;
			case FLT:
				_localctx = new NumFltContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				match(FLT);
				}
				break;
			case SCI:
				_localctx = new NumSciContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
				match(SCI);
				}
				break;
			case HEX:
				_localctx = new NumHexContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(156);
				match(HEX);
				}
				break;
			case BIN:
				_localctx = new NumBinContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(157);
				match(BIN);
				}
				break;
			case OCT:
				_localctx = new NumOctContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(158);
				match(OCT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MnemonicContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(EncaParser.NAME, 0); }
		public MnemonicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mnemonic; }
	}

	public final MnemonicContext mnemonic() throws RecognitionException {
		MnemonicContext _localctx = new MnemonicContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_mnemonic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	 
		public VariableContext() { }
		public void copyFrom(VariableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarAddrContext extends VariableContext {
		public TerminalNode NAME() { return getToken(EncaParser.NAME, 0); }
		public VarAddrContext(VariableContext ctx) { copyFrom(ctx); }
	}
	public static class VarContext extends VariableContext {
		public TerminalNode NAME() { return getToken(EncaParser.NAME, 0); }
		public VarContext(VariableContext ctx) { copyFrom(ctx); }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_variable);
		try {
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				_localctx = new VarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				match(NAME);
				}
				break;
			case T__15:
				_localctx = new VarAddrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				match(T__15);
				setState(165);
				match(NAME);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u00ab\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\7\2*\n\2\f\2\16\2-\13\2\3\3\3\3\3\3\5\3\62\n"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4?\n\4\3\5\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bQ\n\b\3\t\3\t\3"+
		"\t\5\tV\n\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n^\n\n\3\13\3\13\3\13\3\13\7\13"+
		"d\n\13\f\13\16\13g\13\13\3\13\5\13j\n\13\3\13\3\13\3\f\3\f\5\fp\n\f\3"+
		"\r\3\r\3\r\7\ru\n\r\f\r\16\rx\13\r\3\r\5\r{\n\r\3\16\3\16\5\16\177\n\16"+
		"\3\17\3\17\3\17\7\17\u0084\n\17\f\17\16\17\u0087\13\17\3\20\3\20\3\20"+
		"\3\20\5\20\u008d\n\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0095\n\20\3"+
		"\21\3\21\3\21\5\21\u009a\n\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00a2"+
		"\n\22\3\23\3\23\3\24\3\24\3\24\5\24\u00a9\n\24\3\24\2\2\25\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&\2\3\3\2\4\t\2\u00b4\2+\3\2\2\2\4\61\3"+
		"\2\2\2\6>\3\2\2\2\b@\3\2\2\2\nC\3\2\2\2\fE\3\2\2\2\16P\3\2\2\2\20R\3\2"+
		"\2\2\22]\3\2\2\2\24_\3\2\2\2\26o\3\2\2\2\30q\3\2\2\2\32~\3\2\2\2\34\u0080"+
		"\3\2\2\2\36\u0094\3\2\2\2 \u0099\3\2\2\2\"\u00a1\3\2\2\2$\u00a3\3\2\2"+
		"\2&\u00a8\3\2\2\2(*\5\4\3\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\3"+
		"\3\2\2\2-+\3\2\2\2.\62\5\6\4\2/\62\5\16\b\2\60\62\5\f\7\2\61.\3\2\2\2"+
		"\61/\3\2\2\2\61\60\3\2\2\2\62\5\3\2\2\2\63?\5$\23\2\64\65\5$\23\2\65\66"+
		"\5\34\17\2\66?\3\2\2\2\678\5$\23\289\5\b\5\29?\3\2\2\2:;\5$\23\2;<\5\34"+
		"\17\2<=\5\b\5\2=?\3\2\2\2>\63\3\2\2\2>\64\3\2\2\2>\67\3\2\2\2>:\3\2\2"+
		"\2?\7\3\2\2\2@A\7\3\2\2AB\5\n\6\2B\t\3\2\2\2CD\t\2\2\2D\13\3\2\2\2EF\7"+
		"\30\2\2FG\7\n\2\2G\r\3\2\2\2HI\5\20\t\2IJ\7\13\2\2JK\5\30\r\2KL\7\f\2"+
		"\2LQ\3\2\2\2MN\5\20\t\2NO\5\"\22\2OQ\3\2\2\2PH\3\2\2\2PM\3\2\2\2Q\17\3"+
		"\2\2\2RS\7\30\2\2SU\5\22\n\2TV\5\24\13\2UT\3\2\2\2UV\3\2\2\2V\21\3\2\2"+
		"\2WX\7\r\2\2X^\7\16\2\2YZ\7\r\2\2Z[\5\"\22\2[\\\7\16\2\2\\^\3\2\2\2]W"+
		"\3\2\2\2]Y\3\2\2\2^\23\3\2\2\2_`\7\17\2\2`e\5\26\f\2ab\7\20\2\2bd\5\26"+
		"\f\2ca\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fi\3\2\2\2ge\3\2\2\2hj\7\20"+
		"\2\2ih\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\7\21\2\2l\25\3\2\2\2mp\7\30\2\2n"+
		"p\5\"\22\2om\3\2\2\2on\3\2\2\2p\27\3\2\2\2qv\5\32\16\2rs\7\20\2\2su\5"+
		"\32\16\2tr\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wz\3\2\2\2xv\3\2\2\2y"+
		"{\7\20\2\2zy\3\2\2\2z{\3\2\2\2{\31\3\2\2\2|\177\5\"\22\2}\177\5&\24\2"+
		"~|\3\2\2\2~}\3\2\2\2\177\33\3\2\2\2\u0080\u0085\5\36\20\2\u0081\u0082"+
		"\7\20\2\2\u0082\u0084\5\36\20\2\u0083\u0081\3\2\2\2\u0084\u0087\3\2\2"+
		"\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\35\3\2\2\2\u0087\u0085"+
		"\3\2\2\2\u0088\u0089\7\r\2\2\u0089\u008c\5\36\20\2\u008a\u008b\7\20\2"+
		"\2\u008b\u008d\5\"\22\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u008f\7\16\2\2\u008f\u0095\3\2\2\2\u0090\u0095\5"+
		" \21\2\u0091\u0095\5\"\22\2\u0092\u0095\5\n\6\2\u0093\u0095\5&\24\2\u0094"+
		"\u0088\3\2\2\2\u0094\u0090\3\2\2\2\u0094\u0091\3\2\2\2\u0094\u0092\3\2"+
		"\2\2\u0094\u0093\3\2\2\2\u0095\37\3\2\2\2\u0096\u009a\7\25\2\2\u0097\u009a"+
		"\7\26\2\2\u0098\u009a\7\27\2\2\u0099\u0096\3\2\2\2\u0099\u0097\3\2\2\2"+
		"\u0099\u0098\3\2\2\2\u009a!\3\2\2\2\u009b\u00a2\7\31\2\2\u009c\u00a2\7"+
		"\35\2\2\u009d\u00a2\7\36\2\2\u009e\u00a2\7\32\2\2\u009f\u00a2\7\33\2\2"+
		"\u00a0\u00a2\7\34\2\2\u00a1\u009b\3\2\2\2\u00a1\u009c\3\2\2\2\u00a1\u009d"+
		"\3\2\2\2\u00a1\u009e\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2"+
		"#\3\2\2\2\u00a3\u00a4\7\30\2\2\u00a4%\3\2\2\2\u00a5\u00a9\7\30\2\2\u00a6"+
		"\u00a7\7\22\2\2\u00a7\u00a9\7\30\2\2\u00a8\u00a5\3\2\2\2\u00a8\u00a6\3"+
		"\2\2\2\u00a9\'\3\2\2\2\24+\61>PU]eiovz~\u0085\u008c\u0094\u0099\u00a1"+
		"\u00a8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}