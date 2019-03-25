package com.navy.array;

import org.junit.Test;

public class DynamicArrayTest {
	
	@Test
	public void testAdd() throws Exception{
		DynamicArray<String> da = new DynamicArray<String>();
		for(int i = 0; i < 15; i++){
			da.add(i+"hello");
		}
		for(int i = 0; i < 15; i++){
			System.out.println(da.get(i));
		}
	}
	
	@Test
	public void testRemove() throws Exception{
		DynamicArray<String> da = new DynamicArray<String>();
		for(int i = 0; i < 15; i++){
			da.add(i+"");
		}
		da.printAll();
		da.remove(6);
		da.printAll();
	}
	
	@Test
	public void testRemoveOne() throws Exception{
		DynamicArray<String> da = new DynamicArray<String>();
		for(int i = 0; i < 1; i++){
			da.add(i+"");
		}
		da.printAll();
		da.remove(0);
		da.printAll();
	}
	
	@Test
	public void testRemoveTwo() throws Exception{
		DynamicArray<String> da = new DynamicArray<String>();
		for(int i = 0; i < 2; i++){
			da.add(i+"");
		}
		da.printAll();
		da.remove(0);
		da.printAll();
	}
	
	@Test
	public void testRemoveTail() throws Exception{
		DynamicArray<String> da = new DynamicArray<String>();
		for(int i = 0; i < 3; i++){
			da.add(i+"");
		}
		da.printAll();
		da.remove(2);
		da.printAll();
	}
}
