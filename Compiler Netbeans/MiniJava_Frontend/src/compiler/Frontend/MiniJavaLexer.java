// Generated from C:\Users\Lime\Dropbox\3. Semester\Compiler Construction\GrammarFileMiniJava\MiniJava.g4 by ANTLR 4.1
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
		SEMICOLON=8, COMMA=9, EQUAL=10, DOT=11, INCREMENT=12, DECREMENT=13, ROUNDOPEN=14, 
		ROUNDCLOSE=15, SQUAREOPEN=16, SQUARECLOSE=17, CURLYOPEN=18, CURLYCLOSE=19, 
		TERNARY_PART1=20, TERNARY_PART2=21, PLUSEQUAL=22, TRUE=23, FALSE=24, CLASS=25, 
		EXTENDS=26, TYPEBOOLEAN=27, TYPEVOID=28, TYPEINT=29, TYPECHAR=30, PUBLIC=31, 
		STATIC=32, THIS=33, IF=34, ELSE=35, WHILE=36, FOR=37, PRINT=38, PRINTLN=39, 
		RETURN=40, NEW=41, IDENT=42, INT=43, STRING=44, LINE_COMMENT=45, MULTILINE_COMMENT=46, 
		WHITESPACE=47;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'-'", "'&&'", "'=='", "'<'", "'+'", "'*'", "'!'", "';'", "','", "'='", 
		"'.'", "'++'", "'--'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'?'", 
		"':'", "'+='", "'true'", "'false'", "'class'", "'extends'", "'boolean'", 
		"'void'", "'int'", "'char'", "'public'", "'static'", "'this'", "'if'", 
		"'else'", "'while'", "'for'", "'System.out.print'", "'System.out.println'", 
		"'return'", "'new'", "IDENT", "INT", "STRING", "LINE_COMMENT", "MULTILINE_COMMENT", 
		"WHITESPACE"
	};
	public static final String[] ruleNames = {
		"MINUS", "AND", "EQUALS", "LESSTHAN", "PLUS", "TIMES", "EXCLAMATION", 
		"SEMICOLON", "COMMA", "EQUAL", "DOT", "INCREMENT", "DECREMENT", "ROUNDOPEN", 
		"ROUNDCLOSE", "SQUAREOPEN", "SQUARECLOSE", "CURLYOPEN", "CURLYCLOSE", 
		"TERNARY_PART1", "TERNARY_PART2", "PLUSEQUAL", "TRUE", "FALSE", "CLASS", 
		"EXTENDS", "TYPEBOOLEAN", "TYPEVOID", "TYPEINT", "TYPECHAR", "PUBLIC", 
		"STATIC", "THIS", "IF", "ELSE", "WHILE", "FOR", "PRINT", "PRINTLN", "RETURN", 
		"NEW", "LOWER", "UPPER", "NONNULL", "NUMBER", "IDENT", "INT", "CHAR", 
		"STRING", "LINE_COMMENT", "MULTILINE_COMMENT", "WHITESPACE"
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
		case 49: LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 50: MULTILINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 51: WHITESPACE_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void LINE_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
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

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\61\u0174\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3"+
		" \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3$\3%"+
		"\3%\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3+\3+\3,\3,\3-\3-\3.\3"+
		".\5.\u0128\n.\3/\3/\5/\u012c\n/\3/\3/\3/\3/\7/\u0132\n/\f/\16/\u0135\13"+
		"/\3\60\3\60\3\60\7\60\u013a\n\60\f\60\16\60\u013d\13\60\5\60\u013f\n\60"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u014a\n\61\3\62\3\62"+
		"\7\62\u014e\n\62\f\62\16\62\u0151\13\62\3\62\3\62\3\63\3\63\3\63\3\63"+
		"\7\63\u0159\n\63\f\63\16\63\u015c\13\63\3\63\3\63\3\64\3\64\3\64\3\64"+
		"\7\64\u0164\n\64\f\64\16\64\u0167\13\64\3\64\3\64\3\64\3\64\3\64\3\65"+
		"\6\65\u016f\n\65\r\65\16\65\u0170\3\65\3\65\4\u014f\u0165\66\3\3\1\5\4"+
		"\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16"+
		"\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1"+
		"/\31\1\61\32\1\63\33\1\65\34\1\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$"+
		"\1G%\1I&\1K\'\1M(\1O)\1Q*\1S+\1U\2\1W\2\1Y\2\1[\2\1],\1_-\1a\2\1c.\1e"+
		"/\2g\60\3i\61\4\3\2\5\5\2\"#%]_\u0080\4\2\f\f\17\17\5\2\13\f\17\17\"\""+
		"\u017e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2"+
		"\2\3k\3\2\2\2\5m\3\2\2\2\7p\3\2\2\2\ts\3\2\2\2\13u\3\2\2\2\rw\3\2\2\2"+
		"\17y\3\2\2\2\21{\3\2\2\2\23}\3\2\2\2\25\177\3\2\2\2\27\u0081\3\2\2\2\31"+
		"\u0083\3\2\2\2\33\u0086\3\2\2\2\35\u0089\3\2\2\2\37\u008b\3\2\2\2!\u008d"+
		"\3\2\2\2#\u008f\3\2\2\2%\u0091\3\2\2\2\'\u0093\3\2\2\2)\u0095\3\2\2\2"+
		"+\u0097\3\2\2\2-\u0099\3\2\2\2/\u009c\3\2\2\2\61\u00a1\3\2\2\2\63\u00a7"+
		"\3\2\2\2\65\u00ad\3\2\2\2\67\u00b5\3\2\2\29\u00bd\3\2\2\2;\u00c2\3\2\2"+
		"\2=\u00c6\3\2\2\2?\u00cb\3\2\2\2A\u00d2\3\2\2\2C\u00d9\3\2\2\2E\u00de"+
		"\3\2\2\2G\u00e1\3\2\2\2I\u00e6\3\2\2\2K\u00ec\3\2\2\2M\u00f0\3\2\2\2O"+
		"\u0101\3\2\2\2Q\u0114\3\2\2\2S\u011b\3\2\2\2U\u011f\3\2\2\2W\u0121\3\2"+
		"\2\2Y\u0123\3\2\2\2[\u0127\3\2\2\2]\u012b\3\2\2\2_\u013e\3\2\2\2a\u0149"+
		"\3\2\2\2c\u014b\3\2\2\2e\u0154\3\2\2\2g\u015f\3\2\2\2i\u016e\3\2\2\2k"+
		"l\7/\2\2l\4\3\2\2\2mn\7(\2\2no\7(\2\2o\6\3\2\2\2pq\7?\2\2qr\7?\2\2r\b"+
		"\3\2\2\2st\7>\2\2t\n\3\2\2\2uv\7-\2\2v\f\3\2\2\2wx\7,\2\2x\16\3\2\2\2"+
		"yz\7#\2\2z\20\3\2\2\2{|\7=\2\2|\22\3\2\2\2}~\7.\2\2~\24\3\2\2\2\177\u0080"+
		"\7?\2\2\u0080\26\3\2\2\2\u0081\u0082\7\60\2\2\u0082\30\3\2\2\2\u0083\u0084"+
		"\7-\2\2\u0084\u0085\7-\2\2\u0085\32\3\2\2\2\u0086\u0087\7/\2\2\u0087\u0088"+
		"\7/\2\2\u0088\34\3\2\2\2\u0089\u008a\7*\2\2\u008a\36\3\2\2\2\u008b\u008c"+
		"\7+\2\2\u008c \3\2\2\2\u008d\u008e\7]\2\2\u008e\"\3\2\2\2\u008f\u0090"+
		"\7_\2\2\u0090$\3\2\2\2\u0091\u0092\7}\2\2\u0092&\3\2\2\2\u0093\u0094\7"+
		"\177\2\2\u0094(\3\2\2\2\u0095\u0096\7A\2\2\u0096*\3\2\2\2\u0097\u0098"+
		"\7<\2\2\u0098,\3\2\2\2\u0099\u009a\7-\2\2\u009a\u009b\7?\2\2\u009b.\3"+
		"\2\2\2\u009c\u009d\7v\2\2\u009d\u009e\7t\2\2\u009e\u009f\7w\2\2\u009f"+
		"\u00a0\7g\2\2\u00a0\60\3\2\2\2\u00a1\u00a2\7h\2\2\u00a2\u00a3\7c\2\2\u00a3"+
		"\u00a4\7n\2\2\u00a4\u00a5\7u\2\2\u00a5\u00a6\7g\2\2\u00a6\62\3\2\2\2\u00a7"+
		"\u00a8\7e\2\2\u00a8\u00a9\7n\2\2\u00a9\u00aa\7c\2\2\u00aa\u00ab\7u\2\2"+
		"\u00ab\u00ac\7u\2\2\u00ac\64\3\2\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7"+
		"z\2\2\u00af\u00b0\7v\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2\7p\2\2\u00b2\u00b3"+
		"\7f\2\2\u00b3\u00b4\7u\2\2\u00b4\66\3\2\2\2\u00b5\u00b6\7d\2\2\u00b6\u00b7"+
		"\7q\2\2\u00b7\u00b8\7q\2\2\u00b8\u00b9\7n\2\2\u00b9\u00ba\7g\2\2\u00ba"+
		"\u00bb\7c\2\2\u00bb\u00bc\7p\2\2\u00bc8\3\2\2\2\u00bd\u00be\7x\2\2\u00be"+
		"\u00bf\7q\2\2\u00bf\u00c0\7k\2\2\u00c0\u00c1\7f\2\2\u00c1:\3\2\2\2\u00c2"+
		"\u00c3\7k\2\2\u00c3\u00c4\7p\2\2\u00c4\u00c5\7v\2\2\u00c5<\3\2\2\2\u00c6"+
		"\u00c7\7e\2\2\u00c7\u00c8\7j\2\2\u00c8\u00c9\7c\2\2\u00c9\u00ca\7t\2\2"+
		"\u00ca>\3\2\2\2\u00cb\u00cc\7r\2\2\u00cc\u00cd\7w\2\2\u00cd\u00ce\7d\2"+
		"\2\u00ce\u00cf\7n\2\2\u00cf\u00d0\7k\2\2\u00d0\u00d1\7e\2\2\u00d1@\3\2"+
		"\2\2\u00d2\u00d3\7u\2\2\u00d3\u00d4\7v\2\2\u00d4\u00d5\7c\2\2\u00d5\u00d6"+
		"\7v\2\2\u00d6\u00d7\7k\2\2\u00d7\u00d8\7e\2\2\u00d8B\3\2\2\2\u00d9\u00da"+
		"\7v\2\2\u00da\u00db\7j\2\2\u00db\u00dc\7k\2\2\u00dc\u00dd\7u\2\2\u00dd"+
		"D\3\2\2\2\u00de\u00df\7k\2\2\u00df\u00e0\7h\2\2\u00e0F\3\2\2\2\u00e1\u00e2"+
		"\7g\2\2\u00e2\u00e3\7n\2\2\u00e3\u00e4\7u\2\2\u00e4\u00e5\7g\2\2\u00e5"+
		"H\3\2\2\2\u00e6\u00e7\7y\2\2\u00e7\u00e8\7j\2\2\u00e8\u00e9\7k\2\2\u00e9"+
		"\u00ea\7n\2\2\u00ea\u00eb\7g\2\2\u00ebJ\3\2\2\2\u00ec\u00ed\7h\2\2\u00ed"+
		"\u00ee\7q\2\2\u00ee\u00ef\7t\2\2\u00efL\3\2\2\2\u00f0\u00f1\7U\2\2\u00f1"+
		"\u00f2\7{\2\2\u00f2\u00f3\7u\2\2\u00f3\u00f4\7v\2\2\u00f4\u00f5\7g\2\2"+
		"\u00f5\u00f6\7o\2\2\u00f6\u00f7\7\60\2\2\u00f7\u00f8\7q\2\2\u00f8\u00f9"+
		"\7w\2\2\u00f9\u00fa\7v\2\2\u00fa\u00fb\7\60\2\2\u00fb\u00fc\7r\2\2\u00fc"+
		"\u00fd\7t\2\2\u00fd\u00fe\7k\2\2\u00fe\u00ff\7p\2\2\u00ff\u0100\7v\2\2"+
		"\u0100N\3\2\2\2\u0101\u0102\7U\2\2\u0102\u0103\7{\2\2\u0103\u0104\7u\2"+
		"\2\u0104\u0105\7v\2\2\u0105\u0106\7g\2\2\u0106\u0107\7o\2\2\u0107\u0108"+
		"\7\60\2\2\u0108\u0109\7q\2\2\u0109\u010a\7w\2\2\u010a\u010b\7v\2\2\u010b"+
		"\u010c\7\60\2\2\u010c\u010d\7r\2\2\u010d\u010e\7t\2\2\u010e\u010f\7k\2"+
		"\2\u010f\u0110\7p\2\2\u0110\u0111\7v\2\2\u0111\u0112\7n\2\2\u0112\u0113"+
		"\7p\2\2\u0113P\3\2\2\2\u0114\u0115\7t\2\2\u0115\u0116\7g\2\2\u0116\u0117"+
		"\7v\2\2\u0117\u0118\7w\2\2\u0118\u0119\7t\2\2\u0119\u011a\7p\2\2\u011a"+
		"R\3\2\2\2\u011b\u011c\7p\2\2\u011c\u011d\7g\2\2\u011d\u011e\7y\2\2\u011e"+
		"T\3\2\2\2\u011f\u0120\4c|\2\u0120V\3\2\2\2\u0121\u0122\4C\\\2\u0122X\3"+
		"\2\2\2\u0123\u0124\4\63;\2\u0124Z\3\2\2\2\u0125\u0128\7\62\2\2\u0126\u0128"+
		"\5Y-\2\u0127\u0125\3\2\2\2\u0127\u0126\3\2\2\2\u0128\\\3\2\2\2\u0129\u012c"+
		"\5U+\2\u012a\u012c\5W,\2\u012b\u0129\3\2\2\2\u012b\u012a\3\2\2\2\u012c"+
		"\u0133\3\2\2\2\u012d\u0132\5U+\2\u012e\u0132\5W,\2\u012f\u0132\5[.\2\u0130"+
		"\u0132\7a\2\2\u0131\u012d\3\2\2\2\u0131\u012e\3\2\2\2\u0131\u012f\3\2"+
		"\2\2\u0131\u0130\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0133"+
		"\u0134\3\2\2\2\u0134^\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u013f\7\62\2\2"+
		"\u0137\u013b\5Y-\2\u0138\u013a\5[.\2\u0139\u0138\3\2\2\2\u013a\u013d\3"+
		"\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013f\3\2\2\2\u013d"+
		"\u013b\3\2\2\2\u013e\u0136\3\2\2\2\u013e\u0137\3\2\2\2\u013f`\3\2\2\2"+
		"\u0140\u014a\t\2\2\2\u0141\u0142\7^\2\2\u0142\u014a\7$\2\2\u0143\u0144"+
		"\7^\2\2\u0144\u014a\7^\2\2\u0145\u0146\7^\2\2\u0146\u014a\7v\2\2\u0147"+
		"\u0148\7^\2\2\u0148\u014a\7p\2\2\u0149\u0140\3\2\2\2\u0149\u0141\3\2\2"+
		"\2\u0149\u0143\3\2\2\2\u0149\u0145\3\2\2\2\u0149\u0147\3\2\2\2\u014ab"+
		"\3\2\2\2\u014b\u014f\7$\2\2\u014c\u014e\5a\61\2\u014d\u014c\3\2\2\2\u014e"+
		"\u0151\3\2\2\2\u014f\u0150\3\2\2\2\u014f\u014d\3\2\2\2\u0150\u0152\3\2"+
		"\2\2\u0151\u014f\3\2\2\2\u0152\u0153\7$\2\2\u0153d\3\2\2\2\u0154\u0155"+
		"\7\61\2\2\u0155\u0156\7\61\2\2\u0156\u015a\3\2\2\2\u0157\u0159\n\3\2\2"+
		"\u0158\u0157\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b"+
		"\3\2\2\2\u015b\u015d\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u015e\b\63\2\2"+
		"\u015ef\3\2\2\2\u015f\u0160\7\61\2\2\u0160\u0161\7,\2\2\u0161\u0165\3"+
		"\2\2\2\u0162\u0164\13\2\2\2\u0163\u0162\3\2\2\2\u0164\u0167\3\2\2\2\u0165"+
		"\u0166\3\2\2\2\u0165\u0163\3\2\2\2\u0166\u0168\3\2\2\2\u0167\u0165\3\2"+
		"\2\2\u0168\u0169\7,\2\2\u0169\u016a\7\61\2\2\u016a\u016b\3\2\2\2\u016b"+
		"\u016c\b\64\3\2\u016ch\3\2\2\2\u016d\u016f\t\4\2\2\u016e\u016d\3\2\2\2"+
		"\u016f\u0170\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0172"+
		"\3\2\2\2\u0172\u0173\b\65\4\2\u0173j\3\2\2\2\16\2\u0127\u012b\u0131\u0133"+
		"\u013b\u013e\u0149\u014f\u015a\u0165\u0170";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}