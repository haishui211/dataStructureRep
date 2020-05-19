package com.navy.practice;

public class MidNum2 {

	public static void main(String[] args) {

		int[] nums1 = {};
		int[] nums2 = { 3, 4 };

//		System.out.println(findMedianSortedArrays(nums1, nums2));
	}

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {

		int len = 0;

		if (nums1 != null) {
			len = nums1.length;
		}

		if (nums2 != null) {
			len = len + nums2.length;
		}

		int[] nums3 = new int[len];
		
		if (nums1 == null && nums1.length == 0) {
			copyArray2NewArray(nums2, nums3);
		}
		else if (nums2 == null && nums2.length == 0) {
			copyArray2NewArray(nums1, nums3);
		}
		else {
			mergeSortedArray2NewArray(nums1, nums2, nums3);
		}
		
		if (len % 2 == 0 ) {
			int targetIndex1 = len/2;
			int targetIndex2 = targetIndex1 - 1;
			double d1 = nums3[targetIndex1];
			double d2 = nums3[targetIndex2];
			
			double result = (d1 + d2) / 2;
			return result;
		}
		else {
			int targetIndex = len / 2;
			return nums3[targetIndex];
		}
	}
	
	private void copyArray2NewArray(int[] source, int[] target) {
		for(int i = 0; i < target.length; i++) {
			target[i] = source[i];
		}
	}
	
	private void mergeSortedArray2NewArray(int[] sorted1, int[] sorted2, int[] target) {
		
		for(int i = 0, i1 = 0, i2 = 0; i < target.length; i++) {
			
			if(i1 > sorted1.length-1) {
				target[i] = sorted2[i2];
				i2++;
				return;
			}
			
			if(i2 > sorted2.length-1) {
				target[i] = sorted1[i1];
				i1++;
				return;
			}
			
			int n1 = sorted1[i1];
			int n2 = sorted2[i2];
			
			if(n1 < n2) {
				target[i] = n1;
				i1++;
			}
			else {
				target[i] = n2;
				i2++;
			}
		}
	}
}
