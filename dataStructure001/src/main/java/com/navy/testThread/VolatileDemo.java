package com.navy.testThread;

public class VolatileDemo {
	
//	private volatile long count = 0;
	
	long count = 0;

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}
	
	public void incr() {
		this.count++;
	}
}
