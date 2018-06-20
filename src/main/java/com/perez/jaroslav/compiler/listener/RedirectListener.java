package com.perez.jaroslav.compiler.listener;

import com.perez.jaroslav.compiler.antlr.C2asmBaseListener;
import com.perez.jaroslav.compiler.antlr.C2asmParser;
import com.perez.jaroslav.compiler.listener.base.AbstractBaseListener;
import com.perez.jaroslav.compiler.program.CompilationUnit;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.PrintStream;

public class RedirectListener extends C2asmBaseListener {
    private AbstractBaseListener baseListener;
    public AbstractBaseListener previousListener;
    private CompilationUnit compilationUnit;
    private PrintStream writer;

    public RedirectListener(PrintStream writer) {
        this.writer = writer;
    }

    public void setBaseListener(AbstractBaseListener baseListener, AbstractBaseListener previous) {
        this.baseListener = baseListener;
        this.previousListener = previous;
        baseListener.setRedirectListener(this);
    }

    public CompilationUnit getCompilationUnit() {
        return compilationUnit;
    }

    @Override
    public void enterCompilationUnit(C2asmParser.CompilationUnitContext ctx) {
        compilationUnit = new CompilationUnit();
    }

    @Override
    public void exitCompilationUnit(C2asmParser.CompilationUnitContext ctx) {
        writer.print(compilationUnit.generate());
    }

    @Override
    public void enterExternal_declaration(C2asmParser.External_declarationContext ctx) {
        baseListener.enterExternal_declaration(ctx);
    }

    @Override
    public void exitExternal_declaration(C2asmParser.External_declarationContext ctx) {
        baseListener.exitExternal_declaration(ctx);
    }

    @Override
    public void enterFunction_definition(C2asmParser.Function_definitionContext ctx) {
        baseListener.enterFunction_definition(ctx);
    }

    @Override
    public void exitFunction_definition(C2asmParser.Function_definitionContext ctx) {
        baseListener.exitFunction_definition(ctx);
    }

    @Override
    public void enterPreprocessor_directive(C2asmParser.Preprocessor_directiveContext ctx) {
        baseListener.enterPreprocessor_directive(ctx);
    }

    @Override
    public void exitPreprocessor_directive(C2asmParser.Preprocessor_directiveContext ctx) {
        baseListener.exitPreprocessor_directive(ctx);
    }

    @Override
    public void enterInclude(C2asmParser.IncludeContext ctx) {
        baseListener.enterInclude(ctx);
    }

    @Override
    public void exitInclude(C2asmParser.IncludeContext ctx) {
        baseListener.exitInclude(ctx);
    }

    @Override
    public void enterHeader_file(C2asmParser.Header_fileContext ctx) {
        baseListener.enterHeader_file(ctx);
    }

    @Override
    public void exitHeader_file(C2asmParser.Header_fileContext ctx) {
        baseListener.exitHeader_file(ctx);
    }

    @Override
    public void enterDefine(C2asmParser.DefineContext ctx) {
        baseListener.enterDefine(ctx);
    }

    @Override
    public void exitDefine(C2asmParser.DefineContext ctx) {
        baseListener.exitDefine(ctx);
    }

    @Override
    public void enterDeclaration(C2asmParser.DeclarationContext ctx) {
        baseListener.enterDeclaration(ctx);
    }

    @Override
    public void exitDeclaration(C2asmParser.DeclarationContext ctx) {
        baseListener.exitDeclaration(ctx);
    }

    @Override
    public void enterFunction_declaration(C2asmParser.Function_declarationContext ctx) {
        baseListener.enterFunction_declaration(ctx);
    }

    @Override
    public void exitFunction_declaration(C2asmParser.Function_declarationContext ctx) {
        baseListener.exitFunction_declaration(ctx);
    }

    @Override
    public void enterVariable_declaration(C2asmParser.Variable_declarationContext ctx) {
        baseListener.enterVariable_declaration(ctx);
    }

    @Override
    public void exitVariable_declaration(C2asmParser.Variable_declarationContext ctx) {
        baseListener.exitVariable_declaration(ctx);
    }

    @Override
    public void enterDeclaration_specifiers(C2asmParser.Declaration_specifiersContext ctx) {
        baseListener.enterDeclaration_specifiers(ctx);
    }

