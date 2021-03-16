package com.younger.pattern.structure.facade;

/**
 * @author Younger
 */
public class Facade {

    private SubSystem subSystem;
    private SubSystem2 subSystem2;
    private SubSystem3 subSystem3;

    public Facade() {
        this.subSystem = new SubSystem();
        this.subSystem2 = new SubSystem2();
        this.subSystem3 = new SubSystem3();
    }

    public void method() {
        subSystem.method();
        subSystem2.method();
        subSystem3.method();
    }
}
