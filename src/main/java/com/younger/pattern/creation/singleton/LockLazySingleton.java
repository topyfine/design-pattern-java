package com.younger.pattern.creation.singleton;

/**
 * @author Younger
 */
public class LockLazySingleton {
    private LockLazySingleton() {
    }
    // 用volatile修饰，保证对象创建、初始化、返回引用按顺序执行
    // 避免多线程环境使用未初始化的对象
    private static volatile LockLazySingleton instance;

    public static LockLazySingleton getInstance() {
        if (instance == null) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (LockLazySingleton.class) {
                if (instance == null) {
                    instance = new LockLazySingleton();
                }
            }
        }
        return instance;
    }
}
