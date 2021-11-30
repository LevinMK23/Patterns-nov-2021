package com.geekbrains.patterns.behavioral.memo;

import java.io.IOException;
import java.util.HashMap;

public class CachedFileReader implements FileReader {

    private final HashMap<String, FileData> cache;
    private final FileReader delegate;

    public CachedFileReader(FileReader delegate) {
        cache = new HashMap<>();
        this.delegate = delegate;
    }

    @Override
    public FileData readFile(String res) throws IOException {
        if (cache.containsKey(res)) {
            return cache.get(res);
        }
        cache.put(res, delegate.readFile(res));
        return cache.get(res);
    }
}
