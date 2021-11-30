package com.geekbrains.patterns.behavioral.mediator;

public interface Command {
    CommandType getType();
    void doAction();
}
