package com.younger.pattern.structure.flyweight;

/**
 * @author Younger
 */
public class FlyweightFactory {
    private static Flyweight flyweight = new ConcreteFlyweight();

    private static int times = 0;

    public static Flyweight getFlyweight() {
        return (times++ % 2 == 0) ? flyweight : new ConcreteFlyweight();
    }
}
