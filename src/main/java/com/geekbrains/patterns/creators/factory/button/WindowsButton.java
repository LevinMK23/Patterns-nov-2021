package com.geekbrains.patterns.creators.factory.button;

public class WindowsButton implements Button {

    @Override
    public void render() {
        System.out.println("I'm windows button");
    }
}