    @Override
    public void exitDeclaration_specifiers(C2asmParser.Declaration_specifiersContext ctx) {
        baseListener.exitDeclaration_specifiers(ctx);
    }

    @Override
    public void enterVariable_init_declarator_list(C2asmParser.Variable_init_declarator_listContext ctx) {
        baseListener.enterVariable_init_declarator_list(ctx);
    }

    @Override
    public void exitVariable_init_declarator_list(C2asmParser.Variable_init_declarator_listContext ctx) {
        baseListener.exitVariable_init_declarator_list(ctx);
    }

    @Override
    public void enterInit_declarator(C2asmParser.Init_declaratorContext ctx) {
        baseListener.enterInit_declarator(ctx);
    }

    @Override
    public void exitInit_declarator(C2asmParser.Init_declaratorContext ctx) {
        baseListener.exitInit_declarator(ctx);
    }

    @Override
    public void enterStorage_class_specifier(C2asmParser.Storage_class_specifierContext ctx) {
        baseListener.enterStorage_class_specifier(ctx);
    }

    @Override
    public void exitStorage_class_specifier(C2asmParser.Storage_class_specifierContext ctx) {
        baseListener.exitStorage_class_specifier(ctx);
    }

    @Override
    public void enterType_specifier(C2asmParser.Type_specifierContext ctx) {
        baseListener.enterType_specifier(ctx);
    }

    @Override
    public void exitType_specifier(C2asmParser.Type_specifierContext ctx) {
        baseListener.exitType_specifier(ctx);
    }

    @Override
    public void enterStruct_specifier(C2asmParser.Struct_specifierContext ctx) {
        baseListener.enterStruct_specifier(ctx);
    }

    @Override
    public void exitStruct_specifier(C2asmParser.Struct_specifierContext ctx) {
        baseListener.exitStruct_specifier(ctx);
    }

    @Override
    public void enterStruct(C2asmParser.StructContext ctx) {
        baseListener.enterStruct(ctx);
    }

    @Override
    public void exitStruct(C2asmParser.StructContext ctx) {
        baseListener.exitStruct(ctx);
    }

    @Override
    public void enterStruct_declaration_list(C2asmParser.Struct_declaration_listContext ctx) {
        baseListener.enterStruct_declaration_list(ctx);
    }

    @Override
    public void exitStruct_declaration_list(C2asmParser.Struct_declaration_listContext ctx) {
        baseListener.exitStruct_declaration_list(ctx);
    }

    @Override
    public void enterStruct_declaration(C2asmParser.Struct_declarationContext ctx) {
        baseListener.enterStruct_declaration(ctx);
    }

    @Override
    public void exitStruct_declaration(C2asmParser.Struct_declarationContext ctx) {
        baseListener.exitStruct_declaration(ctx);
    }

    @Override
    public void enterSpecifier_qualifier_list(C2asmParser.Specifier_qualifier_listContext ctx) {
        baseListener.enterSpecifier_qualifier_list(ctx);
    }

    @Override
    public void exitSpecifier_qualifier_list(C2asmParser.Specifier_qualifier_listContext ctx) {
        baseListener.exitSpecifier_qualifier_list(ctx);
    }

    @Override
    public void enterStruct_declarator_list(C2asmParser.Struct_declarator_listContext ctx) {
        baseListener.enterStruct_declarator_list(ctx);
    }

    @Override
    public void exitStruct_declarator_list(C2asmParser.Struct_declarator_listContext ctx) {
        baseListener.exitStruct_declarator_list(ctx);
    }

    @Override
    public void enterStruct_declarator(C2asmParser.Struct_declaratorContext ctx) {
        baseListener.enterStruct_declarator(ctx);
    }

    @Override
    public void exitStruct_declarator(C2asmParser.Struct_declaratorContext ctx) {
        baseListener.exitStruct_declarator(ctx);
    }

    @Override
    public void enterEnum_specifier(C2asmParser.Enum_specifierContext ctx) {
        baseListener.enterEnum_specifier(ctx);
    }

    @Override
    public void exitEnum_specifier(C2asmParser.Enum_specifierContext ctx) {
        baseListener.exitEnum_specifier(ctx);
    }

