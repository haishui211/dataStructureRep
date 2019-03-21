package com.navy.linked;

public class LRUAlgorithm<T> {
	
	private Integer lruSize;
	
	private SingleLinkedList<T> sll = new SingleLinkedList<T>();
	
	public LRUAlgorithm(Integer lruSize) {
		this.lruSize = lruSize;
	}
	
	public void access(T member) {
		if(sll.getSize() < lruSize) {
			sll.add(member);
		}
		
	}
}
