package com.geekbrains.patterns.structures.adapter;

public class YServiceAdapter implements X {

    private Y y;

    public YServiceAdapter(Y y) {
        this.y = y;
    }

    @Override
    public int getInt() {
        return y.getYInt();
    }

    @Override
    public double getDouble() {
        return 0;
    }

}
