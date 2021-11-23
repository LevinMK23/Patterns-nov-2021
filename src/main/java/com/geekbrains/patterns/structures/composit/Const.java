package com.geekbrains.patterns.structures.composit;

public class Const extends UnaryExpression {

    private final Number value;

    public Const(Number value) {
        this.value = value;
    }

    @Override
    public Number eval() {
        return value;
    }

    @Override
    public String toStr() {
        return String.valueOf(value);
    }
}
