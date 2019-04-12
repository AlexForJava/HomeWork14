package com.gmail.chernii.oleksii.factory.method;

import com.gmail.chernii.oleksii.builder.CarBuilder;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Space on 12.04.2019.
 */
@Setter
@Getter
public class CarBuiderCreator extends CarParrent implements CarCreator {

    public CarBuiderCreator(String name, int speed) {
        super(name, speed);
    }

    @Override
    public Car create() {
        return CarBuilder.newInstance()
                .setName(getName())
                .setSpeed(getSpeed())
                .build();
    }
}
