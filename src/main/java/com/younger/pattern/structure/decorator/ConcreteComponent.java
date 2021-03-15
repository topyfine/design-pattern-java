package com.younger.pattern.structure.decorator;

/**
 * @author Younger
 */
public class ConcreteComponent implements Component {
    @Override
    public void show() {
        System.out.println(this.getClass().getSimpleName());
    }
}
