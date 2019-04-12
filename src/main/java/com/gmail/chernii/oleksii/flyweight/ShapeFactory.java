package com.gmail.chernii.oleksii.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Space on 12.04.2019.
 */
public class ShapeFactory {
    private static final Map<String, Shape> shapes = new HashMap<>();

    public Shape getShape(String shapeName) {
        Shape shape = shapes.get(shapeName);
        if (shape == null) {
            if (shapeName.equalsIgnoreCase("point")) {
                shape = new Point();
            }
            if (shapeName.equalsIgnoreCase("circle")) {
                shape = new Circle((int) Math.random() * 10);
            }
            shapes.put(shapeName, shape);
        }
        return shape;
    }
}
