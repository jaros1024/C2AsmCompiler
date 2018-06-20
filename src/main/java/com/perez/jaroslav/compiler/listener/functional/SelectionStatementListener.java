package com.perez.jaroslav.compiler.listener.functional;

import com.perez.jaroslav.compiler.antlr.C2asmParser;
import com.perez.jaroslav.compiler.components.statement.IfStatement;
import com.perez.jaroslav.compiler.components.statement.SwitchStatement;
import com.perez.jaroslav.compiler.listener.base.AbstractBaseListener;

public class SelectionStatementListener extends AbstractBaseListener {

    @Override
    public void exitSelection_statement(C2asmParser.Selection_statementContext ctx) {
        if(ctx.getChild(0).getText().equals("if") && ctx.getChildCount() == 5){
            redirectListener.getCompilationUnit().addStatementLabel();
            redirectListener.setBaseListener(new MainListener(), this);
        }/*else if(ctx.getChild(0).getText().equals("switch")){
            redirectListener.setBaseListener(new MainListener(), this);
        }*/
    }

    @Override
    public void enterStatement(C2asmParser.StatementContext ctx) {
        if(ctx.parent instanceof C2asmParser.Labeled_statementContext && ctx.parent.getChild(0).getText().equals("case")){
            redirectListener.getCompilationUnit().addStatementJump(new SwitchStatement());
        }
    }

    @Override
    public void exitLabeled_statement(C2asmParser.Labeled_statementContext ctx) {
        if( ctx.getChild(0).getText().equals("case")){
            redirectListener.getCompilationUnit().addStatementLabel();
        }
    }

    @Override
    public void enterExpression(C2asmParser.ExpressionContext ctx) {
        redirectListener.setBaseListener(new ExpressionListener(), this);
    }

    @Override
    public void enterElse_statement(C2asmParser.Else_statementContext ctx) {
        redirectListener.getCompilationUnit().addStatementLabel();
    }
}
