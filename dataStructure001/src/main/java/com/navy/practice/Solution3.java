package com.navy.practice;

import java.util.HashMap;
import java.util.Map;

public class Solution3 {

	public int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < nums.length; i++) {
			int c = target - nums[i];
			if(map.get(c) != null) {
				result[0] = map.get(c);
				result[1] = i;
				break;
			}
			map.put(nums[i], i);
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		int[] nums = {2,7,11,15};
		int target = 9;
		int[] result = new Solution3().twoSum(nums, target);
		for(int r : result) {
			System.out.println(r);
		}
	}
}
