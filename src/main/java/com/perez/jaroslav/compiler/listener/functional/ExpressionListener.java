package com.perez.jaroslav.compiler.listener.functional;

import com.perez.jaroslav.compiler.antlr.C2asmParser;
import com.perez.jaroslav.compiler.components.variables.Variable;
import com.perez.jaroslav.compiler.expressions.PrimaryExpression;
import com.perez.jaroslav.compiler.expressions.evaluator.ExpressionEvaluator;
import com.perez.jaroslav.compiler.helpers.VariableHelper;
import com.perez.jaroslav.compiler.listener.base.AbstractBaseListener;
import org.antlr.v4.runtime.tree.ParseTree;

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
        if(ctx.parent.getRuleIndex() != 48){
            if(shouldReturn){
                expressionEvaluator.loadInnerExpression();
            }
            redirectListener.getCompilationUnit().parsedFunction.addCode(expressionEvaluator.getExpression());
            redirectListener.setBaseListener(new MainListener(), this);
            System.out.println(expressionEvaluator.getExpression());
        }
        else {
            expressionEvaluator.loadInnerExpression();
        }
        //dodanie jumpa do ifa gdy jest to wyrazenie ewaluacyjne ifa
        if(ctx.parent.getRuleIndex() == 69 && ctx.parent.getChild(0).getText().equals("if")){
            redirectListener.getCompilationUnit().addIfJump();
        }
    }

    @Override
    public void enterAdditive_expression(C2asmParser.Additive_expressionContext ctx) {
        //baseListener.enterAdditive_expression(ctx);
    }

    @Override
    public void exitAdditive_expression(C2asmParser.Additive_expressionContext ctx) {
        expressions.add("Additive expression: "+ctx.getText());
        if(ctx.children.size() > 1){
            expressionEvaluator.loadAdditiveExpression();
        }
    }

    @Override
    public void enterMultiplicative_expression(C2asmParser.Multiplicative_expressionContext ctx) {
        //baseListener.enterMultiplicative_expression(ctx);
    }

    @Override
    public void exitMultiplicative_expression(C2asmParser.Multiplicative_expressionContext ctx) {
        if(ctx.children.size() > 1){
            expressionEvaluator.loadMultiplicativeExpression();
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
        expressions.add("Unary expression: " + ctx.getText());
    }

    @Override
    public void enterPostfix_expression(C2asmParser.Postfix_expressionContext ctx) {
        //baseListener.enterPostfix_expression(ctx);
    }

    @Override
    public void exitPostfix_expression(C2asmParser.Postfix_expressionContext ctx) {
        expressions.add("Postfix expression: " + ctx.getText());
    }

    @Override
    public void enterPrimary_expression(C2asmParser.Primary_expressionContext ctx) {
        //baseListener.enterPrimary_expression(ctx);
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
            }
            else {
                primaryExpression.type = PrimaryExpression.TYPE_CONST;
                primaryExpression.operand = "$" + ctx.getText();
            }
            System.out.println("Primary expression operand is: " + primaryExpression.operand);
            expressionEvaluator.loadPrimaryExpression(primaryExpression.operand);
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
        expressions.add("Relational expression: " + ctx.getText());
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
