package com.navy.practice;

import java.util.ArrayList;
import java.util.List;

public class LastCirtleNum2 {
	
	public static void main(String[] args) {
		System.out.println(lastRemaining(5, 3));
	}
	
	public static int lastRemaining(int n, int m) {
		
		List<Integer> p1 = new ArrayList<Integer>();
		List<Integer> p2 = new ArrayList<Integer>();
		
		for(int i = 0; i < n; i++) {
			p1.add(i);
		}
		
		int count = 0;
		
		while(p2.size() != 1) {
			count = resolve(p1, p2, count, m);
			p1.clear();
			List<Integer> temp = p1;
			p1 = p2;
			p2 = temp;
		}
		
		return p2.get(0);
	}
	
	private static int resolve(List<Integer> p1, List<Integer> p2, int count, int m) {
		
		for(int i = 0; i < p1.size(); i++) {
			
			count++;
			
			if(count == m) {
				count = 0;
			}
			else {
				p2.add(p1.get(i));
			}
		}
		
		return count;
	}
}
