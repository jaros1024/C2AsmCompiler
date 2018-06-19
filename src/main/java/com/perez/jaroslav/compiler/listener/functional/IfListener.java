package com.perez.jaroslav.compiler.listener.functional;

import com.perez.jaroslav.compiler.antlr.C2asmParser;
import com.perez.jaroslav.compiler.components.Expression.Expression;
import com.perez.jaroslav.compiler.listener.base.AbstractBaseListener;
import com.perez.jaroslav.compiler.util.RandomString;

import java.util.concurrent.ThreadLocalRandom;


public class IfListener extends MainListener {

    private String lastLabel;

    @Override
    public void exitSelection_statement(C2asmParser.Selection_statementContext ctx){

        redirectListener.setBaseListener(new MainListener());
    }

    @Override
    public void enterEquality_expression(C2asmParser.Equality_expressionContext ctx){
        if(ctx.getChildCount() > 2) {
            String operator = ctx.getChild(1).getText();
            String leftExpr = ctx.getChild(0).getText();
            String rightExpr = ctx.getChild(2).getText();

            Expression expr = new Expression(operator, leftExpr, rightExpr);
            addCode(expr.generate(operator));

            RandomString gen = new RandomString(6, ThreadLocalRandom.current());
            lastLabel = gen.nextString().toLowerCase();
            addCode(expr.addJumpAndLabel(operator, lastLabel));
        }
    }


    @Override
    public void enterRelational_expression(C2asmParser.Relational_expressionContext ctx){
        if(ctx.getChildCount() > 2) {
            String operator = ctx.getChild(1).getText();
            String leftExpr = ctx.getChild(0).getText();
            String rightExpr = ctx.getChild(2).getText();

            Expression expr = new Expression(operator, leftExpr, rightExpr);
            addCode(expr.generate(operator));
            RandomString gen = new RandomString(6, ThreadLocalRandom.current());
            lastLabel = gen.nextString().toLowerCase();
            addCode(expr.addJumpAndLabel(operator, lastLabel));
        }
    }

    private void addCode(String string) {
        redirectListener.getCompilationUnit().parsedFunction.addCode(string);
    }
}



