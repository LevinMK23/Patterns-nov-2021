package com.geekbrains.patterns.structures.proxy;

public class ConsoleCaller implements Caller {

    @Override
    public void call(String param) {
        System.out.println(param);
    }
}
