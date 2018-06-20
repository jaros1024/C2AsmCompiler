package com.perez.jaroslav.compiler.listener.functional;

import com.perez.jaroslav.compiler.antlr.C2asmParser;
import com.perez.jaroslav.compiler.components.statement.IfStatement;
import com.perez.jaroslav.compiler.components.statement.SwitchStatement;
import com.perez.jaroslav.compiler.expressions.PrimaryExpression;
import com.perez.jaroslav.compiler.expressions.evaluator.ExpressionEvaluator;
import com.perez.jaroslav.compiler.helpers.VariableHelper;
import com.perez.jaroslav.compiler.listener.base.AbstractBaseListener;

import java.util.LinkedList;
import java.util.List;

public class ExpressionListener extends AbstractBaseListener {
    private List<String> expressions = new LinkedList<>();
    private ExpressionEvaluator expressionEvaluator = new ExpressionEvaluator();
    private boolean shouldReturn = true;

    @Override
    public void exitExpression(C2asmParser.ExpressionContext ctx) {
        System.out.println("Parent index = " + ctx.parent.getRuleIndex());
        for(String str : expressions){
            //System.out.println(str);
        }

        if(!(ctx.parent instanceof C2asmParser.Primary_expressionContext)){
            if(shouldReturn){
                expressionEvaluator.loadInnerExpression();
            }
            System.out.println("Expression parent is " + ctx.parent.getRuleIndex() + " so I will return");
            redirectListener.getCompilationUnit().parsedFunction.addCode(expressionEvaluator.getExpression());
            if(ctx.parent instanceof C2asmParser.Selection_statementContext && ctx.parent.getChild(0).getText().equals("if")){
                redirectListener.getCompilationUnit().addStatementJump(new IfStatement());
            }
            //System.out.println("WRACAM "+ ctx.parent.getText());
            redirectListener.setBaseListener(redirectListener.previousListener, this);
            System.out.println(expressionEvaluator.getExpression());
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
        expressions.add("Cast expression: " + ctx.getText());
    }

    @Override
    public void enterUnary_expression(C2asmParser.Unary_expressionContext ctx) {
        //baseListener.enterUnary_expression(ctx);
    }

    @Override
    public void exitUnary_expression(C2asmParser.Unary_expressionContext ctx) {
        //CASE 1: prefix expression
        if(ctx.children.size() == 2){
            String operator = ctx.children.get(0).getText();
            if(operator.equals("++")){
                expressionEvaluator.loadPrefixIncrementExpression();
            }
            else if(operator.equals("--")){
                expressionEvaluator.loadPrefixDecrementExpression();
            }
            else if(operator.equals("!")){
                expressionEvaluator.loadNotExpression();
            }
        }
    }

    @Override
    public void enterPostfix_expression(C2asmParser.Postfix_expressionContext ctx) {
        //CASE 1: method call
        if(ctx.children.size() == 4){
            List<C2asmParser.Argument_expression_listContext> argumentContexts =
                    ctx.argument_expression_list();
            String methodName = ctx.primary_expression().getText();
            if(argumentContexts != null && argumentContexts.size() > 0){
                shouldReturn = false;
                redirectListener.setBaseListener(new MethodCallListener(methodName), this);
            }
        }
        //CASE 2: postfix expression
        else if(ctx.children.size() == 2){
            String operator = ctx.children.get(1).getText();
            if(operator.equals("++")){
                expressionEvaluator.loadPostfixIncrementExpression();
            }
            else if(operator.equals("--")){
                expressionEvaluator.loadPostfixDecrementExpression();
            }
        }

    }

    @Override
    public void exitPostfix_expression(C2asmParser.Postfix_expressionContext ctx) {
        expressions.add("Postfix expression: " + ctx.getText());
    }

    @Override
    public void exitPrimary_expression(C2asmParser.Primary_expressionContext ctx) {
        expressions.add("Primary expression: " + ctx.getText());
        System.out.println("3 parent is: " + ctx.parent.parent.parent.getRuleIndex());
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
        //baseListener.enterAssignment_expression(ctx);
    }

    @Override
    public void exitAssignment_expression(C2asmParser.Assignment_expressionContext ctx) {
        if(ctx.children.size() > 1){
            expressionEvaluator.loadAssignmentExpression();
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
        expressionEvaluator.copyValues = false;
    }

    @Override
    public void exitLvalue(C2asmParser.LvalueContext ctx) {
        System.out.println("Lvalue id = " + ctx.getRuleIndex());
        expressionEvaluator.copyValues = true;
    }
}
