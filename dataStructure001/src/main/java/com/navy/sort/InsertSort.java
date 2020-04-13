package com.navy.sort;

public class InsertSort {
	public static void main(String[] args) {
		
		Integer[] a = {4,5,6,1,3,2};
		
		for(int i = 1; i < a.length; i++) {
			Integer c = a[i];
			int j = i-1;
			for(; j >= 0; j--) {
				if(a[j] > c) {
					a[j+1] = a[j];
				}
				else {
					break;
				}
			}
			a[j+1] = c;
			printAa(a);
			System.out.println();
		}
	}
	
	public static void moveA(Integer start, Integer end, Integer[] aa) {
		Integer temp = aa[end];
		for(int i = end; i > start; i--) {
			aa[i] = aa[i-1];
		}
		aa[start] = temp;
	}
	
	public static void printAa(Integer[] aa) {
		for(Integer a : aa) {
			System.out.print(a + "  ");
		}
	}
}
