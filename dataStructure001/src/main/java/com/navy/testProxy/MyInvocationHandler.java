package com.navy.testProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
	
	private Object target;
	
	public void setTarget(Object target) {
		this.target = target;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		DogUtil.sMethod1();
		Object result = method.invoke(target, args);
		DogUtil.sMethod2();
		return result;
	}

}