    @Override
    public void enterEnumerator_list(C2asmParser.Enumerator_listContext ctx) {
        baseListener.enterEnumerator_list(ctx);
    }

    @Override
    public void exitEnumerator_list(C2asmParser.Enumerator_listContext ctx) {
        baseListener.exitEnumerator_list(ctx);
    }

    @Override
    public void enterEnumerator(C2asmParser.EnumeratorContext ctx) {
        baseListener.enterEnumerator(ctx);
    }

    @Override
    public void exitEnumerator(C2asmParser.EnumeratorContext ctx) {
        baseListener.exitEnumerator(ctx);
    }

    @Override
    public void enterType_qualifier(C2asmParser.Type_qualifierContext ctx) {
        baseListener.enterType_qualifier(ctx);
    }

    @Override
    public void exitType_qualifier(C2asmParser.Type_qualifierContext ctx) {
        baseListener.exitType_qualifier(ctx);
    }

    @Override
    public void enterVariable_declarator(C2asmParser.Variable_declaratorContext ctx) {
        baseListener.enterVariable_declarator(ctx);
    }

    @Override
    public void exitVariable_declarator(C2asmParser.Variable_declaratorContext ctx) {
        baseListener.exitVariable_declarator(ctx);
    }

    @Override
    public void enterVariable_direct_declarator(C2asmParser.Variable_direct_declaratorContext ctx) {
        baseListener.enterVariable_direct_declarator(ctx);
    }

    @Override
    public void exitVariable_direct_declarator(C2asmParser.Variable_direct_declaratorContext ctx) {
        baseListener.exitVariable_direct_declarator(ctx);
    }

    @Override
    public void enterVariable_declarator_suffix(C2asmParser.Variable_declarator_suffixContext ctx) {
        baseListener.enterVariable_declarator_suffix(ctx);
    }

    @Override
    public void exitVariable_declarator_suffix(C2asmParser.Variable_declarator_suffixContext ctx) {
        baseListener.exitVariable_declarator_suffix(ctx);
    }

    @Override
    public void enterFunction_direct_declarator(C2asmParser.Function_direct_declaratorContext ctx) {
        baseListener.enterFunction_direct_declarator(ctx);
    }

    @Override
    public void exitFunction_direct_declarator(C2asmParser.Function_direct_declaratorContext ctx) {
        baseListener.exitFunction_direct_declarator(ctx);
    }

    @Override
    public void enterPointer(C2asmParser.PointerContext ctx) {
        baseListener.enterPointer(ctx);
    }

    @Override
    public void exitPointer(C2asmParser.PointerContext ctx) {
        baseListener.exitPointer(ctx);
    }

    @Override
    public void enterParameter_type_list(C2asmParser.Parameter_type_listContext ctx) {
        baseListener.enterParameter_type_list(ctx);
    }

    @Override
    public void exitParameter_type_list(C2asmParser.Parameter_type_listContext ctx) {
        baseListener.exitParameter_type_list(ctx);
    }

    @Override
    public void enterParameter_list(C2asmParser.Parameter_listContext ctx) {
        baseListener.enterParameter_list(ctx);
    }

    @Override
    public void exitParameter_list(C2asmParser.Parameter_listContext ctx) {
        baseListener.exitParameter_list(ctx);
    }

    @Override
    public void enterParameter_declaration(C2asmParser.Parameter_declarationContext ctx) {
        baseListener.enterParameter_declaration(ctx);
    }

    @Override
    public void exitParameter_declaration(C2asmParser.Parameter_declarationContext ctx) {
        baseListener.exitParameter_declaration(ctx);
    }

    @Override
    public void enterIdentifier_list(C2asmParser.Identifier_listContext ctx) {
        baseListener.enterIdentifier_list(ctx);
    }

    @Override
    public void exitIdentifier_list(C2asmParser.Identifier_listContext ctx) {
        baseListener.exitIdentifier_list(ctx);
    }

    @Override
    public void enterType_name(C2asmParser.Type_nameContext ctx) {
        baseListener.enterType_name(ctx);
    }

    @Override
    public void exitType_name(C2asmParser.Type_nameContext ctx) {
        baseListener.exitType_name(ctx);
    }

