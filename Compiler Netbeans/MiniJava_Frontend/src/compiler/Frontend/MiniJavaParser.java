// Generated from C:\Users\Thor\Dropbox\DUT\3.Sem\Compiler_Teknik\Compiler_Netbeans\MiniJavaCompiler\Compiler Netbeans\MiniJava_Frontend\src\compiler\Frontend\MiniJava.g4 by ANTLR 4.1
package compiler.Frontend;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniJavaParser extends Parser {
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
	public static final String[] tokenNames = {
		"<INVALID>", "'-'", "'&&'", "'=='", "'<'", "'+'", "'*'", "'!'", "';'", 
		"','", "'='", "'.'", "'++'", "'--'", "'('", "')'", "'['", "']'", "'{'", 
		"'}'", "'?'", "':'", "'+='", "'true'", "'false'", "'class'", "'extends'", 
		"'boolean'", "'void'", "'int'", "'char'", "'public'", "'static'", "'this'", 
		"'if'", "'else'", "'while'", "'for'", "'System.out.print'", "'System.out.println'", 
		"'return'", "'new'", "IDENT", "INT", "STRING", "LINE_COMMENT", "MULTILINE_COMMENT", 
		"WHITESPACE"
	};
	public static final int
		RULE_program = 0, RULE_classDeclaration = 1, RULE_mainClass = 2, RULE_block = 3, 
		RULE_varDeclaration = 4, RULE_initExpression = 5, RULE_initFor = 6, RULE_initStaticArray = 7, 
		RULE_variable = 8, RULE_type = 9, RULE_typeBasic = 10, RULE_typeArray = 11, 
		RULE_typeBoolean = 12, RULE_typeInt = 13, RULE_typeClass = 14, RULE_typeChar = 15, 
		RULE_methodDeclaration = 16, RULE_procType = 17, RULE_typeVoid = 18, RULE_statement = 19, 
		RULE_statementIf = 20, RULE_statementWhile = 21, RULE_statementAssign = 22, 
		RULE_statementPlusEqual = 23, RULE_statementAssignArray = 24, RULE_statementPrint = 25, 
		RULE_statementPrintln = 26, RULE_statementMethod = 27, RULE_statementTernary = 28, 
		RULE_statementIncrement = 29, RULE_statementDecrement = 30, RULE_statementFor = 31, 
		RULE_statementReturn = 32, RULE_expression = 33, RULE_level1 = 34, RULE_level2 = 35, 
		RULE_level3 = 36, RULE_level4 = 37, RULE_level5 = 38, RULE_expressionUnaryMinus = 39, 
		RULE_expressionNegation = 40, RULE_expressionNewObject = 41, RULE_expressionNewArray = 42, 
		RULE_expressionIdentifier = 43, RULE_expressionArrayAccess = 44, RULE_expressionParentheses = 45, 
		RULE_expressionConstantTrue = 46, RULE_expressionConstantFalse = 47, RULE_expressionConstantInteger = 48, 
		RULE_expressionConstantString = 49, RULE_expressionMethodCall = 50, RULE_expressionPostIncrement = 51, 
		RULE_expressionPreIncrement = 52, RULE_expressionPostDecrement = 53, RULE_expressionPreDecrement = 54, 
		RULE_identifier = 55, RULE_identifierIdentifier = 56, RULE_identifierId = 57, 
		RULE_idThis = 58, RULE_idIDENT = 59;
	public static final String[] ruleNames = {
		"program", "classDeclaration", "mainClass", "block", "varDeclaration", 
		"initExpression", "initFor", "initStaticArray", "variable", "type", "typeBasic", 
		"typeArray", "typeBoolean", "typeInt", "typeClass", "typeChar", "methodDeclaration", 
		"procType", "typeVoid", "statement", "statementIf", "statementWhile", 
		"statementAssign", "statementPlusEqual", "statementAssignArray", "statementPrint", 
		"statementPrintln", "statementMethod", "statementTernary", "statementIncrement", 
		"statementDecrement", "statementFor", "statementReturn", "expression", 
		"level1", "level2", "level3", "level4", "level5", "expressionUnaryMinus", 
		"expressionNegation", "expressionNewObject", "expressionNewArray", "expressionIdentifier", 
		"expressionArrayAccess", "expressionParentheses", "expressionConstantTrue", 
		"expressionConstantFalse", "expressionConstantInteger", "expressionConstantString", 
		"expressionMethodCall", "expressionPostIncrement", "expressionPreIncrement", 
		"expressionPostDecrement", "expressionPreDecrement", "identifier", "identifierIdentifier", 
		"identifierId", "idThis", "idIDENT"
	};

	@Override
	public String getGrammarFileName() { return "MiniJava.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniJavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public MainClassContext mainClass() {
			return getRuleContext(MainClassContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120); mainClass();
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(121); classDeclaration();
				}
				}
				setState(126);
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public Token className;
		public Token superClassName;
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public TerminalNode CURLYOPEN() { return getToken(MiniJavaParser.CURLYOPEN, 0); }
		public TerminalNode IDENT(int i) {
			return getToken(MiniJavaParser.IDENT, i);
		}
		public TerminalNode CLASS() { return getToken(MiniJavaParser.CLASS, 0); }
		public TerminalNode CURLYCLOSE() { return getToken(MiniJavaParser.CURLYCLOSE, 0); }
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public List<TerminalNode> IDENT() { return getTokens(MiniJavaParser.IDENT); }
		public TerminalNode EXTENDS() { return getToken(MiniJavaParser.EXTENDS, 0); }
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(127); match(CLASS);
			setState(128); ((ClassDeclarationContext)_localctx).className = match(IDENT);
			setState(131);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(129); match(EXTENDS);
				setState(130); ((ClassDeclarationContext)_localctx).superClassName = match(IDENT);
				}
			}

			setState(133); match(CURLYOPEN);
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(134); varDeclaration();
					}
					} 
				}
				setState(139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPEBOOLEAN) | (1L << TYPEVOID) | (1L << TYPEINT) | (1L << TYPECHAR) | (1L << PUBLIC) | (1L << STATIC) | (1L << IDENT))) != 0)) {
				{
				{
				setState(140); methodDeclaration();
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(146); match(CURLYCLOSE);
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

	public static class MainClassContext extends ParserRuleContext {
		public Token className;
		public MethodDeclarationContext method;
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public TerminalNode CURLYOPEN() { return getToken(MiniJavaParser.CURLYOPEN, 0); }
		public TerminalNode CLASS() { return getToken(MiniJavaParser.CLASS, 0); }
		public TerminalNode CURLYCLOSE() { return getToken(MiniJavaParser.CURLYCLOSE, 0); }
		public TerminalNode IDENT() { return getToken(MiniJavaParser.IDENT, 0); }
		public MainClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMainClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMainClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitMainClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainClassContext mainClass() throws RecognitionException {
		MainClassContext _localctx = new MainClassContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mainClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148); match(CLASS);
			setState(149); ((MainClassContext)_localctx).className = match(IDENT);
			setState(150); match(CURLYOPEN);
			setState(151); ((MainClassContext)_localctx).method = methodDeclaration();
			setState(152); match(CURLYCLOSE);
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

	public static class BlockContext extends ParserRuleContext {
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public TerminalNode CURLYOPEN() { return getToken(MiniJavaParser.CURLYOPEN, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode CURLYCLOSE() { return getToken(MiniJavaParser.CURLYCLOSE, 0); }
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(154); match(CURLYOPEN);
			setState(158);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(155); varDeclaration();
					}
					} 
				}
				setState(160);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << EXCLAMATION) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << ROUNDOPEN) | (1L << CURLYOPEN) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << PRINT) | (1L << PRINTLN) | (1L << RETURN) | (1L << NEW) | (1L << IDENT) | (1L << INT) | (1L << STRING))) != 0)) {
				{
				{
				setState(161); statement();
				}
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(167); match(CURLYCLOSE);
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public VariableContext var;
		public TerminalNode SEMICOLON() { return getToken(MiniJavaParser.SEMICOLON, 0); }
		public TerminalNode EQUAL() { return getToken(MiniJavaParser.EQUAL, 0); }
		public InitExpressionContext initExpression() {
			return getRuleContext(InitExpressionContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169); ((VarDeclarationContext)_localctx).var = variable();
			setState(172);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(170); match(EQUAL);
				setState(171); initExpression();
				}
			}

			setState(174); match(SEMICOLON);
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

	public static class InitExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InitStaticArrayContext initStaticArray() {
			return getRuleContext(InitStaticArrayContext.class,0);
		}
		public InitExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterInitExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitInitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitInitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitExpressionContext initExpression() throws RecognitionException {
		InitExpressionContext _localctx = new InitExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_initExpression);
		try {
			setState(178);
			switch (_input.LA(1)) {
			case MINUS:
			case EXCLAMATION:
			case INCREMENT:
			case DECREMENT:
			case ROUNDOPEN:
			case TRUE:
			case FALSE:
			case THIS:
			case NEW:
			case IDENT:
			case INT:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(176); expression();
				}
				break;
			case CURLYOPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(177); initStaticArray();
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

	public static class InitForContext extends ParserRuleContext {
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public StatementAssignContext statementAssign() {
			return getRuleContext(StatementAssignContext.class,0);
		}
		public InitForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterInitFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitInitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitInitFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitForContext initFor() throws RecognitionException {
		InitForContext _localctx = new InitForContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_initFor);
		try {
			setState(182);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(180); varDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(181); statementAssign();
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

	public static class InitStaticArrayContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> expr = new ArrayList<ExpressionContext>();
		public TerminalNode CURLYOPEN() { return getToken(MiniJavaParser.CURLYOPEN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MiniJavaParser.COMMA); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode CURLYCLOSE() { return getToken(MiniJavaParser.CURLYCLOSE, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniJavaParser.COMMA, i);
		}
		public InitStaticArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initStaticArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterInitStaticArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitInitStaticArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitInitStaticArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitStaticArrayContext initStaticArray() throws RecognitionException {
		InitStaticArrayContext _localctx = new InitStaticArrayContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_initStaticArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184); match(CURLYOPEN);
			setState(193);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << EXCLAMATION) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << ROUNDOPEN) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << NEW) | (1L << IDENT) | (1L << INT) | (1L << STRING))) != 0)) {
				{
				{
				setState(185); ((InitStaticArrayContext)_localctx).expression = expression();
				((InitStaticArrayContext)_localctx).expr.add(((InitStaticArrayContext)_localctx).expression);
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(186); match(COMMA);
					setState(187); ((InitStaticArrayContext)_localctx).expression = expression();
					((InitStaticArrayContext)_localctx).expr.add(((InitStaticArrayContext)_localctx).expression);
					}
					}
					setState(192);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(195); match(CURLYCLOSE);
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
		public Token variableName;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(MiniJavaParser.IDENT, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197); type();
			setState(198); ((VariableContext)_localctx).variableName = match(IDENT);
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

	public static class TypeContext extends ParserRuleContext {
		public TypeArrayContext typeArray() {
			return getRuleContext(TypeArrayContext.class,0);
		}
		public TypeBasicContext typeBasic() {
			return getRuleContext(TypeBasicContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type);
		try {
			setState(202);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(200); typeBasic();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201); typeArray();
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

	public static class TypeBasicContext extends ParserRuleContext {
		public TypeIntContext typeInt() {
			return getRuleContext(TypeIntContext.class,0);
		}
		public TypeClassContext typeClass() {
			return getRuleContext(TypeClassContext.class,0);
		}
		public TypeBooleanContext typeBoolean() {
			return getRuleContext(TypeBooleanContext.class,0);
		}
		public TypeCharContext typeChar() {
			return getRuleContext(TypeCharContext.class,0);
		}
		public TypeBasicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBasic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterTypeBasic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitTypeBasic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitTypeBasic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeBasicContext typeBasic() throws RecognitionException {
		TypeBasicContext _localctx = new TypeBasicContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeBasic);
		try {
			setState(208);
			switch (_input.LA(1)) {
			case TYPEBOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(204); typeBoolean();
				}
				break;
			case TYPEINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(205); typeInt();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(206); typeClass();
				}
				break;
			case TYPECHAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(207); typeChar();
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

	public static class TypeArrayContext extends ParserRuleContext {
		public TypeBasicContext typeBasic() {
			return getRuleContext(TypeBasicContext.class,0);
		}
		public TerminalNode SQUARECLOSE() { return getToken(MiniJavaParser.SQUARECLOSE, 0); }
		public TerminalNode SQUAREOPEN() { return getToken(MiniJavaParser.SQUAREOPEN, 0); }
		public TypeArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterTypeArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitTypeArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitTypeArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArrayContext typeArray() throws RecognitionException {
		TypeArrayContext _localctx = new TypeArrayContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_typeArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210); typeBasic();
			setState(211); match(SQUAREOPEN);
			setState(212); match(SQUARECLOSE);
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

	public static class TypeBooleanContext extends ParserRuleContext {
		public TerminalNode TYPEBOOLEAN() { return getToken(MiniJavaParser.TYPEBOOLEAN, 0); }
		public TypeBooleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBoolean; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterTypeBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitTypeBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitTypeBoolean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeBooleanContext typeBoolean() throws RecognitionException {
		TypeBooleanContext _localctx = new TypeBooleanContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_typeBoolean);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214); match(TYPEBOOLEAN);
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

	public static class TypeIntContext extends ParserRuleContext {
		public TerminalNode TYPEINT() { return getToken(MiniJavaParser.TYPEINT, 0); }
		public TypeIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeInt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterTypeInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitTypeInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitTypeInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeIntContext typeInt() throws RecognitionException {
		TypeIntContext _localctx = new TypeIntContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_typeInt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216); match(TYPEINT);
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

	public static class TypeClassContext extends ParserRuleContext {
		public Token className;
		public TerminalNode IDENT() { return getToken(MiniJavaParser.IDENT, 0); }
		public TypeClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterTypeClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitTypeClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitTypeClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeClassContext typeClass() throws RecognitionException {
		TypeClassContext _localctx = new TypeClassContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_typeClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218); ((TypeClassContext)_localctx).className = match(IDENT);
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

	public static class TypeCharContext extends ParserRuleContext {
		public TerminalNode TYPECHAR() { return getToken(MiniJavaParser.TYPECHAR, 0); }
		public TypeCharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeChar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterTypeChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitTypeChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitTypeChar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeCharContext typeChar() throws RecognitionException {
		TypeCharContext _localctx = new TypeCharContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_typeChar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220); match(TYPECHAR);
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public Token isPublic;
		public Token isStatic;
		public Token methodName;
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public TerminalNode CURLYOPEN() { return getToken(MiniJavaParser.CURLYOPEN, 0); }
		public TerminalNode ROUNDOPEN() { return getToken(MiniJavaParser.ROUNDOPEN, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementReturnContext statementReturn() {
			return getRuleContext(StatementReturnContext.class,0);
		}
		public TerminalNode CURLYCLOSE() { return getToken(MiniJavaParser.CURLYCLOSE, 0); }
		public ProcTypeContext procType() {
			return getRuleContext(ProcTypeContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(MiniJavaParser.IDENT, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniJavaParser.COMMA, i);
		}
		public TerminalNode STATIC() { return getToken(MiniJavaParser.STATIC, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MiniJavaParser.COMMA); }
		public TerminalNode ROUNDCLOSE() { return getToken(MiniJavaParser.ROUNDCLOSE, 0); }
		public TerminalNode PUBLIC() { return getToken(MiniJavaParser.PUBLIC, 0); }
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_methodDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			_la = _input.LA(1);
			if (_la==PUBLIC) {
				{
				setState(222); ((MethodDeclarationContext)_localctx).isPublic = match(PUBLIC);
				}
			}

			setState(226);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(225); ((MethodDeclarationContext)_localctx).isStatic = match(STATIC);
				}
			}

			setState(228); procType();
			setState(229); ((MethodDeclarationContext)_localctx).methodName = match(IDENT);
			setState(230); match(ROUNDOPEN);
			setState(239);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPEBOOLEAN) | (1L << TYPEINT) | (1L << TYPECHAR) | (1L << IDENT))) != 0)) {
				{
				setState(231); variable();
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(232); match(COMMA);
					setState(233); variable();
					}
					}
					setState(238);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(241); match(ROUNDCLOSE);
			setState(242); match(CURLYOPEN);
			setState(246);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(243); varDeclaration();
					}
					} 
				}
				setState(248);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(252);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(249); statement();
					}
					} 
				}
				setState(254);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(255); statementReturn();
			setState(256); match(CURLYCLOSE);
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

	public static class ProcTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeVoidContext typeVoid() {
			return getRuleContext(TypeVoidContext.class,0);
		}
		public ProcTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterProcType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitProcType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitProcType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcTypeContext procType() throws RecognitionException {
		ProcTypeContext _localctx = new ProcTypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_procType);
		try {
			setState(260);
			switch (_input.LA(1)) {
			case TYPEVOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(258); typeVoid();
				}
				break;
			case TYPEBOOLEAN:
			case TYPEINT:
			case TYPECHAR:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(259); type();
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

	public static class TypeVoidContext extends ParserRuleContext {
		public TerminalNode TYPEVOID() { return getToken(MiniJavaParser.TYPEVOID, 0); }
		public TypeVoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeVoid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterTypeVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitTypeVoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitTypeVoid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeVoidContext typeVoid() throws RecognitionException {
		TypeVoidContext _localctx = new TypeVoidContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_typeVoid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262); match(TYPEVOID);
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
		public StatementPrintlnContext statementPrintln() {
			return getRuleContext(StatementPrintlnContext.class,0);
		}
		public StatementPlusEqualContext statementPlusEqual() {
			return getRuleContext(StatementPlusEqualContext.class,0);
		}
		public StatementDecrementContext statementDecrement() {
			return getRuleContext(StatementDecrementContext.class,0);
		}
		public StatementMethodContext statementMethod() {
			return getRuleContext(StatementMethodContext.class,0);
		}
		public StatementAssignArrayContext statementAssignArray() {
			return getRuleContext(StatementAssignArrayContext.class,0);
		}
		public StatementReturnContext statementReturn() {
			return getRuleContext(StatementReturnContext.class,0);
		}
		public StatementIncrementContext statementIncrement() {
			return getRuleContext(StatementIncrementContext.class,0);
		}
		public StatementIfContext statementIf() {
			return getRuleContext(StatementIfContext.class,0);
		}
		public StatementAssignContext statementAssign() {
			return getRuleContext(StatementAssignContext.class,0);
		}
		public StatementPrintContext statementPrint() {
			return getRuleContext(StatementPrintContext.class,0);
		}
		public StatementWhileContext statementWhile() {
			return getRuleContext(StatementWhileContext.class,0);
		}
		public StatementForContext statementFor() {
			return getRuleContext(StatementForContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementTernaryContext statementTernary() {
			return getRuleContext(StatementTernaryContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_statement);
		try {
			setState(278);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(264); block();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(265); statementIf();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(266); statementWhile();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(267); statementAssign();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(268); statementPlusEqual();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(269); statementAssignArray();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(270); statementPrintln();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(271); statementPrint();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(272); statementMethod();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(273); statementReturn();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(274); statementTernary();
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(275); statementIncrement();
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(276); statementDecrement();
				}
				break;

			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(277); statementFor();
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

	public static class StatementIfContext extends ParserRuleContext {
		public ExpressionContext condition;
		public BlockContext ifBlock;
		public BlockContext elseBlock;
		public TerminalNode ELSE() { return getToken(MiniJavaParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(MiniJavaParser.IF, 0); }
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ROUNDOPEN() { return getToken(MiniJavaParser.ROUNDOPEN, 0); }
		public TerminalNode ROUNDCLOSE() { return getToken(MiniJavaParser.ROUNDCLOSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public StatementIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatementIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatementIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStatementIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementIfContext statementIf() throws RecognitionException {
		StatementIfContext _localctx = new StatementIfContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_statementIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280); match(IF);
			setState(281); match(ROUNDOPEN);
			setState(282); ((StatementIfContext)_localctx).condition = expression();
			setState(283); match(ROUNDCLOSE);
			setState(284); ((StatementIfContext)_localctx).ifBlock = block();
			setState(287);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(285); match(ELSE);
				setState(286); ((StatementIfContext)_localctx).elseBlock = block();
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

	public static class StatementWhileContext extends ParserRuleContext {
		public ExpressionContext condition;
		public StatementContext whileBlock;
		public TerminalNode ROUNDOPEN() { return getToken(MiniJavaParser.ROUNDOPEN, 0); }
		public TerminalNode ROUNDCLOSE() { return getToken(MiniJavaParser.ROUNDCLOSE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(MiniJavaParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatementWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatementWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStatementWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementWhileContext statementWhile() throws RecognitionException {
		StatementWhileContext _localctx = new StatementWhileContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_statementWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289); match(WHILE);
			setState(290); match(ROUNDOPEN);
			setState(291); ((StatementWhileContext)_localctx).condition = expression();
			setState(292); match(ROUNDCLOSE);
			setState(293); ((StatementWhileContext)_localctx).whileBlock = statement();
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

	public static class StatementAssignContext extends ParserRuleContext {
		public IdentifierContext lhs;
		public ExpressionContext rhs;
		public TerminalNode EQUAL() { return getToken(MiniJavaParser.EQUAL, 0); }
		public TerminalNode SEMICOLON() { return getToken(MiniJavaParser.SEMICOLON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatementAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatementAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStatementAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementAssignContext statementAssign() throws RecognitionException {
		StatementAssignContext _localctx = new StatementAssignContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_statementAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295); ((StatementAssignContext)_localctx).lhs = identifier();
			setState(296); match(EQUAL);
			setState(297); ((StatementAssignContext)_localctx).rhs = expression();
			setState(298); match(SEMICOLON);
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

	public static class StatementPlusEqualContext extends ParserRuleContext {
		public IdentifierContext lhs;
		public ExpressionContext rhs;
		public TerminalNode SEMICOLON() { return getToken(MiniJavaParser.SEMICOLON, 0); }
		public TerminalNode PLUSEQUAL() { return getToken(MiniJavaParser.PLUSEQUAL, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementPlusEqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementPlusEqual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatementPlusEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatementPlusEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStatementPlusEqual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementPlusEqualContext statementPlusEqual() throws RecognitionException {
		StatementPlusEqualContext _localctx = new StatementPlusEqualContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_statementPlusEqual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300); ((StatementPlusEqualContext)_localctx).lhs = identifier();
			setState(301); match(PLUSEQUAL);
			setState(302); ((StatementPlusEqualContext)_localctx).rhs = expression();
			setState(303); match(SEMICOLON);
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

	public static class StatementAssignArrayContext extends ParserRuleContext {
		public IdentifierContext array;
		public ExpressionContext element;
		public ExpressionContext value;
		public TerminalNode SQUARECLOSE() { return getToken(MiniJavaParser.SQUARECLOSE, 0); }
		public TerminalNode EQUAL() { return getToken(MiniJavaParser.EQUAL, 0); }
		public TerminalNode SEMICOLON() { return getToken(MiniJavaParser.SEMICOLON, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SQUAREOPEN() { return getToken(MiniJavaParser.SQUAREOPEN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public StatementAssignArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementAssignArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatementAssignArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatementAssignArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStatementAssignArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementAssignArrayContext statementAssignArray() throws RecognitionException {
		StatementAssignArrayContext _localctx = new StatementAssignArrayContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_statementAssignArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305); ((StatementAssignArrayContext)_localctx).array = identifier();
			setState(306); match(SQUAREOPEN);
			setState(307); ((StatementAssignArrayContext)_localctx).element = expression();
			setState(308); match(SQUARECLOSE);
			setState(309); match(EQUAL);
			setState(310); ((StatementAssignArrayContext)_localctx).value = expression();
			setState(311); match(SEMICOLON);
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

	public static class StatementPrintContext extends ParserRuleContext {
		public ExpressionContext argument;
		public TerminalNode SEMICOLON() { return getToken(MiniJavaParser.SEMICOLON, 0); }
		public TerminalNode PRINT() { return getToken(MiniJavaParser.PRINT, 0); }
		public TerminalNode ROUNDOPEN() { return getToken(MiniJavaParser.ROUNDOPEN, 0); }
		public TerminalNode ROUNDCLOSE() { return getToken(MiniJavaParser.ROUNDCLOSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementPrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementPrint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatementPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatementPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStatementPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementPrintContext statementPrint() throws RecognitionException {
		StatementPrintContext _localctx = new StatementPrintContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_statementPrint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313); match(PRINT);
			setState(314); match(ROUNDOPEN);
			setState(315); ((StatementPrintContext)_localctx).argument = expression();
			setState(316); match(ROUNDCLOSE);
			setState(317); match(SEMICOLON);
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

	public static class StatementPrintlnContext extends ParserRuleContext {
		public ExpressionContext argument;
		public TerminalNode SEMICOLON() { return getToken(MiniJavaParser.SEMICOLON, 0); }
		public TerminalNode ROUNDOPEN() { return getToken(MiniJavaParser.ROUNDOPEN, 0); }
		public TerminalNode PRINTLN() { return getToken(MiniJavaParser.PRINTLN, 0); }
		public TerminalNode ROUNDCLOSE() { return getToken(MiniJavaParser.ROUNDCLOSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementPrintlnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementPrintln; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatementPrintln(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatementPrintln(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStatementPrintln(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementPrintlnContext statementPrintln() throws RecognitionException {
		StatementPrintlnContext _localctx = new StatementPrintlnContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_statementPrintln);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319); match(PRINTLN);
			setState(320); match(ROUNDOPEN);
			setState(321); ((StatementPrintlnContext)_localctx).argument = expression();
			setState(322); match(ROUNDCLOSE);
			setState(323); match(SEMICOLON);
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

	public static class StatementMethodContext extends ParserRuleContext {
		public ExpressionMethodCallContext ex_method;
		public TerminalNode SEMICOLON() { return getToken(MiniJavaParser.SEMICOLON, 0); }
		public ExpressionMethodCallContext expressionMethodCall() {
			return getRuleContext(ExpressionMethodCallContext.class,0);
		}
		public StatementMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatementMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatementMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStatementMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementMethodContext statementMethod() throws RecognitionException {
		StatementMethodContext _localctx = new StatementMethodContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_statementMethod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325); ((StatementMethodContext)_localctx).ex_method = expressionMethodCall();
			setState(326); match(SEMICOLON);
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

	public static class StatementTernaryContext extends ParserRuleContext {
		public IdentifierContext opt_ident;
		public ExpressionContext condition;
		public IdentifierContext ident_a;
		public ExpressionContext expr_a;
		public IdentifierContext ident_b;
		public ExpressionContext expr_b;
		public TerminalNode SEMICOLON() { return getToken(MiniJavaParser.SEMICOLON, 0); }
		public TerminalNode EQUAL() { return getToken(MiniJavaParser.EQUAL, 0); }
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode TERNARY_PART2() { return getToken(MiniJavaParser.TERNARY_PART2, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public TerminalNode TERNARY_PART1() { return getToken(MiniJavaParser.TERNARY_PART1, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public StatementTernaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementTernary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatementTernary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatementTernary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStatementTernary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementTernaryContext statementTernary() throws RecognitionException {
		StatementTernaryContext _localctx = new StatementTernaryContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_statementTernary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(328); ((StatementTernaryContext)_localctx).opt_ident = identifier();
				setState(329); match(EQUAL);
				}
				break;
			}
			{
			setState(333); ((StatementTernaryContext)_localctx).condition = expression();
			setState(334); match(TERNARY_PART1);
			setState(337);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(335); ((StatementTernaryContext)_localctx).ident_a = identifier();
				}
				break;

			case 2:
				{
				setState(336); ((StatementTernaryContext)_localctx).expr_a = expression();
				}
				break;
			}
			setState(339); match(TERNARY_PART2);
			setState(342);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(340); ((StatementTernaryContext)_localctx).ident_b = identifier();
				}
				break;

			case 2:
				{
				setState(341); ((StatementTernaryContext)_localctx).expr_b = expression();
				}
				break;
			}
			setState(344); match(SEMICOLON);
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

	public static class StatementIncrementContext extends ParserRuleContext {
		public ExpressionPostIncrementContext ex_post_in;
		public ExpressionPreIncrementContext ex_pre_in;
		public TerminalNode SEMICOLON() { return getToken(MiniJavaParser.SEMICOLON, 0); }
		public ExpressionPostIncrementContext expressionPostIncrement() {
			return getRuleContext(ExpressionPostIncrementContext.class,0);
		}
		public ExpressionPreIncrementContext expressionPreIncrement() {
			return getRuleContext(ExpressionPreIncrementContext.class,0);
		}
		public StatementIncrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementIncrement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatementIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatementIncrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStatementIncrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementIncrementContext statementIncrement() throws RecognitionException {
		StatementIncrementContext _localctx = new StatementIncrementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_statementIncrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			switch (_input.LA(1)) {
			case THIS:
			case IDENT:
				{
				setState(346); ((StatementIncrementContext)_localctx).ex_post_in = expressionPostIncrement();
				}
				break;
			case INCREMENT:
				{
				setState(347); ((StatementIncrementContext)_localctx).ex_pre_in = expressionPreIncrement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(350); match(SEMICOLON);
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

	public static class StatementDecrementContext extends ParserRuleContext {
		public ExpressionPostDecrementContext ex_post_de;
		public ExpressionPreDecrementContext ex_pre_de;
		public TerminalNode SEMICOLON() { return getToken(MiniJavaParser.SEMICOLON, 0); }
		public ExpressionPreDecrementContext expressionPreDecrement() {
			return getRuleContext(ExpressionPreDecrementContext.class,0);
		}
		public ExpressionPostDecrementContext expressionPostDecrement() {
			return getRuleContext(ExpressionPostDecrementContext.class,0);
		}
		public StatementDecrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementDecrement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatementDecrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatementDecrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStatementDecrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementDecrementContext statementDecrement() throws RecognitionException {
		StatementDecrementContext _localctx = new StatementDecrementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_statementDecrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			switch (_input.LA(1)) {
			case THIS:
			case IDENT:
				{
				setState(352); ((StatementDecrementContext)_localctx).ex_post_de = expressionPostDecrement();
				}
				break;
			case DECREMENT:
				{
				setState(353); ((StatementDecrementContext)_localctx).ex_pre_de = expressionPreDecrement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(356); match(SEMICOLON);
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

	public static class StatementForContext extends ParserRuleContext {
		public InitForContext var;
		public ExpressionContext condition;
		public ExpressionContext expr;
		public StatementContext forBlock;
		public TerminalNode SEMICOLON() { return getToken(MiniJavaParser.SEMICOLON, 0); }
		public InitForContext initFor() {
			return getRuleContext(InitForContext.class,0);
		}
		public TerminalNode ROUNDOPEN() { return getToken(MiniJavaParser.ROUNDOPEN, 0); }
		public TerminalNode FOR() { return getToken(MiniJavaParser.FOR, 0); }
		public TerminalNode ROUNDCLOSE() { return getToken(MiniJavaParser.ROUNDCLOSE, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public StatementForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatementFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatementFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStatementFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementForContext statementFor() throws RecognitionException {
		StatementForContext _localctx = new StatementForContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_statementFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358); match(FOR);
			setState(359); match(ROUNDOPEN);
			{
			setState(360); ((StatementForContext)_localctx).var = initFor();
			}
			setState(361); ((StatementForContext)_localctx).condition = expression();
			setState(362); match(SEMICOLON);
			setState(363); ((StatementForContext)_localctx).expr = expression();
			setState(364); match(ROUNDCLOSE);
			setState(365); ((StatementForContext)_localctx).forBlock = statement();
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

	public static class StatementReturnContext extends ParserRuleContext {
		public ExpressionContext argument;
		public TerminalNode SEMICOLON() { return getToken(MiniJavaParser.SEMICOLON, 0); }
		public TerminalNode RETURN() { return getToken(MiniJavaParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatementReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatementReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStatementReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementReturnContext statementReturn() throws RecognitionException {
		StatementReturnContext _localctx = new StatementReturnContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_statementReturn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367); match(RETURN);
			setState(369);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << EXCLAMATION) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << ROUNDOPEN) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << NEW) | (1L << IDENT) | (1L << INT) | (1L << STRING))) != 0)) {
				{
				setState(368); ((StatementReturnContext)_localctx).argument = expression();
				}
			}

			setState(371); match(SEMICOLON);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Level1Context head;
		public Level1Context level1;
		public List<Level1Context> tail = new ArrayList<Level1Context>();
		public TerminalNode AND(int i) {
			return getToken(MiniJavaParser.AND, i);
		}
		public Level1Context level1(int i) {
			return getRuleContext(Level1Context.class,i);
		}
		public List<Level1Context> level1() {
			return getRuleContexts(Level1Context.class);
		}
		public List<TerminalNode> AND() { return getTokens(MiniJavaParser.AND); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373); ((ExpressionContext)_localctx).head = level1();
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(374); match(AND);
				setState(375); ((ExpressionContext)_localctx).level1 = level1();
				((ExpressionContext)_localctx).tail.add(((ExpressionContext)_localctx).level1);
				}
				}
				setState(380);
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

	public static class Level1Context extends ParserRuleContext {
		public Level2Context head;
		public Level2Context level2;
		public List<Level2Context> tail = new ArrayList<Level2Context>();
		public List<TerminalNode> EQUALS() { return getTokens(MiniJavaParser.EQUALS); }
		public Level2Context level2(int i) {
			return getRuleContext(Level2Context.class,i);
		}
		public TerminalNode EQUALS(int i) {
			return getToken(MiniJavaParser.EQUALS, i);
		}
		public List<Level2Context> level2() {
			return getRuleContexts(Level2Context.class);
		}
		public Level1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_level1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterLevel1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitLevel1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitLevel1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Level1Context level1() throws RecognitionException {
		Level1Context _localctx = new Level1Context(_ctx, getState());
		enterRule(_localctx, 68, RULE_level1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381); ((Level1Context)_localctx).head = level2();
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUALS) {
				{
				{
				setState(382); match(EQUALS);
				setState(383); ((Level1Context)_localctx).level2 = level2();
				((Level1Context)_localctx).tail.add(((Level1Context)_localctx).level2);
				}
				}
				setState(388);
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

	public static class Level2Context extends ParserRuleContext {
		public Level3Context head;
		public Level3Context level3;
		public List<Level3Context> tail = new ArrayList<Level3Context>();
		public TerminalNode LESSTHAN(int i) {
			return getToken(MiniJavaParser.LESSTHAN, i);
		}
		public List<Level3Context> level3() {
			return getRuleContexts(Level3Context.class);
		}
		public Level3Context level3(int i) {
			return getRuleContext(Level3Context.class,i);
		}
		public List<TerminalNode> LESSTHAN() { return getTokens(MiniJavaParser.LESSTHAN); }
		public Level2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_level2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterLevel2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitLevel2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitLevel2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Level2Context level2() throws RecognitionException {
		Level2Context _localctx = new Level2Context(_ctx, getState());
		enterRule(_localctx, 70, RULE_level2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389); ((Level2Context)_localctx).head = level3();
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LESSTHAN) {
				{
				{
				setState(390); match(LESSTHAN);
				setState(391); ((Level2Context)_localctx).level3 = level3();
				((Level2Context)_localctx).tail.add(((Level2Context)_localctx).level3);
				}
				}
				setState(396);
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

	public static class Level3Context extends ParserRuleContext {
		public Level4Context head;
		public Token PLUS;
		public List<Token> operator = new ArrayList<Token>();
		public Token MINUS;
		public Token _tset786;
		public Level4Context level4;
		public List<Level4Context> tail = new ArrayList<Level4Context>();
		public TerminalNode MINUS(int i) {
			return getToken(MiniJavaParser.MINUS, i);
		}
		public List<Level4Context> level4() {
			return getRuleContexts(Level4Context.class);
		}
		public Level4Context level4(int i) {
			return getRuleContext(Level4Context.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(MiniJavaParser.PLUS); }
		public List<TerminalNode> MINUS() { return getTokens(MiniJavaParser.MINUS); }
		public TerminalNode PLUS(int i) {
			return getToken(MiniJavaParser.PLUS, i);
		}
		public Level3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_level3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterLevel3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitLevel3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitLevel3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Level3Context level3() throws RecognitionException {
		Level3Context _localctx = new Level3Context(_ctx, getState());
		enterRule(_localctx, 72, RULE_level3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397); ((Level3Context)_localctx).head = level4();
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MINUS || _la==PLUS) {
				{
				{
				setState(398);
				((Level3Context)_localctx)._tset786 = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==MINUS || _la==PLUS) ) {
					((Level3Context)_localctx)._tset786 = (Token)_errHandler.recoverInline(this);
				}
				consume();
				((Level3Context)_localctx).operator.add(((Level3Context)_localctx)._tset786);
				setState(399); ((Level3Context)_localctx).level4 = level4();
				((Level3Context)_localctx).tail.add(((Level3Context)_localctx).level4);
				}
				}
				setState(404);
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

	public static class Level4Context extends ParserRuleContext {
		public Level5Context head;
		public Level5Context level5;
		public List<Level5Context> tail = new ArrayList<Level5Context>();
		public List<Level5Context> level5() {
			return getRuleContexts(Level5Context.class);
		}
		public TerminalNode TIMES(int i) {
			return getToken(MiniJavaParser.TIMES, i);
		}
		public List<TerminalNode> TIMES() { return getTokens(MiniJavaParser.TIMES); }
		public Level5Context level5(int i) {
			return getRuleContext(Level5Context.class,i);
		}
		public Level4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_level4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterLevel4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitLevel4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitLevel4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Level4Context level4() throws RecognitionException {
		Level4Context _localctx = new Level4Context(_ctx, getState());
		enterRule(_localctx, 74, RULE_level4);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405); ((Level4Context)_localctx).head = level5();
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TIMES) {
				{
				{
				setState(406); match(TIMES);
				setState(407); ((Level4Context)_localctx).level5 = level5();
				((Level4Context)_localctx).tail.add(((Level4Context)_localctx).level5);
				}
				}
				setState(412);
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

	public static class Level5Context extends ParserRuleContext {
		public ExpressionConstantFalseContext expressionConstantFalse() {
			return getRuleContext(ExpressionConstantFalseContext.class,0);
		}
		public ExpressionConstantStringContext expressionConstantString() {
			return getRuleContext(ExpressionConstantStringContext.class,0);
		}
		public ExpressionConstantIntegerContext expressionConstantInteger() {
			return getRuleContext(ExpressionConstantIntegerContext.class,0);
		}
		public ExpressionParenthesesContext expressionParentheses() {
			return getRuleContext(ExpressionParenthesesContext.class,0);
		}
		public ExpressionPostIncrementContext expressionPostIncrement() {
			return getRuleContext(ExpressionPostIncrementContext.class,0);
		}
		public ExpressionPreDecrementContext expressionPreDecrement() {
			return getRuleContext(ExpressionPreDecrementContext.class,0);
		}
		public ExpressionNewObjectContext expressionNewObject() {
			return getRuleContext(ExpressionNewObjectContext.class,0);
		}
		public ExpressionMethodCallContext expressionMethodCall() {
			return getRuleContext(ExpressionMethodCallContext.class,0);
		}
		public ExpressionUnaryMinusContext expressionUnaryMinus() {
			return getRuleContext(ExpressionUnaryMinusContext.class,0);
		}
		public ExpressionNewArrayContext expressionNewArray() {
			return getRuleContext(ExpressionNewArrayContext.class,0);
		}
		public ExpressionArrayAccessContext expressionArrayAccess() {
			return getRuleContext(ExpressionArrayAccessContext.class,0);
		}
		public ExpressionPreIncrementContext expressionPreIncrement() {
			return getRuleContext(ExpressionPreIncrementContext.class,0);
		}
		public ExpressionNegationContext expressionNegation() {
			return getRuleContext(ExpressionNegationContext.class,0);
		}
		public ExpressionPostDecrementContext expressionPostDecrement() {
			return getRuleContext(ExpressionPostDecrementContext.class,0);
		}
		public ExpressionConstantTrueContext expressionConstantTrue() {
			return getRuleContext(ExpressionConstantTrueContext.class,0);
		}
		public ExpressionIdentifierContext expressionIdentifier() {
			return getRuleContext(ExpressionIdentifierContext.class,0);
		}
		public Level5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_level5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterLevel5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitLevel5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitLevel5(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Level5Context level5() throws RecognitionException {
		Level5Context _localctx = new Level5Context(_ctx, getState());
		enterRule(_localctx, 76, RULE_level5);
		try {
			setState(429);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(413); expressionUnaryMinus();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(414); expressionNegation();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(415); expressionNewObject();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(416); expressionNewArray();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(417); expressionIdentifier();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(418); expressionArrayAccess();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(419); expressionMethodCall();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(420); expressionParentheses();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(421); expressionConstantTrue();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(422); expressionConstantFalse();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(423); expressionConstantInteger();
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(424); expressionConstantString();
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(425); expressionPostIncrement();
				}
				break;

			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(426); expressionPreIncrement();
				}
				break;

			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(427); expressionPostDecrement();
				}
				break;

			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(428); expressionPreDecrement();
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

	public static class ExpressionUnaryMinusContext extends ParserRuleContext {
		public Level5Context argument;
		public Level5Context level5() {
			return getRuleContext(Level5Context.class,0);
		}
		public TerminalNode MINUS() { return getToken(MiniJavaParser.MINUS, 0); }
		public ExpressionUnaryMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionUnaryMinus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionUnaryMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionUnaryMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionUnaryMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionUnaryMinusContext expressionUnaryMinus() throws RecognitionException {
		ExpressionUnaryMinusContext _localctx = new ExpressionUnaryMinusContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_expressionUnaryMinus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431); match(MINUS);
			setState(432); ((ExpressionUnaryMinusContext)_localctx).argument = level5();
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

	public static class ExpressionNegationContext extends ParserRuleContext {
		public Level5Context argument;
		public Level5Context level5() {
			return getRuleContext(Level5Context.class,0);
		}
		public TerminalNode EXCLAMATION() { return getToken(MiniJavaParser.EXCLAMATION, 0); }
		public ExpressionNegationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionNegation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionNegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionNegation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionNegation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionNegationContext expressionNegation() throws RecognitionException {
		ExpressionNegationContext _localctx = new ExpressionNegationContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_expressionNegation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434); match(EXCLAMATION);
			setState(435); ((ExpressionNegationContext)_localctx).argument = level5();
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

	public static class ExpressionNewObjectContext extends ParserRuleContext {
		public Token classname;
		public TerminalNode ROUNDOPEN() { return getToken(MiniJavaParser.ROUNDOPEN, 0); }
		public TerminalNode ROUNDCLOSE() { return getToken(MiniJavaParser.ROUNDCLOSE, 0); }
		public TerminalNode NEW() { return getToken(MiniJavaParser.NEW, 0); }
		public TerminalNode IDENT() { return getToken(MiniJavaParser.IDENT, 0); }
		public ExpressionNewObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionNewObject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionNewObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionNewObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionNewObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionNewObjectContext expressionNewObject() throws RecognitionException {
		ExpressionNewObjectContext _localctx = new ExpressionNewObjectContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_expressionNewObject);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437); match(NEW);
			setState(438); ((ExpressionNewObjectContext)_localctx).classname = match(IDENT);
			setState(439); match(ROUNDOPEN);
			setState(440); match(ROUNDCLOSE);
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

	public static class ExpressionNewArrayContext extends ParserRuleContext {
		public ExpressionContext size;
		public TerminalNode SQUARECLOSE() { return getToken(MiniJavaParser.SQUARECLOSE, 0); }
		public TerminalNode TYPEINT() { return getToken(MiniJavaParser.TYPEINT, 0); }
		public TerminalNode SQUAREOPEN() { return getToken(MiniJavaParser.SQUAREOPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NEW() { return getToken(MiniJavaParser.NEW, 0); }
		public ExpressionNewArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionNewArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionNewArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionNewArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionNewArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionNewArrayContext expressionNewArray() throws RecognitionException {
		ExpressionNewArrayContext _localctx = new ExpressionNewArrayContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_expressionNewArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442); match(NEW);
			setState(443); match(TYPEINT);
			setState(444); match(SQUAREOPEN);
			setState(445); ((ExpressionNewArrayContext)_localctx).size = expression();
			setState(446); match(SQUARECLOSE);
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

	public static class ExpressionIdentifierContext extends ParserRuleContext {
		public IdentifierContext ident;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionIdentifierContext expressionIdentifier() throws RecognitionException {
		ExpressionIdentifierContext _localctx = new ExpressionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_expressionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448); ((ExpressionIdentifierContext)_localctx).ident = identifier();
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

	public static class ExpressionArrayAccessContext extends ParserRuleContext {
		public IdentifierContext ident;
		public ExpressionContext element;
		public TerminalNode SQUARECLOSE() { return getToken(MiniJavaParser.SQUARECLOSE, 0); }
		public TerminalNode SQUAREOPEN() { return getToken(MiniJavaParser.SQUAREOPEN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionArrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionArrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionArrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionArrayAccessContext expressionArrayAccess() throws RecognitionException {
		ExpressionArrayAccessContext _localctx = new ExpressionArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_expressionArrayAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450); ((ExpressionArrayAccessContext)_localctx).ident = identifier();
			setState(451); match(SQUAREOPEN);
			setState(452); ((ExpressionArrayAccessContext)_localctx).element = expression();
			setState(453); match(SQUARECLOSE);
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

	public static class ExpressionParenthesesContext extends ParserRuleContext {
		public ExpressionContext argument;
		public TerminalNode ROUNDOPEN() { return getToken(MiniJavaParser.ROUNDOPEN, 0); }
		public TerminalNode ROUNDCLOSE() { return getToken(MiniJavaParser.ROUNDCLOSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionParenthesesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionParentheses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionParentheses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionParentheses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionParentheses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionParenthesesContext expressionParentheses() throws RecognitionException {
		ExpressionParenthesesContext _localctx = new ExpressionParenthesesContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_expressionParentheses);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455); match(ROUNDOPEN);
			setState(456); ((ExpressionParenthesesContext)_localctx).argument = expression();
			setState(457); match(ROUNDCLOSE);
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

	public static class ExpressionConstantTrueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(MiniJavaParser.TRUE, 0); }
		public ExpressionConstantTrueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionConstantTrue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionConstantTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionConstantTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionConstantTrue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionConstantTrueContext expressionConstantTrue() throws RecognitionException {
		ExpressionConstantTrueContext _localctx = new ExpressionConstantTrueContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_expressionConstantTrue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459); match(TRUE);
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

	public static class ExpressionConstantFalseContext extends ParserRuleContext {
		public TerminalNode FALSE() { return getToken(MiniJavaParser.FALSE, 0); }
		public ExpressionConstantFalseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionConstantFalse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionConstantFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionConstantFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionConstantFalse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionConstantFalseContext expressionConstantFalse() throws RecognitionException {
		ExpressionConstantFalseContext _localctx = new ExpressionConstantFalseContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_expressionConstantFalse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461); match(FALSE);
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

	public static class ExpressionConstantIntegerContext extends ParserRuleContext {
		public Token value;
		public TerminalNode INT() { return getToken(MiniJavaParser.INT, 0); }
		public ExpressionConstantIntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionConstantInteger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionConstantInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionConstantInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionConstantInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionConstantIntegerContext expressionConstantInteger() throws RecognitionException {
		ExpressionConstantIntegerContext _localctx = new ExpressionConstantIntegerContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_expressionConstantInteger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463); ((ExpressionConstantIntegerContext)_localctx).value = match(INT);
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

	public static class ExpressionConstantStringContext extends ParserRuleContext {
		public Token value;
		public TerminalNode STRING() { return getToken(MiniJavaParser.STRING, 0); }
		public ExpressionConstantStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionConstantString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionConstantString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionConstantString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionConstantString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionConstantStringContext expressionConstantString() throws RecognitionException {
		ExpressionConstantStringContext _localctx = new ExpressionConstantStringContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_expressionConstantString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465); ((ExpressionConstantStringContext)_localctx).value = match(STRING);
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

	public static class ExpressionMethodCallContext extends ParserRuleContext {
		public IdentifierContext object;
		public Token method;
		public ExpressionContext expression;
		public List<ExpressionContext> arguments = new ArrayList<ExpressionContext>();
		public TerminalNode DOT() { return getToken(MiniJavaParser.DOT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MiniJavaParser.COMMA); }
		public TerminalNode ROUNDOPEN() { return getToken(MiniJavaParser.ROUNDOPEN, 0); }
		public TerminalNode ROUNDCLOSE() { return getToken(MiniJavaParser.ROUNDCLOSE, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode IDENT() { return getToken(MiniJavaParser.IDENT, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniJavaParser.COMMA, i);
		}
		public ExpressionMethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionMethodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionMethodCallContext expressionMethodCall() throws RecognitionException {
		ExpressionMethodCallContext _localctx = new ExpressionMethodCallContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_expressionMethodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(467); ((ExpressionMethodCallContext)_localctx).object = identifier();
				setState(468); match(DOT);
				}
				break;
			}
			setState(472); ((ExpressionMethodCallContext)_localctx).method = match(IDENT);
			setState(473); match(ROUNDOPEN);
			setState(482);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << EXCLAMATION) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << ROUNDOPEN) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << NEW) | (1L << IDENT) | (1L << INT) | (1L << STRING))) != 0)) {
				{
				setState(474); ((ExpressionMethodCallContext)_localctx).expression = expression();
				((ExpressionMethodCallContext)_localctx).arguments.add(((ExpressionMethodCallContext)_localctx).expression);
				setState(479);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(475); match(COMMA);
					setState(476); ((ExpressionMethodCallContext)_localctx).expression = expression();
					((ExpressionMethodCallContext)_localctx).arguments.add(((ExpressionMethodCallContext)_localctx).expression);
					}
					}
					setState(481);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(484); match(ROUNDCLOSE);
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

	public static class ExpressionPostIncrementContext extends ParserRuleContext {
		public IdentifierContext ident;
		public TerminalNode INCREMENT() { return getToken(MiniJavaParser.INCREMENT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionPostIncrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionPostIncrement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionPostIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionPostIncrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionPostIncrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionPostIncrementContext expressionPostIncrement() throws RecognitionException {
		ExpressionPostIncrementContext _localctx = new ExpressionPostIncrementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_expressionPostIncrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486); ((ExpressionPostIncrementContext)_localctx).ident = identifier();
			setState(487); match(INCREMENT);
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

	public static class ExpressionPreIncrementContext extends ParserRuleContext {
		public IdentifierContext ident;
		public TerminalNode INCREMENT() { return getToken(MiniJavaParser.INCREMENT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionPreIncrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionPreIncrement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionPreIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionPreIncrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionPreIncrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionPreIncrementContext expressionPreIncrement() throws RecognitionException {
		ExpressionPreIncrementContext _localctx = new ExpressionPreIncrementContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_expressionPreIncrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489); match(INCREMENT);
			setState(490); ((ExpressionPreIncrementContext)_localctx).ident = identifier();
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

	public static class ExpressionPostDecrementContext extends ParserRuleContext {
		public IdentifierContext ident;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DECREMENT() { return getToken(MiniJavaParser.DECREMENT, 0); }
		public ExpressionPostDecrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionPostDecrement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionPostDecrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionPostDecrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionPostDecrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionPostDecrementContext expressionPostDecrement() throws RecognitionException {
		ExpressionPostDecrementContext _localctx = new ExpressionPostDecrementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_expressionPostDecrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492); ((ExpressionPostDecrementContext)_localctx).ident = identifier();
			setState(493); match(DECREMENT);
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

	public static class ExpressionPreDecrementContext extends ParserRuleContext {
		public IdentifierContext ident;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DECREMENT() { return getToken(MiniJavaParser.DECREMENT, 0); }
		public ExpressionPreDecrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionPreDecrement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionPreDecrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionPreDecrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionPreDecrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionPreDecrementContext expressionPreDecrement() throws RecognitionException {
		ExpressionPreDecrementContext _localctx = new ExpressionPreDecrementContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_expressionPreDecrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495); match(DECREMENT);
			setState(496); ((ExpressionPreDecrementContext)_localctx).ident = identifier();
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

	public static class IdentifierContext extends ParserRuleContext {
		public IdentifierIdentifierContext identifierIdentifier() {
			return getRuleContext(IdentifierIdentifierContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498); identifierIdentifier();
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

	public static class IdentifierIdentifierContext extends ParserRuleContext {
		public Token IDENT;
		public List<Token> selectors = new ArrayList<Token>();
		public IdentifierIdContext identifierId() {
			return getRuleContext(IdentifierIdContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(MiniJavaParser.DOT); }
		public TerminalNode IDENT(int i) {
			return getToken(MiniJavaParser.IDENT, i);
		}
		public TerminalNode DOT(int i) {
			return getToken(MiniJavaParser.DOT, i);
		}
		public List<TerminalNode> IDENT() { return getTokens(MiniJavaParser.IDENT); }
		public IdentifierIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterIdentifierIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitIdentifierIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitIdentifierIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierIdentifierContext identifierIdentifier() throws RecognitionException {
		IdentifierIdentifierContext _localctx = new IdentifierIdentifierContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_identifierIdentifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(500); identifierId();
			setState(505);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(501); match(DOT);
					setState(502); ((IdentifierIdentifierContext)_localctx).IDENT = match(IDENT);
					((IdentifierIdentifierContext)_localctx).selectors.add(((IdentifierIdentifierContext)_localctx).IDENT);
					}
					} 
				}
				setState(507);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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

	public static class IdentifierIdContext extends ParserRuleContext {
		public IdIDENTContext idIDENT() {
			return getRuleContext(IdIDENTContext.class,0);
		}
		public IdThisContext idThis() {
			return getRuleContext(IdThisContext.class,0);
		}
		public IdentifierIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterIdentifierId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitIdentifierId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitIdentifierId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierIdContext identifierId() throws RecognitionException {
		IdentifierIdContext _localctx = new IdentifierIdContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_identifierId);
		try {
			setState(510);
			switch (_input.LA(1)) {
			case THIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(508); idThis();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(509); idIDENT();
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

	public static class IdThisContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(MiniJavaParser.THIS, 0); }
		public IdThisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idThis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterIdThis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitIdThis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitIdThis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdThisContext idThis() throws RecognitionException {
		IdThisContext _localctx = new IdThisContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_idThis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512); match(THIS);
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

	public static class IdIDENTContext extends ParserRuleContext {
		public Token name;
		public TerminalNode IDENT() { return getToken(MiniJavaParser.IDENT, 0); }
		public IdIDENTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idIDENT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterIdIDENT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitIdIDENT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitIdIDENT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdIDENTContext idIDENT() throws RecognitionException {
		IdIDENTContext _localctx = new IdIDENTContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_idIDENT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514); ((IdIDENTContext)_localctx).name = match(IDENT);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\61\u0207\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\3\2\7\2}\n\2\f\2\16\2\u0080\13\2\3\3\3\3\3\3\3\3\5\3\u0086\n\3\3"+
		"\3\3\3\7\3\u008a\n\3\f\3\16\3\u008d\13\3\3\3\7\3\u0090\n\3\f\3\16\3\u0093"+
		"\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\7\5\u009f\n\5\f\5\16\5\u00a2"+
		"\13\5\3\5\7\5\u00a5\n\5\f\5\16\5\u00a8\13\5\3\5\3\5\3\6\3\6\3\6\5\6\u00af"+
		"\n\6\3\6\3\6\3\7\3\7\5\7\u00b5\n\7\3\b\3\b\5\b\u00b9\n\b\3\t\3\t\3\t\3"+
		"\t\7\t\u00bf\n\t\f\t\16\t\u00c2\13\t\5\t\u00c4\n\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\13\3\13\5\13\u00cd\n\13\3\f\3\f\3\f\3\f\5\f\u00d3\n\f\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\5\22\u00e2\n\22\3\22\5"+
		"\22\u00e5\n\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00ed\n\22\f\22\16\22"+
		"\u00f0\13\22\5\22\u00f2\n\22\3\22\3\22\3\22\7\22\u00f7\n\22\f\22\16\22"+
		"\u00fa\13\22\3\22\7\22\u00fd\n\22\f\22\16\22\u0100\13\22\3\22\3\22\3\22"+
		"\3\23\3\23\5\23\u0107\n\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0119\n\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\5\26\u0122\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\5\36\u014e\n\36\3\36\3\36\3\36\3\36\5\36"+
		"\u0154\n\36\3\36\3\36\3\36\5\36\u0159\n\36\3\36\3\36\3\37\3\37\5\37\u015f"+
		"\n\37\3\37\3\37\3 \3 \5 \u0165\n \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3\""+
		"\3\"\5\"\u0174\n\"\3\"\3\"\3#\3#\3#\7#\u017b\n#\f#\16#\u017e\13#\3$\3"+
		"$\3$\7$\u0183\n$\f$\16$\u0186\13$\3%\3%\3%\7%\u018b\n%\f%\16%\u018e\13"+
		"%\3&\3&\3&\7&\u0193\n&\f&\16&\u0196\13&\3\'\3\'\3\'\7\'\u019b\n\'\f\'"+
		"\16\'\u019e\13\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u01b0"+
		"\n(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3-\3-\3.\3.\3."+
		"\3.\3.\3/\3/\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3"+
		"\64\5\64\u01d9\n\64\3\64\3\64\3\64\3\64\3\64\7\64\u01e0\n\64\f\64\16\64"+
		"\u01e3\13\64\5\64\u01e5\n\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3"+
		"\67\3\67\3\67\38\38\38\39\39\3:\3:\3:\7:\u01fa\n:\f:\16:\u01fd\13:\3;"+
		"\3;\5;\u0201\n;\3<\3<\3=\3=\3=\2>\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvx\2\3\4\2\3\3"+
		"\7\7\u020d\2z\3\2\2\2\4\u0081\3\2\2\2\6\u0096\3\2\2\2\b\u009c\3\2\2\2"+
		"\n\u00ab\3\2\2\2\f\u00b4\3\2\2\2\16\u00b8\3\2\2\2\20\u00ba\3\2\2\2\22"+
		"\u00c7\3\2\2\2\24\u00cc\3\2\2\2\26\u00d2\3\2\2\2\30\u00d4\3\2\2\2\32\u00d8"+
		"\3\2\2\2\34\u00da\3\2\2\2\36\u00dc\3\2\2\2 \u00de\3\2\2\2\"\u00e1\3\2"+
		"\2\2$\u0106\3\2\2\2&\u0108\3\2\2\2(\u0118\3\2\2\2*\u011a\3\2\2\2,\u0123"+
		"\3\2\2\2.\u0129\3\2\2\2\60\u012e\3\2\2\2\62\u0133\3\2\2\2\64\u013b\3\2"+
		"\2\2\66\u0141\3\2\2\28\u0147\3\2\2\2:\u014d\3\2\2\2<\u015e\3\2\2\2>\u0164"+
		"\3\2\2\2@\u0168\3\2\2\2B\u0171\3\2\2\2D\u0177\3\2\2\2F\u017f\3\2\2\2H"+
		"\u0187\3\2\2\2J\u018f\3\2\2\2L\u0197\3\2\2\2N\u01af\3\2\2\2P\u01b1\3\2"+
		"\2\2R\u01b4\3\2\2\2T\u01b7\3\2\2\2V\u01bc\3\2\2\2X\u01c2\3\2\2\2Z\u01c4"+
		"\3\2\2\2\\\u01c9\3\2\2\2^\u01cd\3\2\2\2`\u01cf\3\2\2\2b\u01d1\3\2\2\2"+
		"d\u01d3\3\2\2\2f\u01d8\3\2\2\2h\u01e8\3\2\2\2j\u01eb\3\2\2\2l\u01ee\3"+
		"\2\2\2n\u01f1\3\2\2\2p\u01f4\3\2\2\2r\u01f6\3\2\2\2t\u0200\3\2\2\2v\u0202"+
		"\3\2\2\2x\u0204\3\2\2\2z~\5\6\4\2{}\5\4\3\2|{\3\2\2\2}\u0080\3\2\2\2~"+
		"|\3\2\2\2~\177\3\2\2\2\177\3\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\7\33\2"+
		"\2\u0082\u0085\7,\2\2\u0083\u0084\7\34\2\2\u0084\u0086\7,\2\2\u0085\u0083"+
		"\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u008b\7\24\2\2"+
		"\u0088\u008a\5\n\6\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089"+
		"\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u0091\3\2\2\2\u008d\u008b\3\2\2\2\u008e"+
		"\u0090\5\"\22\2\u008f\u008e\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3"+
		"\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094"+
		"\u0095\7\25\2\2\u0095\5\3\2\2\2\u0096\u0097\7\33\2\2\u0097\u0098\7,\2"+
		"\2\u0098\u0099\7\24\2\2\u0099\u009a\5\"\22\2\u009a\u009b\7\25\2\2\u009b"+
		"\7\3\2\2\2\u009c\u00a0\7\24\2\2\u009d\u009f\5\n\6\2\u009e\u009d\3\2\2"+
		"\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a6"+
		"\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a5\5(\25\2\u00a4\u00a3\3\2\2\2\u00a5"+
		"\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\3\2"+
		"\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\7\25\2\2\u00aa\t\3\2\2\2\u00ab\u00ae"+
		"\5\22\n\2\u00ac\u00ad\7\f\2\2\u00ad\u00af\5\f\7\2\u00ae\u00ac\3\2\2\2"+
		"\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\7\n\2\2\u00b1\13"+
		"\3\2\2\2\u00b2\u00b5\5D#\2\u00b3\u00b5\5\20\t\2\u00b4\u00b2\3\2\2\2\u00b4"+
		"\u00b3\3\2\2\2\u00b5\r\3\2\2\2\u00b6\u00b9\5\n\6\2\u00b7\u00b9\5.\30\2"+
		"\u00b8\u00b6\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9\17\3\2\2\2\u00ba\u00c3"+
		"\7\24\2\2\u00bb\u00c0\5D#\2\u00bc\u00bd\7\13\2\2\u00bd\u00bf\5D#\2\u00be"+
		"\u00bc\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2"+
		"\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00bb\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\7\25\2\2\u00c6\21\3\2\2"+
		"\2\u00c7\u00c8\5\24\13\2\u00c8\u00c9\7,\2\2\u00c9\23\3\2\2\2\u00ca\u00cd"+
		"\5\26\f\2\u00cb\u00cd\5\30\r\2\u00cc\u00ca\3\2\2\2\u00cc\u00cb\3\2\2\2"+
		"\u00cd\25\3\2\2\2\u00ce\u00d3\5\32\16\2\u00cf\u00d3\5\34\17\2\u00d0\u00d3"+
		"\5\36\20\2\u00d1\u00d3\5 \21\2\u00d2\u00ce\3\2\2\2\u00d2\u00cf\3\2\2\2"+
		"\u00d2\u00d0\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3\27\3\2\2\2\u00d4\u00d5"+
		"\5\26\f\2\u00d5\u00d6\7\22\2\2\u00d6\u00d7\7\23\2\2\u00d7\31\3\2\2\2\u00d8"+
		"\u00d9\7\35\2\2\u00d9\33\3\2\2\2\u00da\u00db\7\37\2\2\u00db\35\3\2\2\2"+
		"\u00dc\u00dd\7,\2\2\u00dd\37\3\2\2\2\u00de\u00df\7 \2\2\u00df!\3\2\2\2"+
		"\u00e0\u00e2\7!\2\2\u00e1\u00e0\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e4"+
		"\3\2\2\2\u00e3\u00e5\7\"\2\2\u00e4\u00e3\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00e6\3\2\2\2\u00e6\u00e7\5$\23\2\u00e7\u00e8\7,\2\2\u00e8\u00f1\7\20"+
		"\2\2\u00e9\u00ee\5\22\n\2\u00ea\u00eb\7\13\2\2\u00eb\u00ed\5\22\n\2\u00ec"+
		"\u00ea\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2"+
		"\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00e9\3\2\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\7\21\2\2\u00f4\u00f8\7"+
		"\24\2\2\u00f5\u00f7\5\n\6\2\u00f6\u00f5\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8"+
		"\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fe\3\2\2\2\u00fa\u00f8\3\2"+
		"\2\2\u00fb\u00fd\5(\25\2\u00fc\u00fb\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe"+
		"\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0101\3\2\2\2\u0100\u00fe\3\2"+
		"\2\2\u0101\u0102\5B\"\2\u0102\u0103\7\25\2\2\u0103#\3\2\2\2\u0104\u0107"+
		"\5&\24\2\u0105\u0107\5\24\13\2\u0106\u0104\3\2\2\2\u0106\u0105\3\2\2\2"+
		"\u0107%\3\2\2\2\u0108\u0109\7\36\2\2\u0109\'\3\2\2\2\u010a\u0119\5\b\5"+
		"\2\u010b\u0119\5*\26\2\u010c\u0119\5,\27\2\u010d\u0119\5.\30\2\u010e\u0119"+
		"\5\60\31\2\u010f\u0119\5\62\32\2\u0110\u0119\5\66\34\2\u0111\u0119\5\64"+
		"\33\2\u0112\u0119\58\35\2\u0113\u0119\5B\"\2\u0114\u0119\5:\36\2\u0115"+
		"\u0119\5<\37\2\u0116\u0119\5> \2\u0117\u0119\5@!\2\u0118\u010a\3\2\2\2"+
		"\u0118\u010b\3\2\2\2\u0118\u010c\3\2\2\2\u0118\u010d\3\2\2\2\u0118\u010e"+
		"\3\2\2\2\u0118\u010f\3\2\2\2\u0118\u0110\3\2\2\2\u0118\u0111\3\2\2\2\u0118"+
		"\u0112\3\2\2\2\u0118\u0113\3\2\2\2\u0118\u0114\3\2\2\2\u0118\u0115\3\2"+
		"\2\2\u0118\u0116\3\2\2\2\u0118\u0117\3\2\2\2\u0119)\3\2\2\2\u011a\u011b"+
		"\7$\2\2\u011b\u011c\7\20\2\2\u011c\u011d\5D#\2\u011d\u011e\7\21\2\2\u011e"+
		"\u0121\5\b\5\2\u011f\u0120\7%\2\2\u0120\u0122\5\b\5\2\u0121\u011f\3\2"+
		"\2\2\u0121\u0122\3\2\2\2\u0122+\3\2\2\2\u0123\u0124\7&\2\2\u0124\u0125"+
		"\7\20\2\2\u0125\u0126\5D#\2\u0126\u0127\7\21\2\2\u0127\u0128\5(\25\2\u0128"+
		"-\3\2\2\2\u0129\u012a\5p9\2\u012a\u012b\7\f\2\2\u012b\u012c\5D#\2\u012c"+
		"\u012d\7\n\2\2\u012d/\3\2\2\2\u012e\u012f\5p9\2\u012f\u0130\7\30\2\2\u0130"+
		"\u0131\5D#\2\u0131\u0132\7\n\2\2\u0132\61\3\2\2\2\u0133\u0134\5p9\2\u0134"+
		"\u0135\7\22\2\2\u0135\u0136\5D#\2\u0136\u0137\7\23\2\2\u0137\u0138\7\f"+
		"\2\2\u0138\u0139\5D#\2\u0139\u013a\7\n\2\2\u013a\63\3\2\2\2\u013b\u013c"+
		"\7(\2\2\u013c\u013d\7\20\2\2\u013d\u013e\5D#\2\u013e\u013f\7\21\2\2\u013f"+
		"\u0140\7\n\2\2\u0140\65\3\2\2\2\u0141\u0142\7)\2\2\u0142\u0143\7\20\2"+
		"\2\u0143\u0144\5D#\2\u0144\u0145\7\21\2\2\u0145\u0146\7\n\2\2\u0146\67"+
		"\3\2\2\2\u0147\u0148\5f\64\2\u0148\u0149\7\n\2\2\u01499\3\2\2\2\u014a"+
		"\u014b\5p9\2\u014b\u014c\7\f\2\2\u014c\u014e\3\2\2\2\u014d\u014a\3\2\2"+
		"\2\u014d\u014e\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150\5D#\2\u0150\u0153"+
		"\7\26\2\2\u0151\u0154\5p9\2\u0152\u0154\5D#\2\u0153\u0151\3\2\2\2\u0153"+
		"\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0158\7\27\2\2\u0156\u0159\5"+
		"p9\2\u0157\u0159\5D#\2\u0158\u0156\3\2\2\2\u0158\u0157\3\2\2\2\u0159\u015a"+
		"\3\2\2\2\u015a\u015b\7\n\2\2\u015b;\3\2\2\2\u015c\u015f\5h\65\2\u015d"+
		"\u015f\5j\66\2\u015e\u015c\3\2\2\2\u015e\u015d\3\2\2\2\u015f\u0160\3\2"+
		"\2\2\u0160\u0161\7\n\2\2\u0161=\3\2\2\2\u0162\u0165\5l\67\2\u0163\u0165"+
		"\5n8\2\u0164\u0162\3\2\2\2\u0164\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166"+
		"\u0167\7\n\2\2\u0167?\3\2\2\2\u0168\u0169\7\'\2\2\u0169\u016a\7\20\2\2"+
		"\u016a\u016b\5\16\b\2\u016b\u016c\5D#\2\u016c\u016d\7\n\2\2\u016d\u016e"+
		"\5D#\2\u016e\u016f\7\21\2\2\u016f\u0170\5(\25\2\u0170A\3\2\2\2\u0171\u0173"+
		"\7*\2\2\u0172\u0174\5D#\2\u0173\u0172\3\2\2\2\u0173\u0174\3\2\2\2\u0174"+
		"\u0175\3\2\2\2\u0175\u0176\7\n\2\2\u0176C\3\2\2\2\u0177\u017c\5F$\2\u0178"+
		"\u0179\7\4\2\2\u0179\u017b\5F$\2\u017a\u0178\3\2\2\2\u017b\u017e\3\2\2"+
		"\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017dE\3\2\2\2\u017e\u017c"+
		"\3\2\2\2\u017f\u0184\5H%\2\u0180\u0181\7\5\2\2\u0181\u0183\5H%\2\u0182"+
		"\u0180\3\2\2\2\u0183\u0186\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2"+
		"\2\2\u0185G\3\2\2\2\u0186\u0184\3\2\2\2\u0187\u018c\5J&\2\u0188\u0189"+
		"\7\6\2\2\u0189\u018b\5J&\2\u018a\u0188\3\2\2\2\u018b\u018e\3\2\2\2\u018c"+
		"\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018dI\3\2\2\2\u018e\u018c\3\2\2\2"+
		"\u018f\u0194\5L\'\2\u0190\u0191\t\2\2\2\u0191\u0193\5L\'\2\u0192\u0190"+
		"\3\2\2\2\u0193\u0196\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195"+
		"K\3\2\2\2\u0196\u0194\3\2\2\2\u0197\u019c\5N(\2\u0198\u0199\7\b\2\2\u0199"+
		"\u019b\5N(\2\u019a\u0198\3\2\2\2\u019b\u019e\3\2\2\2\u019c\u019a\3\2\2"+
		"\2\u019c\u019d\3\2\2\2\u019dM\3\2\2\2\u019e\u019c\3\2\2\2\u019f\u01b0"+
		"\5P)\2\u01a0\u01b0\5R*\2\u01a1\u01b0\5T+\2\u01a2\u01b0\5V,\2\u01a3\u01b0"+
		"\5X-\2\u01a4\u01b0\5Z.\2\u01a5\u01b0\5f\64\2\u01a6\u01b0\5\\/\2\u01a7"+
		"\u01b0\5^\60\2\u01a8\u01b0\5`\61\2\u01a9\u01b0\5b\62\2\u01aa\u01b0\5d"+
		"\63\2\u01ab\u01b0\5h\65\2\u01ac\u01b0\5j\66\2\u01ad\u01b0\5l\67\2\u01ae"+
		"\u01b0\5n8\2\u01af\u019f\3\2\2\2\u01af\u01a0\3\2\2\2\u01af\u01a1\3\2\2"+
		"\2\u01af\u01a2\3\2\2\2\u01af\u01a3\3\2\2\2\u01af\u01a4\3\2\2\2\u01af\u01a5"+
		"\3\2\2\2\u01af\u01a6\3\2\2\2\u01af\u01a7\3\2\2\2\u01af\u01a8\3\2\2\2\u01af"+
		"\u01a9\3\2\2\2\u01af\u01aa\3\2\2\2\u01af\u01ab\3\2\2\2\u01af\u01ac\3\2"+
		"\2\2\u01af\u01ad\3\2\2\2\u01af\u01ae\3\2\2\2\u01b0O\3\2\2\2\u01b1\u01b2"+
		"\7\3\2\2\u01b2\u01b3\5N(\2\u01b3Q\3\2\2\2\u01b4\u01b5\7\t\2\2\u01b5\u01b6"+
		"\5N(\2\u01b6S\3\2\2\2\u01b7\u01b8\7+\2\2\u01b8\u01b9\7,\2\2\u01b9\u01ba"+
		"\7\20\2\2\u01ba\u01bb\7\21\2\2\u01bbU\3\2\2\2\u01bc\u01bd\7+\2\2\u01bd"+
		"\u01be\7\37\2\2\u01be\u01bf\7\22\2\2\u01bf\u01c0\5D#\2\u01c0\u01c1\7\23"+
		"\2\2\u01c1W\3\2\2\2\u01c2\u01c3\5p9\2\u01c3Y\3\2\2\2\u01c4\u01c5\5p9\2"+
		"\u01c5\u01c6\7\22\2\2\u01c6\u01c7\5D#\2\u01c7\u01c8\7\23\2\2\u01c8[\3"+
		"\2\2\2\u01c9\u01ca\7\20\2\2\u01ca\u01cb\5D#\2\u01cb\u01cc\7\21\2\2\u01cc"+
		"]\3\2\2\2\u01cd\u01ce\7\31\2\2\u01ce_\3\2\2\2\u01cf\u01d0\7\32\2\2\u01d0"+
		"a\3\2\2\2\u01d1\u01d2\7-\2\2\u01d2c\3\2\2\2\u01d3\u01d4\7.\2\2\u01d4e"+
		"\3\2\2\2\u01d5\u01d6\5p9\2\u01d6\u01d7\7\r\2\2\u01d7\u01d9\3\2\2\2\u01d8"+
		"\u01d5\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01db\7,"+
		"\2\2\u01db\u01e4\7\20\2\2\u01dc\u01e1\5D#\2\u01dd\u01de\7\13\2\2\u01de"+
		"\u01e0\5D#\2\u01df\u01dd\3\2\2\2\u01e0\u01e3\3\2\2\2\u01e1\u01df\3\2\2"+
		"\2\u01e1\u01e2\3\2\2\2\u01e2\u01e5\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e4\u01dc"+
		"\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\7\21\2\2"+
		"\u01e7g\3\2\2\2\u01e8\u01e9\5p9\2\u01e9\u01ea\7\16\2\2\u01eai\3\2\2\2"+
		"\u01eb\u01ec\7\16\2\2\u01ec\u01ed\5p9\2\u01edk\3\2\2\2\u01ee\u01ef\5p"+
		"9\2\u01ef\u01f0\7\17\2\2\u01f0m\3\2\2\2\u01f1\u01f2\7\17\2\2\u01f2\u01f3"+
		"\5p9\2\u01f3o\3\2\2\2\u01f4\u01f5\5r:\2\u01f5q\3\2\2\2\u01f6\u01fb\5t"+
		";\2\u01f7\u01f8\7\r\2\2\u01f8\u01fa\7,\2\2\u01f9\u01f7\3\2\2\2\u01fa\u01fd"+
		"\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fcs\3\2\2\2\u01fd"+
		"\u01fb\3\2\2\2\u01fe\u0201\5v<\2\u01ff\u0201\5x=\2\u0200\u01fe\3\2\2\2"+
		"\u0200\u01ff\3\2\2\2\u0201u\3\2\2\2\u0202\u0203\7#\2\2\u0203w\3\2\2\2"+
		"\u0204\u0205\7,\2\2\u0205y\3\2\2\2)~\u0085\u008b\u0091\u00a0\u00a6\u00ae"+
		"\u00b4\u00b8\u00c0\u00c3\u00cc\u00d2\u00e1\u00e4\u00ee\u00f1\u00f8\u00fe"+
		"\u0106\u0118\u0121\u014d\u0153\u0158\u015e\u0164\u0173\u017c\u0184\u018c"+
		"\u0194\u019c\u01af\u01d8\u01e1\u01e4\u01fb\u0200";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}