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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, FALSE=8, TRUE=9, 
		WS=10, OPENPAREN=11, CLOSEPAREN=12, IF=13, OPENBRACKET=14, CLOSEBRACKET=15, 
		ELSE=16, VALIDVARIABLENAMES=17, INTEGER=18;
	public static final int
		RULE_expr = 0, RULE_data = 1, RULE_booleanvalue = 2, RULE_integervalue = 3, 
		RULE_val = 4, RULE_or = 5, RULE_and = 6, RULE_not = 7, RULE_ifstatement = 8, 
		RULE_variabledeclaration = 9, RULE_variablename = 10, RULE_integer = 11, 
		RULE_add = 12, RULE_subtract = 13, RULE_multiply = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"expr", "data", "booleanvalue", "integervalue", "val", "or", "and", "not", 
			"ifstatement", "variabledeclaration", "variablename", "integer", "add", 
			"subtract", "multiply"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'or'", "'and'", "'not'", "'='", "'+'", "'-'", "'*'", "'false'", 
			"'true'", null, "'('", "')'", "'if'", "'{'", "'}'", "'else'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "FALSE", "TRUE", "WS", 
			"OPENPAREN", "CLOSEPAREN", "IF", "OPENBRACKET", "CLOSEBRACKET", "ELSE", 
			"VALIDVARIABLENAMES", "INTEGER"
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
			setState(32);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				data();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
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
		public BooleanvalueContext booleanvalue() {
			return getRuleContext(BooleanvalueContext.class,0);
		}
		public IntegervalueContext integervalue() {
			return getRuleContext(IntegervalueContext.class,0);
		}
		public VariabledeclarationContext variabledeclaration() {
			return getRuleContext(VariabledeclarationContext.class,0);
		}
		public VariablenameContext variablename() {
			return getRuleContext(VariablenameContext.class,0);
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
			setState(38);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				booleanvalue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				integervalue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(36);
				variabledeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(37);
				variablename();
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
		public OrContext or() {
			return getRuleContext(OrContext.class,0);
		}
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public NotContext not() {
			return getRuleContext(NotContext.class,0);
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
			setState(44);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				val();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				or();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				and();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(43);
				not();
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
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				integer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				add();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				subtract();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(49);
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
			setState(52);
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

	public static class OrContext extends ParserRuleContext {
		public ExprContext leftexpr;
		public ExprContext rightexpr;
		public ValContext leftval;
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
		enterRule(_localctx, 10, RULE_or);
		try {
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				match(T__0);
				setState(55);
				match(OPENPAREN);
				setState(56);
				((OrContext)_localctx).leftexpr = expr();
				setState(57);
				match(CLOSEPAREN);
				setState(58);
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
				setState(61);
				match(T__0);
				setState(62);
				((OrContext)_localctx).leftval = val();
				setState(63);
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
		enterRule(_localctx, 12, RULE_and);
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				match(T__1);
				setState(68);
				match(OPENPAREN);
				setState(69);
				((AndContext)_localctx).leftexpr = expr();
				setState(70);
				match(CLOSEPAREN);
				setState(71);
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
				setState(74);
				match(T__1);
				setState(75);
				((AndContext)_localctx).leftval = val();
				setState(76);
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
		enterRule(_localctx, 14, RULE_not);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(T__2);
			setState(81);
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
		enterRule(_localctx, 16, RULE_ifstatement);
		try {
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				match(IF);
				setState(84);
				match(OPENPAREN);
				setState(85);
				((IfstatementContext)_localctx).ifsection = booleanvalue();
				setState(86);
				match(CLOSEPAREN);
				setState(87);
				match(OPENBRACKET);
				setState(88);
				((IfstatementContext)_localctx).thensection = expr();
				setState(89);
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
				setState(92);
				match(IF);
				setState(93);
				match(OPENPAREN);
				setState(94);
				((IfstatementContext)_localctx).ifsection = booleanvalue();
				setState(95);
				match(CLOSEPAREN);
				setState(96);
				match(OPENBRACKET);
				setState(97);
				((IfstatementContext)_localctx).thensection = expr();
				setState(98);
				match(CLOSEPAREN);
				setState(99);
				match(ELSE);
				setState(100);
				match(OPENBRACKET);
				setState(101);
				((IfstatementContext)_localctx).elsesection = expr();
				setState(102);
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
		public Token varname;
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
		public TerminalNode VALIDVARIABLENAMES() { return getToken(PrefixParser.VALIDVARIABLENAMES, 0); }
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
		enterRule(_localctx, 18, RULE_variabledeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(OPENPAREN);
			setState(107);
			((VariabledeclarationContext)_localctx).varname = match(VALIDVARIABLENAMES);
			setState(108);
			match(T__3);
			setState(109);
			((VariabledeclarationContext)_localctx).value = data();
			setState(110);
			match(OPENPAREN);
			setState(111);
			((VariabledeclarationContext)_localctx).run = expr();
			setState(112);
			match(CLOSEPAREN);
			setState(113);
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
		enterRule(_localctx, 20, RULE_variablename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
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
		enterRule(_localctx, 22, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
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
		public IntegerContext left;
		public IntegerContext right;
		public List<IntegerContext> integer() {
			return getRuleContexts(IntegerContext.class);
		}
		public IntegerContext integer(int i) {
			return getRuleContext(IntegerContext.class,i);
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
		enterRule(_localctx, 24, RULE_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			((AddContext)_localctx).left = integer();
			setState(120);
			match(T__4);
			setState(121);
			((AddContext)_localctx).right = integer();
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
		public IntegerContext left;
		public IntegerContext right;
		public List<IntegerContext> integer() {
			return getRuleContexts(IntegerContext.class);
		}
		public IntegerContext integer(int i) {
			return getRuleContext(IntegerContext.class,i);
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
		enterRule(_localctx, 26, RULE_subtract);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			((SubtractContext)_localctx).left = integer();
			setState(124);
			match(T__5);
			setState(125);
			((SubtractContext)_localctx).right = integer();
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
		public IntegerContext left;
		public IntegerContext right;
		public List<IntegerContext> integer() {
			return getRuleContexts(IntegerContext.class);
		}
		public IntegerContext integer(int i) {
			return getRuleContext(IntegerContext.class,i);
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
		enterRule(_localctx, 28, RULE_multiply);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			((MultiplyContext)_localctx).left = integer();
			setState(128);
			match(T__6);
			setState(129);
			((MultiplyContext)_localctx).right = integer();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24\u0086\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\5\2#\n\2\3"+
		"\3\3\3\3\3\3\3\5\3)\n\3\3\4\3\4\3\4\3\4\5\4/\n\4\3\5\3\5\3\5\3\5\5\5\65"+
		"\n\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7D\n\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bQ\n\b\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\5\nk\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\2\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\3\3\2\n\13\2\u0086\2"+
		"\"\3\2\2\2\4(\3\2\2\2\6.\3\2\2\2\b\64\3\2\2\2\n\66\3\2\2\2\fC\3\2\2\2"+
		"\16P\3\2\2\2\20R\3\2\2\2\22j\3\2\2\2\24l\3\2\2\2\26u\3\2\2\2\30w\3\2\2"+
		"\2\32y\3\2\2\2\34}\3\2\2\2\36\u0081\3\2\2\2 #\5\4\3\2!#\5\22\n\2\" \3"+
		"\2\2\2\"!\3\2\2\2#\3\3\2\2\2$)\5\6\4\2%)\5\b\5\2&)\5\24\13\2\')\5\26\f"+
		"\2($\3\2\2\2(%\3\2\2\2(&\3\2\2\2(\'\3\2\2\2)\5\3\2\2\2*/\5\n\6\2+/\5\f"+
		"\7\2,/\5\16\b\2-/\5\20\t\2.*\3\2\2\2.+\3\2\2\2.,\3\2\2\2.-\3\2\2\2/\7"+
		"\3\2\2\2\60\65\5\30\r\2\61\65\5\32\16\2\62\65\5\34\17\2\63\65\5\36\20"+
		"\2\64\60\3\2\2\2\64\61\3\2\2\2\64\62\3\2\2\2\64\63\3\2\2\2\65\t\3\2\2"+
		"\2\66\67\t\2\2\2\67\13\3\2\2\289\7\3\2\29:\7\r\2\2:;\5\2\2\2;<\7\16\2"+
		"\2<=\5\2\2\2=D\3\2\2\2>D\3\2\2\2?@\7\3\2\2@A\5\n\6\2AB\5\2\2\2BD\3\2\2"+
		"\2C8\3\2\2\2C>\3\2\2\2C?\3\2\2\2D\r\3\2\2\2EF\7\4\2\2FG\7\r\2\2GH\5\2"+
		"\2\2HI\7\16\2\2IJ\5\2\2\2JQ\3\2\2\2KQ\3\2\2\2LM\7\4\2\2MN\5\n\6\2NO\5"+
		"\2\2\2OQ\3\2\2\2PE\3\2\2\2PK\3\2\2\2PL\3\2\2\2Q\17\3\2\2\2RS\7\5\2\2S"+
		"T\5\2\2\2T\21\3\2\2\2UV\7\17\2\2VW\7\r\2\2WX\5\6\4\2XY\7\16\2\2YZ\7\20"+
		"\2\2Z[\5\2\2\2[\\\7\21\2\2\\k\3\2\2\2]k\3\2\2\2^_\7\17\2\2_`\7\r\2\2`"+
		"a\5\6\4\2ab\7\16\2\2bc\7\20\2\2cd\5\2\2\2de\7\16\2\2ef\7\22\2\2fg\7\20"+
		"\2\2gh\5\2\2\2hi\7\21\2\2ik\3\2\2\2jU\3\2\2\2j]\3\2\2\2j^\3\2\2\2k\23"+
		"\3\2\2\2lm\7\r\2\2mn\7\23\2\2no\7\6\2\2op\5\4\3\2pq\7\r\2\2qr\5\2\2\2"+
		"rs\7\16\2\2st\7\16\2\2t\25\3\2\2\2uv\7\23\2\2v\27\3\2\2\2wx\7\24\2\2x"+
		"\31\3\2\2\2yz\5\30\r\2z{\7\7\2\2{|\5\30\r\2|\33\3\2\2\2}~\5\30\r\2~\177"+
		"\7\b\2\2\177\u0080\5\30\r\2\u0080\35\3\2\2\2\u0081\u0082\5\30\r\2\u0082"+
		"\u0083\7\t\2\2\u0083\u0084\5\30\r\2\u0084\37\3\2\2\2\t\"(.\64CPj";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}