    @Override
    public void enterAbstract_declarator(C2asmParser.Abstract_declaratorContext ctx) {
        baseListener.enterAbstract_declarator(ctx);
    }

    @Override
    public void exitAbstract_declarator(C2asmParser.Abstract_declaratorContext ctx) {
        baseListener.exitAbstract_declarator(ctx);
    }

    @Override
    public void enterDirect_abstract_declarator(C2asmParser.Direct_abstract_declaratorContext ctx) {
        baseListener.enterDirect_abstract_declarator(ctx);
    }

    @Override
    public void exitDirect_abstract_declarator(C2asmParser.Direct_abstract_declaratorContext ctx) {
        baseListener.exitDirect_abstract_declarator(ctx);
    }

    @Override
    public void enterAbstract_declarator_suffix(C2asmParser.Abstract_declarator_suffixContext ctx) {
        baseListener.enterAbstract_declarator_suffix(ctx);
    }

    @Override
    public void exitAbstract_declarator_suffix(C2asmParser.Abstract_declarator_suffixContext ctx) {
        baseListener.exitAbstract_declarator_suffix(ctx);
    }

    @Override
    public void enterInitializer(C2asmParser.InitializerContext ctx) {
        baseListener.enterInitializer(ctx);
    }

    @Override
    public void exitInitializer(C2asmParser.InitializerContext ctx) {
        baseListener.exitInitializer(ctx);
    }

    @Override
    public void enterInitializer_list(C2asmParser.Initializer_listContext ctx) {
        baseListener.enterInitializer_list(ctx);
    }

    @Override
    public void exitInitializer_list(C2asmParser.Initializer_listContext ctx) {
        baseListener.exitInitializer_list(ctx);
    }

    @Override
    public void enterArgument_expression_list(C2asmParser.Argument_expression_listContext ctx) {
        baseListener.enterArgument_expression_list(ctx);
    }

    @Override
    public void exitArgument_expression_list(C2asmParser.Argument_expression_listContext ctx) {
        baseListener.exitArgument_expression_list(ctx);
    }

    @Override
    public void enterAdditive_expression(C2asmParser.Additive_expressionContext ctx) {
        baseListener.enterAdditive_expression(ctx);
    }

    @Override
    public void exitAdditive_expression(C2asmParser.Additive_expressionContext ctx) {
        baseListener.exitAdditive_expression(ctx);
    }

    @Override
    public void enterMultiplicative_expression(C2asmParser.Multiplicative_expressionContext ctx) {
        baseListener.enterMultiplicative_expression(ctx);
    }

    @Override
    public void exitMultiplicative_expression(C2asmParser.Multiplicative_expressionContext ctx) {
        baseListener.exitMultiplicative_expression(ctx);
    }

    @Override
    public void enterCast_expression(C2asmParser.Cast_expressionContext ctx) {
        baseListener.enterCast_expression(ctx);
    }

    @Override
    public void exitCast_expression(C2asmParser.Cast_expressionContext ctx) {
        baseListener.exitCast_expression(ctx);
    }

    @Override
    public void enterUnary_expression(C2asmParser.Unary_expressionContext ctx) {
        baseListener.enterUnary_expression(ctx);
    }

    @Override
    public void exitUnary_expression(C2asmParser.Unary_expressionContext ctx) {
        baseListener.exitUnary_expression(ctx);
    }

    @Override
    public void enterPostfix_expression(C2asmParser.Postfix_expressionContext ctx) {
        baseListener.enterPostfix_expression(ctx);
    }

    @Override
    public void exitPostfix_expression(C2asmParser.Postfix_expressionContext ctx) {
        baseListener.exitPostfix_expression(ctx);
    }

    @Override
    public void enterUnary_operator(C2asmParser.Unary_operatorContext ctx) {
        baseListener.enterUnary_operator(ctx);
    }

    @Override
    public void exitUnary_operator(C2asmParser.Unary_operatorContext ctx) {
        baseListener.exitUnary_operator(ctx);
    }

    @Override
    public void enterPrimary_expression(C2asmParser.Primary_expressionContext ctx) {
        baseListener.enterPrimary_expression(ctx);
    }

