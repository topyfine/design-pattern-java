package com.younger.pattern.structure.adapter;

/**
 * @author Younger
 */
public class ClassAdapter extends Adaptee implements Target {

    @Override
    public void adaptShowClassName() {
        // 为Adaptee做适配
        super.showClassName();
        // 增加适配逻辑
        System.out.println(this.getClass().getSimpleName());
    }
}
