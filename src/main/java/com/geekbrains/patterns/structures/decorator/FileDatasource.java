package com.geekbrains.patterns.structures.decorator;

public class FileDatasource implements Datasource {

    // special logic for file

    @Override
    public void write(Object data) {

    }

    @Override
    public Object read() {
        return null;
    }
}
