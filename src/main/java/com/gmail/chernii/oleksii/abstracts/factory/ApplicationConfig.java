package com.gmail.chernii.oleksii.abstracts.factory;

/**
 * Created by Space on 13.04.2019.
 */
public class ApplicationConfig {
    private static final String MAC = "mac";
    public static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
            app = new Application(factory);
        } else {
            factory = new WindowsOSFactory();
            app = new Application(factory);
        }
        return app;
    }
}
