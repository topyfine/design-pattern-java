package com.younger.pattern.creational.factorymethod;

/**
 * @author Younger
 */
public class Client {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product = creator.factoryMethod();
        System.out.println(product.getClass().getSimpleName());
    }
}
