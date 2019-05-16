package com.gmail.chernii.oleksii.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Space on 12.04.2019.
 */
public class FlyweightApp {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        List<Shape> shapes = new ArrayList<>();
        shapes.add(shapeFactory.getShape("point"));
        shapes.add(shapeFactory.getShape("point"));
        shapes.add(shapeFactory.getShape("circle"));
        shapes.add(shapeFactory.getShape("circle"));

        shapes.forEach(e -> {
            int x = (int) (Math.random() * 10);
            int y = (int) (Math.random() * 10);
            e.draw(x, y);
        });
    }
}
