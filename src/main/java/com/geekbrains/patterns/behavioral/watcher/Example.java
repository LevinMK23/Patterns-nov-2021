package com.geekbrains.patterns.behavioral.watcher;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.List;

import static java.nio.file.StandardWatchEventKinds.ENTRY_CREATE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_DELETE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_MODIFY;

public class Example {

    public static void main(String[] args) throws IOException {

        WatchService service = FileSystems.getDefault().newWatchService();

        new Thread(() -> {
            try {
                while (true) {
                    WatchKey key = service.take();
                    List<WatchEvent<?>> events = key.pollEvents();
                    for (WatchEvent<?> event : events) {
                        System.out.println(event.kind() + " " + event.context());
                    }
                    key.reset();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }).start();

        Path.of("dir")
                .register(service, ENTRY_MODIFY, ENTRY_DELETE, ENTRY_CREATE);
    }
}
