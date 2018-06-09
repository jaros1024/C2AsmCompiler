package com.perez.jaroslav.compiler;

import com.perez.jaroslav.compiler.listener.MyListener;
import com.perez.jaroslav.compiler.antlr.C2asmLexer;
import com.perez.jaroslav.compiler.antlr.C2asmParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ANTLRInputStream input = null;
        try {
            // load sample program to compile
            input = new ANTLRInputStream(new FileInputStream("program.c"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        C2asmLexer lexer = new C2asmLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        C2asmParser parser = new C2asmParser(tokens);
        ParseTree tree = parser.compilationUnit();

        MyListener listener = new MyListener();
        ParseTreeWalker.DEFAULT.walk(listener, tree);
    }

}
