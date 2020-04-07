package com.navy.testProxy;

public class Test {
	public static void main(String[] args) {
		DogImpl dogImpl = new DogImpl();
		Dog dog = (Dog) MyProxyFactory.getProxy(dogImpl);
		dog.info();
		dog.run();
	}
}
