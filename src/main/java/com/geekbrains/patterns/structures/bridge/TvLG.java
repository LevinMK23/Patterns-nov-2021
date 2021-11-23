package com.geekbrains.patterns.structures.bridge;

public class TvLG implements TvDevice {

    private final Controller remote;

    public TvLG(Controller remote) {
        this.remote = remote;
    }

    @Override
    public void on() {
        remote.on();
    }

    @Override
    public void off() {
        remote.off();
    }

    @Override
    public void volumeUp() {
        remote.plus();
    }

    @Override
    public void volumeDown() {
        remote.minus();
    }

    @Override
    public void nextChannel() {
        remote.next();
    }

    @Override
    public void previousChannel() {
        remote.prev();
    }

    @Override
    public void toChannel(int channel) {
        remote.digit(channel);
    }
}
