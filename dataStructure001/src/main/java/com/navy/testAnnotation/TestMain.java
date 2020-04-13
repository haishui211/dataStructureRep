package com.navy.testAnnotation;

public class TestMain {
	public static void main(String[] args) throws SecurityException, ClassNotFoundException {
		TestEnableResolve.resolve("com.navy.testAnnotation.MyTest");
	}
}
