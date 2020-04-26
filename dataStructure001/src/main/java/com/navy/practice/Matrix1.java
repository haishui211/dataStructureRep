package com.navy.practice;

import java.util.ArrayList;
import java.util.List;

public class Matrix1 {
	
	public int[] spiralOrder(int[][] matrix) {
		
		List<Integer> result = new ArrayList<Integer>();
		
		
		return null;
    }
	
	private void resolve2R(int[][] matrix, int srow, int erow, int scolumn, int endcolumn, List<Integer> result) {
		
		int[] onerow = matrix[srow];
		
		for(int i = scolumn; i < endcolumn; i++) {
			result.add(onerow[i]);
		}
		
		
	}
	
	public static void main(String[] args) {
		
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		
		int[] result = new Matrix1().spiralOrder(matrix);
		for(int r : result) {
			System.out.println(r);
		}
	}
}
