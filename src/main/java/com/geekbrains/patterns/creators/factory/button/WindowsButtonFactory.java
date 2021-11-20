package com.geekbrains.patterns.creators.factory.button;

public class WindowsButtonFactory implements ButtonFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
