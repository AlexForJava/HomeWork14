package com.gmail.chernii.oleksii.factory.method;

import com.gmail.chernii.oleksii.proxy.ProxyCar;

/**
 * Created by Space on 12.04.2019.
 */
public class CarProxyCreator extends CarParrent implements CarCreator {

    public CarProxyCreator(String name, int speed) {
        super(name, speed);
    }

    @Override
    public Car create() {
        return new ProxyCar(getName(), getSpeed());
    }
}
