package com.geekbrains.patterns.structures.bridge;

public interface TvDevice {

    void on();
    void off();
    void volumeUp();
    void volumeDown();
    void nextChannel();
    void previousChannel();
    void toChannel(int channel);

    // new methods

}
