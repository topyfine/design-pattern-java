package com.younger.pattern.creational.factory;

/**
 * @author Younger
 */
public class SimpleFactory {

    public static final Product createProduct(String productName) {
        Product product;
        switch (productName) {
            case "A" :
                product = new ConcreteProduct1("A");
                break;
            case "B" :
                product = new ConcreteProduct2("B");
                break;
            // case n...
            // 扩展需要不断的增加case，违背开闭原则
            default:
                throw new IllegalArgumentException("no product " + productName);
        }
        return product;
    }

    public static void main(String[] args) {
        Product a = SimpleFactory.createProduct("A");
        System.out.println(a.getName());
    }
}
