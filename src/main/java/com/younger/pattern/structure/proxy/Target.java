package com.younger.pattern.structure.proxy;

/**
 * @author Younger
 */
public class Target implements TargetInterface {
    @Override
    public void operation() {
        System.out.println("Target.operation");
    }
}
