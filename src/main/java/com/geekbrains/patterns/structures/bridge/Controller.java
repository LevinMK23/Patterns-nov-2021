package com.geekbrains.patterns.structures.bridge;

public interface Controller {

    void on();
    void off();
    void next();
    void prev();
    void digit(int digit);
    void plus();
    void minus();

    // new methods

}
