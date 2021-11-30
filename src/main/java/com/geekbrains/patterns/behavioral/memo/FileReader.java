package com.geekbrains.patterns.behavioral.memo;

import java.io.IOException;

public interface FileReader {

    FileData readFile(String res) throws IOException;

}
