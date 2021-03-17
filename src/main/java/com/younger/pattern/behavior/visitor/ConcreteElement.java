package com.younger.pattern.behavior.visitor;

/**
 * @author Younger
 */
public class ConcreteElement implements Element {
    @Override
    public void m1() {
        System.out.println("ConcreteElement.m1");
    }

    @Override
    public void m2() {
        System.out.println("ConcreteElement.m2");
    }

    @Override
    public void acceptVisitor(Visitor visitor) {
        visitor.visit(this);
    }
}
