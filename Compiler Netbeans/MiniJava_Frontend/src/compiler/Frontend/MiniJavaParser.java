// Generated from C:\Users\Lime\Dropbox\3. Semester\Compiler Construction\GrammarFileMiniJava\MiniJava.g4 by ANTLR 4.1
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
		RULE_varDeclaration = 4, RULE_varDeclarationAssign = 5, RULE_varDeclarationStaticArray = 6, 
		RULE_variable = 7, RULE_type = 8, RULE_typeBasic = 9, RULE_typeArray = 10, 
		RULE_typeBoolean = 11, RULE_typeInt = 12, RULE_typeClass = 13, RULE_typeChar = 14, 
		RULE_methodDeclaration = 15, RULE_procType = 16, RULE_typeVoid = 17, RULE_statement = 18, 
		RULE_statementIf = 19, RULE_statementWhile = 20, RULE_statementAssign = 21, 
		RULE_statementAssignArray = 22, RULE_statementPrint = 23, RULE_statementPrintln = 24, 
		RULE_statementMethod = 25, RULE_statementTernary = 26, RULE_statemantIncremnt = 27, 
		RULE_statemantDecremnt = 28, RULE_statementFor = 29, RULE_statementReturn = 30, 
		RULE_expression = 31, RULE_level1 = 32, RULE_level2 = 33, RULE_level3 = 34, 
		RULE_level4 = 35, RULE_level5 = 36, RULE_expressionUnaryMinus = 37, RULE_expressionNegation = 38, 
		RULE_expressionNewObject = 39, RULE_expressionNewArray = 40, RULE_expressionIdentifier = 41, 
		RULE_expressionArrayAccess = 42, RULE_expressionParentheses = 43, RULE_expressionConstantTrue = 44, 
		RULE_expressionConstantFalse = 45, RULE_expressionConstantInteger = 46, 
		RULE_expressionConstantString = 47, RULE_expressionMethodCall = 48, RULE_expressionPostIncremnt = 49, 
		RULE_expressionPreIncremnt = 50, RULE_expressionPostDecrement = 51, RULE_expressionPreIncrement = 52, 
		RULE_identifier = 53, RULE_identifierIdentifier = 54, RULE_identifierId = 55, 
		RULE_idThis = 56, RULE_idIDENT = 57;
	public static final String[] ruleNames = {
		"program", "classDeclaration", "mainClass", "block", "varDeclaration", 
		"varDeclarationAssign", "varDeclarationStaticArray", "variable", "type", 
		"typeBasic", "typeArray", "typeBoolean", "typeInt", "typeClass", "typeChar", 
		"methodDeclaration", "procType", "typeVoid", "statement", "statementIf", 
		"statementWhile", "statementAssign", "statementAssignArray", "statementPrint", 
		"statementPrintln", "statementMethod", "statementTernary", "statemantIncremnt", 
		"statemantDecremnt", "statementFor", "statementReturn", "expression", 
		"level1", "level2", "level3", "level4", "level5", "expressionUnaryMinus", 
		"expressionNegation", "expressionNewObject", "expressionNewArray", "expressionIdentifier", 
		"expressionArrayAccess", "expressionParentheses", "expressionConstantTrue", 
		"expressionConstantFalse", "expressionConstantInteger", "expressionConstantString", 
		"expressionMethodCall", "expressionPostIncremnt", "expressionPreIncremnt", 
		"expressionPostDecrement", "expressionPreIncrement", "identifier", "identifierIdentifier", 
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
			setState(116); mainClass();
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(117); classDeclaration();
				}
				}
				setState(122);
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
		public VarDeclarationStaticArrayContext varDeclarationStaticArray(int i) {
			return getRuleContext(VarDeclarationStaticArrayContext.class,i);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public List<VarDeclarationAssignContext> varDeclarationAssign() {
			return getRuleContexts(VarDeclarationAssignContext.class);
		}
		public TerminalNode CURLYOPEN() { return getToken(MiniJavaParser.CURLYOPEN, 0); }
		public TerminalNode IDENT(int i) {
			return getToken(MiniJavaParser.IDENT, i);
		}
		public TerminalNode CURLYCLOSE() { return getToken(MiniJavaParser.CURLYCLOSE, 0); }
		public List<TerminalNode> IDENT() { return getTokens(MiniJavaParser.IDENT); }
		public TerminalNode EXTENDS() { return getToken(MiniJavaParser.EXTENDS, 0); }
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public VarDeclarationAssignContext varDeclarationAssign(int i) {
			return getRuleContext(VarDeclarationAssignContext.class,i);
		}
		public TerminalNode CLASS() { return getToken(MiniJavaParser.CLASS, 0); }
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<VarDeclarationStaticArrayContext> varDeclarationStaticArray() {
			return getRuleContexts(VarDeclarationStaticArrayContext.class);
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
			setState(123); match(CLASS);
			setState(124); ((ClassDeclarationContext)_localctx).className = match(IDENT);
			setState(127);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(125); match(EXTENDS);
				setState(126); ((ClassDeclarationContext)_localctx).superClassName = match(IDENT);
				}
			}

			setState(129); match(CURLYOPEN);
			setState(135);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					setState(133);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						setState(130); varDeclaration();
						}
						break;

					case 2:
						{
						setState(131); varDeclarationAssign();
						}
						break;

					case 3:
						{
						setState(132); varDeclarationStaticArray();
						}
						break;
					}
					} 
				}
				setState(137);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPEBOOLEAN) | (1L << TYPEVOID) | (1L << TYPEINT) | (1L << TYPECHAR) | (1L << PUBLIC) | (1L << STATIC) | (1L << IDENT))) != 0)) {
				{
				{
				setState(138); methodDeclaration();
				}
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(144); match(CURLYCLOSE);
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
			setState(146); match(CLASS);
			setState(147); ((MainClassContext)_localctx).className = match(IDENT);
			setState(148); match(CURLYOPEN);
			setState(149); ((MainClassContext)_localctx).method = methodDeclaration();
			setState(150); match(CURLYCLOSE);
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
		public VarDeclarationStaticArrayContext varDeclarationStaticArray(int i) {
			return getRuleContext(VarDeclarationStaticArrayContext.class,i);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public List<VarDeclarationAssignContext> varDeclarationAssign() {
			return getRuleContexts(VarDeclarationAssignContext.class);
		}
		public TerminalNode CURLYOPEN() { return getToken(MiniJavaParser.CURLYOPEN, 0); }
		public VarDeclarationAssignContext varDeclarationAssign(int i) {
			return getRuleContext(VarDeclarationAssignContext.class,i);
		}
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
		public List<VarDeclarationStaticArrayContext> varDeclarationStaticArray() {
			return getRuleContexts(VarDeclarationStaticArrayContext.class);
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
			setState(152); match(CURLYOPEN);
			setState(158);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					setState(156);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						setState(153); varDeclaration();
						}
						break;

					case 2:
						{
						setState(154); varDeclarationAssign();
						}
						break;

					case 3:
						{
						setState(155); varDeclarationStaticArray();
						}
						break;
					}
					} 
				}
				setState(160);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169); ((VarDeclarationContext)_localctx).var = variable();
			setState(170); match(SEMICOLON);
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

	public static class VarDeclarationAssignContext extends ParserRuleContext {
		public VariableContext var;
		public ExpressionContext expr;
		public StatementMethodContext statem;
		public TerminalNode EQUAL() { return getToken(MiniJavaParser.EQUAL, 0); }
		public TerminalNode SEMICOLON() { return getToken(MiniJavaParser.SEMICOLON, 0); }
		public StatementMethodContext statementMethod() {
			return getRuleContext(StatementMethodContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VarDeclarationAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclarationAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterVarDeclarationAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitVarDeclarationAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitVarDeclarationAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationAssignContext varDeclarationAssign() throws RecognitionException {
		VarDeclarationAssignContext _localctx = new VarDeclarationAssignContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varDeclarationAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172); ((VarDeclarationAssignContext)_localctx).var = variable();
			setState(173); match(EQUAL);
			setState(176);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(174); ((VarDeclarationAssignContext)_localctx).expr = expression();
				}
				break;

			case 2:
				{
				setState(175); ((VarDeclarationAssignContext)_localctx).statem = statementMethod();
				}
				break;
			}
			setState(178); match(SEMICOLON);
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

	public static class VarDeclarationStaticArrayContext extends ParserRuleContext {
		public VariableContext var;
		public TerminalNode EQUAL() { return getToken(MiniJavaParser.EQUAL, 0); }
		public TerminalNode SEMICOLON() { return getToken(MiniJavaParser.SEMICOLON, 0); }
		public TerminalNode CURLYOPEN() { return getToken(MiniJavaParser.CURLYOPEN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MiniJavaParser.COMMA); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode CURLYCLOSE() { return getToken(MiniJavaParser.CURLYCLOSE, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode COMMA(int i) {
			return getToken(MiniJavaParser.COMMA, i);
		}
		public VarDeclarationStaticArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclarationStaticArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterVarDeclarationStaticArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitVarDeclarationStaticArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitVarDeclarationStaticArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationStaticArrayContext varDeclarationStaticArray() throws RecognitionException {
		VarDeclarationStaticArrayContext _localctx = new VarDeclarationStaticArrayContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varDeclarationStaticArray);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(180); ((VarDeclarationStaticArrayContext)_localctx).var = variable();
			setState(181); match(EQUAL);
			setState(182); match(CURLYOPEN);
			{
			setState(183); expression();
			}
			setState(188);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=1 && _alt!=-1 ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(184); match(COMMA);
					setState(185); expression();
					}
					} 
				}
				setState(190);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(191); match(CURLYCLOSE);
			setState(192); match(SEMICOLON);
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
		enterRule(_localctx, 14, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194); type();
			setState(195); ((VariableContext)_localctx).variableName = match(IDENT);
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
		enterRule(_localctx, 16, RULE_type);
		try {
			setState(199);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(197); typeBasic();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(198); typeArray();
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
		enterRule(_localctx, 18, RULE_typeBasic);
		try {
			setState(205);
			switch (_input.LA(1)) {
			case TYPEBOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(201); typeBoolean();
				}
				break;
			case TYPEINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(202); typeInt();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(203); typeClass();
				}
				break;
			case TYPECHAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(204); typeChar();
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
		enterRule(_localctx, 20, RULE_typeArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207); typeBasic();
			setState(208); match(SQUAREOPEN);
			setState(209); match(SQUARECLOSE);
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
		enterRule(_localctx, 22, RULE_typeBoolean);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211); match(TYPEBOOLEAN);
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
		enterRule(_localctx, 24, RULE_typeInt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213); match(TYPEINT);
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
		enterRule(_localctx, 26, RULE_typeClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215); ((TypeClassContext)_localctx).className = match(IDENT);
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
		enterRule(_localctx, 28, RULE_typeChar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217); match(TYPECHAR);
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
		public VarDeclarationStaticArrayContext varDeclarationStaticArray(int i) {
			return getRuleContext(VarDeclarationStaticArrayContext.class,i);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public List<VarDeclarationAssignContext> varDeclarationAssign() {
			return getRuleContexts(VarDeclarationAssignContext.class);
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
		public VarDeclarationAssignContext varDeclarationAssign(int i) {
			return getRuleContext(VarDeclarationAssignContext.class,i);
		}
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
		public List<VarDeclarationStaticArrayContext> varDeclarationStaticArray() {
			return getRuleContexts(VarDeclarationStaticArrayContext.class);
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
		enterRule(_localctx, 30, RULE_methodDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			_la = _input.LA(1);
			if (_la==PUBLIC) {
				{
				setState(219); ((MethodDeclarationContext)_localctx).isPublic = match(PUBLIC);
				}
			}

			setState(223);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(222); ((MethodDeclarationContext)_localctx).isStatic = match(STATIC);
				}
			}

			setState(225); procType();
			setState(226); ((MethodDeclarationContext)_localctx).methodName = match(IDENT);
			setState(227); match(ROUNDOPEN);
			setState(236);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPEBOOLEAN) | (1L << TYPEINT) | (1L << TYPECHAR) | (1L << IDENT))) != 0)) {
				{
				setState(228); variable();
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(229); match(COMMA);
					setState(230); variable();
					}
					}
					setState(235);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(238); match(ROUNDCLOSE);
			setState(239); match(CURLYOPEN);
			setState(245);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					setState(243);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						setState(240); varDeclaration();
						}
						break;

					case 2:
						{
						setState(241); varDeclarationAssign();
						}
						break;

					case 3:
						{
						setState(242); varDeclarationStaticArray();
						}
						break;
					}
					} 
				}
				setState(247);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(251);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(248); statement();
					}
					} 
				}
				setState(253);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(254); statementReturn();
			setState(255); match(CURLYCLOSE);
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
		enterRule(_localctx, 32, RULE_procType);
		try {
			setState(259);
			switch (_input.LA(1)) {
			case TYPEVOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(257); typeVoid();
				}
				break;
			case TYPEBOOLEAN:
			case TYPEINT:
			case TYPECHAR:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(258); type();
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
		enterRule(_localctx, 34, RULE_typeVoid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261); match(TYPEVOID);
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
		public StatementMethodContext statementMethod() {
			return getRuleContext(StatementMethodContext.class,0);
		}
		public StatementAssignArrayContext statementAssignArray() {
			return getRuleContext(StatementAssignArrayContext.class,0);
		}
		public StatementReturnContext statementReturn() {
			return getRuleContext(StatementReturnContext.class,0);
		}
		public StatementIfContext statementIf() {
			return getRuleContext(StatementIfContext.class,0);
		}
		public StatemantDecremntContext statemantDecremnt() {
			return getRuleContext(StatemantDecremntContext.class,0);
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
		public StatemantIncremntContext statemantIncremnt() {
			return getRuleContext(StatemantIncremntContext.class,0);
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
		enterRule(_localctx, 36, RULE_statement);
		try {
			setState(276);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(263); block();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(264); statementIf();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(265); statementWhile();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(266); statementAssign();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(267); statementAssignArray();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(268); statementPrintln();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(269); statementPrint();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(270); statementMethod();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(271); statementReturn();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(272); statementTernary();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(273); statemantIncremnt();
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(274); statemantDecremnt();
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(275); statementFor();
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
		enterRule(_localctx, 38, RULE_statementIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278); match(IF);
			setState(279); match(ROUNDOPEN);
			setState(280); ((StatementIfContext)_localctx).condition = expression();
			setState(281); match(ROUNDCLOSE);
			setState(282); ((StatementIfContext)_localctx).ifBlock = block();
			setState(285);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(283); match(ELSE);
				setState(284); ((StatementIfContext)_localctx).elseBlock = block();
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
		enterRule(_localctx, 40, RULE_statementWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287); match(WHILE);
			setState(288); match(ROUNDOPEN);
			setState(289); ((StatementWhileContext)_localctx).condition = expression();
			setState(290); match(ROUNDCLOSE);
			setState(291); ((StatementWhileContext)_localctx).whileBlock = statement();
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
		public TerminalNode PLUSEQUAL() { return getToken(MiniJavaParser.PLUSEQUAL, 0); }
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
		enterRule(_localctx, 42, RULE_statementAssign);
		try {
			setState(303);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(293); ((StatementAssignContext)_localctx).lhs = identifier();
				setState(294); match(EQUAL);
				setState(295); ((StatementAssignContext)_localctx).rhs = expression();
				setState(296); match(SEMICOLON);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(298); ((StatementAssignContext)_localctx).lhs = identifier();
				setState(299); match(PLUSEQUAL);
				setState(300); ((StatementAssignContext)_localctx).rhs = expression();
				setState(301); match(SEMICOLON);
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
		enterRule(_localctx, 44, RULE_statementAssignArray);
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
		enterRule(_localctx, 46, RULE_statementPrint);
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
		enterRule(_localctx, 48, RULE_statementPrintln);
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
		enterRule(_localctx, 50, RULE_statementMethod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325); expressionMethodCall();
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
		enterRule(_localctx, 52, RULE_statementTernary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
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
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
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
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
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

	public static class StatemantIncremntContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(MiniJavaParser.SEMICOLON, 0); }
		public ExpressionPostIncremntContext expressionPostIncremnt() {
			return getRuleContext(ExpressionPostIncremntContext.class,0);
		}
		public ExpressionPreIncremntContext expressionPreIncremnt() {
			return getRuleContext(ExpressionPreIncremntContext.class,0);
		}
		public StatemantIncremntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statemantIncremnt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatemantIncremnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatemantIncremnt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStatemantIncremnt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatemantIncremntContext statemantIncremnt() throws RecognitionException {
		StatemantIncremntContext _localctx = new StatemantIncremntContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_statemantIncremnt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			switch (_input.LA(1)) {
			case THIS:
			case IDENT:
				{
				setState(346); expressionPostIncremnt();
				}
				break;
			case INCREMENT:
				{
				setState(347); expressionPreIncremnt();
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

	public static class StatemantDecremntContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(MiniJavaParser.SEMICOLON, 0); }
		public ExpressionPostDecrementContext expressionPostDecrement() {
			return getRuleContext(ExpressionPostDecrementContext.class,0);
		}
		public StatemantDecremntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statemantDecremnt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatemantDecremnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatemantDecremnt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStatemantDecremnt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatemantDecremntContext statemantDecremnt() throws RecognitionException {
		StatemantDecremntContext _localctx = new StatemantDecremntContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_statemantDecremnt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(352); expressionPostDecrement();
				}
				break;

			case 2:
				{
				setState(353); expressionPostDecrement();
				}
				break;
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
		public TerminalNode SEMICOLON() { return getToken(MiniJavaParser.SEMICOLON, 0); }
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public VarDeclarationAssignContext varDeclarationAssign() {
			return getRuleContext(VarDeclarationAssignContext.class,0);
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
		public VarDeclarationStaticArrayContext varDeclarationStaticArray() {
			return getRuleContext(VarDeclarationStaticArrayContext.class,0);
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
		enterRule(_localctx, 58, RULE_statementFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358); match(FOR);
			setState(359); match(ROUNDOPEN);
			setState(363);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(360); varDeclaration();
				}
				break;

			case 2:
				{
				setState(361); varDeclarationAssign();
				}
				break;

			case 3:
				{
				setState(362); varDeclarationStaticArray();
				}
				break;
			}
			setState(365); expression();
			setState(366); match(SEMICOLON);
			setState(367); expression();
			setState(368); match(ROUNDCLOSE);
			setState(369); statement();
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
		enterRule(_localctx, 60, RULE_statementReturn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371); match(RETURN);
			setState(373);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << EXCLAMATION) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << ROUNDOPEN) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << NEW) | (1L << IDENT) | (1L << INT) | (1L << STRING))) != 0)) {
				{
				setState(372); ((StatementReturnContext)_localctx).argument = expression();
				}
			}

			setState(375); match(SEMICOLON);
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
		enterRule(_localctx, 62, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377); ((ExpressionContext)_localctx).head = level1();
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(378); match(AND);
				setState(379); ((ExpressionContext)_localctx).level1 = level1();
				((ExpressionContext)_localctx).tail.add(((ExpressionContext)_localctx).level1);
				}
				}
				setState(384);
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
		enterRule(_localctx, 64, RULE_level1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385); ((Level1Context)_localctx).head = level2();
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUALS) {
				{
				{
				setState(386); match(EQUALS);
				setState(387); ((Level1Context)_localctx).level2 = level2();
				((Level1Context)_localctx).tail.add(((Level1Context)_localctx).level2);
				}
				}
				setState(392);
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
		enterRule(_localctx, 66, RULE_level2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393); ((Level2Context)_localctx).head = level3();
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LESSTHAN) {
				{
				{
				setState(394); match(LESSTHAN);
				setState(395); ((Level2Context)_localctx).level3 = level3();
				((Level2Context)_localctx).tail.add(((Level2Context)_localctx).level3);
				}
				}
				setState(400);
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
		public Token _tset783;
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
		enterRule(_localctx, 68, RULE_level3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401); ((Level3Context)_localctx).head = level4();
			setState(406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MINUS || _la==PLUS) {
				{
				{
				setState(402);
				((Level3Context)_localctx)._tset783 = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==MINUS || _la==PLUS) ) {
					((Level3Context)_localctx)._tset783 = (Token)_errHandler.recoverInline(this);
				}
				consume();
				((Level3Context)_localctx).operator.add(((Level3Context)_localctx)._tset783);
				setState(403); ((Level3Context)_localctx).level4 = level4();
				((Level3Context)_localctx).tail.add(((Level3Context)_localctx).level4);
				}
				}
				setState(408);
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
		enterRule(_localctx, 70, RULE_level4);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409); ((Level4Context)_localctx).head = level5();
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TIMES) {
				{
				{
				setState(410); match(TIMES);
				setState(411); ((Level4Context)_localctx).level5 = level5();
				((Level4Context)_localctx).tail.add(((Level4Context)_localctx).level5);
				}
				}
				setState(416);
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
		public ExpressionPostIncremntContext expressionPostIncremnt() {
			return getRuleContext(ExpressionPostIncremntContext.class,0);
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
		public ExpressionPreIncremntContext expressionPreIncremnt() {
			return getRuleContext(ExpressionPreIncremntContext.class,0);
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
		enterRule(_localctx, 72, RULE_level5);
		try {
			setState(433);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(417); expressionUnaryMinus();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(418); expressionNegation();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(419); expressionNewObject();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(420); expressionNewArray();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(421); expressionIdentifier();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(422); expressionArrayAccess();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(423); expressionMethodCall();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(424); expressionParentheses();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(425); expressionConstantTrue();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(426); expressionConstantFalse();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(427); expressionConstantInteger();
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(428); expressionConstantString();
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(429); expressionPostIncremnt();
				}
				break;

			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(430); expressionPreIncremnt();
				}
				break;

			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(431); expressionPostDecrement();
				}
				break;

			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(432); expressionPreIncrement();
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
		enterRule(_localctx, 74, RULE_expressionUnaryMinus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435); match(MINUS);
			setState(436); ((ExpressionUnaryMinusContext)_localctx).argument = level5();
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
		enterRule(_localctx, 76, RULE_expressionNegation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438); match(EXCLAMATION);
			setState(439); ((ExpressionNegationContext)_localctx).argument = level5();
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
		enterRule(_localctx, 78, RULE_expressionNewObject);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441); match(NEW);
			setState(442); ((ExpressionNewObjectContext)_localctx).classname = match(IDENT);
			setState(443); match(ROUNDOPEN);
			setState(444); match(ROUNDCLOSE);
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
		enterRule(_localctx, 80, RULE_expressionNewArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446); match(NEW);
			setState(447); match(TYPEINT);
			setState(448); match(SQUAREOPEN);
			setState(449); ((ExpressionNewArrayContext)_localctx).size = expression();
			setState(450); match(SQUARECLOSE);
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
		enterRule(_localctx, 82, RULE_expressionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452); ((ExpressionIdentifierContext)_localctx).ident = identifier();
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
		enterRule(_localctx, 84, RULE_expressionArrayAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454); ((ExpressionArrayAccessContext)_localctx).ident = identifier();
			setState(455); match(SQUAREOPEN);
			setState(456); ((ExpressionArrayAccessContext)_localctx).element = expression();
			setState(457); match(SQUARECLOSE);
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
		enterRule(_localctx, 86, RULE_expressionParentheses);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459); match(ROUNDOPEN);
			setState(460); ((ExpressionParenthesesContext)_localctx).argument = expression();
			setState(461); match(ROUNDCLOSE);
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
		enterRule(_localctx, 88, RULE_expressionConstantTrue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463); match(TRUE);
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
		enterRule(_localctx, 90, RULE_expressionConstantFalse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465); match(FALSE);
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
		enterRule(_localctx, 92, RULE_expressionConstantInteger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467); ((ExpressionConstantIntegerContext)_localctx).value = match(INT);
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
		enterRule(_localctx, 94, RULE_expressionConstantString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469); ((ExpressionConstantStringContext)_localctx).value = match(STRING);
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
		enterRule(_localctx, 96, RULE_expressionMethodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(471); ((ExpressionMethodCallContext)_localctx).object = identifier();
				setState(472); match(DOT);
				}
				break;
			}
			setState(476); ((ExpressionMethodCallContext)_localctx).method = match(IDENT);
			setState(477); match(ROUNDOPEN);
			setState(486);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << EXCLAMATION) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << ROUNDOPEN) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << NEW) | (1L << IDENT) | (1L << INT) | (1L << STRING))) != 0)) {
				{
				setState(478); ((ExpressionMethodCallContext)_localctx).expression = expression();
				((ExpressionMethodCallContext)_localctx).arguments.add(((ExpressionMethodCallContext)_localctx).expression);
				setState(483);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(479); match(COMMA);
					setState(480); ((ExpressionMethodCallContext)_localctx).expression = expression();
					((ExpressionMethodCallContext)_localctx).arguments.add(((ExpressionMethodCallContext)_localctx).expression);
					}
					}
					setState(485);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(488); match(ROUNDCLOSE);
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

	public static class ExpressionPostIncremntContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode INCREMENT() { return getToken(MiniJavaParser.INCREMENT, 0); }
		public ExpressionPostIncremntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionPostIncremnt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionPostIncremnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionPostIncremnt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionPostIncremnt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionPostIncremntContext expressionPostIncremnt() throws RecognitionException {
		ExpressionPostIncremntContext _localctx = new ExpressionPostIncremntContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_expressionPostIncremnt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490); identifier();
			setState(491); match(INCREMENT);
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

	public static class ExpressionPreIncremntContext extends ParserRuleContext {
		public TerminalNode INCREMENT() { return getToken(MiniJavaParser.INCREMENT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionPreIncremntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionPreIncremnt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionPreIncremnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionPreIncremnt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionPreIncremnt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionPreIncremntContext expressionPreIncremnt() throws RecognitionException {
		ExpressionPreIncremntContext _localctx = new ExpressionPreIncremntContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_expressionPreIncremnt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493); match(INCREMENT);
			setState(494); identifier();
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
		enterRule(_localctx, 102, RULE_expressionPostDecrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496); identifier();
			setState(497); match(DECREMENT);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DECREMENT() { return getToken(MiniJavaParser.DECREMENT, 0); }
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
			setState(499); match(DECREMENT);
			setState(500); identifier();
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
		enterRule(_localctx, 106, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502); identifierIdentifier();
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
		enterRule(_localctx, 108, RULE_identifierIdentifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(504); identifierId();
			setState(509);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(505); match(DOT);
					setState(506); ((IdentifierIdentifierContext)_localctx).IDENT = match(IDENT);
					((IdentifierIdentifierContext)_localctx).selectors.add(((IdentifierIdentifierContext)_localctx).IDENT);
					}
					} 
				}
				setState(511);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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
		enterRule(_localctx, 110, RULE_identifierId);
		try {
			setState(514);
			switch (_input.LA(1)) {
			case THIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(512); idThis();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(513); idIDENT();
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
		enterRule(_localctx, 112, RULE_idThis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516); match(THIS);
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
		enterRule(_localctx, 114, RULE_idIDENT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518); ((IdIDENTContext)_localctx).name = match(IDENT);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\61\u020b\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\7\2"+
		"y\n\2\f\2\16\2|\13\2\3\3\3\3\3\3\3\3\5\3\u0082\n\3\3\3\3\3\3\3\3\3\7\3"+
		"\u0088\n\3\f\3\16\3\u008b\13\3\3\3\7\3\u008e\n\3\f\3\16\3\u0091\13\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5\u009f\n\5\f\5\16\5"+
		"\u00a2\13\5\3\5\7\5\u00a5\n\5\f\5\16\5\u00a8\13\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\5\7\u00b3\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00bd"+
		"\n\b\f\b\16\b\u00c0\13\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\5\n\u00ca\n\n"+
		"\3\13\3\13\3\13\3\13\5\13\u00d0\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\21\5\21\u00df\n\21\3\21\5\21\u00e2\n\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\7\21\u00ea\n\21\f\21\16\21\u00ed\13\21\5\21\u00ef"+
		"\n\21\3\21\3\21\3\21\3\21\3\21\7\21\u00f6\n\21\f\21\16\21\u00f9\13\21"+
		"\3\21\7\21\u00fc\n\21\f\21\16\21\u00ff\13\21\3\21\3\21\3\21\3\22\3\22"+
		"\5\22\u0106\n\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u0117\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u0120\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\5\27\u0132\n\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\5\34\u014e\n\34\3\34\3\34\3\34\3\34\5\34"+
		"\u0154\n\34\3\34\3\34\3\34\5\34\u0159\n\34\3\34\3\34\3\35\3\35\5\35\u015f"+
		"\n\35\3\35\3\35\3\36\3\36\5\36\u0165\n\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\5\37\u016e\n\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \5 \u0178\n "+
		"\3 \3 \3!\3!\3!\7!\u017f\n!\f!\16!\u0182\13!\3\"\3\"\3\"\7\"\u0187\n\""+
		"\f\"\16\"\u018a\13\"\3#\3#\3#\7#\u018f\n#\f#\16#\u0192\13#\3$\3$\3$\7"+
		"$\u0197\n$\f$\16$\u019a\13$\3%\3%\3%\7%\u019f\n%\f%\16%\u01a2\13%\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u01b4\n&\3\'\3\'\3\'\3"+
		"(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3,\3,\3,\3,\3,\3-\3-\3"+
		"-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\62\5\62\u01dd\n\62\3"+
		"\62\3\62\3\62\3\62\3\62\7\62\u01e4\n\62\f\62\16\62\u01e7\13\62\5\62\u01e9"+
		"\n\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66"+
		"\3\66\3\67\3\67\38\38\38\78\u01fe\n8\f8\168\u0201\138\39\39\59\u0205\n"+
		"9\3:\3:\3;\3;\3;\3\u00be<\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&"+
		"(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprt\2\3\4\2\3\3\7\7\u0218"+
		"\2v\3\2\2\2\4}\3\2\2\2\6\u0094\3\2\2\2\b\u009a\3\2\2\2\n\u00ab\3\2\2\2"+
		"\f\u00ae\3\2\2\2\16\u00b6\3\2\2\2\20\u00c4\3\2\2\2\22\u00c9\3\2\2\2\24"+
		"\u00cf\3\2\2\2\26\u00d1\3\2\2\2\30\u00d5\3\2\2\2\32\u00d7\3\2\2\2\34\u00d9"+
		"\3\2\2\2\36\u00db\3\2\2\2 \u00de\3\2\2\2\"\u0105\3\2\2\2$\u0107\3\2\2"+
		"\2&\u0116\3\2\2\2(\u0118\3\2\2\2*\u0121\3\2\2\2,\u0131\3\2\2\2.\u0133"+
		"\3\2\2\2\60\u013b\3\2\2\2\62\u0141\3\2\2\2\64\u0147\3\2\2\2\66\u014d\3"+
		"\2\2\28\u015e\3\2\2\2:\u0164\3\2\2\2<\u0168\3\2\2\2>\u0175\3\2\2\2@\u017b"+
		"\3\2\2\2B\u0183\3\2\2\2D\u018b\3\2\2\2F\u0193\3\2\2\2H\u019b\3\2\2\2J"+
		"\u01b3\3\2\2\2L\u01b5\3\2\2\2N\u01b8\3\2\2\2P\u01bb\3\2\2\2R\u01c0\3\2"+
		"\2\2T\u01c6\3\2\2\2V\u01c8\3\2\2\2X\u01cd\3\2\2\2Z\u01d1\3\2\2\2\\\u01d3"+
		"\3\2\2\2^\u01d5\3\2\2\2`\u01d7\3\2\2\2b\u01dc\3\2\2\2d\u01ec\3\2\2\2f"+
		"\u01ef\3\2\2\2h\u01f2\3\2\2\2j\u01f5\3\2\2\2l\u01f8\3\2\2\2n\u01fa\3\2"+
		"\2\2p\u0204\3\2\2\2r\u0206\3\2\2\2t\u0208\3\2\2\2vz\5\6\4\2wy\5\4\3\2"+
		"xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\3\3\2\2\2|z\3\2\2\2}~\7\33\2"+
		"\2~\u0081\7,\2\2\177\u0080\7\34\2\2\u0080\u0082\7,\2\2\u0081\177\3\2\2"+
		"\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0089\7\24\2\2\u0084"+
		"\u0088\5\n\6\2\u0085\u0088\5\f\7\2\u0086\u0088\5\16\b\2\u0087\u0084\3"+
		"\2\2\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008f\3\2\2\2\u008b\u0089\3\2"+
		"\2\2\u008c\u008e\5 \21\2\u008d\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u008f\3\2"+
		"\2\2\u0092\u0093\7\25\2\2\u0093\5\3\2\2\2\u0094\u0095\7\33\2\2\u0095\u0096"+
		"\7,\2\2\u0096\u0097\7\24\2\2\u0097\u0098\5 \21\2\u0098\u0099\7\25\2\2"+
		"\u0099\7\3\2\2\2\u009a\u00a0\7\24\2\2\u009b\u009f\5\n\6\2\u009c\u009f"+
		"\5\f\7\2\u009d\u009f\5\16\b\2\u009e\u009b\3\2\2\2\u009e\u009c\3\2\2\2"+
		"\u009e\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1"+
		"\3\2\2\2\u00a1\u00a6\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a5\5&\24\2\u00a4"+
		"\u00a3\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2"+
		"\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\7\25\2\2\u00aa"+
		"\t\3\2\2\2\u00ab\u00ac\5\20\t\2\u00ac\u00ad\7\n\2\2\u00ad\13\3\2\2\2\u00ae"+
		"\u00af\5\20\t\2\u00af\u00b2\7\f\2\2\u00b0\u00b3\5@!\2\u00b1\u00b3\5\64"+
		"\33\2\u00b2\u00b0\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"\u00b5\7\n\2\2\u00b5\r\3\2\2\2\u00b6\u00b7\5\20\t\2\u00b7\u00b8\7\f\2"+
		"\2\u00b8\u00b9\7\24\2\2\u00b9\u00be\5@!\2\u00ba\u00bb\7\13\2\2\u00bb\u00bd"+
		"\5@!\2\u00bc\u00ba\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bf\3\2\2\2\u00be"+
		"\u00bc\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c2\7\25"+
		"\2\2\u00c2\u00c3\7\n\2\2\u00c3\17\3\2\2\2\u00c4\u00c5\5\22\n\2\u00c5\u00c6"+
		"\7,\2\2\u00c6\21\3\2\2\2\u00c7\u00ca\5\24\13\2\u00c8\u00ca\5\26\f\2\u00c9"+
		"\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\23\3\2\2\2\u00cb\u00d0\5\30\r"+
		"\2\u00cc\u00d0\5\32\16\2\u00cd\u00d0\5\34\17\2\u00ce\u00d0\5\36\20\2\u00cf"+
		"\u00cb\3\2\2\2\u00cf\u00cc\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00ce\3\2"+
		"\2\2\u00d0\25\3\2\2\2\u00d1\u00d2\5\24\13\2\u00d2\u00d3\7\22\2\2\u00d3"+
		"\u00d4\7\23\2\2\u00d4\27\3\2\2\2\u00d5\u00d6\7\35\2\2\u00d6\31\3\2\2\2"+
		"\u00d7\u00d8\7\37\2\2\u00d8\33\3\2\2\2\u00d9\u00da\7,\2\2\u00da\35\3\2"+
		"\2\2\u00db\u00dc\7 \2\2\u00dc\37\3\2\2\2\u00dd\u00df\7!\2\2\u00de\u00dd"+
		"\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0\u00e2\7\"\2\2\u00e1"+
		"\u00e0\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\5\""+
		"\22\2\u00e4\u00e5\7,\2\2\u00e5\u00ee\7\20\2\2\u00e6\u00eb\5\20\t\2\u00e7"+
		"\u00e8\7\13\2\2\u00e8\u00ea\5\20\t\2\u00e9\u00e7\3\2\2\2\u00ea\u00ed\3"+
		"\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ee\u00e6\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\3\2"+
		"\2\2\u00f0\u00f1\7\21\2\2\u00f1\u00f7\7\24\2\2\u00f2\u00f6\5\n\6\2\u00f3"+
		"\u00f6\5\f\7\2\u00f4\u00f6\5\16\b\2\u00f5\u00f2\3\2\2\2\u00f5\u00f3\3"+
		"\2\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f8\u00fd\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fc\5&"+
		"\24\2\u00fb\u00fa\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd"+
		"\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0101\5>"+
		" \2\u0101\u0102\7\25\2\2\u0102!\3\2\2\2\u0103\u0106\5$\23\2\u0104\u0106"+
		"\5\22\n\2\u0105\u0103\3\2\2\2\u0105\u0104\3\2\2\2\u0106#\3\2\2\2\u0107"+
		"\u0108\7\36\2\2\u0108%\3\2\2\2\u0109\u0117\5\b\5\2\u010a\u0117\5(\25\2"+
		"\u010b\u0117\5*\26\2\u010c\u0117\5,\27\2\u010d\u0117\5.\30\2\u010e\u0117"+
		"\5\62\32\2\u010f\u0117\5\60\31\2\u0110\u0117\5\64\33\2\u0111\u0117\5>"+
		" \2\u0112\u0117\5\66\34\2\u0113\u0117\58\35\2\u0114\u0117\5:\36\2\u0115"+
		"\u0117\5<\37\2\u0116\u0109\3\2\2\2\u0116\u010a\3\2\2\2\u0116\u010b\3\2"+
		"\2\2\u0116\u010c\3\2\2\2\u0116\u010d\3\2\2\2\u0116\u010e\3\2\2\2\u0116"+
		"\u010f\3\2\2\2\u0116\u0110\3\2\2\2\u0116\u0111\3\2\2\2\u0116\u0112\3\2"+
		"\2\2\u0116\u0113\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0115\3\2\2\2\u0117"+
		"\'\3\2\2\2\u0118\u0119\7$\2\2\u0119\u011a\7\20\2\2\u011a\u011b\5@!\2\u011b"+
		"\u011c\7\21\2\2\u011c\u011f\5\b\5\2\u011d\u011e\7%\2\2\u011e\u0120\5\b"+
		"\5\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120)\3\2\2\2\u0121\u0122"+
		"\7&\2\2\u0122\u0123\7\20\2\2\u0123\u0124\5@!\2\u0124\u0125\7\21\2\2\u0125"+
		"\u0126\5&\24\2\u0126+\3\2\2\2\u0127\u0128\5l\67\2\u0128\u0129\7\f\2\2"+
		"\u0129\u012a\5@!\2\u012a\u012b\7\n\2\2\u012b\u0132\3\2\2\2\u012c\u012d"+
		"\5l\67\2\u012d\u012e\7\30\2\2\u012e\u012f\5@!\2\u012f\u0130\7\n\2\2\u0130"+
		"\u0132\3\2\2\2\u0131\u0127\3\2\2\2\u0131\u012c\3\2\2\2\u0132-\3\2\2\2"+
		"\u0133\u0134\5l\67\2\u0134\u0135\7\22\2\2\u0135\u0136\5@!\2\u0136\u0137"+
		"\7\23\2\2\u0137\u0138\7\f\2\2\u0138\u0139\5@!\2\u0139\u013a\7\n\2\2\u013a"+
		"/\3\2\2\2\u013b\u013c\7(\2\2\u013c\u013d\7\20\2\2\u013d\u013e\5@!\2\u013e"+
		"\u013f\7\21\2\2\u013f\u0140\7\n\2\2\u0140\61\3\2\2\2\u0141\u0142\7)\2"+
		"\2\u0142\u0143\7\20\2\2\u0143\u0144\5@!\2\u0144\u0145\7\21\2\2\u0145\u0146"+
		"\7\n\2\2\u0146\63\3\2\2\2\u0147\u0148\5b\62\2\u0148\u0149\7\n\2\2\u0149"+
		"\65\3\2\2\2\u014a\u014b\5l\67\2\u014b\u014c\7\f\2\2\u014c\u014e\3\2\2"+
		"\2\u014d\u014a\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150"+
		"\5@!\2\u0150\u0153\7\26\2\2\u0151\u0154\5l\67\2\u0152\u0154\5@!\2\u0153"+
		"\u0151\3\2\2\2\u0153\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0158\7\27"+
		"\2\2\u0156\u0159\5l\67\2\u0157\u0159\5@!\2\u0158\u0156\3\2\2\2\u0158\u0157"+
		"\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b\7\n\2\2\u015b\67\3\2\2\2\u015c"+
		"\u015f\5d\63\2\u015d\u015f\5f\64\2\u015e\u015c\3\2\2\2\u015e\u015d\3\2"+
		"\2\2\u015f\u0160\3\2\2\2\u0160\u0161\7\n\2\2\u01619\3\2\2\2\u0162\u0165"+
		"\5h\65\2\u0163\u0165\5h\65\2\u0164\u0162\3\2\2\2\u0164\u0163\3\2\2\2\u0165"+
		"\u0166\3\2\2\2\u0166\u0167\7\n\2\2\u0167;\3\2\2\2\u0168\u0169\7\'\2\2"+
		"\u0169\u016d\7\20\2\2\u016a\u016e\5\n\6\2\u016b\u016e\5\f\7\2\u016c\u016e"+
		"\5\16\b\2\u016d\u016a\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016c\3\2\2\2"+
		"\u016e\u016f\3\2\2\2\u016f\u0170\5@!\2\u0170\u0171\7\n\2\2\u0171\u0172"+
		"\5@!\2\u0172\u0173\7\21\2\2\u0173\u0174\5&\24\2\u0174=\3\2\2\2\u0175\u0177"+
		"\7*\2\2\u0176\u0178\5@!\2\u0177\u0176\3\2\2\2\u0177\u0178\3\2\2\2\u0178"+
		"\u0179\3\2\2\2\u0179\u017a\7\n\2\2\u017a?\3\2\2\2\u017b\u0180\5B\"\2\u017c"+
		"\u017d\7\4\2\2\u017d\u017f\5B\"\2\u017e\u017c\3\2\2\2\u017f\u0182\3\2"+
		"\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181A\3\2\2\2\u0182\u0180"+
		"\3\2\2\2\u0183\u0188\5D#\2\u0184\u0185\7\5\2\2\u0185\u0187\5D#\2\u0186"+
		"\u0184\3\2\2\2\u0187\u018a\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2"+
		"\2\2\u0189C\3\2\2\2\u018a\u0188\3\2\2\2\u018b\u0190\5F$\2\u018c\u018d"+
		"\7\6\2\2\u018d\u018f\5F$\2\u018e\u018c\3\2\2\2\u018f\u0192\3\2\2\2\u0190"+
		"\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191E\3\2\2\2\u0192\u0190\3\2\2\2"+
		"\u0193\u0198\5H%\2\u0194\u0195\t\2\2\2\u0195\u0197\5H%\2\u0196\u0194\3"+
		"\2\2\2\u0197\u019a\3\2\2\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199"+
		"G\3\2\2\2\u019a\u0198\3\2\2\2\u019b\u01a0\5J&\2\u019c\u019d\7\b\2\2\u019d"+
		"\u019f\5J&\2\u019e\u019c\3\2\2\2\u019f\u01a2\3\2\2\2\u01a0\u019e\3\2\2"+
		"\2\u01a0\u01a1\3\2\2\2\u01a1I\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a3\u01b4"+
		"\5L\'\2\u01a4\u01b4\5N(\2\u01a5\u01b4\5P)\2\u01a6\u01b4\5R*\2\u01a7\u01b4"+
		"\5T+\2\u01a8\u01b4\5V,\2\u01a9\u01b4\5b\62\2\u01aa\u01b4\5X-\2\u01ab\u01b4"+
		"\5Z.\2\u01ac\u01b4\5\\/\2\u01ad\u01b4\5^\60\2\u01ae\u01b4\5`\61\2\u01af"+
		"\u01b4\5d\63\2\u01b0\u01b4\5f\64\2\u01b1\u01b4\5h\65\2\u01b2\u01b4\5j"+
		"\66\2\u01b3\u01a3\3\2\2\2\u01b3\u01a4\3\2\2\2\u01b3\u01a5\3\2\2\2\u01b3"+
		"\u01a6\3\2\2\2\u01b3\u01a7\3\2\2\2\u01b3\u01a8\3\2\2\2\u01b3\u01a9\3\2"+
		"\2\2\u01b3\u01aa\3\2\2\2\u01b3\u01ab\3\2\2\2\u01b3\u01ac\3\2\2\2\u01b3"+
		"\u01ad\3\2\2\2\u01b3\u01ae\3\2\2\2\u01b3\u01af\3\2\2\2\u01b3\u01b0\3\2"+
		"\2\2\u01b3\u01b1\3\2\2\2\u01b3\u01b2\3\2\2\2\u01b4K\3\2\2\2\u01b5\u01b6"+
		"\7\3\2\2\u01b6\u01b7\5J&\2\u01b7M\3\2\2\2\u01b8\u01b9\7\t\2\2\u01b9\u01ba"+
		"\5J&\2\u01baO\3\2\2\2\u01bb\u01bc\7+\2\2\u01bc\u01bd\7,\2\2\u01bd\u01be"+
		"\7\20\2\2\u01be\u01bf\7\21\2\2\u01bfQ\3\2\2\2\u01c0\u01c1\7+\2\2\u01c1"+
		"\u01c2\7\37\2\2\u01c2\u01c3\7\22\2\2\u01c3\u01c4\5@!\2\u01c4\u01c5\7\23"+
		"\2\2\u01c5S\3\2\2\2\u01c6\u01c7\5l\67\2\u01c7U\3\2\2\2\u01c8\u01c9\5l"+
		"\67\2\u01c9\u01ca\7\22\2\2\u01ca\u01cb\5@!\2\u01cb\u01cc\7\23\2\2\u01cc"+
		"W\3\2\2\2\u01cd\u01ce\7\20\2\2\u01ce\u01cf\5@!\2\u01cf\u01d0\7\21\2\2"+
		"\u01d0Y\3\2\2\2\u01d1\u01d2\7\31\2\2\u01d2[\3\2\2\2\u01d3\u01d4\7\32\2"+
		"\2\u01d4]\3\2\2\2\u01d5\u01d6\7-\2\2\u01d6_\3\2\2\2\u01d7\u01d8\7.\2\2"+
		"\u01d8a\3\2\2\2\u01d9\u01da\5l\67\2\u01da\u01db\7\r\2\2\u01db\u01dd\3"+
		"\2\2\2\u01dc\u01d9\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01de\3\2\2\2\u01de"+
		"\u01df\7,\2\2\u01df\u01e8\7\20\2\2\u01e0\u01e5\5@!\2\u01e1\u01e2\7\13"+
		"\2\2\u01e2\u01e4\5@!\2\u01e3\u01e1\3\2\2\2\u01e4\u01e7\3\2\2\2\u01e5\u01e3"+
		"\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e9\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e8"+
		"\u01e0\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01eb\7\21"+
		"\2\2\u01ebc\3\2\2\2\u01ec\u01ed\5l\67\2\u01ed\u01ee\7\16\2\2\u01eee\3"+
		"\2\2\2\u01ef\u01f0\7\16\2\2\u01f0\u01f1\5l\67\2\u01f1g\3\2\2\2\u01f2\u01f3"+
		"\5l\67\2\u01f3\u01f4\7\17\2\2\u01f4i\3\2\2\2\u01f5\u01f6\7\17\2\2\u01f6"+
		"\u01f7\5l\67\2\u01f7k\3\2\2\2\u01f8\u01f9\5n8\2\u01f9m\3\2\2\2\u01fa\u01ff"+
		"\5p9\2\u01fb\u01fc\7\r\2\2\u01fc\u01fe\7,\2\2\u01fd\u01fb\3\2\2\2\u01fe"+
		"\u0201\3\2\2\2\u01ff\u01fd\3\2\2\2\u01ff\u0200\3\2\2\2\u0200o\3\2\2\2"+
		"\u0201\u01ff\3\2\2\2\u0202\u0205\5r:\2\u0203\u0205\5t;\2\u0204\u0202\3"+
		"\2\2\2\u0204\u0203\3\2\2\2\u0205q\3\2\2\2\u0206\u0207\7#\2\2\u0207s\3"+
		"\2\2\2\u0208\u0209\7,\2\2\u0209u\3\2\2\2+z\u0081\u0087\u0089\u008f\u009e"+
		"\u00a0\u00a6\u00b2\u00be\u00c9\u00cf\u00de\u00e1\u00eb\u00ee\u00f5\u00f7"+
		"\u00fd\u0105\u0116\u011f\u0131\u014d\u0153\u0158\u015e\u0164\u016d\u0177"+
		"\u0180\u0188\u0190\u0198\u01a0\u01b3\u01dc\u01e5\u01e8\u01ff\u0204";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}