package com.navy.linked;


/**
 * 单向链表
 * @author haishui211
 * @param <T>
 */
public class SingleLinkedList<T> {
	
	private Node<T> head;
	private Node<T> tail;
	private Integer size = 0;
	
	public void add(T member) {
		
		Node<T> insert = new Node<T>();
		insert.data = member;
		
		if(tail == null) {
			head = insert;
			tail = insert;
			size++;
			return;
		}
		
		Node<T> temp = tail;
		temp.next = insert;
		tail = insert;
		size++;
	}
	
	public void addAtHead(T member) {
		
		Node<T> insert = new Node<T>();
		insert.data = member;
		
		if(tail == null) {
			head = insert;
			tail = insert;
			size++;
			return;
		}
		insert.next = head;
		head = insert;
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
	
	public Integer index(T member) {
		
		int index = -1;
		Node<T> target = head;
		while(target != null) {
			index++;
			if(member.equals(target.data)) {
				return index;
			}
			target = target.next;
		}
		
		return -1;
	}
	
	public void printAll() {
		Node<T> target = head;
		while(target != null) {
			System.out.print(target.data + "  ");
			target = target.next;
		}
		System.out.println();
	}
	
	public int remove(T member) {
		
		if(size == 0) {
			return 0;
		}
		
		Node<T> target = head;
		Node<T> prev = null;
		
		while(target != null) {
			if(member.equals(target.data)) {
				break;
			}
			prev = target;
			target = target.next;
		}
		
		//如果没有找到需要删除的节点
		if(target == null) {
			return 0;
		}
		//如果需要删除的节点恰好是链表的唯一元素
		if(prev == null && target.next == null) {
			head = null;
			tail = null;
			size = 0;
			return 1;
		}
		//如果需要删除的节点恰好是链表的头节点，将头节点指向到目标节点的下一个节点
		if(prev == null) {
			head = target.next;
			size--;
			return 1;
		}
		//如果需要删除的节点恰好是链表的尾节点，将尾节点指向到目标节点的前一个节点
		if(target.next == null) {
			tail = prev;
			prev.next = null;
			size--;
			return 1;
		}
		
		prev.next = target.next;
		size--;
		
		return 1;
	}
	
	public int removeAll(T member) {
		boolean flag = true;
		int count = 0;
		while(flag) {
			if(remove(member) == 0) {
				flag = false;
			}
			else {
				count++;
			}
		}
		return count;
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
			p = pNext;
			pNext = pNextNext;
		}
		
		tail.next = null;
	}

	public Integer getSize() {
		return size;
	}
}
