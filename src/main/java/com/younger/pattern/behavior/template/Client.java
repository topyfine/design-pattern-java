package com.younger.pattern.behavior.template;

/**
 * @author Younger
 */
public class Client {
    public static void main(String[] args) {
        // 定义算法骨架
        // 抽象模版方法延迟到子类实现
        Template template = new ConcreteTemplate();
        // 钩子方法
        // 确定步骤的某些流程是否参与整个算法骨架
//        template.setUseM1(false);
        template.m();
    }
}
