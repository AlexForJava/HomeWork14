package com.gmail.chernii.oleksii.abstracts.factory;

/**
 * Created by Space on 12.04.2019.
 */
public class WindowsOSButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created WindowsButton.");
    }
}
