package com.geekbrains.patterns.structures.decorator;

public interface Datasource {

    void write(Object data);
    Object read();

}
