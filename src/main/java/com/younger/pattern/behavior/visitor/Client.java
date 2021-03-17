package com.younger.pattern.behavior.visitor;

/**
 * @author Younger
 */
public class Client {
    public static void main(String[] args) {
        Element element = new ConcreteElement();
        // 关注维度1的visitor
        Visitor visitor = new ConcreteVisitor();
        element.acceptVisitor(visitor);
        // 关注维度2的visitor
        Visitor visitor2 = new ConcreteVisitor2();
        element.acceptVisitor(visitor2);
        // ...
        // 各种视角观察同一个element
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.add(element);
        System.out.println("\n访问者visitor：");
        objectStructure.trace(visitor);
        System.out.println("\n访问者visitor2：");
        objectStructure.trace(visitor2);
    }
}
