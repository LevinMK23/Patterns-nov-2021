package com.geekbrains.patterns.behavioral.memo;

import java.io.IOException;
import java.time.Instant;

public class Test {

    private static void runWithTimer(FileReader reader) throws IOException {
        long start = Instant.now().toEpochMilli();
        for (int i = 0; i < 100; i++) {
            reader.readFile("dir/video.mov");
            // System.out.println("try " + (i + 1));
        }
        long end = Instant.now().toEpochMilli();
        System.out.println("Time: " + (end - start));
    }

    public static void main(String[] args) throws IOException {
        FileReader reader = new MacOsFileReader();
        runWithTimer(reader);

        FileReader cachedReader = new CachedFileReader(reader);
        runWithTimer(cachedReader);
    }
}
