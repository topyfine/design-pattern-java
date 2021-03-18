package com.younger.pattern.behavior.mediator;

/**
 * @author Younger
 */
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    abstract void send(String msg);
    abstract void receive(String msg);
}
