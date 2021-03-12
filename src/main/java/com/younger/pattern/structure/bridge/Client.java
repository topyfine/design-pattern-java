package com.younger.pattern.structure.bridge;

/**
 * @author Younger
 */
public class Client {
    public static void main(String[] args) {
        // 两个维度同时变化，选取1个维度进行抽象化
        // 3种情况
        RefinedAbstraction refinedAbstraction = new RefinedAbstraction();
        RefinedAbstraction2 refinedAbstraction2 = new RefinedAbstraction2();
        RefinedAbstraction3 refinedAbstraction3 = new RefinedAbstraction3();
        // 抽象维度聚合到实现，避免创建N*M类造成类爆炸
        // 使用桥接模式只需n+m个类
        ConcreteImplementor implementor = new ConcreteImplementor(refinedAbstraction);
        ConcreteImplementor implementor2 = new ConcreteImplementor(refinedAbstraction2);
        ConcreteImplementor implementor3 = new ConcreteImplementor(refinedAbstraction3);
        ConcreteImplementor2 implementor4 = new ConcreteImplementor2(refinedAbstraction);
        ConcreteImplementor2 implementor5 = new ConcreteImplementor2(refinedAbstraction2);
        ConcreteImplementor2 implementor6 = new ConcreteImplementor2(refinedAbstraction3);
        implementor.show();
        implementor2.show();
        implementor3.show();
        implementor4.show();
        implementor5.show();
        implementor6.show();
    }
}
