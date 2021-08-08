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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, COMMENT=16, 
		COMMENT_BLOCK=17, REGISTER=18, STACK=19, BASE=20, NAME=21, DEC=22, HEX=23, 
		BIN=24, OCT=25, FLT=26, SCI=27, WHITESPACE=28;
	public static final int
		RULE_parse = 0, RULE_statement = 1, RULE_instruction = 2, RULE_conditional = 3, 
		RULE_condition = 4, RULE_label = 5, RULE_data = 6, RULE_storage = 7, RULE_specifier = 8, 
		RULE_data_list = 9, RULE_operands = 10, RULE_operand = 11, RULE_register = 12, 
		RULE_number = 13, RULE_mnemonic = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "statement", "instruction", "conditional", "condition", "label", 
			"data", "storage", "specifier", "data_list", "operands", "operand", "register", 
			"number", "mnemonic"
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
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAME) {
				{
				{
				setState(30);
				statement();
				}
				}
				setState(35);
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
			setState(39);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new StatInstrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				instruction();
				}
				break;
			case 2:
				_localctx = new StatDataContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				data();
				}
				break;
			case 3:
				_localctx = new StatLabContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
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
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new InstrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				mnemonic();
				}
				break;
			case 2:
				_localctx = new InstrOperContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				mnemonic();
				setState(43);
				operands();
				}
				break;
			case 3:
				_localctx = new InstrCondContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
				mnemonic();
				setState(46);
				conditional();
				}
				break;
			case 4:
				_localctx = new InstrOperCondContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(48);
				mnemonic();
				setState(49);
				operands();
				setState(50);
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
			setState(54);
			match(T__0);
			setState(55);
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
			setState(57);
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
			setState(59);
			match(NAME);
			setState(60);
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
		public StorageContext storage() {
			return getRuleContext(StorageContext.class,0);
		}
		public Data_listContext data_list() {
			return getRuleContext(Data_listContext.class,0);
		}
		public DataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data; }
	}

	public final DataContext data() throws RecognitionException {
		DataContext _localctx = new DataContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_data);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			storage();
			setState(63);
			match(T__8);
			setState(64);
			data_list();
			setState(65);
			match(T__9);
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
		public SpecifierContext specifier() {
			return getRuleContext(SpecifierContext.class,0);
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
			setState(67);
			match(NAME);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(68);
				specifier();
				}
			}

			setState(71);
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
		enterRule(_localctx, 16, RULE_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__10);
			setState(74);
			match(NAME);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(75);
				match(T__11);
				setState(76);
				number();
				}
			}

			setState(79);
			match(T__12);
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
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public Data_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_list; }
	}

	public final Data_listContext data_list() throws RecognitionException {
		Data_listContext _localctx = new Data_listContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_data_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			number();
			setState(86);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(82);
					match(T__11);
					setState(83);
					number();
					}
					} 
				}
				setState(88);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(89);
				match(T__11);
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
		enterRule(_localctx, 20, RULE_operands);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			operand();
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(93);
				match(T__11);
				setState(94);
				operand();
				}
				}
				setState(99);
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
		public RegisterContext register() {
			return getRuleContext(RegisterContext.class,0);
		}
		public OpRegContext(OperandContext ctx) { copyFrom(ctx); }
	}
	public static class OpNumContext extends OperandContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public OpNumContext(OperandContext ctx) { copyFrom(ctx); }
	}
	public static class OpNameContext extends OperandContext {
		public TerminalNode NAME() { return getToken(EncaParser.NAME, 0); }
		public OpNameContext(OperandContext ctx) { copyFrom(ctx); }
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
		public OpRelContext(OperandContext ctx) { copyFrom(ctx); }
	}
	public static class OpRelOffContext extends OperandContext {
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public OpRelOffContext(OperandContext ctx) { copyFrom(ctx); }
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_operand);
		try {
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new OpRelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				match(T__13);
				setState(101);
				operand();
				setState(102);
				match(T__14);
				}
				break;
			case 2:
				_localctx = new OpRelOffContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				match(T__13);
				setState(105);
				operand();
				setState(106);
				match(T__11);
				setState(107);
				number();
				setState(108);
				match(T__14);
				}
				break;
			case 3:
				_localctx = new OpRegContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				register();
				}
				break;
			case 4:
				_localctx = new OpNumContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(111);
				number();
				}
				break;
			case 5:
				_localctx = new OpCondContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(112);
				condition();
				}
				break;
			case 6:
				_localctx = new OpNameContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(113);
				match(NAME);
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

	public static class RegisterContext extends ParserRuleContext {
		public RegisterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_register; }
	 
		public RegisterContext() { }
		public void copyFrom(RegisterContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RegStackContext extends RegisterContext {
		public TerminalNode STACK() { return getToken(EncaParser.STACK, 0); }
		public RegStackContext(RegisterContext ctx) { copyFrom(ctx); }
	}
	public static class RegContext extends RegisterContext {
		public TerminalNode REGISTER() { return getToken(EncaParser.REGISTER, 0); }
		public RegContext(RegisterContext ctx) { copyFrom(ctx); }
	}
	public static class RegBaseContext extends RegisterContext {
		public TerminalNode BASE() { return getToken(EncaParser.BASE, 0); }
		public RegBaseContext(RegisterContext ctx) { copyFrom(ctx); }
	}

	public final RegisterContext register() throws RecognitionException {
		RegisterContext _localctx = new RegisterContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_register);
		try {
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REGISTER:
				_localctx = new RegContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				match(REGISTER);
				}
				break;
			case STACK:
				_localctx = new RegStackContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(STACK);
				}
				break;
			case BASE:
				_localctx = new RegBaseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
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
		enterRule(_localctx, 26, RULE_number);
		try {
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEC:
				_localctx = new NumDecContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				match(DEC);
				}
				break;
			case FLT:
				_localctx = new NumFltContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				match(FLT);
				}
				break;
			case SCI:
				_localctx = new NumSciContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				match(SCI);
				}
				break;
			case HEX:
				_localctx = new NumHexContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(124);
				match(HEX);
				}
				break;
			case BIN:
				_localctx = new NumBinContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(125);
				match(BIN);
				}
				break;
			case OCT:
				_localctx = new NumOctContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(126);
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
		enterRule(_localctx, 28, RULE_mnemonic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36\u0086\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\7\2\"\n\2\f\2"+
		"\16\2%\13\2\3\3\3\3\3\3\5\3*\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\4\67\n\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\5\tH\n\t\3\t\3\t\3\n\3\n\3\n\3\n\5\nP\n\n\3\n\3\n\3\13\3\13\3"+
		"\13\7\13W\n\13\f\13\16\13Z\13\13\3\13\5\13]\n\13\3\f\3\f\3\f\7\fb\n\f"+
		"\f\f\16\fe\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\5\ru\n\r\3\16\3\16\3\16\5\16z\n\16\3\17\3\17\3\17\3\17\3\17\3\17\5"+
		"\17\u0082\n\17\3\20\3\20\3\20\2\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36\2\3\3\2\4\t\2\u008d\2#\3\2\2\2\4)\3\2\2\2\6\66\3\2\2\2\b8\3\2\2"+
		"\2\n;\3\2\2\2\f=\3\2\2\2\16@\3\2\2\2\20E\3\2\2\2\22K\3\2\2\2\24S\3\2\2"+
		"\2\26^\3\2\2\2\30t\3\2\2\2\32y\3\2\2\2\34\u0081\3\2\2\2\36\u0083\3\2\2"+
		"\2 \"\5\4\3\2! \3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$\3\3\2\2\2%#\3"+
		"\2\2\2&*\5\6\4\2\'*\5\16\b\2(*\5\f\7\2)&\3\2\2\2)\'\3\2\2\2)(\3\2\2\2"+
		"*\5\3\2\2\2+\67\5\36\20\2,-\5\36\20\2-.\5\26\f\2.\67\3\2\2\2/\60\5\36"+
		"\20\2\60\61\5\b\5\2\61\67\3\2\2\2\62\63\5\36\20\2\63\64\5\26\f\2\64\65"+
		"\5\b\5\2\65\67\3\2\2\2\66+\3\2\2\2\66,\3\2\2\2\66/\3\2\2\2\66\62\3\2\2"+
		"\2\67\7\3\2\2\289\7\3\2\29:\5\n\6\2:\t\3\2\2\2;<\t\2\2\2<\13\3\2\2\2="+
		">\7\27\2\2>?\7\n\2\2?\r\3\2\2\2@A\5\20\t\2AB\7\13\2\2BC\5\24\13\2CD\7"+
		"\f\2\2D\17\3\2\2\2EG\7\27\2\2FH\5\22\n\2GF\3\2\2\2GH\3\2\2\2HI\3\2\2\2"+
		"IJ\7\n\2\2J\21\3\2\2\2KL\7\r\2\2LO\7\27\2\2MN\7\16\2\2NP\5\34\17\2OM\3"+
		"\2\2\2OP\3\2\2\2PQ\3\2\2\2QR\7\17\2\2R\23\3\2\2\2SX\5\34\17\2TU\7\16\2"+
		"\2UW\5\34\17\2VT\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\\\3\2\2\2ZX\3"+
		"\2\2\2[]\7\16\2\2\\[\3\2\2\2\\]\3\2\2\2]\25\3\2\2\2^c\5\30\r\2_`\7\16"+
		"\2\2`b\5\30\r\2a_\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\27\3\2\2\2ec"+
		"\3\2\2\2fg\7\20\2\2gh\5\30\r\2hi\7\21\2\2iu\3\2\2\2jk\7\20\2\2kl\5\30"+
		"\r\2lm\7\16\2\2mn\5\34\17\2no\7\21\2\2ou\3\2\2\2pu\5\32\16\2qu\5\34\17"+
		"\2ru\5\n\6\2su\7\27\2\2tf\3\2\2\2tj\3\2\2\2tp\3\2\2\2tq\3\2\2\2tr\3\2"+
		"\2\2ts\3\2\2\2u\31\3\2\2\2vz\7\24\2\2wz\7\25\2\2xz\7\26\2\2yv\3\2\2\2"+
		"yw\3\2\2\2yx\3\2\2\2z\33\3\2\2\2{\u0082\7\30\2\2|\u0082\7\34\2\2}\u0082"+
		"\7\35\2\2~\u0082\7\31\2\2\177\u0082\7\32\2\2\u0080\u0082\7\33\2\2\u0081"+
		"{\3\2\2\2\u0081|\3\2\2\2\u0081}\3\2\2\2\u0081~\3\2\2\2\u0081\177\3\2\2"+
		"\2\u0081\u0080\3\2\2\2\u0082\35\3\2\2\2\u0083\u0084\7\27\2\2\u0084\37"+
		"\3\2\2\2\r#)\66GOX\\cty\u0081";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}