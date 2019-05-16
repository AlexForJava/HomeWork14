package com.gmail.chernii.oleksii.abstracts.factory;

/**
 * Created by Space on 12.04.2019.
 */
public class WindowsOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsOSCheckbox();
    }
}
