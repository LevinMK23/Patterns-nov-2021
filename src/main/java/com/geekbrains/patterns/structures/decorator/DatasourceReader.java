package com.geekbrains.patterns.structures.decorator;

public class DatasourceReader {

    private final Datasource datasource;

    public DatasourceReader(Datasource datasource) {
        this.datasource = datasource;
    }

    public void writeData(Object data) {
        datasource.write(data);
    }

    public Object readDate() {
        return datasource.read();
    }

}
