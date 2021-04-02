package com.younger.pattern.creational.abstractfactory;

/**
 * @author Younger
 */
public class ConcreteFactory2 extends AbstractFactory {
    @Override
    ProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    ProductB createProductB() {
        return new ConcreteProductB2();
    }
}
