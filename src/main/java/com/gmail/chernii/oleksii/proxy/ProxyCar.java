package com.gmail.chernii.oleksii.proxy;

import com.gmail.chernii.oleksii.factory.method.Car;

/**
 * Created by Space on 12.04.2019.
 */
public class ProxyCar implements Image, Car {
    private String name;
    private int speed;
    private RealCar realrealCar;

    public ProxyCar(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    @Override
    public void display() {
        if (realrealCar == null) {
            realrealCar = new RealCar(name, speed);
        }
        realrealCar.display();
    }

    @Override
    public void showInfo() {
        if (realrealCar == null) {
            realrealCar = new RealCar(name, speed);
        }
        realrealCar.showInfo();
    }
}
