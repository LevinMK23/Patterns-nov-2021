package com.geekbrains.patterns.creators.factory;

import java.util.concurrent.Executors;

public class ClientProcessor {

    public void clientSay(WordFactory wordFactory) {
        System.out.println(wordFactory.createWord());
    }

    public static void main(String[] args) {
        ClientProcessor clientProcessor = new ClientProcessor();
        clientProcessor.clientSay(new GoodWordFactory());
        clientProcessor.clientSay(new BadWordFactory());

        // Factory method -> Executors.new.....
    }

}
