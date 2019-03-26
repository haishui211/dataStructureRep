package com.navy.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



public class ThreeNumberPractice3 {
	
	public static void main(String[] args) {
		int[] nums = {-1, 0, 1, 2, -1, -4};
		System.out.println(new ThreeNumberPractice3().threeSum(nums));
	}
	
	public List<List<Integer>> threeSum(int[] nums) {
		
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		
		Set<String> set = new HashSet<String>();
		sort(nums);
		int zeroIndex = gtZeroIndex(nums);
		for(int i = 0; i <= zeroIndex; i++) {
			for(int j = i+1; j < nums.length; j++) {
				for(int k = j+1; k < nums.length; k++) {
					int sum = nums[i] + nums[j] + nums[k];
					if(sum != 0){
						continue;
					}
					
					List<Integer> selects = new ArrayList<Integer>();
					selects.add(nums[i]);
					selects.add(nums[j]);
					selects.add(nums[k]);
					
					String str = selects.get(0) + " " + selects.get(1) + " " + selects.get(2);
					if(!set.contains(str)) {
						result.add(selects);
						set.add(str);
					}
				}
			}
		}
		return result;
	}
	
	private int gtZeroIndex(int[] nums){
		for(int i = 0; i < nums.length; i++){
			if(nums[i] > 0){
				return i;
			}
		}
		return 0;
	}
	
	private void sort(int[] nums){
		for(int i = 0; i < nums.length; i++) {
			int end = nums.length - i;
			
			if(!oneBubble(nums, end)) {
				break;
			}
		}
	}
	
	private boolean oneBubble(int[] nums, int end) {
		boolean hasExchange = false;
		for(int j = 0; j < end-1; j++) {
			Integer c = nums[j];
			Integer n = nums[j+1];
			if(c.compareTo(n) > 0) {
				nums[j] = n;
				nums[j+1] = c;
				hasExchange = true;
			}
		}
		return hasExchange;
	}
}
