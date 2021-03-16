package com.younger.pattern.structure.proxy;

import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;

import java.lang.reflect.Proxy;

/**
 * @author Younger
 */
public class Client {
    public static void main(String[] args) {
        // 静态代理
        ProxyTarget proxyTarget = new ProxyTarget();
        proxyTarget.operation();
        // JDK动态代理Target
        Target target = new Target();
        TargetInterface proxyInstance = (TargetInterface) Proxy.newProxyInstance(Target.class.getClassLoader(), Target.class.getInterfaces(), (proxy, method, args1) -> {
            method.invoke(target, args1);
            System.out.println(proxy.getClass().getSimpleName() + "." + method.getName());
            return null;
        });
        proxyInstance.operation();
        // cglib动态代理
        Enhancer enhancer = new Enhancer();
        enhancer.setInterfaces(Target.class.getInterfaces());
        enhancer.setCallback(new Callback() {
        });
    }
}
