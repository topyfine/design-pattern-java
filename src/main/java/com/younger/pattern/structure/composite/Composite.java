package com.younger.pattern.structure.composite;

import java.util.List;

/**
 * @author Younger
 */
public class Composite {
    protected List<Composite> children;

    public List<Composite> getChildren() {
        return children;
    }

    public void setChildren(List<Composite> children) {
        this.children = children;
    }

    boolean isLeaf() {return children == null || children.isEmpty();}
}
