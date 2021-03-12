package com.younger.pattern.creation.builder;

/**
 * @author Younger
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.buildPart();
        // ...
        // 多种构造步骤
    }
}
