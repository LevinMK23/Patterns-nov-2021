package com.geekbrains.patterns.structures.composit;

public abstract class BinaryExpression implements Expression {

    private final Expression left;
    private final Expression right;
    private final Function function;
    private final String printCode;

    public BinaryExpression(Expression left,
                            Expression right,
                            Function function,
                            String printCode) {
        this.left = left;
        this.right = right;
        this.function = function;
        this.printCode = printCode;
    }

    @Override
    public Number eval() {
        return function.apply(left, right);
    }

    @Override
    public String toStr() {
        return String.format("(%s%s%s)", left.toStr(), printCode, right.toStr());
    }

    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }
}
