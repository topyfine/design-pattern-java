package com.younger.pattern.creational.singleton;

/**
 * @author Younger
 */
public class HungrySingleton {
    private static HungrySingleton instance = new HungrySingleton();

    public static HungrySingleton getInstance() {
        return instance;
    }

    private HungrySingleton() {
    }
}
