package com.navy.testThread;

public class VolatileThreadTest {
	
	volatile long count = 0;
	
	public static void main(String[] args) {
		
		VolatileDemo volatileDemo = new VolatileDemo();
		
		for(int i = 0; i < 10; i++) {
			Runnable r1 = new Runnable() {
				@Override
				public void run() {
					for(int j = 0; j < 1000; j++) {
						volatileDemo.incr();
					}
				}
			};
			Thread t = new Thread(r1);
			t.start();
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(volatileDemo.getCount());
	}
}
