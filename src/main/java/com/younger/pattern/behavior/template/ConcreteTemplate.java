package com.younger.pattern.behavior.template;

/**
 * @author Younger
 */
public class ConcreteTemplate extends Template {
    @Override
    protected void m1() {
        System.out.println("ConcreteTemplate.m1");;
    }

    @Override
    protected void m2() {
        System.out.println("ConcreteTemplate.m2");
    }
}
