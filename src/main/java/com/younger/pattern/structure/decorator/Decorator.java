package com.younger.pattern.structure.decorator;

/**
 * @author Younger
 */
public class Decorator {

    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }


    public void show() {
        component.show();
    }
}
