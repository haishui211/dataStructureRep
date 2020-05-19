package com.navy.practice;

import java.util.HashSet;
import java.util.Set;

public class LastCirtleNum {
	
	public static void main(String[] args) {
		System.out.println(lastRemaining(5, 3));
	}
	
	public static int lastRemaining(int n, int m) {
		
		Set<Integer> set = new HashSet<Integer>();
		
		int count = 0;
		
		int result = -1;
		
		for(int i = 0; i <= n-1; i++) {
			
			if(!set.contains(i)){
				count++;
			}
			
			//如果计数器count=m，说明这个时候要删除一个元素i
			if(count == m) {
				set.add(i);
				count = 0;
			}
			
			//如果已删除数等于n，那么说明，这是最后一个元素，需要停止了
			if(set.size() == n) {
				result = i;
				break;
			}
			
			//让圈圈再次循环
			if(i == n-1) {
				i = -1;
			}
			
		}
		
		return result;
	}
}
