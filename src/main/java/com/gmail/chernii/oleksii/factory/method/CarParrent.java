package com.gmail.chernii.oleksii.factory.method;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Space on 12.04.2019.
 */
@AllArgsConstructor
@Setter
@Getter
public abstract class CarParrent implements CarCreator {
    private String name;
    private int speed;

    @Override
    public abstract Car create();
}
