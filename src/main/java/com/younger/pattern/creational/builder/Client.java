package com.younger.pattern.creational.builder;

/**
 * @author Younger
 */
public class Client {
    public static void main(String[] args) {
        ConcreteBuilder concreteBuilder = new ConcreteBuilder();
        // 使用Director角色解耦客户端和具体的构造过程
        Director director = new Director(concreteBuilder);
        director.construct();
        Product product = concreteBuilder.getResult();
        System.out.println(product.getName());
    }
}
