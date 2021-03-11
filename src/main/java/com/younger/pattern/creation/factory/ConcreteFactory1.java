package com.younger.pattern.creation.factory;

/**
 * @author Younger
 */
public class ConcreteFactory1 implements IFactory {
    @Override
    public Product createProduct() {
        return new ConcreteProduct1(ConcreteProduct1.class.getSimpleName());
    }
}
