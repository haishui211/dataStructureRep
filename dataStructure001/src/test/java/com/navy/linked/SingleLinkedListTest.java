package com.navy.linked;

import org.junit.Test;

public class SingleLinkedListTest {
	
	@Test
	public void testAdd() {
		SingleLinkedList<Integer> list = new SingleLinkedList<Integer>();
		list.add(12);
		list.add(34);
		list.add(2);
		
		for(int i = 0; i < list.getSize(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	@Test
	public void testAddAtHead() {
		SingleLinkedList2<Integer> list = new SingleLinkedList2<Integer>();
		list.addAtHead(9);
		list.addAtHead(8);
		list.addAtHead(7);
		list.addAtHead(6);
		list.addAtHead(5);
		list.addAtHead(4);
		list.addAtHead(3);
		list.addAtHead(2);
		
		for(int i = 0; i < list.getSize(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	@Test
	public void testRemoveHead() {
		SingleLinkedList<Integer> list = new SingleLinkedList<Integer>();
		list.add(12);
		list.add(34);
		list.add(2);
		
		list.remove(12);
		printAll(list);
	}
	
	@Test
	public void testRemoveTail() {
		SingleLinkedList<Integer> list = new SingleLinkedList<Integer>();
		list.add(12);
		list.add(34);
		list.add(2);
		
		list.remove(2);
		printAll(list);
	}
	
	@Test
	public void testRemoveMid() {
		SingleLinkedList<Integer> list = new SingleLinkedList<Integer>();
		list.add(12);
		list.add(34);
		list.add(2);
		
		list.remove(34);
		printAll(list);
	}
	
	@Test
	public void testRemoveOnlyMember() {
		SingleLinkedList<Integer> list = new SingleLinkedList<Integer>();
		list.add(12);
		list.remove(12);
		printAll(list);
	}
	
	@Test
	public void testRemoveAll() {
		SingleLinkedList<Integer> list = new SingleLinkedList<Integer>();
		list.add(12);
		list.add(12);
		list.add(12);
		list.add(23);
		int count = list.removeAll(12);
		System.out.println("count: " + count);
		printAll(list);
	}
	
	@Test
	public void testIndex() {
		SingleLinkedList2<Integer> list = new SingleLinkedList2<Integer>();
		list.add(12);
		System.out.println(list.index(12));
	}
	
	@Test
	public void testIndexHead() {
		SingleLinkedList2<Integer> list = new SingleLinkedList2<Integer>();
		list.add(12);
		list.add(23);
		System.out.println(list.index(12));
	}
	
	@Test
	public void testIndexTail() {
		SingleLinkedList2<Integer> list = new SingleLinkedList2<Integer>();
		list.add(12);
		list.add(23);
		System.out.println(list.index(23));
	}
	
	@Test
	public void testIndexMid() {
		SingleLinkedList2<Integer> list = new SingleLinkedList2<Integer>();
		list.add(12);
		list.add(23);
		list.add(34);
		System.out.println(list.index(23));
	}
	
	@Test
	public void testIndexNotExist() {
		SingleLinkedList2<Integer> list = new SingleLinkedList2<Integer>();
		list.add(12);
		list.add(23);
		list.add(34);
		System.out.println(list.index(556));
	}
	
	@Test
	public void testInverseOne() {
		SingleLinkedList<Integer> list = new SingleLinkedList<Integer>();
		list.add(1);
		list.inverse();
		printAll(list);
	}
	
	@Test
	public void testInverseTwo() {
		SingleLinkedList<Integer> list = new SingleLinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.inverse();
		printAll(list);
	}
	
	@Test
	public void testInverseThree() {
		SingleLinkedList<Integer> list = new SingleLinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.inverse();
		printAll(list);
	}
	
	@Test
	public void testInverseFour() {
		SingleLinkedList<Integer> list = new SingleLinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.inverse();
		printAll(list);
	}
	
	private void printAll(SingleLinkedList<Integer> list) {
		for(int i = 0; i < list.getSize(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}
	
	@Test
	public void testPrintAll() {
		SingleLinkedList<Integer> list = new SingleLinkedList<Integer>();
		list.add(12);
		list.add(12);
		list.add(12);
		list.add(23);
		printAll(list);
		System.out.println();
		list.printAll();
	}
}
