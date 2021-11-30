package com.geekbrains.patterns.arch.part1.floatValue;

public class Test {

    public static void main(String[] args) {

        double d = 1 / 3.;
        float f = 1 / 3f;

        // 10 ^ 17 - 0 - 10
        // 10 ^ 18 - 0 - 100
        // 10 ^ 19 - 0 - 1000
        long x; // 0 .. 10 ^ 19

        // b, m, k, usd, cents

        System.out.printf("%.17f\n%.17f\n", d, f);
    }
}
