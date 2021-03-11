package com.younger.pattern.behavior.command;

/**
 * @author Younger
 */
public class Client {
    public static void main(String[] args) {
        // 命令的真正执行者
        Receiver receiver = new Receiver();
        // 命令载体
        ConcreteCommand concreteCommand = new ConcreteCommand(receiver);
        // 命令的调用者
        Invoker invoker = new Invoker(concreteCommand);
        invoker.call();
    }
}
