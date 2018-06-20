package com.perez.jaroslav.compiler.listener.functional;

import com.perez.jaroslav.compiler.antlr.C2asmParser;
import com.perez.jaroslav.compiler.components.callarguments.MethodArgument;
import com.perez.jaroslav.compiler.components.statement.IfStatement;
import com.perez.jaroslav.compiler.components.statement.SwitchStatement;
import com.perez.jaroslav.compiler.expressions.PrimaryExpression;
import com.perez.jaroslav.compiler.expressions.evaluator.ExpressionEvaluator;
import com.perez.jaroslav.compiler.helpers.TypeHelper;
import com.perez.jaroslav.compiler.helpers.VariableHelper;
import com.perez.jaroslav.compiler.listener.base.AbstractBaseListener;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.List;

public class ExpressionListener extends AbstractBaseListener {
    private List<String> expressions = new LinkedList<>();
    private ExpressionEvaluator expressionEvaluator = new ExpressionEvaluator();
    private boolean shouldReturn = true;
    private boolean callingMethodWithoutArgs = false;

    //marks if we are doing addition/subtraction... assignment, so we will need to copy lvalue
    private boolean operationAssignment = false;

    @Override
    public void exitExpression(C2asmParser.ExpressionContext ctx) {
        if(!(ctx.parent instanceof C2asmParser.Primary_expressionContext)){
            if(shouldReturn){
                expressionEvaluator.loadInnerExpression();
            }
            redirectListener.getCompilationUnit().parsedFunction.addCode(expressionEvaluator.getExpression());
            if(ctx.parent instanceof C2asmParser.Selection_statementContext && ctx.parent.getChild(0).getText().equals("if")){
                redirectListener.getCompilationUnit().addStatementJump(new IfStatement());
            }
            redirectListener.setBaseListener(redirectListener.previousListener, this);
        }
        else {
            expressionEvaluator.loadInnerExpression();
        }
    }

    @Override
    public void enterAdditive_expression(C2asmParser.Additive_expressionContext ctx) {
        //baseListener.enterAdditive_expression(ctx);
    }

    @Override
    public void exitAdditive_expression(C2asmParser.Additive_expressionContext ctx) {
        if(ctx.children.size() > 1){
            String operator = ctx.children.get(1).getText();
            if(operator.equals("+")){
                expressionEvaluator.loadAdditiveExpression();
            }
            else if(operator.equals("-")){
                expressionEvaluator.loadSubtractiveExpression();
            }
        }
    }

    @Override
    public void enterMultiplicative_expression(C2asmParser.Multiplicative_expressionContext ctx) {
        //baseListener.enterMultiplicative_expression(ctx);
    }

    @Override
    public void exitMultiplicative_expression(C2asmParser.Multiplicative_expressionContext ctx) {
        if(ctx.children.size() > 1){
            String operator = ctx.children.get(1).getText();
            if(operator.equals("*")){
                expressionEvaluator.loadMultiplicativeExpression();
            }
            else if(operator.equals("/")){
                expressionEvaluator.loadDivisionExpression();
            }
            else if(operator.equals("%")){
                expressionEvaluator.loadModuloExpression();
            }
        }
    }

    @Override
    public void enterCast_expression(C2asmParser.Cast_expressionContext ctx) {
        //baseListener.enterCast_expression(ctx);
    }

    @Override
    public void exitCast_expression(C2asmParser.Cast_expressionContext ctx) {
        //expressions.add("Cast expression: " + ctx.getText());
    }

    @Override
    public void enterUnary_expression(C2asmParser.Unary_expressionContext ctx) {
        //CASE 1: prefix expression
        if(ctx.children.size() == 2){
            String operator = ctx.children.get(0).getText();
            if(operator.equals("++")){
                expressionEvaluator.copyAddress = true;
            }
            else if(operator.equals("--")){
                expressionEvaluator.copyAddress = true;
            }
            else if(operator.equals("!")){
                expressionEvaluator.copyAddress = true;
            }
            else if(operator.equals("&")){
                expressionEvaluator.copyAddress = true;
            }
        }
    }

    @Override
    public void exitUnary_expression(C2asmParser.Unary_expressionContext ctx) {
        //CASE 1: prefix expression
        if(ctx.children.size() == 2){
            String operator = ctx.children.get(0).getText();
            if(operator.equals("++")){
                expressionEvaluator.loadPrefixIncrementExpression();
                expressionEvaluator.copyAddress = false;
            }
            else if(operator.equals("--")){
                expressionEvaluator.loadPrefixDecrementExpression();
                expressionEvaluator.copyAddress = false;
            }
            else if(operator.equals("!")){
                expressionEvaluator.loadNotExpression();
                expressionEvaluator.copyAddress = false;
            }
            else if(operator.equals("&")){
                expressionEvaluator.loadAddressExpression();
                expressionEvaluator.copyAddress = false;
            }
        }
    }

