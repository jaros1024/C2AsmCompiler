package com.perez.jaroslav.compiler.components.variables;

import com.perez.jaroslav.compiler.components.variables.Global;

public class Variable extends AbstractVariable {
    public String address;

    public Variable() {
    }

    public Variable(String name, String type, String value, String address) {
        this.name = name;
        this.type = type;
        this.value = value;
        this.address = address;
    }
}
