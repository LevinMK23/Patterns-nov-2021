package com.geekbrains.patterns.behavioral.visitor;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

import com.geekbrains.patterns.structures.composit.Const;
import com.geekbrains.patterns.structures.composit.Sum;

public class Example {

    public static void main(String[] args) throws IOException {


//        Files.walkFileTree(Path.of("./"), new SimpleFileVisitor<>() {
//            @Override
//            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
//                // TODO: 26.11.2021
//                return super.visitFile(file, attrs);
//            }
//        });

        FinalList list = new FinalList("123", 23, new Sum(new Const(1), new Const(2)));
        list.forEach(o -> System.out.print(o + " "));

    }
}
