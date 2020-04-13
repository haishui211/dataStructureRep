package com.navy.sort;

public class BubbleSort2 {
	public static void main(String[] args) {
		Integer[] aa = {4,5,6,3,2,1};
		
		for(int i = 0; i < aa.length; i++) {
			for(int j = 0; j < aa.length-i-1; j++) {
				if(aa[j] > aa[j+1]) {
					Integer temp = aa[j];
					aa[j] = aa[j+1];
					aa[j+1] = temp;
				}
			}
			printAa(aa);
			System.out.println();
		}
	}
	
	public static void printAa(Integer[] aa) {
		for(Integer a : aa) {
			System.out.print(a + "  ");
		}
	}
}
