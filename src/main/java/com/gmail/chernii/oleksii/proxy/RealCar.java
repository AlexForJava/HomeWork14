package com.gmail.chernii.oleksii.proxy;

import com.gmail.chernii.oleksii.factory.method.Car;

/**
 * Created by Space on 12.04.2019.
 */
public class RealCar implements Image, Car {
    private String name;
    private int speed;

    public RealCar(String name, int speed) {
        this.name = name;
        this.speed = speed;
        load();
    }

    public void load() {
        System.out.println("loading..." + name);
    }

    @Override
    public void display() {
        System.out.println("display " + name);
    }

    @Override
    public void showInfo() {
        System.out.println(name + " " + speed);
        System.out.println(getClass().getSimpleName());
    }
}
