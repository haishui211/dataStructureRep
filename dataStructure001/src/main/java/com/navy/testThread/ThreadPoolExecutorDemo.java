package com.navy.testThread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.DiscardPolicy;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorDemo {
	
	private static final int corePoolSize = 10;
	
	private static final int maximumPoolSize = 20;
	
	private static final long keepAliveTime = 10;
	
	private static final TimeUnit timeUnit = TimeUnit.MINUTES;
	
	private static final BlockingQueue<Runnable> workQueue = new LinkedBlockingQueue<Runnable>(2);
	
	private static final DiscardPolicy handler = new DiscardPolicy();
	
	private static volatile Integer count = 0;
	
	public static void main(String[] args) {
		
		ThreadPoolExecutor pool = new ThreadPoolExecutor(corePoolSize,maximumPoolSize,keepAliveTime,timeUnit,workQueue,handler);
		
		for(int i = 0; i < 3; i++) {
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					int resolveSize = 0;
					while(true) {
						try {
							resolveSize++;
							Thread.sleep(100);
							count++;
							if(count == 100) {
								break;
							}
						}
						catch(Exception e) {
							
						}
					}
					System.out.println("resolveSize: " + resolveSize);
				}
			};
			
//			pool.execute(runnable);
			new Thread(runnable).start();
		}
		
		try {
			Thread.sleep(60*1000*3);
			
		}
		catch(Exception e) {
			
		}
	}
}
