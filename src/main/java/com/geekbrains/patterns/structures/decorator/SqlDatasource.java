package com.geekbrains.patterns.structures.decorator;

public class SqlDatasource implements Datasource {

    // special for db

    @Override
    public void write(Object data) {

    }

    @Override
    public Object read() {
        return null;
    }
}
