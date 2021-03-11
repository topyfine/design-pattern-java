package com.younger.pattern.behavior.command;

/**
 * @author Younger
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    void call() {
        command.execute();
    }
}