    @Override
    public void exitPrimary_expression(C2asmParser.Primary_expressionContext ctx) {
        baseListener.exitPrimary_expression(ctx);
    }

    @Override
    public void enterConstant(C2asmParser.ConstantContext ctx) {
        baseListener.enterConstant(ctx);
    }

    @Override
    public void exitConstant(C2asmParser.ConstantContext ctx) {
        baseListener.exitConstant(ctx);
    }

    @Override
    public void enterExpression(C2asmParser.ExpressionContext ctx) {
        baseListener.enterExpression(ctx);
    }

    @Override
    public void exitExpression(C2asmParser.ExpressionContext ctx) {
        baseListener.exitExpression(ctx);
    }

    @Override
    public void enterConstant_expression(C2asmParser.Constant_expressionContext ctx) {
        baseListener.enterConstant_expression(ctx);
    }

    @Override
    public void exitConstant_expression(C2asmParser.Constant_expressionContext ctx) {
        baseListener.exitConstant_expression(ctx);
    }

    @Override
    public void enterAssignment_expression(C2asmParser.Assignment_expressionContext ctx) {
        baseListener.enterAssignment_expression(ctx);
    }

    @Override
    public void exitAssignment_expression(C2asmParser.Assignment_expressionContext ctx) {
        baseListener.exitAssignment_expression(ctx);
    }

    @Override
    public void enterLvalue(C2asmParser.LvalueContext ctx) {
        baseListener.enterLvalue(ctx);
    }

    @Override
    public void exitLvalue(C2asmParser.LvalueContext ctx) {
        baseListener.exitLvalue(ctx);
    }

    @Override
    public void enterAssignment_operator(C2asmParser.Assignment_operatorContext ctx) {
        baseListener.enterAssignment_operator(ctx);
    }

    @Override
    public void exitAssignment_operator(C2asmParser.Assignment_operatorContext ctx) {
        baseListener.exitAssignment_operator(ctx);
    }

    @Override
    public void enterConditional_expression(C2asmParser.Conditional_expressionContext ctx) {
        baseListener.enterConditional_expression(ctx);
    }

    @Override
    public void exitConditional_expression(C2asmParser.Conditional_expressionContext ctx) {
        baseListener.exitConditional_expression(ctx);
    }

    @Override
    public void enterLogical_or_expression(C2asmParser.Logical_or_expressionContext ctx) {
        baseListener.enterLogical_or_expression(ctx);
    }

    @Override
    public void exitLogical_or_expression(C2asmParser.Logical_or_expressionContext ctx) {
        baseListener.exitLogical_or_expression(ctx);
    }

    @Override
    public void enterLogical_and_expression(C2asmParser.Logical_and_expressionContext ctx) {
        baseListener.enterLogical_and_expression(ctx);
    }

    @Override
    public void exitLogical_and_expression(C2asmParser.Logical_and_expressionContext ctx) {
        baseListener.exitLogical_and_expression(ctx);
    }

    @Override
    public void enterInclusive_or_expression(C2asmParser.Inclusive_or_expressionContext ctx) {
        baseListener.enterInclusive_or_expression(ctx);
    }

    @Override
    public void exitInclusive_or_expression(C2asmParser.Inclusive_or_expressionContext ctx) {
        baseListener.exitInclusive_or_expression(ctx);
    }

    @Override
    public void enterExclusive_or_expression(C2asmParser.Exclusive_or_expressionContext ctx) {
        baseListener.enterExclusive_or_expression(ctx);
    }

    @Override
    public void exitExclusive_or_expression(C2asmParser.Exclusive_or_expressionContext ctx) {
        baseListener.exitExclusive_or_expression(ctx);
    }

    @Override
    public void enterAnd_expression(C2asmParser.And_expressionContext ctx) {
        baseListener.enterAnd_expression(ctx);
    }

    @Override
    public void exitAnd_expression(C2asmParser.And_expressionContext ctx) {
        baseListener.exitAnd_expression(ctx);
    }

    @Override
    public void enterEquality_expression(C2asmParser.Equality_expressionContext ctx) {
        baseListener.enterEquality_expression(ctx);
    }

