package com.navy.testThread;

public class DeadDemo {
	
	public static void main(String[] args) {
		
		Object lockA = new Object();
		Object lockB = new Object();
		
		new Thread() {
			@Override
			public void run() {
				synchronized(lockA) {
					System.out.println("acquire lockA,now ready acquire lockB.");
					try {
						Thread.sleep(1000);
					} 
					catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					synchronized(lockB) {
						System.out.println("thread A finish.");
					}
				}
			}
		}.start();
		
		new Thread() {
			@Override
			public void run() {
				synchronized(lockB) {
					System.out.println("acquire lockB,now ready acquire lockA.");
					try {
						Thread.sleep(1000);
					} 
					catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					synchronized(lockA) {
						System.out.println("thread B finish.");
					}
				}
			}
		}.start();
	}
}