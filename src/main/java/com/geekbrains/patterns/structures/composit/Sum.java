package com.geekbrains.patterns.structures.composit;

public class Sum extends BinaryExpression {

    public Sum(Expression left, Expression right) {
        super(left, right,
                (left1, right1) -> left1.eval().intValue() + right1.eval().intValue(),
                "+"
        );
    }
}
