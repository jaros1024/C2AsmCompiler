package com.perez.jaroslav.compiler.listener.functional;

import com.perez.jaroslav.compiler.antlr.C2asmParser;
import com.perez.jaroslav.compiler.components.functions.Function;
import com.perez.jaroslav.compiler.listener.base.AbstractBaseListener;

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

        List<Function.Argument> args = new LinkedList<>();
        for(C2asmParser.Parameter_declarationContext param : params){
            if(param.declaration_specifiers() == null){
                continue;
            }
            String paramType = param.declaration_specifiers().type_specifier(0).getText();
            String paramName = param.declaration_specifiers().type_specifier(1).getText();

            Function.Argument argument = new Function.Argument();
            argument.name = paramName;
            argument.type = paramType;
            args.add(argument);
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

        List<Function.Argument> args = new LinkedList<>();

        if(ctx.function_direct_declarator().parameter_type_list().size() > 0){
            List<C2asmParser.Parameter_declarationContext> params = ctx.function_direct_declarator().parameter_type_list().
                    get(0).parameter_list().parameter_declaration();


            for(C2asmParser.Parameter_declarationContext param : params){
                if(param.declaration_specifiers() == null){
                    continue;
                }
                String paramType = param.declaration_specifiers().type_specifier(0).getText();
                String paramName = param.declaration_specifiers().type_specifier(1).getText();

                Function.Argument argument = new Function.Argument();
                argument.name = paramName;
                argument.type = paramType;
                args.add(argument);
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
        redirectListener.getCompilationUnit().addGlobal(identifier, type, value);
    }

    @Override
    public void enterJump_statement(C2asmParser.Jump_statementContext ctx) {
        String jump = ctx.getRuleContext().getChild(0).getText();
        if(jump.equals("return")){
            if(ctx.getRuleContext().getChildCount() == 3){
                redirectListener.setBaseListener(new ReturnListener(redirectListener.getCompilationUnit().parsedFunction));
            }
            else {
                redirectListener.getCompilationUnit().parsedFunction.functionReturn();
            }
        }
        else if(jump.equals("break")){
            //todo implement break
        }
        else if(jump.equals("continue")){
            //todo implement continue
        }
    }

    @Override
    public void enterPostfix_expression(C2asmParser.Postfix_expressionContext ctx) {
        List<C2asmParser.Argument_expression_listContext> argumentContexts =
                ctx.argument_expression_list();
        String methodName = ctx.primary_expression().getText();
        if(argumentContexts != null && argumentContexts.size() > 0){
            redirectListener.setBaseListener(new MethodCallListener(methodName));
        }
    }

}
