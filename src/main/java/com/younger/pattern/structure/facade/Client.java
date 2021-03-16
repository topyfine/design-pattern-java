package com.younger.pattern.structure.facade;

/**
 * @author Younger
 */
public class Client {

    public static void main(String[] args) {
        Facade facade = new Facade();
        // 所有子系统接口通过外观类接口暴露
        // 客户端和子系统解耦
        facade.method();
    }
}
