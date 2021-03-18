package com.younger.pattern.behavior.mediator;

/**
 * @author Younger
 */
public class ConcreteColleague extends Colleague {
    public ConcreteColleague(Mediator mediator) {
        super(mediator);
    }

    @Override
    void send(String msg) {
        System.out.println(this.hashCode() + " ConcreteColleague.send msg: " + msg);
        mediator.relay(this, msg);
    }

    @Override
    void receive(String msg) {
        System.out.println(this.hashCode() + " ConcreteColleague.receive msg: " + msg);
    }
}
