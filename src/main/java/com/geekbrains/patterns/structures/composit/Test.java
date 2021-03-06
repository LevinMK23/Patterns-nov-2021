package com.geekbrains.patterns.structures.composit;

public class Test {

    public static void main(String[] args) {

        Expression expression = new Multiply(
                new Sum(new Const(2), new Const(3)),
                new Sum(new Const(4), new Const(5))
        );

        expression.print();
        System.out.println(expression.eval());
    }
}
