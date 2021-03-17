package com.younger.pattern.behavior.visitor;

/**
 * @author Younger
 */
public class ConcreteVisitor2 implements Visitor {
    @Override
    public void visit(Element element) {
        System.out.println("ConcreteVisitor2.visit");
        System.out.println("只关注Element.m2");
        element.m2();
    }
}
