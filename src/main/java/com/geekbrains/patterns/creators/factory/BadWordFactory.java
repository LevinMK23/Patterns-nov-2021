package com.geekbrains.patterns.creators.factory;

public class BadWordFactory implements WordFactory {

    @Override
    public String createWord() {
        return "Fuck";
    }
}
