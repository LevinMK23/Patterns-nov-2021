package com.geekbrains.patterns.creators.singleton;

public class Network {

    public static final Network I = new Network();

    private static final Network instance = new Network();

    private Network() {
    }

    public static Network getInstance() throws InterruptedException {
        return instance;
    }

    public String readMessage() {
        // some impl
        return "Msg";
    }

    public void writeMessage(String msg) {
        System.out.println(msg);
    }

}
