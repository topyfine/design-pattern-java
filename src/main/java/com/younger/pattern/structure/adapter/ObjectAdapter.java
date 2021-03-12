package com.younger.pattern.structure.adapter;

/**
 * @author Younger
 */
public class ObjectAdapter implements Target {

    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void adaptShowClassName() {
        // 承上
        adaptee.showClassName();
        // 做适配逻辑
        System.out.println(this.getClass().getSimpleName());
    }
}
