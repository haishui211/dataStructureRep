package com.navy.practice;

public class Solution1 {

	public int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		for(int i = 0; i < nums.length; i++) {
			for(int j = i+1; j < nums.length; j++) {
				if(target == (nums[i]+nums[j])) {
					result[0] = i;
					result[1] = j;
					break;
				}
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] nums = {2,7,11,15};
		int target = 9;
		int[] result = new Solution1().twoSum(nums, target);
		for(int r : result) {
			System.out.println(r);
		}
	}
}
