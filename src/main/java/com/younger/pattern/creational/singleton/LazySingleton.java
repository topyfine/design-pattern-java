package com.younger.pattern.creational.singleton;

/**
 * @author Younger
 */
public class LazySingleton {
    private LazySingleton() {
    }

    private static LazySingleton instance;

    public static LazySingleton getInstance() {
        if (instance == null) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance = new LazySingleton();
        }
        return instance;
    }
}
