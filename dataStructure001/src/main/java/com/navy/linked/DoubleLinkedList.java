package com.navy.linked;

/**
 * 双向链表
 * @author haishui211
 */
public class DoubleLinkedList<T> {
	private Node<T> head;
	private Node<T> tail;
	private Integer size = 0;
	
	public void add(T member) {
		Node<T> insert = new Node<T>();
		insert.data = member;
		
		if(head == null) {
			head = insert;
			tail = insert;
			size++;
			return;
		}
		
		Node<T> temp = tail;
		temp.next = insert;
		insert.pre = temp;
		tail = insert;
		size++;
	}
	
	public T get(Integer i) {
		
		if(size == 0) {
			return null;
		}
		
		if(i >= size) {
			return null;
		}
		
		Node<T> target = head;
		
		for(int index = 0; index < i; index++) {
			target = target.next;
		}
		
		return target.data;
	}
	
	public int index(T member) {
		int index = -1;
		Node<T> target = head;
		while(target != null) {
			index++;
			if(member.equals(target.data)) {
				break;
			}
			target = target.next;
		}
		return index;
	}
	
	public int remove(T member) {
		
		Node<T> target = head;
		
		while(target != null) {
			if(member.equals(target.data)) {
				break;
			}
			target = target.next;
		}
		
		//如果没有找到需要删除的节点
		if(target == null) {
			return 0;
		}
		
		//如果删除节点是链表的唯一节点
		if(target.pre == null && target.next == null) {
			head = null;
			tail = null;
			size--;
			return 1;
		}
		
		//如果删除节点是链表的头节点
		if(target.pre == null) {
			head = target.next;
			size--;
			return 1;
		}
		
		//如果删除节点是链表的尾节点
		if(target.next == null) {
			tail = target.pre;
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
		
		while(p != null) {
			
			if(pNext == null) {
				head = p;
				break;
			}
			
			Node<T> pNextNext = pNext.next;
			
			pNext.next = p;
			p.pre = pNext;
			
			p = pNext;
			pNext = pNextNext;
		}
		
		head.pre = null;
		tail.next = null;
	}

	public Integer getSize() {
		return size;
	}
}
