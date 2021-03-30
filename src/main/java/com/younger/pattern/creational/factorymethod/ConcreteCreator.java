package com.younger.pattern.creational.factorymethod;

/**
 * @author Younger
 */
public class ConcreteCreator extends Creator {
    @Override
    Product factoryMethod() {
        return new ConcreteProduct();
    }
}
