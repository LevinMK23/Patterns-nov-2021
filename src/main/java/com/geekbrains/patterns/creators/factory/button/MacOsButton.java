package com.geekbrains.patterns.creators.factory.button;

public class MacOsButton implements Button {

    @Override
    public void render() {
        System.out.println("I'm mac OS button");
    }
}
