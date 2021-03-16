package com.younger.pattern.structure.proxy;

/**
 * @author Younger
 */
public class ProxyTarget extends Target {
    @Override
    public void operation() {
        super.operation();
        System.out.println("ProxyTarget.operation");
    }
}
