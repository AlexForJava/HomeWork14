package com.gmail.chernii.oleksii.factory.method;

import com.gmail.chernii.oleksii.singleton.CarSingleton;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Space on 12.04.2019.
 */
@Setter
@Getter
public class CarSingletonCreator extends CarParrent implements CarCreator {

    public CarSingletonCreator(String name, int speed) {
        super(name, speed);
    }

    @Override
    public Car create() {
        return CarSingleton.getInstance(getName(), getSpeed());
    }
}
