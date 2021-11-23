package com.geekbrains.patterns.structures.composit;

public class Multiply extends BinaryExpression {

    public Multiply(Expression left, Expression right) {
        super(left, right, (x, y) -> x.eval().intValue() * y.eval().intValue(), "*");
    }
}
