package com.geekbrains.principles;

public class Rectangle extends Shape {

    private double width, height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    void draw() {

    }

    @Override
    double getSquare() {
        return 0;
    }
}
