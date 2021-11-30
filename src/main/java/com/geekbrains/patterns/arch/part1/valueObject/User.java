package com.geekbrains.patterns.arch.part1.valueObject;

import lombok.AllArgsConstructor;
import lombok.Data;

// value object - instance of data class
@Data
@AllArgsConstructor
public class User {

    // final fields !!!
    // getters
    // no setters
    // Builder

    private final String name;
    private final String surname;


}
