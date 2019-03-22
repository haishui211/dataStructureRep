package com.navy.linked;

public class LRUAlgorithm<T> {
	
	private Integer lruSize;
	
	private SingleLinkedList<T> sll = new SingleLinkedList<T>();
	
	public LRUAlgorithm(Integer lruSize) {
		this.lruSize = lruSize;
	}
	
	public void access(T member) {
		Integer index = sll.index(member);
		if(index == -1) {
			//元素不存在lru访问链表中
			resolveNotExist(member);
		}
		else {
			//元素存在lru访问链表中
			resolveExist(member);
		}
	}
	
	private void resolveExist(T member) {
		sll.remove(member);
		sll.addAtHead(member);
	}
	
	private void resolveNotExist(T member) {
		if(sll.getSize() >= lruSize) {
			//lru链表已满
			T lastMember = sll.get(lruSize-1);
			sll.remove(lastMember);
		}
		sll.addAtHead(member);
	}
	
	public void printAll() {
		this.sll.printAll();
	}
}
