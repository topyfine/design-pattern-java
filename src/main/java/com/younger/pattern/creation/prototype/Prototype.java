package com.younger.pattern.creation.prototype;

import java.io.*;

/**
 * @author Younger
 */
public class Prototype implements Cloneable, Serializable {
    private String name;

    public Prototype getNextPrototype() {
        return nextPrototype;
    }

    public void setNextPrototype(Prototype nextPrototype) {
        this.nextPrototype = nextPrototype;
    }

    private Prototype nextPrototype;

    public Prototype(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Prototype clone() throws CloneNotSupportedException {
        return (Prototype) super.clone();
    }

    // 克隆-深拷贝
    // 1.类属性引用对象深拷贝
    public Prototype clone1() throws CloneNotSupportedException {
        Prototype clone = (Prototype) super.clone();
        // 不加此段就是浅拷贝
        if (nextPrototype != null) {
            clone.setNextPrototype(nextPrototype.clone());
        }
        return clone;
    }

    // 2.序列化方式实现深拷贝
    public Prototype clone2() {
        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(this);
            ByteArrayInputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());
            return (Prototype) new ObjectInputStream(inputStream).readObject();
        } catch (Exception e) {
            // 对象必须实现序列化能力
            throw new RuntimeException(e);
        }
    }
}
