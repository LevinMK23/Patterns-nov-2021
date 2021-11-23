package com.geekbrains.patterns.structures.proxy.transaction;

import java.util.List;

public class DbService {

    public List<String> getUsers() {
        // big function
        // many sql queries
        return List.of();
    }

}
