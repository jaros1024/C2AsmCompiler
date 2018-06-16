// Generated from C:/Users/Jarek/IdeaProjects/C2AsmCompiler\C2asm.g4 by ANTLR 4.7

package com.perez.jaroslav.compiler.antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class C2asmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, IDENTIFIER=80, 
		CHARACTER_LITERAL=81, STRING_LITERAL=82, HEX_LITERAL=83, DECIMAL_LITERAL=84, 
		OCTAL_LITERAL=85, FLOATING_POINT_LITERAL=86, WS=87, LINE_COMMENT=88, BLOCK_COMMENT=89;
	public static final int
		RULE_compilationUnit = 0, RULE_external_declaration = 1, RULE_function_definition = 2, 
		RULE_preprocessor_directive = 3, RULE_include = 4, RULE_header_file = 5, 
		RULE_define = 6, RULE_declaration = 7, RULE_function_declaration = 8, 
		RULE_variable_declaration = 9, RULE_declaration_specifiers = 10, RULE_variable_init_declarator_list = 11, 
		RULE_init_declarator = 12, RULE_storage_class_specifier = 13, RULE_type_specifier = 14, 
		RULE_struct_specifier = 15, RULE_struct = 16, RULE_struct_declaration_list = 17, 
		RULE_struct_declaration = 18, RULE_specifier_qualifier_list = 19, RULE_struct_declarator_list = 20, 
		RULE_struct_declarator = 21, RULE_enum_specifier = 22, RULE_enumerator_list = 23, 
		RULE_enumerator = 24, RULE_type_qualifier = 25, RULE_variable_declarator = 26, 
		RULE_variable_direct_declarator = 27, RULE_variable_declarator_suffix = 28, 
		RULE_function_direct_declarator = 29, RULE_pointer = 30, RULE_parameter_type_list = 31, 
		RULE_parameter_list = 32, RULE_parameter_declaration = 33, RULE_identifier_list = 34, 
		RULE_type_name = 35, RULE_abstract_declarator = 36, RULE_direct_abstract_declarator = 37, 
		RULE_abstract_declarator_suffix = 38, RULE_initializer = 39, RULE_initializer_list = 40, 
		RULE_argument_expression_list = 41, RULE_additive_expression = 42, RULE_multiplicative_expression = 43, 
		RULE_cast_expression = 44, RULE_unary_expression = 45, RULE_postfix_expression = 46, 
		RULE_unary_operator = 47, RULE_primary_expression = 48, RULE_constant = 49, 
		RULE_expression = 50, RULE_constant_expression = 51, RULE_assignment_expression = 52, 
		RULE_lvalue = 53, RULE_assignment_operator = 54, RULE_conditional_expression = 55, 
		RULE_logical_or_expression = 56, RULE_logical_and_expression = 57, RULE_inclusive_or_expression = 58, 
		RULE_exclusive_or_expression = 59, RULE_and_expression = 60, RULE_equality_expression = 61, 
		RULE_relational_expression = 62, RULE_shift_expression = 63, RULE_statement = 64, 
		RULE_labeled_statement = 65, RULE_compound_statement = 66, RULE_statement_list = 67, 
		RULE_expression_statement = 68, RULE_selection_statement = 69, RULE_iteration_statement = 70, 
		RULE_jump_statement = 71;
	public static final String[] ruleNames = {
		"compilationUnit", "external_declaration", "function_definition", "preprocessor_directive", 
		"include", "header_file", "define", "declaration", "function_declaration", 
		"variable_declaration", "declaration_specifiers", "variable_init_declarator_list", 
		"init_declarator", "storage_class_specifier", "type_specifier", "struct_specifier", 
		"struct", "struct_declaration_list", "struct_declaration", "specifier_qualifier_list", 
		"struct_declarator_list", "struct_declarator", "enum_specifier", "enumerator_list", 
		"enumerator", "type_qualifier", "variable_declarator", "variable_direct_declarator", 
		"variable_declarator_suffix", "function_direct_declarator", "pointer", 
		"parameter_type_list", "parameter_list", "parameter_declaration", "identifier_list", 
		"type_name", "abstract_declarator", "direct_abstract_declarator", "abstract_declarator_suffix", 
		"initializer", "initializer_list", "argument_expression_list", "additive_expression", 
		"multiplicative_expression", "cast_expression", "unary_expression", "postfix_expression", 
		"unary_operator", "primary_expression", "constant", "expression", "constant_expression", 
		"assignment_expression", "lvalue", "assignment_operator", "conditional_expression", 
		"logical_or_expression", "logical_and_expression", "inclusive_or_expression", 
		"exclusive_or_expression", "and_expression", "equality_expression", "relational_expression", 
		"shift_expression", "statement", "labeled_statement", "compound_statement", 
		"statement_list", "expression_statement", "selection_statement", "iteration_statement", 
		"jump_statement"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'#include'", "'<'", "'>'", "'\"'", "'.h'", "'#define'", "';'", 
		"','", "'='", "'extern'", "'static'", "'auto'", "'register'", "'void'", 
		"'char'", "'short'", "'int'", "'long'", "'float'", "'double'", "'signed'", 
		"'unsigned'", "'{'", "'}'", "'struct'", "':'", "'enum'", "'const'", "'volatile'", 
		"'['", "']'", "'('", "')'", "'*'", "'...'", "'+'", "'-'", "'/'", "'%'", 
		"'++'", "'--'", "'sizeof'", "'.'", "'->'", "'&'", "'~'", "'!'", "'*='", 
		"'/='", "'%='", "'+='", "'-='", "'<<='", "'>>='", "'&='", "'^='", "'|='", 
		"'?'", "'||'", "'&&'", "'|'", "'^'", "'=='", "'!='", "'<='", "'>='", "'<<'", 
		"'>>'", "'case'", "'default'", "'if'", "'else'", "'switch'", "'while'", 
		"'do'", "'for'", "'continue'", "'break'", "'return'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "IDENTIFIER", "CHARACTER_LITERAL", 
		"STRING_LITERAL", "HEX_LITERAL", "DECIMAL_LITERAL", "OCTAL_LITERAL", "FLOATING_POINT_LITERAL", 
		"WS", "LINE_COMMENT", "BLOCK_COMMENT"
	};
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
	public String getGrammarFileName() { return "C2asm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public C2asmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public List<Preprocessor_directiveContext> preprocessor_directive() {
			return getRuleContexts(Preprocessor_directiveContext.class);
		}
		public Preprocessor_directiveContext preprocessor_directive(int i) {
			return getRuleContext(Preprocessor_directiveContext.class,i);
		}
		public List<External_declarationContext> external_declaration() {
			return getRuleContexts(External_declarationContext.class);
		}
		public External_declarationContext external_declaration(int i) {
			return getRuleContext(External_declarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__5) {
				{
				{
				setState(144);
				preprocessor_directive();
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(151); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(150);
				external_declaration();
				}
				}
				setState(153); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__24) | (1L << T__26) | (1L << T__27) | (1L << T__28))) != 0) || _la==IDENTIFIER );
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

	public static class External_declarationContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Function_definitionContext function_definition() {
			return getRuleContext(Function_definitionContext.class,0);
		}
		public External_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_external_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterExternal_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitExternal_declaration(this);
		}
	}

	public final External_declarationContext external_declaration() throws RecognitionException {
		External_declarationContext _localctx = new External_declarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_external_declaration);
		try {
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				function_definition();
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

	public static class Function_definitionContext extends ParserRuleContext {
		public Declaration_specifiersContext declaration_specifiers() {
			return getRuleContext(Declaration_specifiersContext.class,0);
		}
		public Function_direct_declaratorContext function_direct_declarator() {
			return getRuleContext(Function_direct_declaratorContext.class,0);
		}
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterFunction_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitFunction_definition(this);
		}
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			declaration_specifiers();
			setState(160);
			function_direct_declarator();
			setState(161);
			compound_statement();
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

	public static class Preprocessor_directiveContext extends ParserRuleContext {
		public IncludeContext include() {
			return getRuleContext(IncludeContext.class,0);
		}
		public DefineContext define() {
			return getRuleContext(DefineContext.class,0);
		}
		public Preprocessor_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preprocessor_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterPreprocessor_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitPreprocessor_directive(this);
		}
	}

	public final Preprocessor_directiveContext preprocessor_directive() throws RecognitionException {
		Preprocessor_directiveContext _localctx = new Preprocessor_directiveContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_preprocessor_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(163);
				include();
				}
				break;
			case T__5:
				{
				setState(164);
				define();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class IncludeContext extends ParserRuleContext {
		public Header_fileContext header_file() {
			return getRuleContext(Header_fileContext.class,0);
		}
		public IncludeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterInclude(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitInclude(this);
		}
	}

	public final IncludeContext include() throws RecognitionException {
		IncludeContext _localctx = new IncludeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_include);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(T__0);
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(168);
				match(T__1);
				setState(169);
				header_file();
				setState(170);
				match(T__2);
				}
				break;
			case T__3:
				{
				setState(172);
				match(T__3);
				setState(173);
				header_file();
				setState(174);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Header_fileContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(C2asmParser.IDENTIFIER, 0); }
		public Header_fileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterHeader_file(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitHeader_file(this);
		}
	}

	public final Header_fileContext header_file() throws RecognitionException {
		Header_fileContext _localctx = new Header_fileContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_header_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(IDENTIFIER);
			setState(179);
			match(T__4);
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

	public static class DefineContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(C2asmParser.IDENTIFIER, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(C2asmParser.DECIMAL_LITERAL, 0); }
		public DefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterDefine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitDefine(this);
		}
	}

	public final DefineContext define() throws RecognitionException {
		DefineContext _localctx = new DefineContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_define);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(T__5);
			setState(182);
			match(IDENTIFIER);
			setState(183);
			match(DECIMAL_LITERAL);
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

	public static class DeclarationContext extends ParserRuleContext {
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declaration);
		try {
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				variable_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				function_declaration();
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

	public static class Function_declarationContext extends ParserRuleContext {
		public Declaration_specifiersContext declaration_specifiers() {
			return getRuleContext(Declaration_specifiersContext.class,0);
		}
		public Function_direct_declaratorContext function_direct_declarator() {
			return getRuleContext(Function_direct_declaratorContext.class,0);
		}
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterFunction_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitFunction_declaration(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_function_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			declaration_specifiers();
			setState(190);
			function_direct_declarator();
			setState(191);
			match(T__6);
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

	public static class Variable_declarationContext extends ParserRuleContext {
		public Declaration_specifiersContext declaration_specifiers() {
			return getRuleContext(Declaration_specifiersContext.class,0);
		}
		public Variable_init_declarator_listContext variable_init_declarator_list() {
			return getRuleContext(Variable_init_declarator_listContext.class,0);
		}
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterVariable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitVariable_declaration(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variable_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			declaration_specifiers();
			setState(194);
			variable_init_declarator_list();
			setState(195);
			match(T__6);
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

	public static class Declaration_specifiersContext extends ParserRuleContext {
		public List<Storage_class_specifierContext> storage_class_specifier() {
			return getRuleContexts(Storage_class_specifierContext.class);
		}
		public Storage_class_specifierContext storage_class_specifier(int i) {
			return getRuleContext(Storage_class_specifierContext.class,i);
		}
		public List<Type_specifierContext> type_specifier() {
			return getRuleContexts(Type_specifierContext.class);
		}
		public Type_specifierContext type_specifier(int i) {
			return getRuleContext(Type_specifierContext.class,i);
		}
		public List<Type_qualifierContext> type_qualifier() {
			return getRuleContexts(Type_qualifierContext.class);
		}
		public Type_qualifierContext type_qualifier(int i) {
			return getRuleContext(Type_qualifierContext.class,i);
		}
		public Declaration_specifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_specifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterDeclaration_specifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitDeclaration_specifiers(this);
		}
	}

	public final Declaration_specifiersContext declaration_specifiers() throws RecognitionException {
		Declaration_specifiersContext _localctx = new Declaration_specifiersContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declaration_specifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(200); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(200);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__9:
					case T__10:
					case T__11:
					case T__12:
						{
						setState(197);
						storage_class_specifier();
						}
						break;
					case T__13:
					case T__14:
					case T__15:
					case T__16:
					case T__17:
					case T__18:
					case T__19:
					case T__20:
					case T__21:
					case T__24:
					case T__26:
					case IDENTIFIER:
						{
						setState(198);
						type_specifier();
						}
						break;
					case T__27:
					case T__28:
						{
						setState(199);
						type_qualifier();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(202); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Variable_init_declarator_listContext extends ParserRuleContext {
		public List<Init_declaratorContext> init_declarator() {
			return getRuleContexts(Init_declaratorContext.class);
		}
		public Init_declaratorContext init_declarator(int i) {
			return getRuleContext(Init_declaratorContext.class,i);
		}
		public Variable_init_declarator_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_init_declarator_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterVariable_init_declarator_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitVariable_init_declarator_list(this);
		}
	}

	public final Variable_init_declarator_listContext variable_init_declarator_list() throws RecognitionException {
		Variable_init_declarator_listContext _localctx = new Variable_init_declarator_listContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variable_init_declarator_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			init_declarator();
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(205);
				match(T__7);
				setState(206);
				init_declarator();
				}
				}
				setState(211);
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

	public static class Init_declaratorContext extends ParserRuleContext {
		public Variable_declaratorContext variable_declarator() {
			return getRuleContext(Variable_declaratorContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public Init_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterInit_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitInit_declarator(this);
		}
	}

	public final Init_declaratorContext init_declarator() throws RecognitionException {
		Init_declaratorContext _localctx = new Init_declaratorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_init_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			variable_declarator();
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(213);
				match(T__8);
				setState(214);
				initializer();
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

	public static class Storage_class_specifierContext extends ParserRuleContext {
		public Storage_class_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storage_class_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterStorage_class_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitStorage_class_specifier(this);
		}
	}

	public final Storage_class_specifierContext storage_class_specifier() throws RecognitionException {
		Storage_class_specifierContext _localctx = new Storage_class_specifierContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_storage_class_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) ) {
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

	public static class Type_specifierContext extends ParserRuleContext {
		public Struct_specifierContext struct_specifier() {
			return getRuleContext(Struct_specifierContext.class,0);
		}
		public Enum_specifierContext enum_specifier() {
			return getRuleContext(Enum_specifierContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(C2asmParser.IDENTIFIER, 0); }
		public Type_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterType_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitType_specifier(this);
		}
	}

	public final Type_specifierContext type_specifier() throws RecognitionException {
		Type_specifierContext _localctx = new Type_specifierContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_type_specifier);
		try {
			setState(231);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				match(T__13);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				match(T__14);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				match(T__15);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 4);
				{
				setState(222);
				match(T__16);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 5);
				{
				setState(223);
				match(T__17);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 6);
				{
				setState(224);
				match(T__18);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 7);
				{
				setState(225);
				match(T__19);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 8);
				{
				setState(226);
				match(T__20);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 9);
				{
				setState(227);
				match(T__21);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 10);
				{
				setState(228);
				struct_specifier();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 11);
				{
				setState(229);
				enum_specifier();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 12);
				{
				setState(230);
				match(IDENTIFIER);
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

	public static class Struct_specifierContext extends ParserRuleContext {
		public StructContext struct() {
			return getRuleContext(StructContext.class,0);
		}
		public Struct_declaration_listContext struct_declaration_list() {
			return getRuleContext(Struct_declaration_listContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(C2asmParser.IDENTIFIER, 0); }
		public Struct_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterStruct_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitStruct_specifier(this);
		}
	}

	public final Struct_specifierContext struct_specifier() throws RecognitionException {
		Struct_specifierContext _localctx = new Struct_specifierContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_struct_specifier);
		int _la;
		try {
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				struct();
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(234);
					match(IDENTIFIER);
					}
				}

				setState(237);
				match(T__22);
				setState(238);
				struct_declaration_list();
				setState(239);
				match(T__23);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				struct();
				setState(242);
				match(IDENTIFIER);
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

	public static class StructContext extends ParserRuleContext {
		public StructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitStruct(this);
		}
	}

	public final StructContext struct() throws RecognitionException {
		StructContext _localctx = new StructContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_struct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(T__24);
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

	public static class Struct_declaration_listContext extends ParserRuleContext {
		public List<Struct_declarationContext> struct_declaration() {
			return getRuleContexts(Struct_declarationContext.class);
		}
		public Struct_declarationContext struct_declaration(int i) {
			return getRuleContext(Struct_declarationContext.class,i);
		}
		public Struct_declaration_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_declaration_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterStruct_declaration_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitStruct_declaration_list(this);
		}
	}

	public final Struct_declaration_listContext struct_declaration_list() throws RecognitionException {
		Struct_declaration_listContext _localctx = new Struct_declaration_listContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_struct_declaration_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(248);
				struct_declaration();
				}
				}
				setState(251); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__24) | (1L << T__26) | (1L << T__27) | (1L << T__28))) != 0) || _la==IDENTIFIER );
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

	public static class Struct_declarationContext extends ParserRuleContext {
		public Specifier_qualifier_listContext specifier_qualifier_list() {
			return getRuleContext(Specifier_qualifier_listContext.class,0);
		}
		public Struct_declarator_listContext struct_declarator_list() {
			return getRuleContext(Struct_declarator_listContext.class,0);
		}
		public Struct_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterStruct_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitStruct_declaration(this);
		}
	}

	public final Struct_declarationContext struct_declaration() throws RecognitionException {
		Struct_declarationContext _localctx = new Struct_declarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_struct_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			specifier_qualifier_list();
			setState(254);
			struct_declarator_list();
			setState(255);
			match(T__6);
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

	public static class Specifier_qualifier_listContext extends ParserRuleContext {
		public List<Type_qualifierContext> type_qualifier() {
			return getRuleContexts(Type_qualifierContext.class);
		}
		public Type_qualifierContext type_qualifier(int i) {
			return getRuleContext(Type_qualifierContext.class,i);
		}
		public List<Type_specifierContext> type_specifier() {
			return getRuleContexts(Type_specifierContext.class);
		}
		public Type_specifierContext type_specifier(int i) {
			return getRuleContext(Type_specifierContext.class,i);
		}
		public Specifier_qualifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specifier_qualifier_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterSpecifier_qualifier_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitSpecifier_qualifier_list(this);
		}
	}

	public final Specifier_qualifier_listContext specifier_qualifier_list() throws RecognitionException {
		Specifier_qualifier_listContext _localctx = new Specifier_qualifier_listContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_specifier_qualifier_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(259); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(259);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__27:
					case T__28:
						{
						setState(257);
						type_qualifier();
						}
						break;
					case T__13:
					case T__14:
					case T__15:
					case T__16:
					case T__17:
					case T__18:
					case T__19:
					case T__20:
					case T__21:
					case T__24:
					case T__26:
					case IDENTIFIER:
						{
						setState(258);
						type_specifier();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(261); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Struct_declarator_listContext extends ParserRuleContext {
		public List<Struct_declaratorContext> struct_declarator() {
			return getRuleContexts(Struct_declaratorContext.class);
		}
		public Struct_declaratorContext struct_declarator(int i) {
			return getRuleContext(Struct_declaratorContext.class,i);
		}
		public Struct_declarator_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_declarator_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterStruct_declarator_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitStruct_declarator_list(this);
		}
	}

	public final Struct_declarator_listContext struct_declarator_list() throws RecognitionException {
		Struct_declarator_listContext _localctx = new Struct_declarator_listContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_struct_declarator_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			struct_declarator();
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(264);
				match(T__7);
				setState(265);
				struct_declarator();
				}
				}
				setState(270);
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

	public static class Struct_declaratorContext extends ParserRuleContext {
		public Variable_declaratorContext variable_declarator() {
			return getRuleContext(Variable_declaratorContext.class,0);
		}
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public Struct_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterStruct_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitStruct_declarator(this);
		}
	}

	public final Struct_declaratorContext struct_declarator() throws RecognitionException {
		Struct_declaratorContext _localctx = new Struct_declaratorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_struct_declarator);
		int _la;
		try {
			setState(278);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				variable_declarator();
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__25) {
					{
					setState(272);
					match(T__25);
					setState(273);
					constant_expression();
					}
				}

				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				match(T__25);
				setState(277);
				constant_expression();
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

	public static class Enum_specifierContext extends ParserRuleContext {
		public Enumerator_listContext enumerator_list() {
			return getRuleContext(Enumerator_listContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(C2asmParser.IDENTIFIER, 0); }
		public Enum_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterEnum_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitEnum_specifier(this);
		}
	}

	public final Enum_specifierContext enum_specifier() throws RecognitionException {
		Enum_specifierContext _localctx = new Enum_specifierContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_enum_specifier);
		try {
			setState(293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				match(T__26);
				setState(281);
				match(T__22);
				setState(282);
				enumerator_list();
				setState(283);
				match(T__23);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				match(T__26);
				setState(286);
				match(IDENTIFIER);
				setState(287);
				match(T__22);
				setState(288);
				enumerator_list();
				setState(289);
				match(T__23);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(291);
				match(T__26);
				setState(292);
				match(IDENTIFIER);
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

	public static class Enumerator_listContext extends ParserRuleContext {
		public List<EnumeratorContext> enumerator() {
			return getRuleContexts(EnumeratorContext.class);
		}
		public EnumeratorContext enumerator(int i) {
			return getRuleContext(EnumeratorContext.class,i);
		}
		public Enumerator_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterEnumerator_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitEnumerator_list(this);
		}
	}

	public final Enumerator_listContext enumerator_list() throws RecognitionException {
		Enumerator_listContext _localctx = new Enumerator_listContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_enumerator_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			enumerator();
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(296);
				match(T__7);
				setState(297);
				enumerator();
				}
				}
				setState(302);
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

	public static class EnumeratorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(C2asmParser.IDENTIFIER, 0); }
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public EnumeratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterEnumerator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitEnumerator(this);
		}
	}

	public final EnumeratorContext enumerator() throws RecognitionException {
		EnumeratorContext _localctx = new EnumeratorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_enumerator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(IDENTIFIER);
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(304);
				match(T__8);
				setState(305);
				constant_expression();
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

	public static class Type_qualifierContext extends ParserRuleContext {
		public Type_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_qualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterType_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitType_qualifier(this);
		}
	}

	public final Type_qualifierContext type_qualifier() throws RecognitionException {
		Type_qualifierContext _localctx = new Type_qualifierContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_type_qualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			_la = _input.LA(1);
			if ( !(_la==T__27 || _la==T__28) ) {
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

	public static class Variable_declaratorContext extends ParserRuleContext {
		public Variable_direct_declaratorContext variable_direct_declarator() {
			return getRuleContext(Variable_direct_declaratorContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public Variable_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterVariable_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitVariable_declarator(this);
		}
	}

	public final Variable_declaratorContext variable_declarator() throws RecognitionException {
		Variable_declaratorContext _localctx = new Variable_declaratorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_variable_declarator);
		int _la;
		try {
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__33) {
					{
					setState(310);
					pointer();
					}
				}

				setState(313);
				variable_direct_declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				pointer();
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

	public static class Variable_direct_declaratorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(C2asmParser.IDENTIFIER, 0); }
		public List<Variable_declarator_suffixContext> variable_declarator_suffix() {
			return getRuleContexts(Variable_declarator_suffixContext.class);
		}
		public Variable_declarator_suffixContext variable_declarator_suffix(int i) {
			return getRuleContext(Variable_declarator_suffixContext.class,i);
		}
		public Variable_direct_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_direct_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterVariable_direct_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitVariable_direct_declarator(this);
		}
	}

	public final Variable_direct_declaratorContext variable_direct_declarator() throws RecognitionException {
		Variable_direct_declaratorContext _localctx = new Variable_direct_declaratorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_variable_direct_declarator);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(IDENTIFIER);
			setState(321);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(318);
					variable_declarator_suffix();
					}
					} 
				}
				setState(323);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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

	public static class Variable_declarator_suffixContext extends ParserRuleContext {
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public Variable_declarator_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declarator_suffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterVariable_declarator_suffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitVariable_declarator_suffix(this);
		}
	}

	public final Variable_declarator_suffixContext variable_declarator_suffix() throws RecognitionException {
		Variable_declarator_suffixContext _localctx = new Variable_declarator_suffixContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_variable_declarator_suffix);
		try {
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(324);
				match(T__29);
				setState(325);
				constant_expression();
				setState(326);
				match(T__30);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				match(T__29);
				setState(329);
				match(T__30);
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

	public static class Function_direct_declaratorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(C2asmParser.IDENTIFIER, 0); }
		public List<Parameter_type_listContext> parameter_type_list() {
			return getRuleContexts(Parameter_type_listContext.class);
		}
		public Parameter_type_listContext parameter_type_list(int i) {
			return getRuleContext(Parameter_type_listContext.class,i);
		}
		public Function_direct_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_direct_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterFunction_direct_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitFunction_direct_declarator(this);
		}
	}

	public final Function_direct_declaratorContext function_direct_declarator() throws RecognitionException {
		Function_direct_declaratorContext _localctx = new Function_direct_declaratorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_function_direct_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(IDENTIFIER);
			setState(333);
			match(T__31);
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__24) | (1L << T__26) | (1L << T__27) | (1L << T__28))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(334);
				parameter_type_list();
				}
				}
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(340);
			match(T__32);
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

	public static class PointerContext extends ParserRuleContext {
		public List<Type_qualifierContext> type_qualifier() {
			return getRuleContexts(Type_qualifierContext.class);
		}
		public Type_qualifierContext type_qualifier(int i) {
			return getRuleContext(Type_qualifierContext.class,i);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public PointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterPointer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitPointer(this);
		}
	}

	public final PointerContext pointer() throws RecognitionException {
		PointerContext _localctx = new PointerContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_pointer);
		try {
			int _alt;
			setState(354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(342);
				match(T__33);
				setState(344); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(343);
						type_qualifier();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(346); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(349);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(348);
					pointer();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(351);
				match(T__33);
				setState(352);
				pointer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(353);
				match(T__33);
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

	public static class Parameter_type_listContext extends ParserRuleContext {
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public Parameter_type_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_type_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterParameter_type_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitParameter_type_list(this);
		}
	}

	public final Parameter_type_listContext parameter_type_list() throws RecognitionException {
		Parameter_type_listContext _localctx = new Parameter_type_listContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_parameter_type_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			parameter_list();
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(357);
				match(T__7);
				setState(358);
				match(T__34);
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

	public static class Parameter_listContext extends ParserRuleContext {
		public List<Parameter_declarationContext> parameter_declaration() {
			return getRuleContexts(Parameter_declarationContext.class);
		}
		public Parameter_declarationContext parameter_declaration(int i) {
			return getRuleContext(Parameter_declarationContext.class,i);
		}
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterParameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitParameter_list(this);
		}
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_parameter_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			parameter_declaration();
			setState(366);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(362);
					match(T__7);
					setState(363);
					parameter_declaration();
					}
					} 
				}
				setState(368);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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

	public static class Parameter_declarationContext extends ParserRuleContext {
		public Declaration_specifiersContext declaration_specifiers() {
			return getRuleContext(Declaration_specifiersContext.class,0);
		}
		public List<Variable_declaratorContext> variable_declarator() {
			return getRuleContexts(Variable_declaratorContext.class);
		}
		public Variable_declaratorContext variable_declarator(int i) {
			return getRuleContext(Variable_declaratorContext.class,i);
		}
		public List<Abstract_declaratorContext> abstract_declarator() {
			return getRuleContexts(Abstract_declaratorContext.class);
		}
		public Abstract_declaratorContext abstract_declarator(int i) {
			return getRuleContext(Abstract_declaratorContext.class,i);
		}
		public Parameter_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterParameter_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitParameter_declaration(this);
		}
	}

	public final Parameter_declarationContext parameter_declaration() throws RecognitionException {
		Parameter_declarationContext _localctx = new Parameter_declarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_parameter_declaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			declaration_specifiers();
			setState(374);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(372);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						setState(370);
						variable_declarator();
						}
						break;
					case 2:
						{
						setState(371);
						abstract_declarator();
						}
						break;
					}
					} 
				}
				setState(376);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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

	public static class Identifier_listContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(C2asmParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(C2asmParser.IDENTIFIER, i);
		}
		public Identifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterIdentifier_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitIdentifier_list(this);
		}
	}

	public final Identifier_listContext identifier_list() throws RecognitionException {
		Identifier_listContext _localctx = new Identifier_listContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_identifier_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(IDENTIFIER);
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(378);
				match(T__7);
				setState(379);
				match(IDENTIFIER);
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

	public static class Type_nameContext extends ParserRuleContext {
		public Specifier_qualifier_listContext specifier_qualifier_list() {
			return getRuleContext(Specifier_qualifier_listContext.class,0);
		}
		public Abstract_declaratorContext abstract_declarator() {
			return getRuleContext(Abstract_declaratorContext.class,0);
		}
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitType_name(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_type_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			specifier_qualifier_list();
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__31) | (1L << T__33))) != 0)) {
				{
				setState(386);
				abstract_declarator();
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

	public static class Abstract_declaratorContext extends ParserRuleContext {
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public Direct_abstract_declaratorContext direct_abstract_declarator() {
			return getRuleContext(Direct_abstract_declaratorContext.class,0);
		}
		public Abstract_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstract_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterAbstract_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitAbstract_declarator(this);
		}
	}

	public final Abstract_declaratorContext abstract_declarator() throws RecognitionException {
		Abstract_declaratorContext _localctx = new Abstract_declaratorContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_abstract_declarator);
		try {
			setState(394);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(389);
				pointer();
				setState(391);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(390);
					direct_abstract_declarator();
					}
					break;
				}
				}
				break;
			case T__29:
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				setState(393);
				direct_abstract_declarator();
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

	public static class Direct_abstract_declaratorContext extends ParserRuleContext {
		public Abstract_declaratorContext abstract_declarator() {
			return getRuleContext(Abstract_declaratorContext.class,0);
		}
		public List<Abstract_declarator_suffixContext> abstract_declarator_suffix() {
			return getRuleContexts(Abstract_declarator_suffixContext.class);
		}
		public Abstract_declarator_suffixContext abstract_declarator_suffix(int i) {
			return getRuleContext(Abstract_declarator_suffixContext.class,i);
		}
		public Direct_abstract_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_direct_abstract_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterDirect_abstract_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitDirect_abstract_declarator(this);
		}
	}

	public final Direct_abstract_declaratorContext direct_abstract_declarator() throws RecognitionException {
		Direct_abstract_declaratorContext _localctx = new Direct_abstract_declaratorContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_direct_abstract_declarator);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(396);
				match(T__31);
				setState(397);
				abstract_declarator();
				setState(398);
				match(T__32);
				}
				break;
			case 2:
				{
				setState(400);
				abstract_declarator_suffix();
				}
				break;
			}
			setState(406);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(403);
					abstract_declarator_suffix();
					}
					} 
				}
				setState(408);
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

	public static class Abstract_declarator_suffixContext extends ParserRuleContext {
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public Parameter_type_listContext parameter_type_list() {
			return getRuleContext(Parameter_type_listContext.class,0);
		}
		public Abstract_declarator_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstract_declarator_suffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterAbstract_declarator_suffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitAbstract_declarator_suffix(this);
		}
	}

	public final Abstract_declarator_suffixContext abstract_declarator_suffix() throws RecognitionException {
		Abstract_declarator_suffixContext _localctx = new Abstract_declarator_suffixContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_abstract_declarator_suffix);
		try {
			setState(421);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(409);
				match(T__29);
				setState(410);
				match(T__30);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(411);
				match(T__29);
				setState(412);
				constant_expression();
				setState(413);
				match(T__30);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(415);
				match(T__31);
				setState(416);
				match(T__32);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(417);
				match(T__31);
				setState(418);
				parameter_type_list();
				setState(419);
				match(T__32);
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

	public static class InitializerContext extends ParserRuleContext {
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public Initializer_listContext initializer_list() {
			return getRuleContext(Initializer_listContext.class,0);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitInitializer(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_initializer);
		int _la;
		try {
			setState(431);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
			case T__33:
			case T__35:
			case T__36:
			case T__39:
			case T__40:
			case T__41:
			case T__44:
			case T__45:
			case T__46:
			case IDENTIFIER:
			case CHARACTER_LITERAL:
			case STRING_LITERAL:
			case HEX_LITERAL:
			case DECIMAL_LITERAL:
			case OCTAL_LITERAL:
			case FLOATING_POINT_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(423);
				assignment_expression();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				setState(424);
				match(T__22);
				setState(425);
				initializer_list();
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(426);
					match(T__7);
					}
				}

				setState(429);
				match(T__23);
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

	public static class Initializer_listContext extends ParserRuleContext {
		public List<InitializerContext> initializer() {
			return getRuleContexts(InitializerContext.class);
		}
		public InitializerContext initializer(int i) {
			return getRuleContext(InitializerContext.class,i);
		}
		public Initializer_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterInitializer_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitInitializer_list(this);
		}
	}

	public final Initializer_listContext initializer_list() throws RecognitionException {
		Initializer_listContext _localctx = new Initializer_listContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_initializer_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			initializer();
			setState(438);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(434);
					match(T__7);
					setState(435);
					initializer();
					}
					} 
				}
				setState(440);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
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

	public static class Argument_expression_listContext extends ParserRuleContext {
		public List<Assignment_expressionContext> assignment_expression() {
			return getRuleContexts(Assignment_expressionContext.class);
		}
		public Assignment_expressionContext assignment_expression(int i) {
			return getRuleContext(Assignment_expressionContext.class,i);
		}
		public Argument_expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterArgument_expression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitArgument_expression_list(this);
		}
	}

	public final Argument_expression_listContext argument_expression_list() throws RecognitionException {
		Argument_expression_listContext _localctx = new Argument_expression_listContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_argument_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			assignment_expression();
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(442);
				match(T__7);
				setState(443);
				assignment_expression();
				}
				}
				setState(448);
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

	public static class Additive_expressionContext extends ParserRuleContext {
		public List<Multiplicative_expressionContext> multiplicative_expression() {
			return getRuleContexts(Multiplicative_expressionContext.class);
		}
		public Multiplicative_expressionContext multiplicative_expression(int i) {
			return getRuleContext(Multiplicative_expressionContext.class,i);
		}
		public Additive_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterAdditive_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitAdditive_expression(this);
		}
	}

	public final Additive_expressionContext additive_expression() throws RecognitionException {
		Additive_expressionContext _localctx = new Additive_expressionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_additive_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(449);
			multiplicative_expression();
			}
			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__35 || _la==T__36) {
				{
				setState(454);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__35:
					{
					setState(450);
					match(T__35);
					setState(451);
					multiplicative_expression();
					}
					break;
				case T__36:
					{
					setState(452);
					match(T__36);
					setState(453);
					multiplicative_expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(458);
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

	public static class Multiplicative_expressionContext extends ParserRuleContext {
		public List<Cast_expressionContext> cast_expression() {
			return getRuleContexts(Cast_expressionContext.class);
		}
		public Cast_expressionContext cast_expression(int i) {
			return getRuleContext(Cast_expressionContext.class,i);
		}
		public Multiplicative_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicative_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterMultiplicative_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitMultiplicative_expression(this);
		}
	}

	public final Multiplicative_expressionContext multiplicative_expression() throws RecognitionException {
		Multiplicative_expressionContext _localctx = new Multiplicative_expressionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_multiplicative_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(459);
			cast_expression();
			}
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__33) | (1L << T__37) | (1L << T__38))) != 0)) {
				{
				setState(466);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__33:
					{
					setState(460);
					match(T__33);
					setState(461);
					cast_expression();
					}
					break;
				case T__37:
					{
					setState(462);
					match(T__37);
					setState(463);
					cast_expression();
					}
					break;
				case T__38:
					{
					setState(464);
					match(T__38);
					setState(465);
					cast_expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(470);
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

	public static class Cast_expressionContext extends ParserRuleContext {
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Cast_expressionContext cast_expression() {
			return getRuleContext(Cast_expressionContext.class,0);
		}
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Cast_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterCast_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitCast_expression(this);
		}
	}

	public final Cast_expressionContext cast_expression() throws RecognitionException {
		Cast_expressionContext _localctx = new Cast_expressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_cast_expression);
		try {
			setState(477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(471);
				match(T__31);
				setState(472);
				type_name();
				setState(473);
				match(T__32);
				setState(474);
				cast_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(476);
				unary_expression();
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

	public static class Unary_expressionContext extends ParserRuleContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public Cast_expressionContext cast_expression() {
			return getRuleContext(Cast_expressionContext.class,0);
		}
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Unary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterUnary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitUnary_expression(this);
		}
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_unary_expression);
		try {
			setState(494);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(479);
				postfix_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(480);
				match(T__39);
				setState(481);
				unary_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(482);
				match(T__40);
				setState(483);
				unary_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(484);
				unary_operator();
				setState(485);
				cast_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(487);
				match(T__41);
				setState(488);
				unary_expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(489);
				match(T__41);
				setState(490);
				match(T__31);
				setState(491);
				type_name();
				setState(492);
				match(T__32);
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

	public static class Postfix_expressionContext extends ParserRuleContext {
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<Argument_expression_listContext> argument_expression_list() {
			return getRuleContexts(Argument_expression_listContext.class);
		}
		public Argument_expression_listContext argument_expression_list(int i) {
			return getRuleContext(Argument_expression_listContext.class,i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(C2asmParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(C2asmParser.IDENTIFIER, i);
		}
		public Postfix_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterPostfix_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitPostfix_expression(this);
		}
	}

	public final Postfix_expressionContext postfix_expression() throws RecognitionException {
		Postfix_expressionContext _localctx = new Postfix_expressionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_postfix_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			primary_expression();
			setState(515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__31) | (1L << T__39) | (1L << T__40) | (1L << T__42) | (1L << T__43))) != 0)) {
				{
				setState(513);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(497);
					match(T__29);
					setState(498);
					expression();
					setState(499);
					match(T__30);
					}
					break;
				case 2:
					{
					setState(501);
					match(T__31);
					setState(502);
					match(T__32);
					}
					break;
				case 3:
					{
					setState(503);
					match(T__31);
					setState(504);
					argument_expression_list();
					setState(505);
					match(T__32);
					}
					break;
				case 4:
					{
					setState(507);
					match(T__42);
					setState(508);
					match(IDENTIFIER);
					}
					break;
				case 5:
					{
					setState(509);
					match(T__43);
					setState(510);
					match(IDENTIFIER);
					}
					break;
				case 6:
					{
					setState(511);
					match(T__39);
					}
					break;
				case 7:
					{
					setState(512);
					match(T__40);
					}
					break;
				}
				}
				setState(517);
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

	public static class Unary_operatorContext extends ParserRuleContext {
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitUnary_operator(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__33) | (1L << T__35) | (1L << T__36) | (1L << T__44) | (1L << T__45) | (1L << T__46))) != 0)) ) {
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

	public static class Primary_expressionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(C2asmParser.IDENTIFIER, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterPrimary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitPrimary_expression(this);
		}
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_primary_expression);
		try {
			setState(526);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(520);
				match(IDENTIFIER);
				}
				break;
			case CHARACTER_LITERAL:
			case STRING_LITERAL:
			case HEX_LITERAL:
			case DECIMAL_LITERAL:
			case OCTAL_LITERAL:
			case FLOATING_POINT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(521);
				constant();
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 3);
				{
				setState(522);
				match(T__31);
				setState(523);
				expression();
				setState(524);
				match(T__32);
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

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode HEX_LITERAL() { return getToken(C2asmParser.HEX_LITERAL, 0); }
		public TerminalNode OCTAL_LITERAL() { return getToken(C2asmParser.OCTAL_LITERAL, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(C2asmParser.DECIMAL_LITERAL, 0); }
		public TerminalNode CHARACTER_LITERAL() { return getToken(C2asmParser.CHARACTER_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(C2asmParser.STRING_LITERAL, 0); }
		public TerminalNode FLOATING_POINT_LITERAL() { return getToken(C2asmParser.FLOATING_POINT_LITERAL, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			_la = _input.LA(1);
			if ( !(((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (CHARACTER_LITERAL - 81)) | (1L << (STRING_LITERAL - 81)) | (1L << (HEX_LITERAL - 81)) | (1L << (DECIMAL_LITERAL - 81)) | (1L << (OCTAL_LITERAL - 81)) | (1L << (FLOATING_POINT_LITERAL - 81)))) != 0)) ) {
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<Assignment_expressionContext> assignment_expression() {
			return getRuleContexts(Assignment_expressionContext.class);
		}
		public Assignment_expressionContext assignment_expression(int i) {
			return getRuleContext(Assignment_expressionContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			assignment_expression();
			setState(535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(531);
				match(T__7);
				setState(532);
				assignment_expression();
				}
				}
				setState(537);
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

	public static class Constant_expressionContext extends ParserRuleContext {
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public Constant_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterConstant_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitConstant_expression(this);
		}
	}

	public final Constant_expressionContext constant_expression() throws RecognitionException {
		Constant_expressionContext _localctx = new Constant_expressionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_constant_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			conditional_expression();
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

	public static class Assignment_expressionContext extends ParserRuleContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public Assignment_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterAssignment_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitAssignment_expression(this);
		}
	}

	public final Assignment_expressionContext assignment_expression() throws RecognitionException {
		Assignment_expressionContext _localctx = new Assignment_expressionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_assignment_expression);
		try {
			setState(545);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(540);
				lvalue();
				setState(541);
				assignment_operator();
				setState(542);
				assignment_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(544);
				conditional_expression();
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

	public static class LvalueContext extends ParserRuleContext {
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterLvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitLvalue(this);
		}
	}

	public final LvalueContext lvalue() throws RecognitionException {
		LvalueContext _localctx = new LvalueContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_lvalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			unary_expression();
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

	public static class Assignment_operatorContext extends ParserRuleContext {
		public Assignment_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterAssignment_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitAssignment_operator(this);
		}
	}

	public final Assignment_operatorContext assignment_operator() throws RecognitionException {
		Assignment_operatorContext _localctx = new Assignment_operatorContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_assignment_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56))) != 0)) ) {
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

	public static class Conditional_expressionContext extends ParserRuleContext {
		public Logical_or_expressionContext logical_or_expression() {
			return getRuleContext(Logical_or_expressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public Conditional_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterConditional_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitConditional_expression(this);
		}
	}

	public final Conditional_expressionContext conditional_expression() throws RecognitionException {
		Conditional_expressionContext _localctx = new Conditional_expressionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_conditional_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			logical_or_expression();
			setState(557);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__57) {
				{
				setState(552);
				match(T__57);
				setState(553);
				expression();
				setState(554);
				match(T__25);
				setState(555);
				conditional_expression();
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

	public static class Logical_or_expressionContext extends ParserRuleContext {
		public List<Logical_and_expressionContext> logical_and_expression() {
			return getRuleContexts(Logical_and_expressionContext.class);
		}
		public Logical_and_expressionContext logical_and_expression(int i) {
			return getRuleContext(Logical_and_expressionContext.class,i);
		}
		public Logical_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterLogical_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitLogical_or_expression(this);
		}
	}

	public final Logical_or_expressionContext logical_or_expression() throws RecognitionException {
		Logical_or_expressionContext _localctx = new Logical_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_logical_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			logical_and_expression();
			setState(564);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__58) {
				{
				{
				setState(560);
				match(T__58);
				setState(561);
				logical_and_expression();
				}
				}
				setState(566);
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

	public static class Logical_and_expressionContext extends ParserRuleContext {
		public List<Inclusive_or_expressionContext> inclusive_or_expression() {
			return getRuleContexts(Inclusive_or_expressionContext.class);
		}
		public Inclusive_or_expressionContext inclusive_or_expression(int i) {
			return getRuleContext(Inclusive_or_expressionContext.class,i);
		}
		public Logical_and_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_and_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterLogical_and_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitLogical_and_expression(this);
		}
	}

	public final Logical_and_expressionContext logical_and_expression() throws RecognitionException {
		Logical_and_expressionContext _localctx = new Logical_and_expressionContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_logical_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			inclusive_or_expression();
			setState(572);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__59) {
				{
				{
				setState(568);
				match(T__59);
				setState(569);
				inclusive_or_expression();
				}
				}
				setState(574);
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

	public static class Inclusive_or_expressionContext extends ParserRuleContext {
		public List<Exclusive_or_expressionContext> exclusive_or_expression() {
			return getRuleContexts(Exclusive_or_expressionContext.class);
		}
		public Exclusive_or_expressionContext exclusive_or_expression(int i) {
			return getRuleContext(Exclusive_or_expressionContext.class,i);
		}
		public Inclusive_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusive_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterInclusive_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitInclusive_or_expression(this);
		}
	}

	public final Inclusive_or_expressionContext inclusive_or_expression() throws RecognitionException {
		Inclusive_or_expressionContext _localctx = new Inclusive_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_inclusive_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			exclusive_or_expression();
			setState(580);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__60) {
				{
				{
				setState(576);
				match(T__60);
				setState(577);
				exclusive_or_expression();
				}
				}
				setState(582);
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

	public static class Exclusive_or_expressionContext extends ParserRuleContext {
		public List<And_expressionContext> and_expression() {
			return getRuleContexts(And_expressionContext.class);
		}
		public And_expressionContext and_expression(int i) {
			return getRuleContext(And_expressionContext.class,i);
		}
		public Exclusive_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusive_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterExclusive_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitExclusive_or_expression(this);
		}
	}

	public final Exclusive_or_expressionContext exclusive_or_expression() throws RecognitionException {
		Exclusive_or_expressionContext _localctx = new Exclusive_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_exclusive_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			and_expression();
			setState(588);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__61) {
				{
				{
				setState(584);
				match(T__61);
				setState(585);
				and_expression();
				}
				}
				setState(590);
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

	public static class And_expressionContext extends ParserRuleContext {
		public List<Equality_expressionContext> equality_expression() {
			return getRuleContexts(Equality_expressionContext.class);
		}
		public Equality_expressionContext equality_expression(int i) {
			return getRuleContext(Equality_expressionContext.class,i);
		}
		public And_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterAnd_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitAnd_expression(this);
		}
	}

	public final And_expressionContext and_expression() throws RecognitionException {
		And_expressionContext _localctx = new And_expressionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			equality_expression();
			setState(596);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__44) {
				{
				{
				setState(592);
				match(T__44);
				setState(593);
				equality_expression();
				}
				}
				setState(598);
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

	public static class Equality_expressionContext extends ParserRuleContext {
		public List<Relational_expressionContext> relational_expression() {
			return getRuleContexts(Relational_expressionContext.class);
		}
		public Relational_expressionContext relational_expression(int i) {
			return getRuleContext(Relational_expressionContext.class,i);
		}
		public Equality_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterEquality_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitEquality_expression(this);
		}
	}

	public final Equality_expressionContext equality_expression() throws RecognitionException {
		Equality_expressionContext _localctx = new Equality_expressionContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_equality_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			relational_expression();
			setState(604);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__62 || _la==T__63) {
				{
				{
				setState(600);
				_la = _input.LA(1);
				if ( !(_la==T__62 || _la==T__63) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(601);
				relational_expression();
				}
				}
				setState(606);
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

	public static class Relational_expressionContext extends ParserRuleContext {
		public List<Shift_expressionContext> shift_expression() {
			return getRuleContexts(Shift_expressionContext.class);
		}
		public Shift_expressionContext shift_expression(int i) {
			return getRuleContext(Shift_expressionContext.class,i);
		}
		public Relational_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterRelational_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitRelational_expression(this);
		}
	}

	public final Relational_expressionContext relational_expression() throws RecognitionException {
		Relational_expressionContext _localctx = new Relational_expressionContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_relational_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			shift_expression();
			setState(612);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1 || _la==T__2 || _la==T__64 || _la==T__65) {
				{
				{
				setState(608);
				_la = _input.LA(1);
				if ( !(_la==T__1 || _la==T__2 || _la==T__64 || _la==T__65) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(609);
				shift_expression();
				}
				}
				setState(614);
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

	public static class Shift_expressionContext extends ParserRuleContext {
		public List<Additive_expressionContext> additive_expression() {
			return getRuleContexts(Additive_expressionContext.class);
		}
		public Additive_expressionContext additive_expression(int i) {
			return getRuleContext(Additive_expressionContext.class,i);
		}
		public Shift_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterShift_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitShift_expression(this);
		}
	}

	public final Shift_expressionContext shift_expression() throws RecognitionException {
		Shift_expressionContext _localctx = new Shift_expressionContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_shift_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			additive_expression();
			setState(620);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__66 || _la==T__67) {
				{
				{
				setState(616);
				_la = _input.LA(1);
				if ( !(_la==T__66 || _la==T__67) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(617);
				additive_expression();
				}
				}
				setState(622);
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
		public Labeled_statementContext labeled_statement() {
			return getRuleContext(Labeled_statementContext.class,0);
		}
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Expression_statementContext expression_statement() {
			return getRuleContext(Expression_statementContext.class,0);
		}
		public Selection_statementContext selection_statement() {
			return getRuleContext(Selection_statementContext.class,0);
		}
		public Iteration_statementContext iteration_statement() {
			return getRuleContext(Iteration_statementContext.class,0);
		}
		public Jump_statementContext jump_statement() {
			return getRuleContext(Jump_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_statement);
		try {
			setState(629);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__68:
			case T__69:
				enterOuterAlt(_localctx, 1);
				{
				setState(623);
				labeled_statement();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				setState(624);
				compound_statement();
				}
				break;
			case T__6:
			case T__31:
			case T__33:
			case T__35:
			case T__36:
			case T__39:
			case T__40:
			case T__41:
			case T__44:
			case T__45:
			case T__46:
			case IDENTIFIER:
			case CHARACTER_LITERAL:
			case STRING_LITERAL:
			case HEX_LITERAL:
			case DECIMAL_LITERAL:
			case OCTAL_LITERAL:
			case FLOATING_POINT_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(625);
				expression_statement();
				}
				break;
			case T__70:
			case T__72:
				enterOuterAlt(_localctx, 4);
				{
				setState(626);
				selection_statement();
				}
				break;
			case T__73:
			case T__74:
			case T__75:
				enterOuterAlt(_localctx, 5);
				{
				setState(627);
				iteration_statement();
				}
				break;
			case T__76:
			case T__77:
			case T__78:
				enterOuterAlt(_localctx, 6);
				{
				setState(628);
				jump_statement();
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

	public static class Labeled_statementContext extends ParserRuleContext {
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Labeled_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeled_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterLabeled_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitLabeled_statement(this);
		}
	}

	public final Labeled_statementContext labeled_statement() throws RecognitionException {
		Labeled_statementContext _localctx = new Labeled_statementContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_labeled_statement);
		try {
			setState(639);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__68:
				enterOuterAlt(_localctx, 1);
				{
				setState(631);
				match(T__68);
				setState(632);
				constant_expression();
				setState(633);
				match(T__25);
				setState(634);
				statement();
				}
				break;
			case T__69:
				enterOuterAlt(_localctx, 2);
				{
				setState(636);
				match(T__69);
				setState(637);
				match(T__25);
				setState(638);
				statement();
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

	public static class Compound_statementContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public Compound_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterCompound_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitCompound_statement(this);
		}
	}

	public final Compound_statementContext compound_statement() throws RecognitionException {
		Compound_statementContext _localctx = new Compound_statementContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_compound_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
			match(T__22);
			setState(645);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(642);
					declaration();
					}
					} 
				}
				setState(647);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			}
			setState(649);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__22) | (1L << T__31) | (1L << T__33) | (1L << T__35) | (1L << T__36) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__44) | (1L << T__45) | (1L << T__46))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (T__68 - 69)) | (1L << (T__69 - 69)) | (1L << (T__70 - 69)) | (1L << (T__72 - 69)) | (1L << (T__73 - 69)) | (1L << (T__74 - 69)) | (1L << (T__75 - 69)) | (1L << (T__76 - 69)) | (1L << (T__77 - 69)) | (1L << (T__78 - 69)) | (1L << (IDENTIFIER - 69)) | (1L << (CHARACTER_LITERAL - 69)) | (1L << (STRING_LITERAL - 69)) | (1L << (HEX_LITERAL - 69)) | (1L << (DECIMAL_LITERAL - 69)) | (1L << (OCTAL_LITERAL - 69)) | (1L << (FLOATING_POINT_LITERAL - 69)))) != 0)) {
				{
				setState(648);
				statement_list();
				}
			}

			setState(651);
			match(T__23);
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

	public static class Statement_listContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Statement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterStatement_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitStatement_list(this);
		}
	}

	public final Statement_listContext statement_list() throws RecognitionException {
		Statement_listContext _localctx = new Statement_listContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_statement_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(653);
				statement();
				}
				}
				setState(656); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__22) | (1L << T__31) | (1L << T__33) | (1L << T__35) | (1L << T__36) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__44) | (1L << T__45) | (1L << T__46))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (T__68 - 69)) | (1L << (T__69 - 69)) | (1L << (T__70 - 69)) | (1L << (T__72 - 69)) | (1L << (T__73 - 69)) | (1L << (T__74 - 69)) | (1L << (T__75 - 69)) | (1L << (T__76 - 69)) | (1L << (T__77 - 69)) | (1L << (T__78 - 69)) | (1L << (IDENTIFIER - 69)) | (1L << (CHARACTER_LITERAL - 69)) | (1L << (STRING_LITERAL - 69)) | (1L << (HEX_LITERAL - 69)) | (1L << (DECIMAL_LITERAL - 69)) | (1L << (OCTAL_LITERAL - 69)) | (1L << (FLOATING_POINT_LITERAL - 69)))) != 0) );
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

	public static class Expression_statementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterExpression_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitExpression_statement(this);
		}
	}

	public final Expression_statementContext expression_statement() throws RecognitionException {
		Expression_statementContext _localctx = new Expression_statementContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_expression_statement);
		try {
			setState(662);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(658);
				match(T__6);
				}
				break;
			case T__31:
			case T__33:
			case T__35:
			case T__36:
			case T__39:
			case T__40:
			case T__41:
			case T__44:
			case T__45:
			case T__46:
			case IDENTIFIER:
			case CHARACTER_LITERAL:
			case STRING_LITERAL:
			case HEX_LITERAL:
			case DECIMAL_LITERAL:
			case OCTAL_LITERAL:
			case FLOATING_POINT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(659);
				expression();
				setState(660);
				match(T__6);
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

	public static class Selection_statementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Selection_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selection_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterSelection_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitSelection_statement(this);
		}
	}

	public final Selection_statementContext selection_statement() throws RecognitionException {
		Selection_statementContext _localctx = new Selection_statementContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_selection_statement);
		try {
			setState(679);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__70:
				enterOuterAlt(_localctx, 1);
				{
				setState(664);
				match(T__70);
				setState(665);
				match(T__31);
				setState(666);
				expression();
				setState(667);
				match(T__32);
				setState(668);
				statement();
				setState(671);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
				case 1:
					{
					setState(669);
					match(T__71);
					setState(670);
					statement();
					}
					break;
				}
				}
				break;
			case T__72:
				enterOuterAlt(_localctx, 2);
				{
				setState(673);
				match(T__72);
				setState(674);
				match(T__31);
				setState(675);
				expression();
				setState(676);
				match(T__32);
				setState(677);
				statement();
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

	public static class Iteration_statementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<Expression_statementContext> expression_statement() {
			return getRuleContexts(Expression_statementContext.class);
		}
		public Expression_statementContext expression_statement(int i) {
			return getRuleContext(Expression_statementContext.class,i);
		}
		public Iteration_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteration_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterIteration_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitIteration_statement(this);
		}
	}

	public final Iteration_statementContext iteration_statement() throws RecognitionException {
		Iteration_statementContext _localctx = new Iteration_statementContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_iteration_statement);
		int _la;
		try {
			setState(705);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__73:
				enterOuterAlt(_localctx, 1);
				{
				setState(681);
				match(T__73);
				setState(682);
				match(T__31);
				setState(683);
				expression();
				setState(684);
				match(T__32);
				setState(685);
				statement();
				}
				break;
			case T__74:
				enterOuterAlt(_localctx, 2);
				{
				setState(687);
				match(T__74);
				setState(688);
				statement();
				setState(689);
				match(T__73);
				setState(690);
				match(T__31);
				setState(691);
				expression();
				setState(692);
				match(T__32);
				setState(693);
				match(T__6);
				}
				break;
			case T__75:
				enterOuterAlt(_localctx, 3);
				{
				setState(695);
				match(T__75);
				setState(696);
				match(T__31);
				setState(697);
				expression_statement();
				setState(698);
				expression_statement();
				setState(700);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & ((1L << (T__31 - 32)) | (1L << (T__33 - 32)) | (1L << (T__35 - 32)) | (1L << (T__36 - 32)) | (1L << (T__39 - 32)) | (1L << (T__40 - 32)) | (1L << (T__41 - 32)) | (1L << (T__44 - 32)) | (1L << (T__45 - 32)) | (1L << (T__46 - 32)) | (1L << (IDENTIFIER - 32)) | (1L << (CHARACTER_LITERAL - 32)) | (1L << (STRING_LITERAL - 32)) | (1L << (HEX_LITERAL - 32)) | (1L << (DECIMAL_LITERAL - 32)) | (1L << (OCTAL_LITERAL - 32)) | (1L << (FLOATING_POINT_LITERAL - 32)))) != 0)) {
					{
					setState(699);
					expression();
					}
				}

				setState(702);
				match(T__32);
				setState(703);
				statement();
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

	public static class Jump_statementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Jump_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jump_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).enterJump_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C2asmListener ) ((C2asmListener)listener).exitJump_statement(this);
		}
	}

	public final Jump_statementContext jump_statement() throws RecognitionException {
		Jump_statementContext _localctx = new Jump_statementContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_jump_statement);
		try {
			setState(717);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(707);
				match(T__76);
				setState(708);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(709);
				match(T__77);
				setState(710);
				match(T__6);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(711);
				match(T__78);
				setState(712);
				match(T__6);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(713);
				match(T__78);
				setState(714);
				expression();
				setState(715);
				match(T__6);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3[\u02d2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\3\2\7\2\u0094\n\2\f\2\16\2\u0097\13\2\3\2\6\2\u009a\n\2\r\2\16\2\u009b"+
		"\3\3\3\3\5\3\u00a0\n\3\3\4\3\4\3\4\3\4\3\5\3\5\5\5\u00a8\n\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00b3\n\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\5\t\u00be\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\6"+
		"\f\u00cb\n\f\r\f\16\f\u00cc\3\r\3\r\3\r\7\r\u00d2\n\r\f\r\16\r\u00d5\13"+
		"\r\3\16\3\16\3\16\5\16\u00da\n\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00ea\n\20\3\21\3\21\5\21\u00ee"+
		"\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00f7\n\21\3\22\3\22\3\23"+
		"\6\23\u00fc\n\23\r\23\16\23\u00fd\3\24\3\24\3\24\3\24\3\25\3\25\6\25\u0106"+
		"\n\25\r\25\16\25\u0107\3\26\3\26\3\26\7\26\u010d\n\26\f\26\16\26\u0110"+
		"\13\26\3\27\3\27\3\27\5\27\u0115\n\27\3\27\3\27\5\27\u0119\n\27\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0128"+
		"\n\30\3\31\3\31\3\31\7\31\u012d\n\31\f\31\16\31\u0130\13\31\3\32\3\32"+
		"\3\32\5\32\u0135\n\32\3\33\3\33\3\34\5\34\u013a\n\34\3\34\3\34\5\34\u013e"+
		"\n\34\3\35\3\35\7\35\u0142\n\35\f\35\16\35\u0145\13\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\5\36\u014d\n\36\3\37\3\37\3\37\7\37\u0152\n\37\f\37\16"+
		"\37\u0155\13\37\3\37\3\37\3 \3 \6 \u015b\n \r \16 \u015c\3 \5 \u0160\n"+
		" \3 \3 \3 \5 \u0165\n \3!\3!\3!\5!\u016a\n!\3\"\3\"\3\"\7\"\u016f\n\""+
		"\f\"\16\"\u0172\13\"\3#\3#\3#\7#\u0177\n#\f#\16#\u017a\13#\3$\3$\3$\7"+
		"$\u017f\n$\f$\16$\u0182\13$\3%\3%\5%\u0186\n%\3&\3&\5&\u018a\n&\3&\5&"+
		"\u018d\n&\3\'\3\'\3\'\3\'\3\'\5\'\u0194\n\'\3\'\7\'\u0197\n\'\f\'\16\'"+
		"\u019a\13\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u01a8\n(\3)\3)\3)\3"+
		")\5)\u01ae\n)\3)\3)\5)\u01b2\n)\3*\3*\3*\7*\u01b7\n*\f*\16*\u01ba\13*"+
		"\3+\3+\3+\7+\u01bf\n+\f+\16+\u01c2\13+\3,\3,\3,\3,\3,\7,\u01c9\n,\f,\16"+
		",\u01cc\13,\3-\3-\3-\3-\3-\3-\3-\7-\u01d5\n-\f-\16-\u01d8\13-\3.\3.\3"+
		".\3.\3.\3.\5.\u01e0\n.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5"+
		"/\u01f1\n/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\7\60\u0204\n\60\f\60\16\60\u0207\13\60\3\61"+
		"\3\61\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u0211\n\62\3\63\3\63\3\64\3\64"+
		"\3\64\7\64\u0218\n\64\f\64\16\64\u021b\13\64\3\65\3\65\3\66\3\66\3\66"+
		"\3\66\3\66\5\66\u0224\n\66\3\67\3\67\38\38\39\39\39\39\39\39\59\u0230"+
		"\n9\3:\3:\3:\7:\u0235\n:\f:\16:\u0238\13:\3;\3;\3;\7;\u023d\n;\f;\16;"+
		"\u0240\13;\3<\3<\3<\7<\u0245\n<\f<\16<\u0248\13<\3=\3=\3=\7=\u024d\n="+
		"\f=\16=\u0250\13=\3>\3>\3>\7>\u0255\n>\f>\16>\u0258\13>\3?\3?\3?\7?\u025d"+
		"\n?\f?\16?\u0260\13?\3@\3@\3@\7@\u0265\n@\f@\16@\u0268\13@\3A\3A\3A\7"+
		"A\u026d\nA\fA\16A\u0270\13A\3B\3B\3B\3B\3B\3B\5B\u0278\nB\3C\3C\3C\3C"+
		"\3C\3C\3C\3C\5C\u0282\nC\3D\3D\7D\u0286\nD\fD\16D\u0289\13D\3D\5D\u028c"+
		"\nD\3D\3D\3E\6E\u0291\nE\rE\16E\u0292\3F\3F\3F\3F\5F\u0299\nF\3G\3G\3"+
		"G\3G\3G\3G\3G\5G\u02a2\nG\3G\3G\3G\3G\3G\3G\5G\u02aa\nG\3H\3H\3H\3H\3"+
		"H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\5H\u02bf\nH\3H\3H\3H\5H\u02c4"+
		"\nH\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\5I\u02d0\nI\3I\2\2J\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhj"+
		"lnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\2\n\3"+
		"\2\f\17\3\2\36\37\5\2$$&\'/\61\3\2SX\4\2\13\13\62;\3\2AB\4\2\4\5CD\3\2"+
		"EF\2\u02f6\2\u0095\3\2\2\2\4\u009f\3\2\2\2\6\u00a1\3\2\2\2\b\u00a7\3\2"+
		"\2\2\n\u00a9\3\2\2\2\f\u00b4\3\2\2\2\16\u00b7\3\2\2\2\20\u00bd\3\2\2\2"+
		"\22\u00bf\3\2\2\2\24\u00c3\3\2\2\2\26\u00ca\3\2\2\2\30\u00ce\3\2\2\2\32"+
		"\u00d6\3\2\2\2\34\u00db\3\2\2\2\36\u00e9\3\2\2\2 \u00f6\3\2\2\2\"\u00f8"+
		"\3\2\2\2$\u00fb\3\2\2\2&\u00ff\3\2\2\2(\u0105\3\2\2\2*\u0109\3\2\2\2,"+
		"\u0118\3\2\2\2.\u0127\3\2\2\2\60\u0129\3\2\2\2\62\u0131\3\2\2\2\64\u0136"+
		"\3\2\2\2\66\u013d\3\2\2\28\u013f\3\2\2\2:\u014c\3\2\2\2<\u014e\3\2\2\2"+
		">\u0164\3\2\2\2@\u0166\3\2\2\2B\u016b\3\2\2\2D\u0173\3\2\2\2F\u017b\3"+
		"\2\2\2H\u0183\3\2\2\2J\u018c\3\2\2\2L\u0193\3\2\2\2N\u01a7\3\2\2\2P\u01b1"+
		"\3\2\2\2R\u01b3\3\2\2\2T\u01bb\3\2\2\2V\u01c3\3\2\2\2X\u01cd\3\2\2\2Z"+
		"\u01df\3\2\2\2\\\u01f0\3\2\2\2^\u01f2\3\2\2\2`\u0208\3\2\2\2b\u0210\3"+
		"\2\2\2d\u0212\3\2\2\2f\u0214\3\2\2\2h\u021c\3\2\2\2j\u0223\3\2\2\2l\u0225"+
		"\3\2\2\2n\u0227\3\2\2\2p\u0229\3\2\2\2r\u0231\3\2\2\2t\u0239\3\2\2\2v"+
		"\u0241\3\2\2\2x\u0249\3\2\2\2z\u0251\3\2\2\2|\u0259\3\2\2\2~\u0261\3\2"+
		"\2\2\u0080\u0269\3\2\2\2\u0082\u0277\3\2\2\2\u0084\u0281\3\2\2\2\u0086"+
		"\u0283\3\2\2\2\u0088\u0290\3\2\2\2\u008a\u0298\3\2\2\2\u008c\u02a9\3\2"+
		"\2\2\u008e\u02c3\3\2\2\2\u0090\u02cf\3\2\2\2\u0092\u0094\5\b\5\2\u0093"+
		"\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u009a\5\4\3\2\u0099"+
		"\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2"+
		"\2\2\u009c\3\3\2\2\2\u009d\u00a0\5\20\t\2\u009e\u00a0\5\6\4\2\u009f\u009d"+
		"\3\2\2\2\u009f\u009e\3\2\2\2\u00a0\5\3\2\2\2\u00a1\u00a2\5\26\f\2\u00a2"+
		"\u00a3\5<\37\2\u00a3\u00a4\5\u0086D\2\u00a4\7\3\2\2\2\u00a5\u00a8\5\n"+
		"\6\2\u00a6\u00a8\5\16\b\2\u00a7\u00a5\3\2\2\2\u00a7\u00a6\3\2\2\2\u00a8"+
		"\t\3\2\2\2\u00a9\u00b2\7\3\2\2\u00aa\u00ab\7\4\2\2\u00ab\u00ac\5\f\7\2"+
		"\u00ac\u00ad\7\5\2\2\u00ad\u00b3\3\2\2\2\u00ae\u00af\7\6\2\2\u00af\u00b0"+
		"\5\f\7\2\u00b0\u00b1\7\6\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00aa\3\2\2\2\u00b2"+
		"\u00ae\3\2\2\2\u00b3\13\3\2\2\2\u00b4\u00b5\7R\2\2\u00b5\u00b6\7\7\2\2"+
		"\u00b6\r\3\2\2\2\u00b7\u00b8\7\b\2\2\u00b8\u00b9\7R\2\2\u00b9\u00ba\7"+
		"V\2\2\u00ba\17\3\2\2\2\u00bb\u00be\5\24\13\2\u00bc\u00be\5\22\n\2\u00bd"+
		"\u00bb\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be\21\3\2\2\2\u00bf\u00c0\5\26\f"+
		"\2\u00c0\u00c1\5<\37\2\u00c1\u00c2\7\t\2\2\u00c2\23\3\2\2\2\u00c3\u00c4"+
		"\5\26\f\2\u00c4\u00c5\5\30\r\2\u00c5\u00c6\7\t\2\2\u00c6\25\3\2\2\2\u00c7"+
		"\u00cb\5\34\17\2\u00c8\u00cb\5\36\20\2\u00c9\u00cb\5\64\33\2\u00ca\u00c7"+
		"\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\27\3\2\2\2\u00ce\u00d3\5\32\16"+
		"\2\u00cf\u00d0\7\n\2\2\u00d0\u00d2\5\32\16\2\u00d1\u00cf\3\2\2\2\u00d2"+
		"\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\31\3\2\2"+
		"\2\u00d5\u00d3\3\2\2\2\u00d6\u00d9\5\66\34\2\u00d7\u00d8\7\13\2\2\u00d8"+
		"\u00da\5P)\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\33\3\2\2\2"+
		"\u00db\u00dc\t\2\2\2\u00dc\35\3\2\2\2\u00dd\u00ea\7\20\2\2\u00de\u00ea"+
		"\7\21\2\2\u00df\u00ea\7\22\2\2\u00e0\u00ea\7\23\2\2\u00e1\u00ea\7\24\2"+
		"\2\u00e2\u00ea\7\25\2\2\u00e3\u00ea\7\26\2\2\u00e4\u00ea\7\27\2\2\u00e5"+
		"\u00ea\7\30\2\2\u00e6\u00ea\5 \21\2\u00e7\u00ea\5.\30\2\u00e8\u00ea\7"+
		"R\2\2\u00e9\u00dd\3\2\2\2\u00e9\u00de\3\2\2\2\u00e9\u00df\3\2\2\2\u00e9"+
		"\u00e0\3\2\2\2\u00e9\u00e1\3\2\2\2\u00e9\u00e2\3\2\2\2\u00e9\u00e3\3\2"+
		"\2\2\u00e9\u00e4\3\2\2\2\u00e9\u00e5\3\2\2\2\u00e9\u00e6\3\2\2\2\u00e9"+
		"\u00e7\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea\37\3\2\2\2\u00eb\u00ed\5\"\22"+
		"\2\u00ec\u00ee\7R\2\2\u00ed\u00ec\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef"+
		"\3\2\2\2\u00ef\u00f0\7\31\2\2\u00f0\u00f1\5$\23\2\u00f1\u00f2\7\32\2\2"+
		"\u00f2\u00f7\3\2\2\2\u00f3\u00f4\5\"\22\2\u00f4\u00f5\7R\2\2\u00f5\u00f7"+
		"\3\2\2\2\u00f6\u00eb\3\2\2\2\u00f6\u00f3\3\2\2\2\u00f7!\3\2\2\2\u00f8"+
		"\u00f9\7\33\2\2\u00f9#\3\2\2\2\u00fa\u00fc\5&\24\2\u00fb\u00fa\3\2\2\2"+
		"\u00fc\u00fd\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe%\3"+
		"\2\2\2\u00ff\u0100\5(\25\2\u0100\u0101\5*\26\2\u0101\u0102\7\t\2\2\u0102"+
		"\'\3\2\2\2\u0103\u0106\5\64\33\2\u0104\u0106\5\36\20\2\u0105\u0103\3\2"+
		"\2\2\u0105\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0105\3\2\2\2\u0107"+
		"\u0108\3\2\2\2\u0108)\3\2\2\2\u0109\u010e\5,\27\2\u010a\u010b\7\n\2\2"+
		"\u010b\u010d\5,\27\2\u010c\u010a\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c"+
		"\3\2\2\2\u010e\u010f\3\2\2\2\u010f+\3\2\2\2\u0110\u010e\3\2\2\2\u0111"+
		"\u0114\5\66\34\2\u0112\u0113\7\34\2\2\u0113\u0115\5h\65\2\u0114\u0112"+
		"\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0119\3\2\2\2\u0116\u0117\7\34\2\2"+
		"\u0117\u0119\5h\65\2\u0118\u0111\3\2\2\2\u0118\u0116\3\2\2\2\u0119-\3"+
		"\2\2\2\u011a\u011b\7\35\2\2\u011b\u011c\7\31\2\2\u011c\u011d\5\60\31\2"+
		"\u011d\u011e\7\32\2\2\u011e\u0128\3\2\2\2\u011f\u0120\7\35\2\2\u0120\u0121"+
		"\7R\2\2\u0121\u0122\7\31\2\2\u0122\u0123\5\60\31\2\u0123\u0124\7\32\2"+
		"\2\u0124\u0128\3\2\2\2\u0125\u0126\7\35\2\2\u0126\u0128\7R\2\2\u0127\u011a"+
		"\3\2\2\2\u0127\u011f\3\2\2\2\u0127\u0125\3\2\2\2\u0128/\3\2\2\2\u0129"+
		"\u012e\5\62\32\2\u012a\u012b\7\n\2\2\u012b\u012d\5\62\32\2\u012c\u012a"+
		"\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f"+
		"\61\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0134\7R\2\2\u0132\u0133\7\13\2"+
		"\2\u0133\u0135\5h\65\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\63"+
		"\3\2\2\2\u0136\u0137\t\3\2\2\u0137\65\3\2\2\2\u0138\u013a\5> \2\u0139"+
		"\u0138\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013e\58"+
		"\35\2\u013c\u013e\5> \2\u013d\u0139\3\2\2\2\u013d\u013c\3\2\2\2\u013e"+
		"\67\3\2\2\2\u013f\u0143\7R\2\2\u0140\u0142\5:\36\2\u0141\u0140\3\2\2\2"+
		"\u0142\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u01449\3"+
		"\2\2\2\u0145\u0143\3\2\2\2\u0146\u0147\7 \2\2\u0147\u0148\5h\65\2\u0148"+
		"\u0149\7!\2\2\u0149\u014d\3\2\2\2\u014a\u014b\7 \2\2\u014b\u014d\7!\2"+
		"\2\u014c\u0146\3\2\2\2\u014c\u014a\3\2\2\2\u014d;\3\2\2\2\u014e\u014f"+
		"\7R\2\2\u014f\u0153\7\"\2\2\u0150\u0152\5@!\2\u0151\u0150\3\2\2\2\u0152"+
		"\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0156\3\2"+
		"\2\2\u0155\u0153\3\2\2\2\u0156\u0157\7#\2\2\u0157=\3\2\2\2\u0158\u015a"+
		"\7$\2\2\u0159\u015b\5\64\33\2\u015a\u0159\3\2\2\2\u015b\u015c\3\2\2\2"+
		"\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015f\3\2\2\2\u015e\u0160"+
		"\5> \2\u015f\u015e\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0165\3\2\2\2\u0161"+
		"\u0162\7$\2\2\u0162\u0165\5> \2\u0163\u0165\7$\2\2\u0164\u0158\3\2\2\2"+
		"\u0164\u0161\3\2\2\2\u0164\u0163\3\2\2\2\u0165?\3\2\2\2\u0166\u0169\5"+
		"B\"\2\u0167\u0168\7\n\2\2\u0168\u016a\7%\2\2\u0169\u0167\3\2\2\2\u0169"+
		"\u016a\3\2\2\2\u016aA\3\2\2\2\u016b\u0170\5D#\2\u016c\u016d\7\n\2\2\u016d"+
		"\u016f\5D#\2\u016e\u016c\3\2\2\2\u016f\u0172\3\2\2\2\u0170\u016e\3\2\2"+
		"\2\u0170\u0171\3\2\2\2\u0171C\3\2\2\2\u0172\u0170\3\2\2\2\u0173\u0178"+
		"\5\26\f\2\u0174\u0177\5\66\34\2\u0175\u0177\5J&\2\u0176\u0174\3\2\2\2"+
		"\u0176\u0175\3\2\2\2\u0177\u017a\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0179"+
		"\3\2\2\2\u0179E\3\2\2\2\u017a\u0178\3\2\2\2\u017b\u0180\7R\2\2\u017c\u017d"+
		"\7\n\2\2\u017d\u017f\7R\2\2\u017e\u017c\3\2\2\2\u017f\u0182\3\2\2\2\u0180"+
		"\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181G\3\2\2\2\u0182\u0180\3\2\2\2"+
		"\u0183\u0185\5(\25\2\u0184\u0186\5J&\2\u0185\u0184\3\2\2\2\u0185\u0186"+
		"\3\2\2\2\u0186I\3\2\2\2\u0187\u0189\5> \2\u0188\u018a\5L\'\2\u0189\u0188"+
		"\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018d\3\2\2\2\u018b\u018d\5L\'\2\u018c"+
		"\u0187\3\2\2\2\u018c\u018b\3\2\2\2\u018dK\3\2\2\2\u018e\u018f\7\"\2\2"+
		"\u018f\u0190\5J&\2\u0190\u0191\7#\2\2\u0191\u0194\3\2\2\2\u0192\u0194"+
		"\5N(\2\u0193\u018e\3\2\2\2\u0193\u0192\3\2\2\2\u0194\u0198\3\2\2\2\u0195"+
		"\u0197\5N(\2\u0196\u0195\3\2\2\2\u0197\u019a\3\2\2\2\u0198\u0196\3\2\2"+
		"\2\u0198\u0199\3\2\2\2\u0199M\3\2\2\2\u019a\u0198\3\2\2\2\u019b\u019c"+
		"\7 \2\2\u019c\u01a8\7!\2\2\u019d\u019e\7 \2\2\u019e\u019f\5h\65\2\u019f"+
		"\u01a0\7!\2\2\u01a0\u01a8\3\2\2\2\u01a1\u01a2\7\"\2\2\u01a2\u01a8\7#\2"+
		"\2\u01a3\u01a4\7\"\2\2\u01a4\u01a5\5@!\2\u01a5\u01a6\7#\2\2\u01a6\u01a8"+
		"\3\2\2\2\u01a7\u019b\3\2\2\2\u01a7\u019d\3\2\2\2\u01a7\u01a1\3\2\2\2\u01a7"+
		"\u01a3\3\2\2\2\u01a8O\3\2\2\2\u01a9\u01b2\5j\66\2\u01aa\u01ab\7\31\2\2"+
		"\u01ab\u01ad\5R*\2\u01ac\u01ae\7\n\2\2\u01ad\u01ac\3\2\2\2\u01ad\u01ae"+
		"\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b0\7\32\2\2\u01b0\u01b2\3\2\2\2"+
		"\u01b1\u01a9\3\2\2\2\u01b1\u01aa\3\2\2\2\u01b2Q\3\2\2\2\u01b3\u01b8\5"+
		"P)\2\u01b4\u01b5\7\n\2\2\u01b5\u01b7\5P)\2\u01b6\u01b4\3\2\2\2\u01b7\u01ba"+
		"\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9S\3\2\2\2\u01ba"+
		"\u01b8\3\2\2\2\u01bb\u01c0\5j\66\2\u01bc\u01bd\7\n\2\2\u01bd\u01bf\5j"+
		"\66\2\u01be\u01bc\3\2\2\2\u01bf\u01c2\3\2\2\2\u01c0\u01be\3\2\2\2\u01c0"+
		"\u01c1\3\2\2\2\u01c1U\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c3\u01ca\5X-\2\u01c4"+
		"\u01c5\7&\2\2\u01c5\u01c9\5X-\2\u01c6\u01c7\7\'\2\2\u01c7\u01c9\5X-\2"+
		"\u01c8\u01c4\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c9\u01cc\3\2\2\2\u01ca\u01c8"+
		"\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cbW\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cd"+
		"\u01d6\5Z.\2\u01ce\u01cf\7$\2\2\u01cf\u01d5\5Z.\2\u01d0\u01d1\7(\2\2\u01d1"+
		"\u01d5\5Z.\2\u01d2\u01d3\7)\2\2\u01d3\u01d5\5Z.\2\u01d4\u01ce\3\2\2\2"+
		"\u01d4\u01d0\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d5\u01d8\3\2\2\2\u01d6\u01d4"+
		"\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7Y\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d9"+
		"\u01da\7\"\2\2\u01da\u01db\5H%\2\u01db\u01dc\7#\2\2\u01dc\u01dd\5Z.\2"+
		"\u01dd\u01e0\3\2\2\2\u01de\u01e0\5\\/\2\u01df\u01d9\3\2\2\2\u01df\u01de"+
		"\3\2\2\2\u01e0[\3\2\2\2\u01e1\u01f1\5^\60\2\u01e2\u01e3\7*\2\2\u01e3\u01f1"+
		"\5\\/\2\u01e4\u01e5\7+\2\2\u01e5\u01f1\5\\/\2\u01e6\u01e7\5`\61\2\u01e7"+
		"\u01e8\5Z.\2\u01e8\u01f1\3\2\2\2\u01e9\u01ea\7,\2\2\u01ea\u01f1\5\\/\2"+
		"\u01eb\u01ec\7,\2\2\u01ec\u01ed\7\"\2\2\u01ed\u01ee\5H%\2\u01ee\u01ef"+
		"\7#\2\2\u01ef\u01f1\3\2\2\2\u01f0\u01e1\3\2\2\2\u01f0\u01e2\3\2\2\2\u01f0"+
		"\u01e4\3\2\2\2\u01f0\u01e6\3\2\2\2\u01f0\u01e9\3\2\2\2\u01f0\u01eb\3\2"+
		"\2\2\u01f1]\3\2\2\2\u01f2\u0205\5b\62\2\u01f3\u01f4\7 \2\2\u01f4\u01f5"+
		"\5f\64\2\u01f5\u01f6\7!\2\2\u01f6\u0204\3\2\2\2\u01f7\u01f8\7\"\2\2\u01f8"+
		"\u0204\7#\2\2\u01f9\u01fa\7\"\2\2\u01fa\u01fb\5T+\2\u01fb\u01fc\7#\2\2"+
		"\u01fc\u0204\3\2\2\2\u01fd\u01fe\7-\2\2\u01fe\u0204\7R\2\2\u01ff\u0200"+
		"\7.\2\2\u0200\u0204\7R\2\2\u0201\u0204\7*\2\2\u0202\u0204\7+\2\2\u0203"+
		"\u01f3\3\2\2\2\u0203\u01f7\3\2\2\2\u0203\u01f9\3\2\2\2\u0203\u01fd\3\2"+
		"\2\2\u0203\u01ff\3\2\2\2\u0203\u0201\3\2\2\2\u0203\u0202\3\2\2\2\u0204"+
		"\u0207\3\2\2\2\u0205\u0203\3\2\2\2\u0205\u0206\3\2\2\2\u0206_\3\2\2\2"+
		"\u0207\u0205\3\2\2\2\u0208\u0209\t\4\2\2\u0209a\3\2\2\2\u020a\u0211\7"+
		"R\2\2\u020b\u0211\5d\63\2\u020c\u020d\7\"\2\2\u020d\u020e\5f\64\2\u020e"+
		"\u020f\7#\2\2\u020f\u0211\3\2\2\2\u0210\u020a\3\2\2\2\u0210\u020b\3\2"+
		"\2\2\u0210\u020c\3\2\2\2\u0211c\3\2\2\2\u0212\u0213\t\5\2\2\u0213e\3\2"+
		"\2\2\u0214\u0219\5j\66\2\u0215\u0216\7\n\2\2\u0216\u0218\5j\66\2\u0217"+
		"\u0215\3\2\2\2\u0218\u021b\3\2\2\2\u0219\u0217\3\2\2\2\u0219\u021a\3\2"+
		"\2\2\u021ag\3\2\2\2\u021b\u0219\3\2\2\2\u021c\u021d\5p9\2\u021di\3\2\2"+
		"\2\u021e\u021f\5l\67\2\u021f\u0220\5n8\2\u0220\u0221\5j\66\2\u0221\u0224"+
		"\3\2\2\2\u0222\u0224\5p9\2\u0223\u021e\3\2\2\2\u0223\u0222\3\2\2\2\u0224"+
		"k\3\2\2\2\u0225\u0226\5\\/\2\u0226m\3\2\2\2\u0227\u0228\t\6\2\2\u0228"+
		"o\3\2\2\2\u0229\u022f\5r:\2\u022a\u022b\7<\2\2\u022b\u022c\5f\64\2\u022c"+
		"\u022d\7\34\2\2\u022d\u022e\5p9\2\u022e\u0230\3\2\2\2\u022f\u022a\3\2"+
		"\2\2\u022f\u0230\3\2\2\2\u0230q\3\2\2\2\u0231\u0236\5t;\2\u0232\u0233"+
		"\7=\2\2\u0233\u0235\5t;\2\u0234\u0232\3\2\2\2\u0235\u0238\3\2\2\2\u0236"+
		"\u0234\3\2\2\2\u0236\u0237\3\2\2\2\u0237s\3\2\2\2\u0238\u0236\3\2\2\2"+
		"\u0239\u023e\5v<\2\u023a\u023b\7>\2\2\u023b\u023d\5v<\2\u023c\u023a\3"+
		"\2\2\2\u023d\u0240\3\2\2\2\u023e\u023c\3\2\2\2\u023e\u023f\3\2\2\2\u023f"+
		"u\3\2\2\2\u0240\u023e\3\2\2\2\u0241\u0246\5x=\2\u0242\u0243\7?\2\2\u0243"+
		"\u0245\5x=\2\u0244\u0242\3\2\2\2\u0245\u0248\3\2\2\2\u0246\u0244\3\2\2"+
		"\2\u0246\u0247\3\2\2\2\u0247w\3\2\2\2\u0248\u0246\3\2\2\2\u0249\u024e"+
		"\5z>\2\u024a\u024b\7@\2\2\u024b\u024d\5z>\2\u024c\u024a\3\2\2\2\u024d"+
		"\u0250\3\2\2\2\u024e\u024c\3\2\2\2\u024e\u024f\3\2\2\2\u024fy\3\2\2\2"+
		"\u0250\u024e\3\2\2\2\u0251\u0256\5|?\2\u0252\u0253\7/\2\2\u0253\u0255"+
		"\5|?\2\u0254\u0252\3\2\2\2\u0255\u0258\3\2\2\2\u0256\u0254\3\2\2\2\u0256"+
		"\u0257\3\2\2\2\u0257{\3\2\2\2\u0258\u0256\3\2\2\2\u0259\u025e\5~@\2\u025a"+
		"\u025b\t\7\2\2\u025b\u025d\5~@\2\u025c\u025a\3\2\2\2\u025d\u0260\3\2\2"+
		"\2\u025e\u025c\3\2\2\2\u025e\u025f\3\2\2\2\u025f}\3\2\2\2\u0260\u025e"+
		"\3\2\2\2\u0261\u0266\5\u0080A\2\u0262\u0263\t\b\2\2\u0263\u0265\5\u0080"+
		"A\2\u0264\u0262\3\2\2\2\u0265\u0268\3\2\2\2\u0266\u0264\3\2\2\2\u0266"+
		"\u0267\3\2\2\2\u0267\177\3\2\2\2\u0268\u0266\3\2\2\2\u0269\u026e\5V,\2"+
		"\u026a\u026b\t\t\2\2\u026b\u026d\5V,\2\u026c\u026a\3\2\2\2\u026d\u0270"+
		"\3\2\2\2\u026e\u026c\3\2\2\2\u026e\u026f\3\2\2\2\u026f\u0081\3\2\2\2\u0270"+
		"\u026e\3\2\2\2\u0271\u0278\5\u0084C\2\u0272\u0278\5\u0086D\2\u0273\u0278"+
		"\5\u008aF\2\u0274\u0278\5\u008cG\2\u0275\u0278\5\u008eH\2\u0276\u0278"+
		"\5\u0090I\2\u0277\u0271\3\2\2\2\u0277\u0272\3\2\2\2\u0277\u0273\3\2\2"+
		"\2\u0277\u0274\3\2\2\2\u0277\u0275\3\2\2\2\u0277\u0276\3\2\2\2\u0278\u0083"+
		"\3\2\2\2\u0279\u027a\7G\2\2\u027a\u027b\5h\65\2\u027b\u027c\7\34\2\2\u027c"+
		"\u027d\5\u0082B\2\u027d\u0282\3\2\2\2\u027e\u027f\7H\2\2\u027f\u0280\7"+
		"\34\2\2\u0280\u0282\5\u0082B\2\u0281\u0279\3\2\2\2\u0281\u027e\3\2\2\2"+
		"\u0282\u0085\3\2\2\2\u0283\u0287\7\31\2\2\u0284\u0286\5\20\t\2\u0285\u0284"+
		"\3\2\2\2\u0286\u0289\3\2\2\2\u0287\u0285\3\2\2\2\u0287\u0288\3\2\2\2\u0288"+
		"\u028b\3\2\2\2\u0289\u0287\3\2\2\2\u028a\u028c\5\u0088E\2\u028b\u028a"+
		"\3\2\2\2\u028b\u028c\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u028e\7\32\2\2"+
		"\u028e\u0087\3\2\2\2\u028f\u0291\5\u0082B\2\u0290\u028f\3\2\2\2\u0291"+
		"\u0292\3\2\2\2\u0292\u0290\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0089\3\2"+
		"\2\2\u0294\u0299\7\t\2\2\u0295\u0296\5f\64\2\u0296\u0297\7\t\2\2\u0297"+
		"\u0299\3\2\2\2\u0298\u0294\3\2\2\2\u0298\u0295\3\2\2\2\u0299\u008b\3\2"+
		"\2\2\u029a\u029b\7I\2\2\u029b\u029c\7\"\2\2\u029c\u029d\5f\64\2\u029d"+
		"\u029e\7#\2\2\u029e\u02a1\5\u0082B\2\u029f\u02a0\7J\2\2\u02a0\u02a2\5"+
		"\u0082B\2\u02a1\u029f\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02aa\3\2\2\2"+
		"\u02a3\u02a4\7K\2\2\u02a4\u02a5\7\"\2\2\u02a5\u02a6\5f\64\2\u02a6\u02a7"+
		"\7#\2\2\u02a7\u02a8\5\u0082B\2\u02a8\u02aa\3\2\2\2\u02a9\u029a\3\2\2\2"+
		"\u02a9\u02a3\3\2\2\2\u02aa\u008d\3\2\2\2\u02ab\u02ac\7L\2\2\u02ac\u02ad"+
		"\7\"\2\2\u02ad\u02ae\5f\64\2\u02ae\u02af\7#\2\2\u02af\u02b0\5\u0082B\2"+
		"\u02b0\u02c4\3\2\2\2\u02b1\u02b2\7M\2\2\u02b2\u02b3\5\u0082B\2\u02b3\u02b4"+
		"\7L\2\2\u02b4\u02b5\7\"\2\2\u02b5\u02b6\5f\64\2\u02b6\u02b7\7#\2\2\u02b7"+
		"\u02b8\7\t\2\2\u02b8\u02c4\3\2\2\2\u02b9\u02ba\7N\2\2\u02ba\u02bb\7\""+
		"\2\2\u02bb\u02bc\5\u008aF\2\u02bc\u02be\5\u008aF\2\u02bd\u02bf\5f\64\2"+
		"\u02be\u02bd\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02c1"+
		"\7#\2\2\u02c1\u02c2\5\u0082B\2\u02c2\u02c4\3\2\2\2\u02c3\u02ab\3\2\2\2"+
		"\u02c3\u02b1\3\2\2\2\u02c3\u02b9\3\2\2\2\u02c4\u008f\3\2\2\2\u02c5\u02c6"+
		"\7O\2\2\u02c6\u02d0\7\t\2\2\u02c7\u02c8\7P\2\2\u02c8\u02d0\7\t\2\2\u02c9"+
		"\u02ca\7Q\2\2\u02ca\u02d0\7\t\2\2\u02cb\u02cc\7Q\2\2\u02cc\u02cd\5f\64"+
		"\2\u02cd\u02ce\7\t\2\2\u02ce\u02d0\3\2\2\2\u02cf\u02c5\3\2\2\2\u02cf\u02c7"+
		"\3\2\2\2\u02cf\u02c9\3\2\2\2\u02cf\u02cb\3\2\2\2\u02d0\u0091\3\2\2\2N"+
		"\u0095\u009b\u009f\u00a7\u00b2\u00bd\u00ca\u00cc\u00d3\u00d9\u00e9\u00ed"+
		"\u00f6\u00fd\u0105\u0107\u010e\u0114\u0118\u0127\u012e\u0134\u0139\u013d"+
		"\u0143\u014c\u0153\u015c\u015f\u0164\u0169\u0170\u0176\u0178\u0180\u0185"+
		"\u0189\u018c\u0193\u0198\u01a7\u01ad\u01b1\u01b8\u01c0\u01c8\u01ca\u01d4"+
		"\u01d6\u01df\u01f0\u0203\u0205\u0210\u0219\u0223\u022f\u0236\u023e\u0246"+
		"\u024e\u0256\u025e\u0266\u026e\u0277\u0281\u0287\u028b\u0292\u0298\u02a1"+
		"\u02a9\u02be\u02c3\u02cf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}