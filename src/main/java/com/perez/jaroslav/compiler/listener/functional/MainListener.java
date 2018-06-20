package com.perez.jaroslav.compiler.listener.functional;

import com.perez.jaroslav.compiler.antlr.C2asmLexer;
import com.perez.jaroslav.compiler.antlr.C2asmParser;
import com.perez.jaroslav.compiler.components.statement.SwitchStatement;
import com.perez.jaroslav.compiler.components.variables.ArgumentVariable;
import com.perez.jaroslav.compiler.listener.base.AbstractBaseListener;
import com.perez.jaroslav.compiler.program.CompilationUnit;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class MainListener extends AbstractBaseListener {

    @Override
    public void enterFunction_definition(C2asmParser.Function_definitionContext ctx) {
        String type = ctx.declaration_specifiers().type_specifier(0).getText();
        String name = ctx.function_direct_declarator().IDENTIFIER().getText();

        List<C2asmParser.Parameter_declarationContext> params;
        if(ctx.function_direct_declarator().parameter_type_list().size() > 0){
            params = ctx.function_direct_declarator().parameter_type_list().
                    get(0).parameter_list().parameter_declaration();
        }
        else {
            params = new LinkedList<>();
        }

        HashMap<String, ArgumentVariable> args = new HashMap<>();
        int argCount = 0;
        for(C2asmParser.Parameter_declarationContext param : params){
            if(param.declaration_specifiers() == null){
                continue;
            }
            String paramType = param.declaration_specifiers().type_specifier(0).getText();
            String paramName = param.declaration_specifiers().type_specifier(1).getText();

            ArgumentVariable argument = new ArgumentVariable();
            argument.name = paramName;
            argument.type = paramType;
            argument.storageType = ArgumentVariable.TYPE_STACK;
            argument.location = Integer.valueOf(argCount).toString();
            args.put(argument.name, argument);
        }

        redirectListener.getCompilationUnit().addFunction(name, type, args);
        redirectListener.getCompilationUnit().startFunction(name);
    }

    @Override
    public void exitFunction_definition(C2asmParser.Function_definitionContext ctx) {
        redirectListener.getCompilationUnit().endFunction();
    }

    @Override
    public void enterHeader_file(C2asmParser.Header_fileContext ctx) {
        redirectListener.getCompilationUnit().addHeader(ctx.IDENTIFIER().getText());
    }

    @Override
    public void enterDefine(C2asmParser.DefineContext ctx) {
        redirectListener.getCompilationUnit().addDefine(ctx.IDENTIFIER().getText(), ctx.DECIMAL_LITERAL().getText());
    }

    @Override
    public void enterFunction_declaration(C2asmParser.Function_declarationContext ctx) {
        String type = ctx.declaration_specifiers().type_specifier(0).getText();
        String name = ctx.function_direct_declarator().IDENTIFIER().getText();

        HashMap<String, ArgumentVariable> args = new HashMap<>();

        if(ctx.function_direct_declarator().parameter_type_list().size() > 0){
            List<C2asmParser.Parameter_declarationContext> params = ctx.function_direct_declarator().parameter_type_list().
                    get(0).parameter_list().parameter_declaration();

            int argCount = 0;
            for(C2asmParser.Parameter_declarationContext param : params){
                if(param.declaration_specifiers() == null){
                    continue;
                }
                String paramType = param.declaration_specifiers().type_specifier(0).getText();
                String paramName = param.declaration_specifiers().type_specifier(1).getText();

                ArgumentVariable argument = new ArgumentVariable();
                argument.name = paramName;
                argument.type = paramType;
                argument.storageType = ArgumentVariable.TYPE_STACK;
                argument.location = Integer.valueOf(argCount).toString();
                args.put(argument.name, argument);
            }
        }

        redirectListener.getCompilationUnit().addFunction(name, type, args);
    }

    @Override
    public void enterVariable_declaration(C2asmParser.Variable_declarationContext ctx) {
        String type = ctx.declaration_specifiers().type_specifier(0).getText();
        List<C2asmParser.Init_declaratorContext> contexts = ctx.variable_init_declarator_list().init_declarator();
        String identifier = contexts.get(0).variable_declarator().getText();
        String value = "0";
        if(contexts.get(0).initializer() != null){
            value = contexts.get(0).initializer().assignment_expression().getText();
        }
        boolean pointer = (contexts.get(0).variable_declarator().pointer() != null);
        CompilationUnit compilationUnit = redirectListener.getCompilationUnit();
        //if we are not in function, then make a global
        if(compilationUnit.parsedFunction == null){
            compilationUnit.addGlobal(identifier, type, value, pointer);
        }
        //otherwise make a local variable
        else {
            compilationUnit.parsedFunction.addLocalVariable(identifier, type, value, pointer);
        }
    }

    @Override
    public void enterJump_statement(C2asmParser.Jump_statementContext ctx) {
        String jump = ctx.getRuleContext().getChild(0).getText();
        if(jump.equals("return")){
            if(ctx.getRuleContext().getChildCount() == 3){
                redirectListener.setBaseListener(new ReturnListener(redirectListener.getCompilationUnit().parsedFunction), this);
            }
            else {
                redirectListener.getCompilationUnit().parsedFunction.functionReturn();
            }
        }
        else if(jump.equals("break")){
            redirectListener.getCompilationUnit().doBreak();
        }
        else if(jump.equals("continue")){
            redirectListener.getCompilationUnit().doContinue();
        }
    }

    @Override
    public void enterPostfix_expression(C2asmParser.Postfix_expressionContext ctx) {
        //if this postfix expression is a method call expression
        List<C2asmParser.Argument_expression_listContext> argumentContexts =
                ctx.argument_expression_list();
        String methodName = ctx.primary_expression().getText();
        if(argumentContexts != null && argumentContexts.size() > 0){
            redirectListener.setBaseListener(new MethodCallListener(methodName), this);
        }
    }

    @Override
    public void enterWhile_statement(C2asmParser.While_statementContext ctx) {
        redirectListener.getCompilationUnit().addWhileLoop();
        redirectListener.setBaseListener(new ExpressionListener(), this);
    }

    @Override
    public void exitWhile_statement(C2asmParser.While_statementContext ctx) {
        redirectListener.getCompilationUnit().removeWhileLoop();
    }

    @Override
    public void enterDo_statement(C2asmParser.Do_statementContext ctx) {
        redirectListener.getCompilationUnit().addDoLoop();
    }

    @Override
    public void exitDo_statement(C2asmParser.Do_statementContext ctx) {
        redirectListener.getCompilationUnit().removeDoLoop();
    }

    @Override
    public void enterFor_statement(C2asmParser.For_statementContext ctx) {
        redirectListener.getCompilationUnit().addForLoop();
    }

    @Override
    public void exitFor_statement(C2asmParser.For_statementContext ctx) {
        redirectListener.getCompilationUnit().removeForLoop();
    }

    @Override
    public void enterExpression(C2asmParser.ExpressionContext ctx) {
        redirectListener.setBaseListener(new ExpressionListener(), this);
    }

    @Override
    public void enterStatement(C2asmParser.StatementContext ctx) {
        //if statement parent is while, then compare rax and make a jump
        if (ctx.parent instanceof C2asmParser.While_statementContext) {
            redirectListener.getCompilationUnit().addLoopJumpToEnd();
        }
    }

    @Override
    public void enterElse_statement(C2asmParser.Else_statementContext ctx) {
        redirectListener.getCompilationUnit().addIfLabel();
    }

    @Override
    public void exitStatement(C2asmParser.StatementContext ctx) {
        //gdy rodzic to selection statement i nie ma else
        if(ctx.parent instanceof C2asmParser.Selection_statementContext && ctx.parent.getChildCount() == 5
                && ctx.parent.getChild(0).getText().equals("if")){
            redirectListener.getCompilationUnit().addIfLabel();
        }
        else if(ctx.parent instanceof C2asmParser.Labeled_statementContext && ctx.parent.getChild(0).getText().equals("case")){
            redirectListener.getCompilationUnit().addIfLabel();
        }else if(ctx.parent instanceof C2asmParser.Labeled_statementContext && ctx.parent.getChild(0).getText().equals("default")){
            //  redirectListener.getCo
        }
    }
}
