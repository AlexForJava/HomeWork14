package com.gmail.chernii.oleksii.flyweight;

/**
 * Created by Space on 12.04.2019.
 */
public class Point implements Shape {
    @Override
    public void draw(int x, int y) {
        System.out.println("Point (" + x + ", " + y + ")");
    }
}
