package com.perez.jaroslav.compiler.components.variables;

public class Global extends AbstractVariable {
    public Global() {
    }

    public Global(String name, String type, String value, boolean pointer) {
        this.name = name;
        this.type = type;
        this.value = value;
        this.pointer = pointer;
    }
}
