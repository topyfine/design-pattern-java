package com.younger.pattern.creational.factory;

/**
 * @author Younger
 */
public class MethodFactory {

    private static IFactory factory;

    public static IFactory getFactory() {
        return factory;
    }

    public static void setFactory(IFactory factory) {
        MethodFactory.factory = factory;
    }

    public static void main(String[] args) {
        // 产品1
        MethodFactory.setFactory(new ConcreteFactory1());
        Product product1 = MethodFactory.getFactory().createProduct();
        System.out.println(product1.getName());
        // 产品2
        MethodFactory.setFactory(new ConcreteFactory2());
        Product product2 = MethodFactory.getFactory().createProduct();
        System.out.println(product2.getName());
        // 产品n...
        // 扩展产品需要不断增加工厂类。新增1种产品就需要增加1个工厂
        // 造成类扩展
    }
}
