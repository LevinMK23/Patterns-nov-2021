package com.geekbrains.patterns.structures.composit;

public abstract class UnaryExpression implements Expression {

    private Expression expression;

    @Override
    public String toString() {
        return toStr();
    }
}
