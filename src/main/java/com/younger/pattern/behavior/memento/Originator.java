package com.younger.pattern.behavior.memento;

/**
 * @author Younger
 */
public class Originator {
    // 进度
    private int progress = 0;

    // 创建进度
    public Memento createMemento() {
        Memento memento = new Memento();
        memento.setProgress(progress);
        System.out.println("Originator.createMemento 当前进度：" + progress + "%");
        return memento;
    }

    // 恢复进度
    public void restoreMemento(Memento memento) {
        progress = memento.getProgress();
        System.out.println("Originator.restoreMemento 恢复进度：" + progress + "%");
    }

    public void process() {
        progress += 10;
        System.out.println("Originator.process 进度前进：" + progress + "%");
    }
}
