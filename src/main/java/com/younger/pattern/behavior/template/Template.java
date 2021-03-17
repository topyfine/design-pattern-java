package com.younger.pattern.behavior.template;

/**
 * @author Younger
 */
public abstract class Template {
    protected abstract void m1();
    protected abstract void m2();
    // 骨架方法
    public final void m() {
        if (useM1) {
            m1();
        }
        m2();
    }
    // 钩子方法
    private boolean useM1 = true;
    protected void setUseM1(boolean useM1) {
        this.useM1 = useM1;
    }
}
