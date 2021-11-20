package com.geekbrains.patterns.creators.factory.button;

public class UiDesigner {

    Button getButton(ButtonFactory buttonFactory) {
        return buttonFactory.createButton();
    }

    public static void main(String[] args) {

        UiDesigner designer = new UiDesigner();

        Button win = designer.getButton(new WindowsButtonFactory());
        win.onClick();

        Button mac = designer.getButton(new MacOsButtonFactory());
        mac.onClick();

    }

}
