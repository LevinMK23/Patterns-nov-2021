package com.geekbrains.patterns.behavioral.visitor;

public class FinalList {

    private final Object[] data;

    public FinalList(Object... objects) {
        data = objects;
    }

    void forEach(Visitor visitor) {
        for (Object o : data) {
            visitor.visit(o);
        }
    }

}
