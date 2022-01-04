package com.navy.sort;

import java.util.List;

public class BubbleSort {
	
	public static void sort(List<Integer> list){
		for(int i = 0; i < list.size(); i++) {
			int end = list.size() - i;
			
			if(!oneBubble(list, end)) {
				break;
			}
		}
		printAll(list);
	}
	
	private static boolean oneBubble(List<Integer> list, int end) {
		boolean hasExchange = false;
		for(int j = 0; j < end-1; j++) {
			Integer c = list.get(j);
			Integer n = list.get(j+1);
			if(c.compareTo(n) > 0) {
				list.set(j, n);
				list.set(j+1, c);
				hasExchange = true;
			}
		}
		return hasExchange;
	}
	
	private static void printAll(List<Integer> list) {
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
	}
}
