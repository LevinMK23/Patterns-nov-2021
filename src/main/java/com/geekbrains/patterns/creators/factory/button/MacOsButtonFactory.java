package com.geekbrains.patterns.creators.factory.button;

public class MacOsButtonFactory implements ButtonFactory {

    @Override
    public Button createButton() {
        return new MacOsButton();
    }
}
