package com.geekbrains.patterns.structures.proxy;

import java.time.Instant;

public class ConsoleCallerProxy implements Caller {

    private final Caller caller;

    public ConsoleCallerProxy(Caller caller) {
        this.caller = caller;
    }

    @Override
    public void call(String param) {
        long start = Instant.now().toEpochMilli();
        caller.call(param);
        long end = Instant.now().toEpochMilli();
        System.out.println("Invoked by " + (end - start) + " ms.");
    }
}
