package com.younger.pattern.structure.adapter;

/**
 * @author Younger
 */
public class Client {
    public static void main(String[] args) {
        // 类适配器
        // 继承被适配者，通过适配提供目标接口能力
        ClassAdapter classAdapter = new ClassAdapter();
        classAdapter.adaptShowClassName();
        // 对象适配器
        // 聚合被适配者，通过适配提供目标接口能力
        ObjectAdapter objectAdapter = new ObjectAdapter(new Adaptee());
        objectAdapter.adaptShowClassName();
        // 接口适配器
        // 为目标接口创建默认的空实现，使用者只需关注感兴趣的接口重新实现
        InterfaceAdapter interfaceAdapter = new InterfaceAdapter();
        interfaceAdapter.adaptShowClassName();
    }
}