    @Override
    public void enterPostfix_expression(C2asmParser.Postfix_expressionContext ctx) {
        //CASE 1: method with arguments call
        if(ctx.children.size() == 4){
            List<C2asmParser.Argument_expression_listContext> argumentContexts =
                    ctx.argument_expression_list();
            String methodName = ctx.primary_expression().getText();
            if(argumentContexts != null && argumentContexts.size() > 0){
                shouldReturn = false;
                redirectListener.setBaseListener(new MethodCallListener(methodName), this);
            }
        }
        //CASE 2: method without arguments call
        else if(ctx.children.size() == 3 && ctx.getChild(1).getText().equals("(") && ctx.getChild(2).getText().equals(")")){
            String methodName = ctx.primary_expression().getText();
            shouldReturn = false;
            List<MethodArgument> arguments = new LinkedList<>();
            redirectListener.getCompilationUnit().callFunction(methodName, arguments);
            callingMethodWithoutArgs = true;
        }
        //CASE 3: postfix expression
        else if(ctx.children.size() == 2){
            String operator = ctx.children.get(1).getText();
            if(operator.equals("++")){
                expressionEvaluator.copyAddress = true;
            }
            else if(operator.equals("--")){
                expressionEvaluator.copyAddress = true;
            }
        }

    }

    @Override
    public void exitPostfix_expression(C2asmParser.Postfix_expressionContext ctx) {
        //CASE: postfix expression
        if(ctx.children.size() == 2){
            String operator = ctx.children.get(1).getText();
            if(operator.equals("++")){
                expressionEvaluator.loadPostfixIncrementExpression();
                expressionEvaluator.copyAddress = false;
            }
            else if(operator.equals("--")){
                expressionEvaluator.loadPostfixDecrementExpression();
                expressionEvaluator.copyAddress = false;
            }
        }

    }

    @Override
    public void exitPrimary_expression(C2asmParser.Primary_expressionContext ctx) {
        if(callingMethodWithoutArgs){
            return;
        }
        C2asmParser.ConstantContext constantContext = ctx.constant();
        if(ctx.expression() == null){
            PrimaryExpression primaryExpression = new PrimaryExpression();

            if(constantContext == null){
                primaryExpression.type = PrimaryExpression.TYPE_VARIABLE;
                primaryExpression.operand = VariableHelper.getVariableOperand(ctx.getText(), redirectListener.getCompilationUnit());
                expressionEvaluator.loadPrimaryExpression(primaryExpression.operand,
                        redirectListener.getCompilationUnit().getVariable(ctx.getText()).type);
            }
            else {
                primaryExpression.type = PrimaryExpression.TYPE_CONST;
                primaryExpression.operand = "$" + ctx.getText();
                expressionEvaluator.loadPrimaryExpression(primaryExpression.operand);
            }
        }
        else {
            expressionEvaluator.loadPrimaryExpression("%rax");
        }
    }

    @Override
    public void enterAssignment_expression(C2asmParser.Assignment_expressionContext ctx) {
        if(ctx.children.size() > 1){
            String operator = ctx.assignment_operator().getText();
            if(operator.equals("+=")){
                expressionEvaluator.copyAddress = true;
                operationAssignment = true;
            }
            else if(operator.equals("-=")){
                expressionEvaluator.copyAddress = true;
                operationAssignment = true;
            }
            else if(operator.equals("*=")){
                expressionEvaluator.copyAddress = true;
                operationAssignment = true;
            }
            else if(operator.equals("/=")){
                expressionEvaluator.copyAddress = true;
                operationAssignment = true;
            }
            else if(operator.equals("%=")){
                expressionEvaluator.copyAddress = true;
                operationAssignment = true;
            }
        }
    }

    @Override
    public void exitAssignment_expression(C2asmParser.Assignment_expressionContext ctx) {
        if(ctx.children.size() > 1){
            String operator = ctx.assignment_operator().getText();
            if(operator.equals("=")){
                expressionEvaluator.loadAssignmentExpression();
            }
            else if(operator.equals("+=")){
                expressionEvaluator.loadAddAssignmentExpression();
                expressionEvaluator.copyAddress = false;
                operationAssignment = false;
            }
            else if(operator.equals("-=")){
                expressionEvaluator.loadSubAssignmentExpression();
                expressionEvaluator.copyAddress = false;
                operationAssignment = false;
            }
            else if(operator.equals("*=")){
                expressionEvaluator.loadMulAssignmentExpression();
                expressionEvaluator.copyAddress = false;
                operationAssignment = false;
            }
            else if(operator.equals("/=")){
                expressionEvaluator.loadDivAssignmentExpression();
                expressionEvaluator.copyAddress = false;
                operationAssignment = false;
            }
            else if(operator.equals("%=")){
                expressionEvaluator.loadModAssignmentExpression();
                expressionEvaluator.copyAddress = false;
                operationAssignment = false;
            }
            shouldReturn = false;
        }
    }

