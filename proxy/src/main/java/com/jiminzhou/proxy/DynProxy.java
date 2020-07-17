package com.jiminzhou.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynProxy implements InvocationHandler {
    private Object object;
    public Object getInstance(Object o) {
        object = o;
        Class clazz = o.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // before
        Object ret = method.invoke(object, args);
        // after
        System.out.println("通过代理购买");
        return ret;
    }
}
