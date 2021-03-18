package com.younger.pattern.behavior.mediator;

/**
 * @author Younger
 */
public interface Mediator {
    void register(Colleague colleague);
    void relay(Colleague colleague, String msg);
}
