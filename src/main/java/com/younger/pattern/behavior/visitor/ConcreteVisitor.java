package com.younger.pattern.behavior.visitor;

/**
 * @author Younger
 */
public class ConcreteVisitor implements Visitor {
    @Override
    public void visit(Element element) {
        System.out.println("ConcreteVisitor.visit");
        System.out.println("只关注Element.m1");
        element.m1();
    }
}
