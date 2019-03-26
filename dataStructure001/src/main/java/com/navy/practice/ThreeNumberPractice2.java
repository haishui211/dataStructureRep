package com.navy.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.navy.sort.BubbleSort;

public class ThreeNumberPractice2 {
	
	public static void main(String[] args) {
		int[] nums = {-1, 0, 1, 2, -1, -4};
		new ThreeNumberPractice2().threeSum(nums);
	}
	
	public List<List<Integer>> threeSum(int[] nums) {
		
		Set<String> set = new HashSet<String>();
		
		for(int i = 0; i < nums.length; i++) {
			int[] sorts = new int[3];
			sorts[0] = nums[i];
			
			for(int j = 0; j < nums.length; j++) {
				int[] backSorts1 = new int[1];
				if(j == i) {
					continue;
				}
				
				int temp = sorts[0];
				if(nums[j] > temp){
					sorts[1] = nums[j];
				}
				else{
					sorts[0] = nums[j];
					sorts[1] = temp;
				}
				
				for(int k = 0; k < nums.length; k++) {
					int[] backSorts = {sorts[0], sorts[1]};
					
					if(k == j || k == i) {
						continue;
					}
					
					int temp2 = sorts[1];
					if(nums[k] > temp2){
						sorts[2] = nums[k];
					}
					else{
						sorts[1] = nums[k];
						sorts[2] = temp2;
					}
					
					
					int sum = sorts[0] + sorts[1] + sorts[2];
					if(sum == 0){
						String str = sorts[0] + " " + sorts[1] + " " + sorts[2];
						if(!set.contains(str)) {
							System.out.println(str);
							set.add(str);
						}
					}
					sorts[0] = backSorts[0];
					sorts[1] = backSorts[1];
				}
				sorts[0] = backSorts1[0];
				
			}
		}
        return null;
    }
}
