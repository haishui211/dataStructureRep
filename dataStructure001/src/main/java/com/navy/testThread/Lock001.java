package com.navy.testThread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Lock001 {
	
	private final Lock rtl =  new ReentrantLock();  
	
	public void test() {
		try {
			rtl.lock();
		}
		finally {
			rtl.unlock();
		}
	}
}
