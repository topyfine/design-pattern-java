package com.younger.pattern.structure.bridge;

/**
 * @author Younger
 */
public class Implementor {
    private Abstraction abstraction;

    public Implementor(Abstraction abstraction) {
        this.abstraction = abstraction;
    }

    public void show() {
        System.out.println(abstraction.getClass().getSimpleName() + ", " + this.getClass().getSimpleName());
    }
}
