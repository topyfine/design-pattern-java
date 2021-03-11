package com.younger.pattern.creation.singleton;

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
