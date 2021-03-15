package com.younger.pattern.structure.decorator;

/**
 * @author Younger
 */
public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }

    public void addedShow() {
        super.show();
        System.out.println(this.getClass().getSimpleName());
    }
}
