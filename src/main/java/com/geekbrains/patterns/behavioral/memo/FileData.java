package com.geekbrains.patterns.behavioral.memo;

public class FileData {

    private final byte[] data;

    public FileData(byte[] data) {
        this.data = data;
    }

    public byte[] getData() {
        return data;
    }
}
