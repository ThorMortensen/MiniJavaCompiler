// Generated from /Users/probst/workspace/MiniJava_Analysis/src/compiler/Frontend/MiniJava.g4 by ANTLR 4.1
package compiler.Frontend;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniJavaLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MINUS=1, AND=2, EQUALS=3, LESSTHAN=4, PLUS=5, TIMES=6, EXCLAMATION=7, 
		SEMICOLON=8, COMMA=9, EQUAL=10, DOT=11, ROUNDOPEN=12, ROUNDCLOSE=13, SQUAREOPEN=14, 
		SQUARECLOSE=15, CURLYOPEN=16, CURLYCLOSE=17, TRUE=18, FALSE=19, CLASS=20, 
		EXTENDS=21, TYPEBOOLEAN=22, TYPEVOID=23, TYPEINT=24, PUBLIC=25, STATIC=26, 
		THIS=27, IF=28, ELSE=29, WHILE=30, PRINT=31, PRINTLN=32, RETURN=33, NEW=34, 
		IDENT=35, INT=36, STRING=37, LINE_COMMENT=38, MULTILINE_COMMENT=39, WHITESPACE=40;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'-'", "'&&'", "'=='", "'<'", "'+'", "'*'", "'!'", "';'", "','", "'='", 
		"'.'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'true'", "'false'", 
		"'class'", "'extends'", "'boolean'", "'void'", "'int'", "'public'", "'static'", 
		"'this'", "'if'", "'else'", "'while'", "'System.out.print'", "'System.out.println'", 
		"'return'", "'new'", "IDENT", "INT", "STRING", "LINE_COMMENT", "MULTILINE_COMMENT", 
		"WHITESPACE"
	};
	public static final String[] ruleNames = {
		"MINUS", "AND", "EQUALS", "LESSTHAN", "PLUS", "TIMES", "EXCLAMATION", 
		"SEMICOLON", "COMMA", "EQUAL", "DOT", "ROUNDOPEN", "ROUNDCLOSE", "SQUAREOPEN", 
		"SQUARECLOSE", "CURLYOPEN", "CURLYCLOSE", "TRUE", "FALSE", "CLASS", "EXTENDS", 
		"TYPEBOOLEAN", "TYPEVOID", "TYPEINT", "PUBLIC", "STATIC", "THIS", "IF", 
		"ELSE", "WHILE", "PRINT", "PRINTLN", "RETURN", "NEW", "LOWER", "UPPER", 
		"NONNULL", "NUMBER", "IDENT", "INT", "CHAR", "STRING", "LINE_COMMENT", 
		"MULTILINE_COMMENT", "WHITESPACE"
	};


	public MiniJavaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiniJava.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 42: LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 43: MULTILINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 44: WHITESPACE_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WHITESPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: skip();  break;
		}
	}
	private void MULTILINE_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}
	private void LINE_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2*\u0150\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3"+
		"\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3"+
		"\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3"+
		"\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3"+
		"$\3$\3%\3%\3&\3&\3\'\3\'\5\'\u0104\n\'\3(\3(\5(\u0108\n(\3(\3(\3(\3(\7"+
		"(\u010e\n(\f(\16(\u0111\13(\3)\3)\3)\7)\u0116\n)\f)\16)\u0119\13)\5)\u011b"+
		"\n)\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u0126\n*\3+\3+\7+\u012a\n+\f+\16+\u012d"+
		"\13+\3+\3+\3,\3,\3,\3,\7,\u0135\n,\f,\16,\u0138\13,\3,\3,\3-\3-\3-\3-"+
		"\7-\u0140\n-\f-\16-\u0143\13-\3-\3-\3-\3-\3-\3.\6.\u014b\n.\r.\16.\u014c"+
		"\3.\3.\4\u012b\u0141/\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n"+
		"\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%"+
		"\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\19"+
		"\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G\2\1I\2\1K\2\1M\2\1O%\1Q&\1S\2\1U\'\1"+
		"W(\2Y)\3[*\4\3\2\5\5\2\"#%]_\u0080\4\2\f\f\17\17\5\2\13\f\17\17\"\"\u015a"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2O\3\2\2"+
		"\2\2Q\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\3]\3\2\2\2\5"+
		"_\3\2\2\2\7b\3\2\2\2\te\3\2\2\2\13g\3\2\2\2\ri\3\2\2\2\17k\3\2\2\2\21"+
		"m\3\2\2\2\23o\3\2\2\2\25q\3\2\2\2\27s\3\2\2\2\31u\3\2\2\2\33w\3\2\2\2"+
		"\35y\3\2\2\2\37{\3\2\2\2!}\3\2\2\2#\177\3\2\2\2%\u0081\3\2\2\2\'\u0086"+
		"\3\2\2\2)\u008c\3\2\2\2+\u0092\3\2\2\2-\u009a\3\2\2\2/\u00a2\3\2\2\2\61"+
		"\u00a7\3\2\2\2\63\u00ab\3\2\2\2\65\u00b2\3\2\2\2\67\u00b9\3\2\2\29\u00be"+
		"\3\2\2\2;\u00c1\3\2\2\2=\u00c6\3\2\2\2?\u00cc\3\2\2\2A\u00dd\3\2\2\2C"+
		"\u00f0\3\2\2\2E\u00f7\3\2\2\2G\u00fb\3\2\2\2I\u00fd\3\2\2\2K\u00ff\3\2"+
		"\2\2M\u0103\3\2\2\2O\u0107\3\2\2\2Q\u011a\3\2\2\2S\u0125\3\2\2\2U\u0127"+
		"\3\2\2\2W\u0130\3\2\2\2Y\u013b\3\2\2\2[\u014a\3\2\2\2]^\7/\2\2^\4\3\2"+
		"\2\2_`\7(\2\2`a\7(\2\2a\6\3\2\2\2bc\7?\2\2cd\7?\2\2d\b\3\2\2\2ef\7>\2"+
		"\2f\n\3\2\2\2gh\7-\2\2h\f\3\2\2\2ij\7,\2\2j\16\3\2\2\2kl\7#\2\2l\20\3"+
		"\2\2\2mn\7=\2\2n\22\3\2\2\2op\7.\2\2p\24\3\2\2\2qr\7?\2\2r\26\3\2\2\2"+
		"st\7\60\2\2t\30\3\2\2\2uv\7*\2\2v\32\3\2\2\2wx\7+\2\2x\34\3\2\2\2yz\7"+
		"]\2\2z\36\3\2\2\2{|\7_\2\2| \3\2\2\2}~\7}\2\2~\"\3\2\2\2\177\u0080\7\177"+
		"\2\2\u0080$\3\2\2\2\u0081\u0082\7v\2\2\u0082\u0083\7t\2\2\u0083\u0084"+
		"\7w\2\2\u0084\u0085\7g\2\2\u0085&\3\2\2\2\u0086\u0087\7h\2\2\u0087\u0088"+
		"\7c\2\2\u0088\u0089\7n\2\2\u0089\u008a\7u\2\2\u008a\u008b\7g\2\2\u008b"+
		"(\3\2\2\2\u008c\u008d\7e\2\2\u008d\u008e\7n\2\2\u008e\u008f\7c\2\2\u008f"+
		"\u0090\7u\2\2\u0090\u0091\7u\2\2\u0091*\3\2\2\2\u0092\u0093\7g\2\2\u0093"+
		"\u0094\7z\2\2\u0094\u0095\7v\2\2\u0095\u0096\7g\2\2\u0096\u0097\7p\2\2"+
		"\u0097\u0098\7f\2\2\u0098\u0099\7u\2\2\u0099,\3\2\2\2\u009a\u009b\7d\2"+
		"\2\u009b\u009c\7q\2\2\u009c\u009d\7q\2\2\u009d\u009e\7n\2\2\u009e\u009f"+
		"\7g\2\2\u009f\u00a0\7c\2\2\u00a0\u00a1\7p\2\2\u00a1.\3\2\2\2\u00a2\u00a3"+
		"\7x\2\2\u00a3\u00a4\7q\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6\7f\2\2\u00a6"+
		"\60\3\2\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9\7p\2\2\u00a9\u00aa\7v\2\2\u00aa"+
		"\62\3\2\2\2\u00ab\u00ac\7r\2\2\u00ac\u00ad\7w\2\2\u00ad\u00ae\7d\2\2\u00ae"+
		"\u00af\7n\2\2\u00af\u00b0\7k\2\2\u00b0\u00b1\7e\2\2\u00b1\64\3\2\2\2\u00b2"+
		"\u00b3\7u\2\2\u00b3\u00b4\7v\2\2\u00b4\u00b5\7c\2\2\u00b5\u00b6\7v\2\2"+
		"\u00b6\u00b7\7k\2\2\u00b7\u00b8\7e\2\2\u00b8\66\3\2\2\2\u00b9\u00ba\7"+
		"v\2\2\u00ba\u00bb\7j\2\2\u00bb\u00bc\7k\2\2\u00bc\u00bd\7u\2\2\u00bd8"+
		"\3\2\2\2\u00be\u00bf\7k\2\2\u00bf\u00c0\7h\2\2\u00c0:\3\2\2\2\u00c1\u00c2"+
		"\7g\2\2\u00c2\u00c3\7n\2\2\u00c3\u00c4\7u\2\2\u00c4\u00c5\7g\2\2\u00c5"+
		"<\3\2\2\2\u00c6\u00c7\7y\2\2\u00c7\u00c8\7j\2\2\u00c8\u00c9\7k\2\2\u00c9"+
		"\u00ca\7n\2\2\u00ca\u00cb\7g\2\2\u00cb>\3\2\2\2\u00cc\u00cd\7U\2\2\u00cd"+
		"\u00ce\7{\2\2\u00ce\u00cf\7u\2\2\u00cf\u00d0\7v\2\2\u00d0\u00d1\7g\2\2"+
		"\u00d1\u00d2\7o\2\2\u00d2\u00d3\7\60\2\2\u00d3\u00d4\7q\2\2\u00d4\u00d5"+
		"\7w\2\2\u00d5\u00d6\7v\2\2\u00d6\u00d7\7\60\2\2\u00d7\u00d8\7r\2\2\u00d8"+
		"\u00d9\7t\2\2\u00d9\u00da\7k\2\2\u00da\u00db\7p\2\2\u00db\u00dc\7v\2\2"+
		"\u00dc@\3\2\2\2\u00dd\u00de\7U\2\2\u00de\u00df\7{\2\2\u00df\u00e0\7u\2"+
		"\2\u00e0\u00e1\7v\2\2\u00e1\u00e2\7g\2\2\u00e2\u00e3\7o\2\2\u00e3\u00e4"+
		"\7\60\2\2\u00e4\u00e5\7q\2\2\u00e5\u00e6\7w\2\2\u00e6\u00e7\7v\2\2\u00e7"+
		"\u00e8\7\60\2\2\u00e8\u00e9\7r\2\2\u00e9\u00ea\7t\2\2\u00ea\u00eb\7k\2"+
		"\2\u00eb\u00ec\7p\2\2\u00ec\u00ed\7v\2\2\u00ed\u00ee\7n\2\2\u00ee\u00ef"+
		"\7p\2\2\u00efB\3\2\2\2\u00f0\u00f1\7t\2\2\u00f1\u00f2\7g\2\2\u00f2\u00f3"+
		"\7v\2\2\u00f3\u00f4\7w\2\2\u00f4\u00f5\7t\2\2\u00f5\u00f6\7p\2\2\u00f6"+
		"D\3\2\2\2\u00f7\u00f8\7p\2\2\u00f8\u00f9\7g\2\2\u00f9\u00fa\7y\2\2\u00fa"+
		"F\3\2\2\2\u00fb\u00fc\4c|\2\u00fcH\3\2\2\2\u00fd\u00fe\4C\\\2\u00feJ\3"+
		"\2\2\2\u00ff\u0100\4\63;\2\u0100L\3\2\2\2\u0101\u0104\7\62\2\2\u0102\u0104"+
		"\5K&\2\u0103\u0101\3\2\2\2\u0103\u0102\3\2\2\2\u0104N\3\2\2\2\u0105\u0108"+
		"\5G$\2\u0106\u0108\5I%\2\u0107\u0105\3\2\2\2\u0107\u0106\3\2\2\2\u0108"+
		"\u010f\3\2\2\2\u0109\u010e\5G$\2\u010a\u010e\5I%\2\u010b\u010e\5M\'\2"+
		"\u010c\u010e\7a\2\2\u010d\u0109\3\2\2\2\u010d\u010a\3\2\2\2\u010d\u010b"+
		"\3\2\2\2\u010d\u010c\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f"+
		"\u0110\3\2\2\2\u0110P\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u011b\7\62\2\2"+
		"\u0113\u0117\5K&\2\u0114\u0116\5M\'\2\u0115\u0114\3\2\2\2\u0116\u0119"+
		"\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011b\3\2\2\2\u0119"+
		"\u0117\3\2\2\2\u011a\u0112\3\2\2\2\u011a\u0113\3\2\2\2\u011bR\3\2\2\2"+
		"\u011c\u0126\t\2\2\2\u011d\u011e\7^\2\2\u011e\u0126\7$\2\2\u011f\u0120"+
		"\7^\2\2\u0120\u0126\7^\2\2\u0121\u0122\7^\2\2\u0122\u0126\7v\2\2\u0123"+
		"\u0124\7^\2\2\u0124\u0126\7p\2\2\u0125\u011c\3\2\2\2\u0125\u011d\3\2\2"+
		"\2\u0125\u011f\3\2\2\2\u0125\u0121\3\2\2\2\u0125\u0123\3\2\2\2\u0126T"+
		"\3\2\2\2\u0127\u012b\7$\2\2\u0128\u012a\5S*\2\u0129\u0128\3\2\2\2\u012a"+
		"\u012d\3\2\2\2\u012b\u012c\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u012e\3\2"+
		"\2\2\u012d\u012b\3\2\2\2\u012e\u012f\7$\2\2\u012fV\3\2\2\2\u0130\u0131"+
		"\7\61\2\2\u0131\u0132\7\61\2\2\u0132\u0136\3\2\2\2\u0133\u0135\n\3\2\2"+
		"\u0134\u0133\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137"+
		"\3\2\2\2\u0137\u0139\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u013a\b,\2\2\u013a"+
		"X\3\2\2\2\u013b\u013c\7\61\2\2\u013c\u013d\7,\2\2\u013d\u0141\3\2\2\2"+
		"\u013e\u0140\13\2\2\2\u013f\u013e\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u0142"+
		"\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u0144\3\2\2\2\u0143\u0141\3\2\2\2\u0144"+
		"\u0145\7,\2\2\u0145\u0146\7\61\2\2\u0146\u0147\3\2\2\2\u0147\u0148\b-"+
		"\3\2\u0148Z\3\2\2\2\u0149\u014b\t\4\2\2\u014a\u0149\3\2\2\2\u014b\u014c"+
		"\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e\3\2\2\2\u014e"+
		"\u014f\b.\4\2\u014f\\\3\2\2\2\16\2\u0103\u0107\u010d\u010f\u0117\u011a"+
		"\u0125\u012b\u0136\u0141\u014c";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}