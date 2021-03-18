package com.younger.pattern.behavior.mediator;

/**
 * @author Younger
 */
public class Client {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        ConcreteColleague colleague = new ConcreteColleague(mediator);
        ConcreteColleague colleague2 = new ConcreteColleague(mediator);
        ConcreteColleague colleague3 = new ConcreteColleague(mediator);
        mediator.register(colleague);
        mediator.register(colleague2);
        mediator.register(colleague3);
        // 散播消息
        colleague.send("hey");
        colleague2.send("alyx");
        colleague3.send("freeman");
    }
}
