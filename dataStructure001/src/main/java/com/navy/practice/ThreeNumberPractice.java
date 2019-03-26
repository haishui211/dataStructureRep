package com.navy.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.navy.sort.BubbleSort;

public class ThreeNumberPractice {
	public static void main(String[] args) {
		int[] nums = {-1, 0, 1, 2, -1, -4};
		Set<String> set = new HashSet<String>();
		for(int i = 0; i < nums.length; i++) {
			for(int j = 0; j < nums.length; j++) {
				if(j == i) {
					continue;
				}
				for(int k = 0; k < nums.length; k++) {
					if(k == j || k == i) {
						continue;
					}
					int sum = nums[i] + nums[j] + nums[k];
					if(sum != 0){
						continue;
					}
					String str = resolve(nums[i], nums[j], nums[k]);
					if(!set.contains(str)) {
						System.out.println(str);
						set.add(str);
					}
				}
			}
		}
	}
	
	private static String  resolve(int n1, int n2, int n3) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(n1);
		list.add(n2);
		list.add(n3);
		BubbleSort.sort(list);
		String result = list.get(0) + " " + list.get(1) + " " + list.get(2);
		return result;
	}
}
