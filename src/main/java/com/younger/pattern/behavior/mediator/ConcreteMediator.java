package com.younger.pattern.behavior.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Younger
 */
public class ConcreteMediator implements Mediator {
    private List<Colleague> colleagues = new ArrayList<>();

    @Override
    public void register(Colleague colleague) {
        colleagues.add(colleague);
    }

    @Override
    public void relay(Colleague colleague, String msg) {
        colleagues.forEach(colleague1 -> {
            // 不用给自己转播
            if (colleague1 != colleague) {
                colleague1.receive(msg);
            }
        });
    }
}
