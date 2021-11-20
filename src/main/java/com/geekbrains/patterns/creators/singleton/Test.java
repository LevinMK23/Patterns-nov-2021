package com.geekbrains.patterns.creators.singleton;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        Thread[] threads = new Thread[20];
        for (int i = 0; i < 20; i++) {
            threads[i] = new Thread(() -> {
                Network instance = null;
                try {
                    instance = Network.getInstance();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                instance.writeMessage("Hello " + instance);
            });
        }


        Arrays.stream(threads)
                .parallel()
                .forEach(Thread::start);


    }
}
