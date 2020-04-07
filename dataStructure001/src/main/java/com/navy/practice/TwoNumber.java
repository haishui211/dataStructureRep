package com.navy.practice;

import java.util.HashMap;
import java.util.Map;

public class TwoNumber {
	public static void main(String[] args) {
		int[] ns = {1,2,3,4,5,6,7,8,9};
		int target = 10;
		int l1 = -1;
		int l2 = -1;
		
		Map<Integer, Integer> nMap = new HashMap<Integer, Integer>();
		for(int i = 0; i < ns.length; i++) {
			nMap.put(ns[i], i);
		}
		
		for(int i = 0; i < ns.length; i++) {
			int ss = target-ns[i];
			if(nMap.containsKey(ss)) {
				l1 = i;
				l2 = nMap.get(ns[i]);
				break;
			}
		}
		
		System.out.println("l1: " + l1 + " l2: " + l2);
	}
}
