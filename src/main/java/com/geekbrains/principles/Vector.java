package com.geekbrains.principles;

public class Vector {

    int x, y;

    public Vector(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Vector sum(Vector v) {
        return sum(this, v);
    }

    Vector sum(Vector v, Vector w) {
        return new Vector(v.x - w.x, v.y - w.y);
    }
}
