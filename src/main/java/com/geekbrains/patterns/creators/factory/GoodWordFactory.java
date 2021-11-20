package com.geekbrains.patterns.creators.factory;

public class GoodWordFactory implements WordFactory {

    @Override
    public String createWord() {
        return "Hello";
    }
}
