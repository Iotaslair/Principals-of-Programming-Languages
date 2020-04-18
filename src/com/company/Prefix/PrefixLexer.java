// Generated from C:/Users/billy/POPL/Principals-of-Programming-Languages/src/com/company/Prefix\Prefix.g4 by ANTLR 4.8
package com.company.Prefix;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PrefixLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, OR=5, AND=6, NOT=7, FALSE=8, TRUE=9, WS=10, 
		OPENPAREN=11, CLOSEPAREN=12, IF=13, OPENBRACKET=14, CLOSEBRACKET=15, ELSE=16, 
		DEF=17, CALL=18, VALIDVARIABLENAMES=19, INTEGER=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "OR", "AND", "NOT", "FALSE", "TRUE", 
			"WS", "OPENPAREN", "CLOSEPAREN", "IF", "OPENBRACKET", "CLOSEBRACKET", 
			"ELSE", "DEF", "CALL", "VALIDVARIABLENAMES", "INTEGER"
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


	public PrefixLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Prefix.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26u\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\13\6\13K\n\13\r\13\16\13L\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\7\24l\n\24\f\24\16\24o\13\24"+
		"\3\25\6\25r\n\25\r\25\16\25s\2\2\26\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26\3\2\6\5"+
		"\2\13\f\17\17\"\"\4\2C\\c|\5\2\62;C\\c|\3\2\62;\2w\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5-\3\2\2\2\7/\3\2\2\2\t\61\3\2\2\2\13\63"+
		"\3\2\2\2\r\66\3\2\2\2\17:\3\2\2\2\21>\3\2\2\2\23D\3\2\2\2\25J\3\2\2\2"+
		"\27P\3\2\2\2\31R\3\2\2\2\33T\3\2\2\2\35W\3\2\2\2\37Y\3\2\2\2![\3\2\2\2"+
		"#`\3\2\2\2%d\3\2\2\2\'i\3\2\2\2)q\3\2\2\2+,\7?\2\2,\4\3\2\2\2-.\7-\2\2"+
		".\6\3\2\2\2/\60\7/\2\2\60\b\3\2\2\2\61\62\7,\2\2\62\n\3\2\2\2\63\64\7"+
		"q\2\2\64\65\7t\2\2\65\f\3\2\2\2\66\67\7c\2\2\678\7p\2\289\7f\2\29\16\3"+
		"\2\2\2:;\7p\2\2;<\7q\2\2<=\7v\2\2=\20\3\2\2\2>?\7h\2\2?@\7c\2\2@A\7n\2"+
		"\2AB\7u\2\2BC\7g\2\2C\22\3\2\2\2DE\7v\2\2EF\7t\2\2FG\7w\2\2GH\7g\2\2H"+
		"\24\3\2\2\2IK\t\2\2\2JI\3\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MN\3\2\2"+
		"\2NO\b\13\2\2O\26\3\2\2\2PQ\7*\2\2Q\30\3\2\2\2RS\7+\2\2S\32\3\2\2\2TU"+
		"\7k\2\2UV\7h\2\2V\34\3\2\2\2WX\7}\2\2X\36\3\2\2\2YZ\7\177\2\2Z \3\2\2"+
		"\2[\\\7g\2\2\\]\7n\2\2]^\7u\2\2^_\7g\2\2_\"\3\2\2\2`a\7f\2\2ab\7g\2\2"+
		"bc\7h\2\2c$\3\2\2\2de\7e\2\2ef\7c\2\2fg\7n\2\2gh\7n\2\2h&\3\2\2\2im\t"+
		"\3\2\2jl\t\4\2\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2n(\3\2\2\2om\3"+
		"\2\2\2pr\t\5\2\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2t*\3\2\2\2\6\2"+
		"Lms\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}