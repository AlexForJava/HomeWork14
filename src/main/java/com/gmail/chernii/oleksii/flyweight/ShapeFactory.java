package com.gmail.chernii.oleksii.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Space on 12.04.2019.
 */
public class ShapeFactory {
    private static final Map<String, Shape> shapes = new HashMap<>();
    private static final String POINT = "point";
    private static final String CIRCLE = "circle";

    public Shape getShape(String shapeName) {
        Shape shape = shapes.get(shapeName);
        if (shape == null) {
            if (POINT.equalsIgnoreCase(shapeName)) {
                shape = new Point();
            }
            if (CIRCLE.equalsIgnoreCase(shapeName)) {
                shape = new Circle((int) Math.random() * 10);
            }
            shapes.put(shapeName, shape);
        }
        return shape;
    }
}
