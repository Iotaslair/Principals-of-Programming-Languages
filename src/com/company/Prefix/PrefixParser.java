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
		T__0=1, T__1=2, T__2=3, T__3=4, FALSE=5, TRUE=6, WS=7, OPENPAREN=8, CLOSEPAREN=9, 
		IF=10, OPENBRACKET=11, CLOSEBRACKET=12, ELSE=13, VALIDVARIABLENAMES=14;
	public static final int
		RULE_expr = 0, RULE_booleanvalue = 1, RULE_val = 2, RULE_or = 3, RULE_and = 4, 
		RULE_not = 5, RULE_ifstatement = 6, RULE_variable = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"expr", "booleanvalue", "val", "or", "and", "not", "ifstatement", "variable"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'or'", "'and'", "'not'", "'='", "'false'", "'true'", null, "'('", 
			"')'", "'if'", "'{'", "'}'", "'else'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "FALSE", "TRUE", "WS", "OPENPAREN", "CLOSEPAREN", 
			"IF", "OPENBRACKET", "CLOSEBRACKET", "ELSE", "VALIDVARIABLENAMES"
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
		public BooleanvalueContext booleanvalue() {
			return getRuleContext(BooleanvalueContext.class,0);
		}
		public IfstatementContext ifstatement() {
			return getRuleContext(IfstatementContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
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
			setState(19);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(16);
				booleanvalue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(17);
				ifstatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(18);
				variable();
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
		enterRule(_localctx, 2, RULE_booleanvalue);
		try {
			setState(25);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(21);
				val();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(22);
				or();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(23);
				and();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(24);
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
		enterRule(_localctx, 4, RULE_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
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
		enterRule(_localctx, 6, RULE_or);
		try {
			setState(40);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				match(T__0);
				setState(30);
				match(OPENPAREN);
				setState(31);
				((OrContext)_localctx).leftexpr = expr();
				setState(32);
				match(CLOSEPAREN);
				setState(33);
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
				setState(36);
				match(T__0);
				setState(37);
				((OrContext)_localctx).leftval = val();
				setState(38);
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
		enterRule(_localctx, 8, RULE_and);
		try {
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				match(T__1);
				setState(43);
				match(OPENPAREN);
				setState(44);
				((AndContext)_localctx).leftexpr = expr();
				setState(45);
				match(CLOSEPAREN);
				setState(46);
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
				setState(49);
				match(T__1);
				setState(50);
				((AndContext)_localctx).leftval = val();
				setState(51);
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
		enterRule(_localctx, 10, RULE_not);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(T__2);
			setState(56);
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
		enterRule(_localctx, 12, RULE_ifstatement);
		try {
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				match(IF);
				setState(59);
				match(OPENPAREN);
				setState(60);
				((IfstatementContext)_localctx).ifsection = booleanvalue();
				setState(61);
				match(CLOSEPAREN);
				setState(62);
				match(OPENBRACKET);
				setState(63);
				((IfstatementContext)_localctx).thensection = expr();
				setState(64);
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
				setState(67);
				match(IF);
				setState(68);
				match(OPENPAREN);
				setState(69);
				((IfstatementContext)_localctx).ifsection = booleanvalue();
				setState(70);
				match(CLOSEPAREN);
				setState(71);
				match(OPENBRACKET);
				setState(72);
				((IfstatementContext)_localctx).thensection = expr();
				setState(73);
				match(CLOSEPAREN);
				setState(74);
				match(ELSE);
				setState(75);
				match(OPENBRACKET);
				setState(76);
				((IfstatementContext)_localctx).elsesection = expr();
				setState(77);
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

	public static class VariableContext extends ParserRuleContext {
		public Token varname;
		public BooleanvalueContext value;
		public TerminalNode VALIDVARIABLENAMES() { return getToken(PrefixParser.VALIDVARIABLENAMES, 0); }
		public BooleanvalueContext booleanvalue() {
			return getRuleContext(BooleanvalueContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixListener ) ((PrefixListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixListener ) ((PrefixListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrefixVisitor ) return ((PrefixVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			((VariableContext)_localctx).varname = match(VALIDVARIABLENAMES);
			setState(82);
			match(T__3);
			setState(83);
			((VariableContext)_localctx).value = booleanvalue();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20X\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\5\2\26"+
		"\n\2\3\3\3\3\3\3\3\3\5\3\34\n\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\5\5+\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5"+
		"\68\n\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bR\n\b\3\t\3\t\3\t\3\t\3\t\2\2\n"+
		"\2\4\6\b\n\f\16\20\2\3\3\2\7\b\2Z\2\25\3\2\2\2\4\33\3\2\2\2\6\35\3\2\2"+
		"\2\b*\3\2\2\2\n\67\3\2\2\2\f9\3\2\2\2\16Q\3\2\2\2\20S\3\2\2\2\22\26\5"+
		"\4\3\2\23\26\5\16\b\2\24\26\5\20\t\2\25\22\3\2\2\2\25\23\3\2\2\2\25\24"+
		"\3\2\2\2\26\3\3\2\2\2\27\34\5\6\4\2\30\34\5\b\5\2\31\34\5\n\6\2\32\34"+
		"\5\f\7\2\33\27\3\2\2\2\33\30\3\2\2\2\33\31\3\2\2\2\33\32\3\2\2\2\34\5"+
		"\3\2\2\2\35\36\t\2\2\2\36\7\3\2\2\2\37 \7\3\2\2 !\7\n\2\2!\"\5\2\2\2\""+
		"#\7\13\2\2#$\5\2\2\2$+\3\2\2\2%+\3\2\2\2&\'\7\3\2\2\'(\5\6\4\2()\5\2\2"+
		"\2)+\3\2\2\2*\37\3\2\2\2*%\3\2\2\2*&\3\2\2\2+\t\3\2\2\2,-\7\4\2\2-.\7"+
		"\n\2\2./\5\2\2\2/\60\7\13\2\2\60\61\5\2\2\2\618\3\2\2\2\628\3\2\2\2\63"+
		"\64\7\4\2\2\64\65\5\6\4\2\65\66\5\2\2\2\668\3\2\2\2\67,\3\2\2\2\67\62"+
		"\3\2\2\2\67\63\3\2\2\28\13\3\2\2\29:\7\5\2\2:;\5\2\2\2;\r\3\2\2\2<=\7"+
		"\f\2\2=>\7\n\2\2>?\5\4\3\2?@\7\13\2\2@A\7\r\2\2AB\5\2\2\2BC\7\16\2\2C"+
		"R\3\2\2\2DR\3\2\2\2EF\7\f\2\2FG\7\n\2\2GH\5\4\3\2HI\7\13\2\2IJ\7\r\2\2"+
		"JK\5\2\2\2KL\7\13\2\2LM\7\17\2\2MN\7\r\2\2NO\5\2\2\2OP\7\16\2\2PR\3\2"+
		"\2\2Q<\3\2\2\2QD\3\2\2\2QE\3\2\2\2R\17\3\2\2\2ST\7\20\2\2TU\7\6\2\2UV"+
		"\5\4\3\2V\21\3\2\2\2\7\25\33*\67Q";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}