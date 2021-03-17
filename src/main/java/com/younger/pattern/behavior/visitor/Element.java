package com.younger.pattern.behavior.visitor;

/**
 * @author Younger
 */
public interface Element {
    void m1();
    void m2();

    void acceptVisitor(Visitor visitor);
}
