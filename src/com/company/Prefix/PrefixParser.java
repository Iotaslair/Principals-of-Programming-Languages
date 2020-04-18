// Generated from C:/Users/billy/POPL/Principals-of-Programming-Languages/src/com/company/Prefix\Prefix.g4 by ANTLR 4.8
package com.company.Prefix;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PrefixParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, OR=5, AND=6, NOT=7, FALSE=8, TRUE=9, WS=10, 
		OPENPAREN=11, CLOSEPAREN=12, IF=13, OPENBRACKET=14, CLOSEBRACKET=15, ELSE=16, 
		DEF=17, CALL=18, VALIDVARIABLENAMES=19, INTEGER=20;
	public static final int
		RULE_expr = 0, RULE_data = 1, RULE_booleanvalue = 2, RULE_integervalue = 3, 
		RULE_val = 4, RULE_ifstatement = 5, RULE_variabledeclaration = 6, RULE_variablename = 7, 
		RULE_integer = 8, RULE_add = 9, RULE_subtract = 10, RULE_multiply = 11, 
		RULE_functiondeclaration = 12, RULE_functioncall = 13, RULE_or = 14, RULE_and = 15, 
		RULE_not = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"expr", "data", "booleanvalue", "integervalue", "val", "ifstatement", 
			"variabledeclaration", "variablename", "integer", "add", "subtract", 
			"multiply", "functiondeclaration", "functioncall", "or", "and", "not"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'+'", "'-'", "'*'", "'or'", "'and'", "'not'", "'false'", 
			"'true'", null, "'('", "')'", "'if'", "'{'", "'}'", "'else'", "'def'", 
			"'call'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "OR", "AND", "NOT", "FALSE", "TRUE", "WS", 
			"OPENPAREN", "CLOSEPAREN", "IF", "OPENBRACKET", "CLOSEBRACKET", "ELSE", 
			"DEF", "CALL", "VALIDVARIABLENAMES", "INTEGER"
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
	public String getGrammarFileName() { return "Prefix.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PrefixParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ExprContext extends ParserRuleContext {
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public IfstatementContext ifstatement() {
			return getRuleContext(IfstatementContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixListener ) ((PrefixListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixListener ) ((PrefixListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrefixVisitor ) return ((PrefixVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expr);
		try {
			setState(36);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				data();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				ifstatement();
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

	public static class DataContext extends ParserRuleContext {
		public FunctiondeclarationContext functiondeclaration() {
			return getRuleContext(FunctiondeclarationContext.class,0);
		}
		public IntegervalueContext integervalue() {
			return getRuleContext(IntegervalueContext.class,0);
		}
		public VariablenameContext variablename() {
			return getRuleContext(VariablenameContext.class,0);
		}
		public FunctioncallContext functioncall() {
			return getRuleContext(FunctioncallContext.class,0);
		}
		public VariabledeclarationContext variabledeclaration() {
			return getRuleContext(VariabledeclarationContext.class,0);
		}
		public BooleanvalueContext booleanvalue() {
			return getRuleContext(BooleanvalueContext.class,0);
		}
		public DataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixListener ) ((PrefixListener)listener).enterData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixListener ) ((PrefixListener)listener).exitData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrefixVisitor ) return ((PrefixVisitor<? extends T>)visitor).visitData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataContext data() throws RecognitionException {
		DataContext _localctx = new DataContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_data);
		try {
			setState(44);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				functiondeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				integervalue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				variablename();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(41);
				functioncall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(42);
				variabledeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(43);
				booleanvalue();
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

	public static class BooleanvalueContext extends ParserRuleContext {
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public NotContext not() {
			return getRuleContext(NotContext.class,0);
		}
		public OrContext or() {
			return getRuleContext(OrContext.class,0);
		}
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public BooleanvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixListener ) ((PrefixListener)listener).enterBooleanvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixListener ) ((PrefixListener)listener).exitBooleanvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrefixVisitor ) return ((PrefixVisitor<? extends T>)visitor).visitBooleanvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanvalueContext booleanvalue() throws RecognitionException {
		BooleanvalueContext _localctx = new BooleanvalueContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_booleanvalue);
		try {
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				val();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				not();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				or();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(49);
				and();
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

	public static class IntegervalueContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public AddContext add() {
			return getRuleContext(AddContext.class,0);
		}
		public SubtractContext subtract() {
			return getRuleContext(SubtractContext.class,0);
		}
		public MultiplyContext multiply() {
			return getRuleContext(MultiplyContext.class,0);
		}
		public IntegervalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integervalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixListener ) ((PrefixListener)listener).enterIntegervalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixListener ) ((PrefixListener)listener).exitIntegervalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrefixVisitor ) return ((PrefixVisitor<? extends T>)visitor).visitIntegervalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegervalueContext integervalue() throws RecognitionException {
		IntegervalueContext _localctx = new IntegervalueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_integervalue);
		try {
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				integer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				add();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				subtract();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(55);
				multiply();
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

	public static class ValContext extends ParserRuleContext {
		public TerminalNode FALSE() { return getToken(PrefixParser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(PrefixParser.TRUE, 0); }
		public ValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixListener ) ((PrefixListener)listener).enterVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixListener ) ((PrefixListener)listener).exitVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrefixVisitor ) return ((PrefixVisitor<? extends T>)visitor).visitVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
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

	public static class IfstatementContext extends ParserRuleContext {
		public BooleanvalueContext ifsection;
		public ExprContext thensection;
		public ExprContext elsesection;
		public TerminalNode IF() { return getToken(PrefixParser.IF, 0); }
		public TerminalNode OPENPAREN() { return getToken(PrefixParser.OPENPAREN, 0); }
		public List<TerminalNode> CLOSEPAREN() { return getTokens(PrefixParser.CLOSEPAREN); }
		public TerminalNode CLOSEPAREN(int i) {
			return getToken(PrefixParser.CLOSEPAREN, i);
		}
		public List<TerminalNode> OPENBRACKET() { return getTokens(PrefixParser.OPENBRACKET); }
		public TerminalNode OPENBRACKET(int i) {
			return getToken(PrefixParser.OPENBRACKET, i);
		}
		public TerminalNode CLOSEBRACKET() { return getToken(PrefixParser.CLOSEBRACKET, 0); }
		public BooleanvalueContext booleanvalue() {
			return getRuleContext(BooleanvalueContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(PrefixParser.ELSE, 0); }
		public IfstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixListener ) ((PrefixListener)listener).enterIfstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixListener ) ((PrefixListener)listener).exitIfstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrefixVisitor ) return ((PrefixVisitor<? extends T>)visitor).visitIfstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstatementContext ifstatement() throws RecognitionException {
		IfstatementContext _localctx = new IfstatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifstatement);
		try {
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				match(IF);
				setState(61);
				match(OPENPAREN);
				setState(62);
				((IfstatementContext)_localctx).ifsection = booleanvalue();
				setState(63);
				match(CLOSEPAREN);
				setState(64);
				match(OPENBRACKET);
				setState(65);
				((IfstatementContext)_localctx).thensection = expr();
				setState(66);
				match(CLOSEBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				match(IF);
				setState(70);
				match(OPENPAREN);
				setState(71);
				((IfstatementContext)_localctx).ifsection = booleanvalue();
				setState(72);
				match(CLOSEPAREN);
				setState(73);
				match(OPENBRACKET);
				setState(74);
				((IfstatementContext)_localctx).thensection = expr();
				setState(75);
				match(CLOSEPAREN);
				setState(76);
				match(ELSE);
				setState(77);
				match(OPENBRACKET);
				setState(78);
				((IfstatementContext)_localctx).elsesection = expr();
				setState(79);
				match(CLOSEBRACKET);
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

	public static class VariabledeclarationContext extends ParserRuleContext {
		public VariablenameContext varname;
		public DataContext value;
		public ExprContext run;
		public List<TerminalNode> OPENPAREN() { return getTokens(PrefixParser.OPENPAREN); }
		public TerminalNode OPENPAREN(int i) {
			return getToken(PrefixParser.OPENPAREN, i);
		}
		public List<TerminalNode> CLOSEPAREN() { return getTokens(PrefixParser.CLOSEPAREN); }
		public TerminalNode CLOSEPAREN(int i) {
			return getToken(PrefixParser.CLOSEPAREN, i);
		}
		public VariablenameContext variablename() {
			return getRuleContext(VariablenameContext.class,0);
		}
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VariabledeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variabledeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixListener ) ((PrefixListener)listener).enterVariabledeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixListener ) ((PrefixListener)listener).exitVariabledeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrefixVisitor ) return ((PrefixVisitor<? extends T>)visitor).visitVariabledeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariabledeclarationContext variabledeclaration() throws RecognitionException {
		VariabledeclarationContext _localctx = new VariabledeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variabledeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(OPENPAREN);
			setState(84);
			((VariabledeclarationContext)_localctx).varname = variablename();
			setState(85);
			match(T__0);
			setState(86);
			((VariabledeclarationContext)_localctx).value = data();
			setState(87);
			match(OPENPAREN);
			setState(88);
			((VariabledeclarationContext)_localctx).run = expr();
			setState(89);
			match(CLOSEPAREN);
			setState(90);
			match(CLOSEPAREN);
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

	public static class VariablenameContext extends ParserRuleContext {
		public Token varname;
		public TerminalNode VALIDVARIABLENAMES() { return getToken(PrefixParser.VALIDVARIABLENAMES, 0); }
		public VariablenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variablename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixListener ) ((PrefixListener)listener).enterVariablename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixListener ) ((PrefixListener)listener).exitVariablename(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrefixVisitor ) return ((PrefixVisitor<? extends T>)visitor).visitVariablename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariablenameContext variablename() throws RecognitionException {
		VariablenameContext _localctx = new VariablenameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variablename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			((VariablenameContext)_localctx).varname = match(VALIDVARIABLENAMES);
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

	public static class IntegerContext extends ParserRuleContext {
		public Token intvalue;
		public TerminalNode INTEGER() { return getToken(PrefixParser.INTEGER, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixListener ) ((PrefixListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixListener ) ((PrefixListener)listener).exitInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrefixVisitor ) return ((PrefixVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			((IntegerContext)_localctx).intvalue = match(INTEGER);
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

	public static class AddContext extends ParserRuleContext {
		public ExprContext left;
		public ExprContext right;
		public TerminalNode OPENPAREN() { return getToken(PrefixParser.OPENPAREN, 0); }
		public TerminalNode CLOSEPAREN() { return getToken(PrefixParser.CLOSEPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixListener ) ((PrefixListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixListener ) ((PrefixListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrefixVisitor ) return ((PrefixVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddContext add() throws RecognitionException {
		AddContext _localctx = new AddContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(OPENPAREN);
			setState(97);
			((AddContext)_localctx).left = expr();
			setState(98);
			match(T__1);
			setState(99);
			((AddContext)_localctx).right = expr();
			setState(100);
			match(CLOSEPAREN);
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

	public static class SubtractContext extends ParserRuleContext {
		public ExprContext left;
		public ExprContext right;
		public TerminalNode OPENPAREN() { return getToken(PrefixParser.OPENPAREN, 0); }
		public TerminalNode CLOSEPAREN() { return getToken(PrefixParser.CLOSEPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public SubtractContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subtract; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixListener ) ((PrefixListener)listener).enterSubtract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixListener ) ((PrefixListener)listener).exitSubtract(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrefixVisitor ) return ((PrefixVisitor<? extends T>)visitor).visitSubtract(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubtractContext subtract() throws RecognitionException {
		SubtractContext _localctx = new SubtractContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_subtract);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(OPENPAREN);
			setState(103);
			((SubtractContext)_localctx).left = expr();
			setState(104);
			match(T__2);
			setState(105);
			((SubtractContext)_localctx).right = expr();
			setState(106);
			match(CLOSEPAREN);
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

	public static class MultiplyContext extends ParserRuleContext {
		public ExprContext left;
		public ExprContext right;
		public TerminalNode OPENPAREN() { return getToken(PrefixParser.OPENPAREN, 0); }
		public TerminalNode CLOSEPAREN() { return getToken(PrefixParser.CLOSEPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MultiplyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiply; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixListener ) ((PrefixListener)listener).enterMultiply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixListener ) ((PrefixListener)listener).exitMultiply(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrefixVisitor ) return ((PrefixVisitor<? extends T>)visitor).visitMultiply(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplyContext multiply() throws RecognitionException {
		MultiplyContext _localctx = new MultiplyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_multiply);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(OPENPAREN);
			setState(109);
			((MultiplyContext)_localctx).left = expr();
			setState(110);
			match(T__3);
			setState(111);
			((MultiplyContext)_localctx).right = expr();
			setState(112);
			match(CLOSEPAREN);
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

	public static class FunctiondeclarationContext extends ParserRuleContext {
		public VariablenameContext functionname;
		public VariablenameContext variable;
		public ExprContext functionbody;
		public ExprContext run;
		public List<TerminalNode> OPENPAREN() { return getTokens(PrefixParser.OPENPAREN); }
		public TerminalNode OPENPAREN(int i) {
			return getToken(PrefixParser.OPENPAREN, i);
		}
		public TerminalNode DEF() { return getToken(PrefixParser.DEF, 0); }
		public List<TerminalNode> CLOSEPAREN() { return getTokens(PrefixParser.CLOSEPAREN); }
		public TerminalNode CLOSEPAREN(int i) {
			return getToken(PrefixParser.CLOSEPAREN, i);
		}
		public List<VariablenameContext> variablename() {
			return getRuleContexts(VariablenameContext.class);
		}
		public VariablenameContext variablename(int i) {
			return getRuleContext(VariablenameContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public FunctiondeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiondeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixListener ) ((PrefixListener)listener).enterFunctiondeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixListener ) ((PrefixListener)listener).exitFunctiondeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrefixVisitor ) return ((PrefixVisitor<? extends T>)visitor).visitFunctiondeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctiondeclarationContext functiondeclaration() throws RecognitionException {
		FunctiondeclarationContext _localctx = new FunctiondeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functiondeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(OPENPAREN);
			setState(115);
			match(DEF);
			setState(116);
			((FunctiondeclarationContext)_localctx).functionname = variablename();
			setState(117);
			((FunctiondeclarationContext)_localctx).variable = variablename();
			setState(118);
			match(OPENPAREN);
			setState(119);
			((FunctiondeclarationContext)_localctx).functionbody = expr();
			setState(120);
			((FunctiondeclarationContext)_localctx).run = expr();
			setState(121);
			match(CLOSEPAREN);
			setState(122);
			match(CLOSEPAREN);
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

	public static class FunctioncallContext extends ParserRuleContext {
		public VariablenameContext functionname;
		public ExprContext variable;
		public TerminalNode CALL() { return getToken(PrefixParser.CALL, 0); }
		public VariablenameContext variablename() {
			return getRuleContext(VariablenameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FunctioncallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functioncall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixListener ) ((PrefixListener)listener).enterFunctioncall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixListener ) ((PrefixListener)listener).exitFunctioncall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrefixVisitor ) return ((PrefixVisitor<? extends T>)visitor).visitFunctioncall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctioncallContext functioncall() throws RecognitionException {
		FunctioncallContext _localctx = new FunctioncallContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_functioncall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(CALL);
			setState(125);
			((FunctioncallContext)_localctx).functionname = variablename();
			setState(126);
			((FunctioncallContext)_localctx).variable = expr();
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

	public static class OrContext extends ParserRuleContext {
		public ExprContext leftexpr;
		public ExprContext rightexpr;
		public ValContext leftval;
		public TerminalNode OR() { return getToken(PrefixParser.OR, 0); }
		public TerminalNode OPENPAREN() { return getToken(PrefixParser.OPENPAREN, 0); }
		public TerminalNode CLOSEPAREN() { return getToken(PrefixParser.CLOSEPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public OrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixListener ) ((PrefixListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixListener ) ((PrefixListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrefixVisitor ) return ((PrefixVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrContext or() throws RecognitionException {
		OrContext _localctx = new OrContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_or);
		try {
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				match(OR);
				setState(129);
				match(OPENPAREN);
				setState(130);
				((OrContext)_localctx).leftexpr = expr();
				setState(131);
				match(CLOSEPAREN);
				setState(132);
				((OrContext)_localctx).rightexpr = expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(135);
				match(OR);
				setState(136);
				((OrContext)_localctx).leftval = val();
				setState(137);
				((OrContext)_localctx).rightexpr = expr();
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

	public static class AndContext extends ParserRuleContext {
		public ExprContext leftexpr;
		public ExprContext rightexpr;
		public ValContext leftval;
		public TerminalNode AND() { return getToken(PrefixParser.AND, 0); }
		public TerminalNode OPENPAREN() { return getToken(PrefixParser.OPENPAREN, 0); }
		public TerminalNode CLOSEPAREN() { return getToken(PrefixParser.CLOSEPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public AndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixListener ) ((PrefixListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixListener ) ((PrefixListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrefixVisitor ) return ((PrefixVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndContext and() throws RecognitionException {
		AndContext _localctx = new AndContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_and);
		try {
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				match(AND);
				setState(142);
				match(OPENPAREN);
				setState(143);
				((AndContext)_localctx).leftexpr = expr();
				setState(144);
				match(CLOSEPAREN);
				setState(145);
				((AndContext)_localctx).rightexpr = expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				match(AND);
				setState(149);
				((AndContext)_localctx).leftval = val();
				setState(150);
				((AndContext)_localctx).rightexpr = expr();
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

	public static class NotContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(PrefixParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixListener ) ((PrefixListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixListener ) ((PrefixListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrefixVisitor ) return ((PrefixVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotContext not() throws RecognitionException {
		NotContext _localctx = new NotContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_not);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(NOT);
			setState(155);
			expr();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26\u00a0\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\5\2\'\n\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3/\n\3\3\4\3\4\3\4\3\4\5"+
		"\4\65\n\4\3\5\3\5\3\5\3\5\5\5;\n\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7T\n\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u008e\n\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u009b\n\21\3\22\3\22\3\22"+
		"\3\22\2\2\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\3\3\2\n\13\2"+
		"\u00a0\2&\3\2\2\2\4.\3\2\2\2\6\64\3\2\2\2\b:\3\2\2\2\n<\3\2\2\2\fS\3\2"+
		"\2\2\16U\3\2\2\2\20^\3\2\2\2\22`\3\2\2\2\24b\3\2\2\2\26h\3\2\2\2\30n\3"+
		"\2\2\2\32t\3\2\2\2\34~\3\2\2\2\36\u008d\3\2\2\2 \u009a\3\2\2\2\"\u009c"+
		"\3\2\2\2$\'\5\4\3\2%\'\5\f\7\2&$\3\2\2\2&%\3\2\2\2\'\3\3\2\2\2(/\5\32"+
		"\16\2)/\5\b\5\2*/\5\20\t\2+/\5\34\17\2,/\5\16\b\2-/\5\6\4\2.(\3\2\2\2"+
		".)\3\2\2\2.*\3\2\2\2.+\3\2\2\2.,\3\2\2\2.-\3\2\2\2/\5\3\2\2\2\60\65\5"+
		"\n\6\2\61\65\5\"\22\2\62\65\5\36\20\2\63\65\5 \21\2\64\60\3\2\2\2\64\61"+
		"\3\2\2\2\64\62\3\2\2\2\64\63\3\2\2\2\65\7\3\2\2\2\66;\5\22\n\2\67;\5\24"+
		"\13\28;\5\26\f\29;\5\30\r\2:\66\3\2\2\2:\67\3\2\2\2:8\3\2\2\2:9\3\2\2"+
		"\2;\t\3\2\2\2<=\t\2\2\2=\13\3\2\2\2>?\7\17\2\2?@\7\r\2\2@A\5\6\4\2AB\7"+
		"\16\2\2BC\7\20\2\2CD\5\2\2\2DE\7\21\2\2ET\3\2\2\2FT\3\2\2\2GH\7\17\2\2"+
		"HI\7\r\2\2IJ\5\6\4\2JK\7\16\2\2KL\7\20\2\2LM\5\2\2\2MN\7\16\2\2NO\7\22"+
		"\2\2OP\7\20\2\2PQ\5\2\2\2QR\7\21\2\2RT\3\2\2\2S>\3\2\2\2SF\3\2\2\2SG\3"+
		"\2\2\2T\r\3\2\2\2UV\7\r\2\2VW\5\20\t\2WX\7\3\2\2XY\5\4\3\2YZ\7\r\2\2Z"+
		"[\5\2\2\2[\\\7\16\2\2\\]\7\16\2\2]\17\3\2\2\2^_\7\25\2\2_\21\3\2\2\2`"+
		"a\7\26\2\2a\23\3\2\2\2bc\7\r\2\2cd\5\2\2\2de\7\4\2\2ef\5\2\2\2fg\7\16"+
		"\2\2g\25\3\2\2\2hi\7\r\2\2ij\5\2\2\2jk\7\5\2\2kl\5\2\2\2lm\7\16\2\2m\27"+
		"\3\2\2\2no\7\r\2\2op\5\2\2\2pq\7\6\2\2qr\5\2\2\2rs\7\16\2\2s\31\3\2\2"+
		"\2tu\7\r\2\2uv\7\23\2\2vw\5\20\t\2wx\5\20\t\2xy\7\r\2\2yz\5\2\2\2z{\5"+
		"\2\2\2{|\7\16\2\2|}\7\16\2\2}\33\3\2\2\2~\177\7\24\2\2\177\u0080\5\20"+
		"\t\2\u0080\u0081\5\2\2\2\u0081\35\3\2\2\2\u0082\u0083\7\7\2\2\u0083\u0084"+
		"\7\r\2\2\u0084\u0085\5\2\2\2\u0085\u0086\7\16\2\2\u0086\u0087\5\2\2\2"+
		"\u0087\u008e\3\2\2\2\u0088\u008e\3\2\2\2\u0089\u008a\7\7\2\2\u008a\u008b"+
		"\5\n\6\2\u008b\u008c\5\2\2\2\u008c\u008e\3\2\2\2\u008d\u0082\3\2\2\2\u008d"+
		"\u0088\3\2\2\2\u008d\u0089\3\2\2\2\u008e\37\3\2\2\2\u008f\u0090\7\b\2"+
		"\2\u0090\u0091\7\r\2\2\u0091\u0092\5\2\2\2\u0092\u0093\7\16\2\2\u0093"+
		"\u0094\5\2\2\2\u0094\u009b\3\2\2\2\u0095\u009b\3\2\2\2\u0096\u0097\7\b"+
		"\2\2\u0097\u0098\5\n\6\2\u0098\u0099\5\2\2\2\u0099\u009b\3\2\2\2\u009a"+
		"\u008f\3\2\2\2\u009a\u0095\3\2\2\2\u009a\u0096\3\2\2\2\u009b!\3\2\2\2"+
		"\u009c\u009d\7\t\2\2\u009d\u009e\5\2\2\2\u009e#\3\2\2\2\t&.\64:S\u008d"+
		"\u009a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}