    @Override
    public void enterConditional_expression(C2asmParser.Conditional_expressionContext ctx) {
        //baseListener.enterConditional_expression(ctx);
    }

    @Override
    public void exitConditional_expression(C2asmParser.Conditional_expressionContext ctx) {
        expressions.add("Conditional expression: " + ctx.getText());
    }

    @Override
    public void enterLogical_or_expression(C2asmParser.Logical_or_expressionContext ctx) {
        //baseListener.enterLogical_or_expression(ctx);
    }

    @Override
    public void exitLogical_or_expression(C2asmParser.Logical_or_expressionContext ctx) {
        expressions.add("Logical or expr: " + ctx.getText());
        if(ctx.children.size() > 1){
            expressionEvaluator.loadLogicalOrExpression();
        }
    }

    @Override
    public void enterLogical_and_expression(C2asmParser.Logical_and_expressionContext ctx) {
        //baseListener.enterLogical_and_expression(ctx);
    }

    @Override
    public void exitLogical_and_expression(C2asmParser.Logical_and_expressionContext ctx) {
        if(ctx.children.size() > 1){
            expressionEvaluator.loadLogicalAndExpression();
        }
    }

    @Override
    public void enterInclusive_or_expression(C2asmParser.Inclusive_or_expressionContext ctx) {
        //baseListener.enterInclusive_or_expression(ctx);
    }

    @Override
    public void exitInclusive_or_expression(C2asmParser.Inclusive_or_expressionContext ctx) {
        expressions.add("Inclusive or expr: "+ctx.getText());
    }

    @Override
    public void enterExclusive_or_expression(C2asmParser.Exclusive_or_expressionContext ctx) {
        //baseListener.enterExclusive_or_expression(ctx);
    }

    @Override
    public void exitExclusive_or_expression(C2asmParser.Exclusive_or_expressionContext ctx) {
        expressions.add("Exclusive or expr: " + ctx.getText());
    }

    @Override
    public void enterAnd_expression(C2asmParser.And_expressionContext ctx) {
        //baseListener.enterAnd_expression(ctx);
    }

    @Override
    public void exitAnd_expression(C2asmParser.And_expressionContext ctx) {
        expressions.add("And expression: " + ctx.getText());
    }

    @Override
    public void enterEquality_expression(C2asmParser.Equality_expressionContext ctx) {
        //baseListener.enterEquality_expression(ctx);
    }

    @Override
    public void exitEquality_expression(C2asmParser.Equality_expressionContext ctx) {
        if(ctx.children.size() > 1){
            String operand = ctx.getChild(1).getText();
            if(operand.equals("==")){
                expressionEvaluator.loadEqualityExpression();
            }
            else if(operand.equals("!=")){
                expressionEvaluator.loadInequalityExpression();
            }
        }
    }

    @Override
    public void enterRelational_expression(C2asmParser.Relational_expressionContext ctx) {
        //baseListener.enterRelational_expression(ctx);
    }

    @Override
    public void exitRelational_expression(C2asmParser.Relational_expressionContext ctx) {
        if(ctx.children.size() == 3){
            String operand = ctx.getChild(1).getText();
            if(operand.equals(">")){
                expressionEvaluator.loadBiggerThanExpression();
            }
            else if(operand.equals("<")){
                expressionEvaluator.loadLessThanExpression();
            }
            else if(operand.equals(">=")){
                expressionEvaluator.loadBiggerEqualExpression();
            }
            else if(operand.equals("<=")){
                expressionEvaluator.loadLessEqualExpression();
            }
        }
    }

    @Override
    public void enterShift_expression(C2asmParser.Shift_expressionContext ctx) {
        //baseListener.enterShift_expression(ctx);
    }

    @Override
    public void exitShift_expression(C2asmParser.Shift_expressionContext ctx) {
        expressions.add("Shift expression: " + ctx.getText());
    }

    @Override
    public void enterLvalue(C2asmParser.LvalueContext ctx){
        if(!operationAssignment){
            expressionEvaluator.copyExpValue = false;
        }
    }

    @Override
    public void exitLvalue(C2asmParser.LvalueContext ctx) {
        expressionEvaluator.copyExpValue = true;
        if(expressionEvaluator.copyAddress){
            expressionEvaluator.copyAddress = false;
        }
    }
}
