package com.geekbrains.patterns.structures.composit;

public interface Expression {

    Number eval();
    String toStr();

    default void print() {
        System.out.println(toStr() + "=" + eval());
    }

}
