package com.geekbrains.patterns.behavioral.mediator;

public class CommandResolver {

    public void resolve(Command command) {
        switch (command.getType()) {
            case UPLOAD -> {
                // TODO: 26.11.2021
            }
            case DOWNLOAD -> {
                // TODO: 26.11.2021
            }
            default -> {
                // TODO: 26.11.2021
            }
        }
    }

}
