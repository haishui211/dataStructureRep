package com.navy.testAnnotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestEnableResolve {
	
	public static void resolve(String clazz) throws SecurityException, ClassNotFoundException {
		for(Method m : Class.forName(clazz).getMethods()) {
			if(m.isAnnotationPresent(TestEnable.class)) {
				try {
					m.invoke(null);
				} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
