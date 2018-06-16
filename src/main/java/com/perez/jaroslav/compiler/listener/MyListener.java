package com.perez.jaroslav.compiler.listener;


import com.perez.jaroslav.compiler.antlr.C2asmBaseListener;
import com.perez.jaroslav.compiler.antlr.C2asmListener;
import com.perez.jaroslav.compiler.antlr.C2asmParser;
import com.perez.jaroslav.compiler.components.Function;
import com.perez.jaroslav.compiler.exceptions.BadSyntaxException;
import com.perez.jaroslav.compiler.program.CompilationUnit;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.List;

public class MyListener extends C2asmBaseListener {
	private PrintStream writer;

	private CompilationUnit compilationUnit;

	public MyListener(PrintStream writer){
		this.writer = writer;
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

        compilationUnit.addFunction(name, type, args);
        compilationUnit.startFunction(name);
    }

    @Override
    public void exitFunction_definition(C2asmParser.Function_definitionContext ctx) {
        compilationUnit.endFunction();
    }

    @Override
    public void enterInclude(C2asmParser.IncludeContext ctx) {
        //
    }

    @Override
    public void enterDefine(C2asmParser.DefineContext ctx) {
        compilationUnit.addDefine(ctx.IDENTIFIER().getText(), ctx.DECIMAL_LITERAL().getText());
    }

    @Override
    public void enterFunction_declaration(C2asmParser.Function_declarationContext ctx) {
        String type = ctx.declaration_specifiers().type_specifier(0).getText();
        String name = ctx.function_direct_declarator().IDENTIFIER().getText();

        List<C2asmParser.Parameter_declarationContext> params = ctx.function_direct_declarator().parameter_type_list().
                get(0).parameter_list().parameter_declaration();

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

        compilationUnit.addFunction(name, type, args);
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
        compilationUnit.addGlobal(identifier, type, value);
    }

    @Override
    public void enterAdditive_expression(C2asmParser.Additive_expressionContext ctx){
        //
    }
}