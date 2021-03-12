package com.younger.pattern.creation.builder;

/**
 * @author Younger
 */
public class ConcreteBuilder extends Builder {
    private Product product = new Product();
    @Override
    protected void buildPart() {
        product.setName("A");
    }

    public Product getResult() {
        return product;
    }
}
