package com.gmail.chernii.oleksii.abstracts.factory;

/**
 * Created by Space on 12.04.2019.
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
