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
		COMMENT_BLOCK=18, REGISTER=19, STACK=20, BASE=21, MNEMONIC=22, NAME=23, 
		DEC=24, HEX=25, BIN=26, OCT=27, FLT=28, AMP=29, SCI=30, WHITESPACE=31;
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
			"'less'", "':'", "'{'", "'}'", "'['", "']'", "'('", "','", "')'", "'='", 
			null, null, null, "'sp'", "'bp'", null, null, null, null, null, null, 
			null, "'&'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "COMMENT", "COMMENT_BLOCK", "REGISTER", 
			"STACK", "BASE", "MNEMONIC", "NAME", "DEC", "HEX", "BIN", "OCT", "FLT", 
			"AMP", "SCI", "WHITESPACE"
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
			while (_la==MNEMONIC || _la==NAME) {
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
	public static class DataArrayContext extends DataContext {
		public StorageContext storage() {
			return getRuleContext(StorageContext.class,0);
		}
		public Data_listContext data_list() {
			return getRuleContext(Data_listContext.class,0);
		}
		public DataArrayContext(DataContext ctx) { copyFrom(ctx); }
	}
	public static class DataSingleContext extends DataContext {
		public StorageContext storage() {
			return getRuleContext(StorageContext.class,0);
		}
		public Data_elementContext data_element() {
			return getRuleContext(Data_elementContext.class,0);
		}
		public DataSingleContext(DataContext ctx) { copyFrom(ctx); }
	}

	public final DataContext data() throws RecognitionException {
		DataContext _localctx = new DataContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_data);
		int _la;
		try {
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new DataArrayContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				storage();
				setState(71);
				match(T__8);
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NAME) | (1L << DEC) | (1L << HEX) | (1L << BIN) | (1L << OCT) | (1L << FLT) | (1L << AMP) | (1L << SCI))) != 0)) {
					{
					setState(72);
					data_list();
					}
				}

				setState(75);
				match(T__9);
				}
				break;
			case 2:
				_localctx = new DataSingleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				storage();
				setState(78);
				data_element();
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
			setState(82);
			match(NAME);
			setState(83);
			dimension();
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(84);
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
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new DimEmptyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				match(T__10);
				setState(88);
				match(T__11);
				}
				break;
			case 2:
				_localctx = new DimNumberContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				match(T__10);
				setState(90);
				number();
				setState(91);
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
			setState(95);
			match(T__12);
			setState(96);
			specifier();
			setState(101);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(97);
					match(T__13);
					setState(98);
					specifier();
					}
					} 
				}
				setState(103);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(104);
				match(T__13);
				}
			}

			setState(107);
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
		public TerminalNode NAME() { return getToken(EncaParser.NAME, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public SpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specifier; }
	}

	public final SpecifierContext specifier() throws RecognitionException {
		SpecifierContext _localctx = new SpecifierContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(NAME);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(110);
				match(T__15);
				setState(111);
				number();
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
			setState(114);
			data_element();
			setState(119);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(115);
					match(T__13);
					setState(116);
					data_element();
					}
					} 
				}
				setState(121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(122);
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
			setState(127);
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
				setState(125);
				number();
				}
				break;
			case NAME:
			case AMP:
				_localctx = new DataVariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
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
			setState(129);
			operand();
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(130);
				match(T__13);
				setState(131);
				operand();
				}
				}
				setState(136);
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
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				_localctx = new OpRelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(T__10);
				setState(138);
				operand();
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(139);
					match(T__13);
					setState(140);
					number();
					}
				}

				setState(143);
				match(T__11);
				}
				break;
			case REGISTER:
			case STACK:
			case BASE:
				_localctx = new OpRegContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
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
				setState(146);
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
				setState(147);
				condition();
				}
				break;
			case NAME:
			case AMP:
				_localctx = new OpVarContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(148);
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
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REGISTER:
				_localctx = new RegStandardContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(REGISTER);
				}
				break;
			case STACK:
				_localctx = new RegStackContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				match(STACK);
				}
				break;
			case BASE:
				_localctx = new RegBaseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
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
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEC:
				_localctx = new NumDecContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				match(DEC);
				}
				break;
			case FLT:
				_localctx = new NumFltContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				match(FLT);
				}
				break;
			case SCI:
				_localctx = new NumSciContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(158);
				match(SCI);
				}
				break;
			case HEX:
				_localctx = new NumHexContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(159);
				match(HEX);
				}
				break;
			case BIN:
				_localctx = new NumBinContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(160);
				match(BIN);
				}
				break;
			case OCT:
				_localctx = new NumOctContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(161);
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
		public TerminalNode MNEMONIC() { return getToken(EncaParser.MNEMONIC, 0); }
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
			setState(164);
			match(MNEMONIC);
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
		public TerminalNode AMP() { return getToken(EncaParser.AMP, 0); }
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
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				_localctx = new VarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				match(NAME);
				}
				break;
			case AMP:
				_localctx = new VarAddrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(AMP);
				setState(168);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\u00ae\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\7\2*\n\2\f\2\16\2-\13\2\3\3\3\3\3\3\5\3\62\n"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4?\n\4\3\5\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\5\bL\n\b\3\b\3\b\3\b\3\b\3\b\5\bS\n\b\3"+
		"\t\3\t\3\t\5\tX\n\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n`\n\n\3\13\3\13\3\13\3"+
		"\13\7\13f\n\13\f\13\16\13i\13\13\3\13\5\13l\n\13\3\13\3\13\3\f\3\f\3\f"+
		"\5\fs\n\f\3\r\3\r\3\r\7\rx\n\r\f\r\16\r{\13\r\3\r\5\r~\n\r\3\16\3\16\5"+
		"\16\u0082\n\16\3\17\3\17\3\17\7\17\u0087\n\17\f\17\16\17\u008a\13\17\3"+
		"\20\3\20\3\20\3\20\5\20\u0090\n\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u0098\n\20\3\21\3\21\3\21\5\21\u009d\n\21\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\5\22\u00a5\n\22\3\23\3\23\3\24\3\24\3\24\5\24\u00ac\n\24\3\24\2\2"+
		"\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\3\3\2\4\t\2\u00b8\2"+
		"+\3\2\2\2\4\61\3\2\2\2\6>\3\2\2\2\b@\3\2\2\2\nC\3\2\2\2\fE\3\2\2\2\16"+
		"R\3\2\2\2\20T\3\2\2\2\22_\3\2\2\2\24a\3\2\2\2\26o\3\2\2\2\30t\3\2\2\2"+
		"\32\u0081\3\2\2\2\34\u0083\3\2\2\2\36\u0097\3\2\2\2 \u009c\3\2\2\2\"\u00a4"+
		"\3\2\2\2$\u00a6\3\2\2\2&\u00ab\3\2\2\2(*\5\4\3\2)(\3\2\2\2*-\3\2\2\2+"+
		")\3\2\2\2+,\3\2\2\2,\3\3\2\2\2-+\3\2\2\2.\62\5\6\4\2/\62\5\16\b\2\60\62"+
		"\5\f\7\2\61.\3\2\2\2\61/\3\2\2\2\61\60\3\2\2\2\62\5\3\2\2\2\63?\5$\23"+
		"\2\64\65\5$\23\2\65\66\5\34\17\2\66?\3\2\2\2\678\5$\23\289\5\b\5\29?\3"+
		"\2\2\2:;\5$\23\2;<\5\34\17\2<=\5\b\5\2=?\3\2\2\2>\63\3\2\2\2>\64\3\2\2"+
		"\2>\67\3\2\2\2>:\3\2\2\2?\7\3\2\2\2@A\7\3\2\2AB\5\n\6\2B\t\3\2\2\2CD\t"+
		"\2\2\2D\13\3\2\2\2EF\7\31\2\2FG\7\n\2\2G\r\3\2\2\2HI\5\20\t\2IK\7\13\2"+
		"\2JL\5\30\r\2KJ\3\2\2\2KL\3\2\2\2LM\3\2\2\2MN\7\f\2\2NS\3\2\2\2OP\5\20"+
		"\t\2PQ\5\32\16\2QS\3\2\2\2RH\3\2\2\2RO\3\2\2\2S\17\3\2\2\2TU\7\31\2\2"+
		"UW\5\22\n\2VX\5\24\13\2WV\3\2\2\2WX\3\2\2\2X\21\3\2\2\2YZ\7\r\2\2Z`\7"+
		"\16\2\2[\\\7\r\2\2\\]\5\"\22\2]^\7\16\2\2^`\3\2\2\2_Y\3\2\2\2_[\3\2\2"+
		"\2`\23\3\2\2\2ab\7\17\2\2bg\5\26\f\2cd\7\20\2\2df\5\26\f\2ec\3\2\2\2f"+
		"i\3\2\2\2ge\3\2\2\2gh\3\2\2\2hk\3\2\2\2ig\3\2\2\2jl\7\20\2\2kj\3\2\2\2"+
		"kl\3\2\2\2lm\3\2\2\2mn\7\21\2\2n\25\3\2\2\2or\7\31\2\2pq\7\22\2\2qs\5"+
		"\"\22\2rp\3\2\2\2rs\3\2\2\2s\27\3\2\2\2ty\5\32\16\2uv\7\20\2\2vx\5\32"+
		"\16\2wu\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z}\3\2\2\2{y\3\2\2\2|~\7"+
		"\20\2\2}|\3\2\2\2}~\3\2\2\2~\31\3\2\2\2\177\u0082\5\"\22\2\u0080\u0082"+
		"\5&\24\2\u0081\177\3\2\2\2\u0081\u0080\3\2\2\2\u0082\33\3\2\2\2\u0083"+
		"\u0088\5\36\20\2\u0084\u0085\7\20\2\2\u0085\u0087\5\36\20\2\u0086\u0084"+
		"\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		"\35\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008c\7\r\2\2\u008c\u008f\5\36\20"+
		"\2\u008d\u008e\7\20\2\2\u008e\u0090\5\"\22\2\u008f\u008d\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\7\16\2\2\u0092\u0098\3"+
		"\2\2\2\u0093\u0098\5 \21\2\u0094\u0098\5\"\22\2\u0095\u0098\5\n\6\2\u0096"+
		"\u0098\5&\24\2\u0097\u008b\3\2\2\2\u0097\u0093\3\2\2\2\u0097\u0094\3\2"+
		"\2\2\u0097\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u0098\37\3\2\2\2\u0099\u009d"+
		"\7\25\2\2\u009a\u009d\7\26\2\2\u009b\u009d\7\27\2\2\u009c\u0099\3\2\2"+
		"\2\u009c\u009a\3\2\2\2\u009c\u009b\3\2\2\2\u009d!\3\2\2\2\u009e\u00a5"+
		"\7\32\2\2\u009f\u00a5\7\36\2\2\u00a0\u00a5\7 \2\2\u00a1\u00a5\7\33\2\2"+
		"\u00a2\u00a5\7\34\2\2\u00a3\u00a5\7\35\2\2\u00a4\u009e\3\2\2\2\u00a4\u009f"+
		"\3\2\2\2\u00a4\u00a0\3\2\2\2\u00a4\u00a1\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4"+
		"\u00a3\3\2\2\2\u00a5#\3\2\2\2\u00a6\u00a7\7\30\2\2\u00a7%\3\2\2\2\u00a8"+
		"\u00ac\7\31\2\2\u00a9\u00aa\7\37\2\2\u00aa\u00ac\7\31\2\2\u00ab\u00a8"+
		"\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\'\3\2\2\2\25+\61>KRW_gkry}\u0081\u0088"+
		"\u008f\u0097\u009c\u00a4\u00ab";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}