package com.geekbrains.patterns.creators.factory.button;

public interface Button {

    void render();

    default void onClick() {
        System.out.println("I'm clicked!");
        render();
    }

}
