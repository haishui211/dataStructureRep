package com.navy.linked;

import org.junit.Test;

public class DoubleLinkedListTest {
	
	@Test
	public void testAdd() {
		DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
		list.add(12);
		list.add(23);
		list.add(34);
		printAll(list);
	}
	
	@Test
	public void testRemoveHead() {
		DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
		list.add(12);
		list.add(34);
		list.add(2);
		
		list.remove(12);
		printAll(list);
	}
	
	@Test
	public void testRemoveTail() {
		DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
		list.add(12);
		list.add(34);
		list.add(2);
		
		list.remove(2);
		printAll(list);
	}
	
	@Test
	public void testRemoveMid() {
		DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
		list.add(12);
		list.add(34);
		list.add(2);
		
		list.remove(34);
		printAll(list);
	}
	
	@Test
	public void testRemoveOnlyMember() {
		DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
		list.add(12);
		list.remove(12);
		printAll(list);
	}
	
	private void printAll(DoubleLinkedList<Integer> list) {
		for(int i = 0; i < list.getSize(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
	}
}
