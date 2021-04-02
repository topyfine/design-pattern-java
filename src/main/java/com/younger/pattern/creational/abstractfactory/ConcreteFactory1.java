package com.younger.pattern.creational.abstractfactory;

/**
 * @author Younger
 */
public class ConcreteFactory1 extends AbstractFactory {
    @Override
    ProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    ProductB createProductB() {
        return new ConcreteProductB1();
    }
}
