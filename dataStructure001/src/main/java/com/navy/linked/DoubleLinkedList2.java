package com.navy.linked;

public class DoubleLinkedList2<T> {
	Node<T> head;
	Node<T> tail;
	Integer size = 0;
	
	public void add(T member) {
		Node<T> insertNode = new Node<T>();
		insertNode.data = member;
		
		if(head == null) {
			head = insertNode;
			tail = insertNode;
			size++;
			return;
		}
		
		Node<T> point = tail;
		point.next = insertNode;
		insertNode.pre = point;
		tail = insertNode;
		size++;
	}
	
	public T get(Integer index) {
		
		if(index >= size || size < 0 || index < 0) {
			return null;
		}
		
		Node<T> p = head;
		
		for(int i = 0; i < index; i++) {
			p = p.next;
		}
		
		return p.data;
	}
	
	public int index(T member) {
		
		if(size <= 0) {
			return -1;
		}
		
		Node<T> p = head;
		
		for(int i = 0; i < size; i++) {
			if(p.data.equals(member)) {
				return i;
			}
			p = p.next;
		}
		
		return -1;
	}
	
	public Integer remove(T member) {
		
		if(size < 0) {
			return -1;
		}
		
		Node<T> target = head;
		
		while(target != null) {
			if(target.data.equals(member)) {
				break;
			}
			target = target.next;
		}
		
		//未找到相等的元素
		if(target == null) {
			return -1;
		}
		
		//如果该元素为链表的唯一节点
		if(target.pre == null && target.next == null) {
			head = null;
			tail = null;
			size = 0;
			
			return 1;
		}
		
		//如果该元素为链表的头节点
		if(target.pre == null) {
			head = target.next;
			target.next.pre = null;
			size--;
			
			return 1;
		}
		
		//如果该元素为链表的尾节点
		if(target.next == null) {
			tail = target.pre;
			target.pre.next = null;
			size--;
			
			return 1;
		}
		
		target.pre.next = target.next;
		target.next.pre = target.pre;
		size--;
		
		return 1;
	}
	
	public void inverse() {
		if(size <= 1) {
			return;
		}
		
		tail = head;
		
		Node<T> p = head;
		Node<T> pNext = p.next;
		Node<T> pNextNext = null;
		
		while(p != null) {
			
			if(pNext == null) {
				head = p;
				break;
			}
			
			pNextNext = pNext.next;
			
			p.pre = pNext;
			pNext.next = p;
			
			p = pNext;
			pNext = pNextNext;
		}
		
		head.pre = null;
		tail.next = null;
	}
}
