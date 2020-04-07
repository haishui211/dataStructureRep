package com.navy.testProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class MyProxyFactory {
	
	public static Object getProxy(Object target) {
		MyInvocationHandler handler = new MyInvocationHandler();
		handler.setTarget(target);
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), (InvocationHandler) handler);
	}
}
