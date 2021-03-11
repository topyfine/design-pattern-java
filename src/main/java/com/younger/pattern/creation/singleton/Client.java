package com.younger.pattern.creation.singleton;

/**
 * @author Younger
 */
public class Client {
    public static void main(String[] args) {
        // 懒汉式
//        System.out.println("懒汉式：");
//        for (int i = 0; i < 10; i++) {
//            new Thread(() -> {
//                LazySingleton instance1 =  LazySingleton.getInstance();
//                System.out.println(instance1.hashCode());
//            }).start();
//        }

        // 饿汉式
//        System.out.println("饿汉式：");
//        for (int i = 0; i < 10; i++) {
//            new Thread(() -> {
//                HungrySingleton instance = HungrySingleton.getInstance();
//                System.out.println(instance.hashCode());
//            }).start();
//        }

        // 同步锁
        System.out.println("同步锁懒汉式：");
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                LockLazySingleton instance = LockLazySingleton.getInstance();
                System.out.println(instance.hashCode());
            }).start();
        }
    }
}