    @Override
    public void exitEquality_expression(C2asmParser.Equality_expressionContext ctx) {
        baseListener.exitEquality_expression(ctx);
    }

    @Override
    public void enterRelational_expression(C2asmParser.Relational_expressionContext ctx) {
        baseListener.enterRelational_expression(ctx);
    }

    @Override
    public void exitRelational_expression(C2asmParser.Relational_expressionContext ctx) {
        baseListener.exitRelational_expression(ctx);
    }

    @Override
    public void enterShift_expression(C2asmParser.Shift_expressionContext ctx) {
        baseListener.enterShift_expression(ctx);
    }

    @Override
    public void exitShift_expression(C2asmParser.Shift_expressionContext ctx) {
        baseListener.exitShift_expression(ctx);
    }

    @Override
    public void enterStatement(C2asmParser.StatementContext ctx) {
        baseListener.enterStatement(ctx);
    }

    @Override
    public void exitStatement(C2asmParser.StatementContext ctx) {
        baseListener.exitStatement(ctx);
    }

    @Override
    public void enterLabeled_statement(C2asmParser.Labeled_statementContext ctx) {
        baseListener.enterLabeled_statement(ctx);
    }

    @Override
    public void exitLabeled_statement(C2asmParser.Labeled_statementContext ctx) {
        baseListener.exitLabeled_statement(ctx);
    }

    @Override
    public void enterCompound_statement(C2asmParser.Compound_statementContext ctx) {
        baseListener.enterCompound_statement(ctx);
    }

    @Override
    public void exitCompound_statement(C2asmParser.Compound_statementContext ctx) {
        baseListener.exitCompound_statement(ctx);
    }

    @Override
    public void enterStatement_list(C2asmParser.Statement_listContext ctx) {
        baseListener.enterStatement_list(ctx);
    }

    @Override
    public void exitStatement_list(C2asmParser.Statement_listContext ctx) {
        baseListener.exitStatement_list(ctx);
    }

    @Override
    public void enterExpression_statement(C2asmParser.Expression_statementContext ctx) {
        baseListener.enterExpression_statement(ctx);
    }

    @Override
    public void exitExpression_statement(C2asmParser.Expression_statementContext ctx) {
        baseListener.exitExpression_statement(ctx);
    }

    @Override
    public void enterSelection_statement(C2asmParser.Selection_statementContext ctx) {
        baseListener.enterSelection_statement(ctx);
    }

    @Override
    public void exitSelection_statement(C2asmParser.Selection_statementContext ctx) {
        baseListener.exitSelection_statement(ctx);
    }

    @Override
    public void enterIteration_statement(C2asmParser.Iteration_statementContext ctx) {
        baseListener.enterIteration_statement(ctx);
    }

    @Override
    public void exitIteration_statement(C2asmParser.Iteration_statementContext ctx) {
        baseListener.exitIteration_statement(ctx);
    }

    @Override
    public void enterWhile_statement(C2asmParser.While_statementContext ctx) {
        baseListener.enterWhile_statement(ctx);
    }

    @Override
    public void exitWhile_statement(C2asmParser.While_statementContext ctx) {
        baseListener.exitWhile_statement(ctx);
    }

    @Override
    public void enterDo_statement(C2asmParser.Do_statementContext ctx) {
        baseListener.enterDo_statement(ctx);
    }

    @Override
    public void exitDo_statement(C2asmParser.Do_statementContext ctx) {
        baseListener.exitDo_statement(ctx);
    }

    @Override
    public void enterFor_statement(C2asmParser.For_statementContext ctx) {
        baseListener.enterFor_statement(ctx);
    }

    @Override
    public void exitFor_statement(C2asmParser.For_statementContext ctx) {
        baseListener.exitFor_statement(ctx);
    }

    @Override
    public void enterJump_statement(C2asmParser.Jump_statementContext ctx) {
        baseListener.enterJump_statement(ctx);
    }

    @Override
    public void exitJump_statement(C2asmParser.Jump_statementContext ctx) {
        baseListener.exitJump_statement(ctx);
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        baseListener.enterEveryRule(ctx);
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        baseListener.exitEveryRule(ctx);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        baseListener.visitTerminal(node);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        baseListener.visitErrorNode(node);
    }
}
