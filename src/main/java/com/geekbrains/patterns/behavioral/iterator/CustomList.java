package com.geekbrains.patterns.behavioral.iterator;

import java.util.Iterator;

public class CustomList<T> implements Iterable<T> {

    private int pos = 0;
    private T[] data;

    public CustomList(T... data) {
        this.data = data;
    }

    @Override
    public Iterator<T> iterator() {
        pos = 0;
        return new Iterator<>() {

            @Override
            public boolean hasNext() {
                return pos < data.length;
            }

            @Override
            public T next() {
                return data[pos++];
            }
        };
    }
}
