package com.gmail.chernii.oleksii.adapter;

/**
 * Created by Space on 12.04.2019.
 */
public class VelocitiSpeedAdapter extends Speed implements Velocity {
    @Override
    public void increase() {
        speedUp();
    }

    @Override
    public void decreasxe() {
        speedDown();
    }
}
