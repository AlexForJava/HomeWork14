package com.gmail.chernii.oleksii.factory.method;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Space on 12.04.2019.
 */
public class FactoryMethoApp {
    public static void main(String[] args) {
        String name = "bmw";
        int speed = 120;
        CarCreator firstCar = new CarBuiderCreator(name, speed);
        CarCreator secondCar = new CarSingletonCreator(name, speed);
        CarCreator thirdCar = new CarProxyCreator(name, speed);

        List<Car> cars = new ArrayList<>();
        cars.add(firstCar.create());
        cars.add(secondCar.create());
        cars.add(thirdCar.create());

        cars.forEach(Car::showInfo);
    }
}
