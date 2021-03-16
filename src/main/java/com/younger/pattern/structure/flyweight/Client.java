package com.younger.pattern.structure.flyweight;


/**
 * @author Younger
 */
public class Client {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Flyweight flyweight = FlyweightFactory.getFlyweight();
            System.out.println(flyweight.hashCode());
        }
    }
}
