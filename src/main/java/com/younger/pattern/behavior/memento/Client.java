package com.younger.pattern.behavior.memento;

/**
 * @author Younger
 */
public class Client {

    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.process();
        originator.process();
        originator.process();
        Memento memento = originator.createMemento();
        Caretaker caretaker = new Caretaker();
        // 保存进度
        caretaker.setMemento(memento);
        originator.process();
        originator.process();
        // 恢复进度
        originator.restoreMemento(caretaker.getMemento());
        originator.process();
    }
}
