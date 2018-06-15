// Generated from C:/Users/Jarek/IdeaProjects/C2AsmCompiler\C2asm.g4 by ANTLR 4.7

package com.perez.jaroslav.compiler.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link C2asmParser}.
 */
public interface C2asmListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link C2asmParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(C2asmParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(C2asmParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#external_declaration}.
	 * @param ctx the parse tree
	 */
	void enterExternal_declaration(C2asmParser.External_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#external_declaration}.
	 * @param ctx the parse tree
	 */
	void exitExternal_declaration(C2asmParser.External_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition(C2asmParser.Function_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition(C2asmParser.Function_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#preprocessor_directive}.
	 * @param ctx the parse tree
	 */
	void enterPreprocessor_directive(C2asmParser.Preprocessor_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#preprocessor_directive}.
	 * @param ctx the parse tree
	 */
	void exitPreprocessor_directive(C2asmParser.Preprocessor_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#include}.
	 * @param ctx the parse tree
	 */
	void enterInclude(C2asmParser.IncludeContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#include}.
	 * @param ctx the parse tree
	 */
	void exitInclude(C2asmParser.IncludeContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#header_file}.
	 * @param ctx the parse tree
	 */
	void enterHeader_file(C2asmParser.Header_fileContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#header_file}.
	 * @param ctx the parse tree
	 */
	void exitHeader_file(C2asmParser.Header_fileContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#define}.
	 * @param ctx the parse tree
	 */
	void enterDefine(C2asmParser.DefineContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#define}.
	 * @param ctx the parse tree
	 */
	void exitDefine(C2asmParser.DefineContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(C2asmParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(C2asmParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(C2asmParser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(C2asmParser.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(C2asmParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(C2asmParser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#declaration_specifiers}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_specifiers(C2asmParser.Declaration_specifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#declaration_specifiers}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_specifiers(C2asmParser.Declaration_specifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#variable_init_declarator_list}.
	 * @param ctx the parse tree
	 */
	void enterVariable_init_declarator_list(C2asmParser.Variable_init_declarator_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#variable_init_declarator_list}.
	 * @param ctx the parse tree
	 */
	void exitVariable_init_declarator_list(C2asmParser.Variable_init_declarator_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#init_declarator}.
	 * @param ctx the parse tree
	 */
	void enterInit_declarator(C2asmParser.Init_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#init_declarator}.
	 * @param ctx the parse tree
	 */
	void exitInit_declarator(C2asmParser.Init_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#storage_class_specifier}.
	 * @param ctx the parse tree
	 */
	void enterStorage_class_specifier(C2asmParser.Storage_class_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#storage_class_specifier}.
	 * @param ctx the parse tree
	 */
	void exitStorage_class_specifier(C2asmParser.Storage_class_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#type_specifier}.
	 * @param ctx the parse tree
	 */
	void enterType_specifier(C2asmParser.Type_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#type_specifier}.
	 * @param ctx the parse tree
	 */
	void exitType_specifier(C2asmParser.Type_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#struct_specifier}.
	 * @param ctx the parse tree
	 */
	void enterStruct_specifier(C2asmParser.Struct_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#struct_specifier}.
	 * @param ctx the parse tree
	 */
	void exitStruct_specifier(C2asmParser.Struct_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#struct}.
	 * @param ctx the parse tree
	 */
	void enterStruct(C2asmParser.StructContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#struct}.
	 * @param ctx the parse tree
	 */
	void exitStruct(C2asmParser.StructContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#struct_declaration_list}.
	 * @param ctx the parse tree
	 */
	void enterStruct_declaration_list(C2asmParser.Struct_declaration_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#struct_declaration_list}.
	 * @param ctx the parse tree
	 */
	void exitStruct_declaration_list(C2asmParser.Struct_declaration_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#struct_declaration}.
	 * @param ctx the parse tree
	 */
	void enterStruct_declaration(C2asmParser.Struct_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#struct_declaration}.
	 * @param ctx the parse tree
	 */
	void exitStruct_declaration(C2asmParser.Struct_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#specifier_qualifier_list}.
	 * @param ctx the parse tree
	 */
	void enterSpecifier_qualifier_list(C2asmParser.Specifier_qualifier_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#specifier_qualifier_list}.
	 * @param ctx the parse tree
	 */
	void exitSpecifier_qualifier_list(C2asmParser.Specifier_qualifier_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#struct_declarator_list}.
	 * @param ctx the parse tree
	 */
	void enterStruct_declarator_list(C2asmParser.Struct_declarator_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#struct_declarator_list}.
	 * @param ctx the parse tree
	 */
	void exitStruct_declarator_list(C2asmParser.Struct_declarator_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#struct_declarator}.
	 * @param ctx the parse tree
	 */
	void enterStruct_declarator(C2asmParser.Struct_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#struct_declarator}.
	 * @param ctx the parse tree
	 */
	void exitStruct_declarator(C2asmParser.Struct_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#enum_specifier}.
	 * @param ctx the parse tree
	 */
	void enterEnum_specifier(C2asmParser.Enum_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#enum_specifier}.
	 * @param ctx the parse tree
	 */
	void exitEnum_specifier(C2asmParser.Enum_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#enumerator_list}.
	 * @param ctx the parse tree
	 */
	void enterEnumerator_list(C2asmParser.Enumerator_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#enumerator_list}.
	 * @param ctx the parse tree
	 */
	void exitEnumerator_list(C2asmParser.Enumerator_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void enterEnumerator(C2asmParser.EnumeratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void exitEnumerator(C2asmParser.EnumeratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#type_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterType_qualifier(C2asmParser.Type_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#type_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitType_qualifier(C2asmParser.Type_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#variable_declarator}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declarator(C2asmParser.Variable_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#variable_declarator}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declarator(C2asmParser.Variable_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#variable_direct_declarator}.
	 * @param ctx the parse tree
	 */
	void enterVariable_direct_declarator(C2asmParser.Variable_direct_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#variable_direct_declarator}.
	 * @param ctx the parse tree
	 */
	void exitVariable_direct_declarator(C2asmParser.Variable_direct_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#variable_declarator_suffix}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declarator_suffix(C2asmParser.Variable_declarator_suffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#variable_declarator_suffix}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declarator_suffix(C2asmParser.Variable_declarator_suffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#function_direct_declarator}.
	 * @param ctx the parse tree
	 */
	void enterFunction_direct_declarator(C2asmParser.Function_direct_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#function_direct_declarator}.
	 * @param ctx the parse tree
	 */
	void exitFunction_direct_declarator(C2asmParser.Function_direct_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#pointer}.
	 * @param ctx the parse tree
	 */
	void enterPointer(C2asmParser.PointerContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#pointer}.
	 * @param ctx the parse tree
	 */
	void exitPointer(C2asmParser.PointerContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#parameter_type_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_type_list(C2asmParser.Parameter_type_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#parameter_type_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_type_list(C2asmParser.Parameter_type_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_list(C2asmParser.Parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list(C2asmParser.Parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void enterParameter_declaration(C2asmParser.Parameter_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void exitParameter_declaration(C2asmParser.Parameter_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#identifier_list}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier_list(C2asmParser.Identifier_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#identifier_list}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier_list(C2asmParser.Identifier_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(C2asmParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(C2asmParser.Type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#abstract_declarator}.
	 * @param ctx the parse tree
	 */
	void enterAbstract_declarator(C2asmParser.Abstract_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#abstract_declarator}.
	 * @param ctx the parse tree
	 */
	void exitAbstract_declarator(C2asmParser.Abstract_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#direct_abstract_declarator}.
	 * @param ctx the parse tree
	 */
	void enterDirect_abstract_declarator(C2asmParser.Direct_abstract_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#direct_abstract_declarator}.
	 * @param ctx the parse tree
	 */
	void exitDirect_abstract_declarator(C2asmParser.Direct_abstract_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#abstract_declarator_suffix}.
	 * @param ctx the parse tree
	 */
	void enterAbstract_declarator_suffix(C2asmParser.Abstract_declarator_suffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#abstract_declarator_suffix}.
	 * @param ctx the parse tree
	 */
	void exitAbstract_declarator_suffix(C2asmParser.Abstract_declarator_suffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(C2asmParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(C2asmParser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#initializer_list}.
	 * @param ctx the parse tree
	 */
	void enterInitializer_list(C2asmParser.Initializer_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#initializer_list}.
	 * @param ctx the parse tree
	 */
	void exitInitializer_list(C2asmParser.Initializer_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#argument_expression_list}.
	 * @param ctx the parse tree
	 */
	void enterArgument_expression_list(C2asmParser.Argument_expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#argument_expression_list}.
	 * @param ctx the parse tree
	 */
	void exitArgument_expression_list(C2asmParser.Argument_expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditive_expression(C2asmParser.Additive_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditive_expression(C2asmParser.Additive_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicative_expression(C2asmParser.Multiplicative_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicative_expression(C2asmParser.Multiplicative_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#cast_expression}.
	 * @param ctx the parse tree
	 */
	void enterCast_expression(C2asmParser.Cast_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#cast_expression}.
	 * @param ctx the parse tree
	 */
	void exitCast_expression(C2asmParser.Cast_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expression(C2asmParser.Unary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expression(C2asmParser.Unary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterPostfix_expression(C2asmParser.Postfix_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitPostfix_expression(C2asmParser.Postfix_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(C2asmParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(C2asmParser.Unary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_expression(C2asmParser.Primary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_expression(C2asmParser.Primary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(C2asmParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(C2asmParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(C2asmParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(C2asmParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void enterConstant_expression(C2asmParser.Constant_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void exitConstant_expression(C2asmParser.Constant_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#assignment_expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_expression(C2asmParser.Assignment_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#assignment_expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_expression(C2asmParser.Assignment_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void enterLvalue(C2asmParser.LvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void exitLvalue(C2asmParser.LvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_operator(C2asmParser.Assignment_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_operator(C2asmParser.Assignment_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void enterConditional_expression(C2asmParser.Conditional_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void exitConditional_expression(C2asmParser.Conditional_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#logical_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_or_expression(C2asmParser.Logical_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#logical_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_or_expression(C2asmParser.Logical_or_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#logical_and_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_and_expression(C2asmParser.Logical_and_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#logical_and_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_and_expression(C2asmParser.Logical_and_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#inclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterInclusive_or_expression(C2asmParser.Inclusive_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#inclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitInclusive_or_expression(C2asmParser.Inclusive_or_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#exclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterExclusive_or_expression(C2asmParser.Exclusive_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#exclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitExclusive_or_expression(C2asmParser.Exclusive_or_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expression(C2asmParser.And_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expression(C2asmParser.And_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void enterEquality_expression(C2asmParser.Equality_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void exitEquality_expression(C2asmParser.Equality_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void enterRelational_expression(C2asmParser.Relational_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void exitRelational_expression(C2asmParser.Relational_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#shift_expression}.
	 * @param ctx the parse tree
	 */
	void enterShift_expression(C2asmParser.Shift_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#shift_expression}.
	 * @param ctx the parse tree
	 */
	void exitShift_expression(C2asmParser.Shift_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(C2asmParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(C2asmParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#labeled_statement}.
	 * @param ctx the parse tree
	 */
	void enterLabeled_statement(C2asmParser.Labeled_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#labeled_statement}.
	 * @param ctx the parse tree
	 */
	void exitLabeled_statement(C2asmParser.Labeled_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#compound_statement}.
	 * @param ctx the parse tree
	 */
	void enterCompound_statement(C2asmParser.Compound_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#compound_statement}.
	 * @param ctx the parse tree
	 */
	void exitCompound_statement(C2asmParser.Compound_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void enterStatement_list(C2asmParser.Statement_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void exitStatement_list(C2asmParser.Statement_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#expression_statement}.
	 * @param ctx the parse tree
	 */
	void enterExpression_statement(C2asmParser.Expression_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#expression_statement}.
	 * @param ctx the parse tree
	 */
	void exitExpression_statement(C2asmParser.Expression_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#selection_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelection_statement(C2asmParser.Selection_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#selection_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelection_statement(C2asmParser.Selection_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#iteration_statement}.
	 * @param ctx the parse tree
	 */
	void enterIteration_statement(C2asmParser.Iteration_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#iteration_statement}.
	 * @param ctx the parse tree
	 */
	void exitIteration_statement(C2asmParser.Iteration_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void enterJump_statement(C2asmParser.Jump_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void exitJump_statement(C2asmParser.Jump_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link C2asmParser#function_call_statement}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_statement(C2asmParser.Function_call_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link C2asmParser#function_call_statement}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_statement(C2asmParser.Function_call_statementContext ctx);
}