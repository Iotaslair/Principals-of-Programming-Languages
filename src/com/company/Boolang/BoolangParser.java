// Generated from C:/Users/billy/POPL/Principals-of-Programming-Languages/src/com/company\Boolang.g4 by ANTLR 4.8
package com.company.Boolang;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BoolangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, FALSE=4, TRUE=5, WS=6, OPENPAREN=7, CLOSEPAREN=8;
	public static final int
		RULE_expr = 0, RULE_val = 1, RULE_or = 2, RULE_and = 3, RULE_not = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"expr", "val", "or", "and", "not"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'or'", "'and'", "'not'", "'false'", "'true'", null, "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "FALSE", "TRUE", "WS", "OPENPAREN", "CLOSEPAREN"
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
	public String getGrammarFileName() { return "Boolang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BoolangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ExprContext extends ParserRuleContext {
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
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoolangListener ) ((BoolangListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoolangListener ) ((BoolangListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoolangVisitor ) return ((BoolangVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expr);
		try {
			setState(14);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(10);
				val();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(11);
				or();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(12);
				and();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(13);
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
		public TerminalNode FALSE() { return getToken(BoolangParser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(BoolangParser.TRUE, 0); }
		public ValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoolangListener ) ((BoolangListener)listener).enterVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoolangListener ) ((BoolangListener)listener).exitVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoolangVisitor ) return ((BoolangVisitor<? extends T>)visitor).visitVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
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
		public TerminalNode OPENPAREN() { return getToken(BoolangParser.OPENPAREN, 0); }
		public TerminalNode CLOSEPAREN() { return getToken(BoolangParser.CLOSEPAREN, 0); }
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
			if ( listener instanceof BoolangListener ) ((BoolangListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoolangListener ) ((BoolangListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoolangVisitor ) return ((BoolangVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrContext or() throws RecognitionException {
		OrContext _localctx = new OrContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_or);
		try {
			setState(29);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPENPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				match(OPENPAREN);
				setState(19);
				((OrContext)_localctx).leftexpr = expr();
				setState(20);
				match(CLOSEPAREN);
				setState(21);
				match(T__0);
				setState(22);
				((OrContext)_localctx).rightexpr = expr();
				}
				break;
			case CLOSEPAREN:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			case FALSE:
			case TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(25);
				((OrContext)_localctx).leftval = val();
				setState(26);
				match(T__0);
				setState(27);
				((OrContext)_localctx).rightexpr = expr();
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

	public static class AndContext extends ParserRuleContext {
		public ExprContext leftexpr;
		public ExprContext rightexpr;
		public ValContext leftval;
		public TerminalNode OPENPAREN() { return getToken(BoolangParser.OPENPAREN, 0); }
		public TerminalNode CLOSEPAREN() { return getToken(BoolangParser.CLOSEPAREN, 0); }
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
			if ( listener instanceof BoolangListener ) ((BoolangListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoolangListener ) ((BoolangListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoolangVisitor ) return ((BoolangVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndContext and() throws RecognitionException {
		AndContext _localctx = new AndContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_and);
		try {
			setState(42);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPENPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				match(OPENPAREN);
				setState(32);
				((AndContext)_localctx).leftexpr = expr();
				setState(33);
				match(CLOSEPAREN);
				setState(34);
				match(T__1);
				setState(35);
				((AndContext)_localctx).rightexpr = expr();
				}
				break;
			case CLOSEPAREN:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			case FALSE:
			case TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				((AndContext)_localctx).leftval = val();
				setState(39);
				match(T__1);
				setState(40);
				((AndContext)_localctx).rightexpr = expr();
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
			if ( listener instanceof BoolangListener ) ((BoolangListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoolangListener ) ((BoolangListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoolangVisitor ) return ((BoolangVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotContext not() throws RecognitionException {
		NotContext _localctx = new NotContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_not);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(T__2);
			setState(45);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\n\62\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\5\2\21\n\2\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4 \n\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\5\5-\n\5\3\6\3\6\3\6\3\6\2\2\7\2\4\6\b\n\2\3\3"+
		"\2\6\7\2\63\2\20\3\2\2\2\4\22\3\2\2\2\6\37\3\2\2\2\b,\3\2\2\2\n.\3\2\2"+
		"\2\f\21\5\4\3\2\r\21\5\6\4\2\16\21\5\b\5\2\17\21\5\n\6\2\20\f\3\2\2\2"+
		"\20\r\3\2\2\2\20\16\3\2\2\2\20\17\3\2\2\2\21\3\3\2\2\2\22\23\t\2\2\2\23"+
		"\5\3\2\2\2\24\25\7\t\2\2\25\26\5\2\2\2\26\27\7\n\2\2\27\30\7\3\2\2\30"+
		"\31\5\2\2\2\31 \3\2\2\2\32 \3\2\2\2\33\34\5\4\3\2\34\35\7\3\2\2\35\36"+
		"\5\2\2\2\36 \3\2\2\2\37\24\3\2\2\2\37\32\3\2\2\2\37\33\3\2\2\2 \7\3\2"+
		"\2\2!\"\7\t\2\2\"#\5\2\2\2#$\7\n\2\2$%\7\4\2\2%&\5\2\2\2&-\3\2\2\2\'-"+
		"\3\2\2\2()\5\4\3\2)*\7\4\2\2*+\5\2\2\2+-\3\2\2\2,!\3\2\2\2,\'\3\2\2\2"+
		",(\3\2\2\2-\t\3\2\2\2./\7\5\2\2/\60\5\2\2\2\60\13\3\2\2\2\5\20\37,";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}