package com.navy.sort;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class BubbleSortTest {
	
	@Test
	public void testSort() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(3);
		list.add(2);
		list.add(1);
		list.add(4);
		
		BubbleSort.sort(list);
	}
}
