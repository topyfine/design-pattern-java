package com.younger.pattern.structure.adapter;

/**
 * @author Younger
 */
public class InterfaceAdapter implements Target {
    @Override
    public void adaptShowClassName() {
        System.out.println(this.getClass().getSimpleName() + " adaptShowClassName no implement");
    }
}
