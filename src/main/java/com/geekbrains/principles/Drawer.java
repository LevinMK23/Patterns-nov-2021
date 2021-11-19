package com.geekbrains.principles;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Drawer {



    void drawAll(Shape[] shapes) {
        for (Shape shape : shapes) {
            shape.draw();
        }
        Stack s = new Stack();
        Queue q = new PriorityQueue();

        List list = new ArrayList();
        List list1 = new LinkedList();

    }

    void printSquare(Rectangle rectangle) {
        rectangle.setHeight(4);
        rectangle.setWidth(5);
        System.out.println(rectangle.getSquare()); // 20
    }

}
