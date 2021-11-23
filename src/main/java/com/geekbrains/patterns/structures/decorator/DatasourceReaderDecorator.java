package com.geekbrains.patterns.structures.decorator;

public class DatasourceReaderDecorator extends DatasourceReader {

    public DatasourceReaderDecorator(Datasource datasource) {
        super(datasource);
    }

    @Override
    public void writeData(Object data) {
        super.writeData(data);
        // add
    }

    @Override
    public Object readDate() {
        // add
        return super.readDate();
    }
}
