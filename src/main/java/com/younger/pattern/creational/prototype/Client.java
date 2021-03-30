package com.younger.pattern.creational.prototype;

/**
 * @author Younger
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 浅拷贝
        Prototype prototype = new Prototype("O");
        prototype.setNextPrototype(new Prototype("L"));
        System.out.println(prototype.getName() + "，" + prototype.getNextPrototype().hashCode());
        Prototype clone = prototype.clone();
        System.out.println(clone.getName() + "，" + clone.getNextPrototype().hashCode());
        // 深拷贝
        // 1.clone方法针对引用对象调用clone
        Prototype clone1 = prototype.clone1();
        System.out.println(clone1.getName() + "，" + clone1.getNextPrototype().hashCode());
        // 2.序列化方式
        Prototype clone2 = prototype.clone2();
        System.out.println(clone2.getName() + "，" + clone2.getNextPrototype().hashCode());
    }
}
