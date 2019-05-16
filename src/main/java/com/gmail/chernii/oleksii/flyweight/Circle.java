package com.gmail.chernii.oleksii.flyweight;

import lombok.AllArgsConstructor;

/**
 * Created by Space on 12.04.2019.
 */
@AllArgsConstructor
public class Circle implements Shape {
    private int radius;

    @Override
    public void draw(int x, int y) {
        System.out.println(" Draw circle radius  " + radius + "  x = " + x + "; y = " + y);
    }
}
