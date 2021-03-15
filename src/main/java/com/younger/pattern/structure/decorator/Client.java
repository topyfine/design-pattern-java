package com.younger.pattern.structure.decorator;

/**
 * @author Younger
 */
public class Client {

    public static void main(String[] args) {
        ConcreteComponent concreteComponent = new ConcreteComponent();
        ConcreteDecorator concreteDecorator = new ConcreteDecorator(concreteComponent);
        concreteDecorator.addedShow();
    }
}
