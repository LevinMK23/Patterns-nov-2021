package com.geekbrains.patterns.behavioral.memo;

import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MacOsFileReader implements FileReader {

    @Override
    public FileData readFile(String res) throws IOException {
        return new FileData(Files.readAllBytes(Path.of(res)));
    }

}
