package com.geekbrains.patterns.creators.builder;

import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {

        Dto dto = Dto.builder()
                .s("")
                .x(1)
                .build();

        User user = User.builder()
                .withName("")
                .withPhone("")
                .build();

        // Retrofit, RestAssured, HttpSecurity
        // Glide, Firebase

//        Stream.of(1,2,3)
//                .map()
//                .filter()
//                .limit();


    }
}
