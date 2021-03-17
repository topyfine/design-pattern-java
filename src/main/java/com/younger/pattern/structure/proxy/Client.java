package com.younger.pattern.structure.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.InvocationHandler;
import net.sf.cglib.proxy.MethodInterceptor;

import java.lang.reflect.Proxy;

/**
 * @author Younger
 */
public class Client {
    public static void main(String[] args) {
        // 静态代理
        System.out.println("静态代理：");
        ProxyTarget proxyTarget = new ProxyTarget();
        proxyTarget.operation();
        // JDK动态代理Target
        System.out.println("JDK动态代理：");
        Target target = new Target();
        TargetInterface proxyInstance = (TargetInterface) Proxy.newProxyInstance(Target.class.getClassLoader(), Target.class.getInterfaces(), (proxy, method, args1) -> {
            method.invoke(target, args1);
            System.out.println(proxy.getClass().getSimpleName() + "." + method.getName());
            return null;
        });
        proxyInstance.operation();
        // cglib动态代理
        System.out.println("cglib动态代理：");
        // 代理接口
        System.out.println("代理接口：");
        Target cglibProxy = (Target) Enhancer.create(Target.class, Target.class.getInterfaces(), (InvocationHandler) (proxy, method, args12) -> {
            method.invoke(target, args12);
            System.out.println(proxy.getClass().getSimpleName() + "." + method.getName());
            return null;
        });
        cglibProxy.operation();
        // 代理类
        System.out.println("代理类：");
        Target cglibProxyObj = (Target) Enhancer.create(Target.class, (InvocationHandler) (proxy, method, args12) -> {
            method.invoke(target, args12);
            System.out.println(proxy.getClass().getSimpleName() + "." + method.getName());
            return null;
        });
        cglibProxyObj.operation();
        /* All generated proxied methods call this method instead of the original method.
         * The original method may either be invoked by normal reflection using the Method object,
         * or by using the MethodProxy (faster).
         */
        Target cglibProxyObj2 = (Target) Enhancer.create(Target.class, (MethodInterceptor) (obj, method, args13, methodProxy) -> {
            System.out.println("代理目标方法执行前...");
            Object retVal = methodProxy.invokeSuper(obj, args13);
            // or
            // Object retVal = method.invoke(target, args13);
            System.out.println("代理目标方法执行后。");
            System.out.println("增强操作..");
            System.out.println(obj.getClass().getSimpleName() + "." + method.getName());
            return retVal;
        });
        cglibProxyObj2.operation();
    }
}
