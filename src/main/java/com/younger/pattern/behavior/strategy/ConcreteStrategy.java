package com.younger.pattern.behavior.strategy;

/**
 * @author Younger
 */
public class ConcreteStrategy implements Strategy {
    @Override
    public void operate() {
        System.out.println("ConcreteStrategy.operate");
    }
}
