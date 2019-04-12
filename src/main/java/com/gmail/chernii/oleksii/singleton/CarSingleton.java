package com.gmail.chernii.oleksii.singleton;

import com.gmail.chernii.oleksii.factory.method.Car;

/**
 * Created by Space on 12.04.2019.
 */
public class CarSingleton implements Car {
    private static volatile CarSingleton instance;

    private String name;
    private int speed;

    private CarSingleton(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public static CarSingleton getInstance(String name, int speed) {
        if (instance == null) {
            synchronized (CarSingleton.class) {
                if (instance == null) {
                    instance = new CarSingleton(name, speed);
                }
            }
        }
        return instance;
    }

    @Override
    public void showInfo() {
        System.out.println(name + " " + speed);
        System.out.println(getClass().getSimpleName());
    }
}
