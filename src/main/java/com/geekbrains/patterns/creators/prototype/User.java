package com.geekbrains.patterns.creators.prototype;

public class User {

    private final String name;
    private final String surname;

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public User copy() {
        return new User(name, surname);
    }
}
