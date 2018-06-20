package com.perez.jaroslav.compiler.components.statement;

import com.perez.jaroslav.compiler.util.RandomString;

public abstract class SelectionStatement {
    public String label = new RandomString(8).nextString();
}
