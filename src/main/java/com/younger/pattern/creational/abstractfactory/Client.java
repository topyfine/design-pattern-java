package com.younger.pattern.creational.abstractfactory;

/**
 * @author Younger
 */
public class Client {
    public static void main(String[] args) {
        AbstractFactory factory1 = new ConcreteFactory1();
        AbstractFactory factory2 = new ConcreteFactory2();
        // 一厂产品线
        ProductA productA1 = factory1.createProductA();
        ProductB productB1 = factory1.createProductB();
        // 二厂产品线
        ProductA productA2 = factory2.createProductA();
        ProductB productB2 = factory2.createProductB();
        // ...
        // N厂产品线
    }
}
