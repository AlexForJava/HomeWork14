package com.gmail.chernii.oleksii.abstracts.factory;

/**
 * Created by Space on 12.04.2019.
 */
public class Demo {
    public static void main(String[] args) {
        Application app = ApplicationConfig.configureApplication();
        app.paint();
    }
}
