package com.younger.pattern.creation.factory;

/**
 * @author Younger
 */
public class ConcreteFactory2 implements IFactory {
    @Override
    public Product createProduct() {
        return new ConcreteProduct2(ConcreteProduct2.class.getSimpleName());
    }
}
