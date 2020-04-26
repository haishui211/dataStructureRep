package com.navy.practice;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {

	public int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		for(int i = 0; i < nums.length; i++) {
			int c = target-nums[i];
			if(map.get(c) != null && map.get(c) != i) {
				result[0] = i;
				result[1] = map.get(c);
				break;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] nums = {2,7,11,15};
		int target = 9;
		int[] result = new Solution2().twoSum(nums, target);
		for(int r : result) {
			System.out.println(r);
		}
	}
}
