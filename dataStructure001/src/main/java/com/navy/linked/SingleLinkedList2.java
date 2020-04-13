package com.navy.linked;

import java.util.HashMap;
import java.util.Map;

public class SingleLinkedList2<T> {
	Node<T> head;
	Node<T> tail;
	int size = 0;
	
	public void add(T t) {
		addAtTail(t);
	}
	
	public void addAtTail(T t) {
		
		Node<T> addNode = new Node<T>();
		addNode.data = t;
		
		if(tail == null) {
			head = addNode;
			tail = addNode;
			size++;
			return;
		}
		
		Node<T> temp = tail;
		temp.next = addNode;
		tail = addNode;
		size++;
	}
	
	public void addAtHead(T t) {
		Node<T> addNode = new Node<T>();
		addNode.data = t;
		
		if(head == null) {
			head = addNode;
			tail = addNode;
			size++;
			return;
		}
		
		Node<T> temp = head;
		addNode.next = temp;
		head = addNode;
		size++;
	}
	
	public Integer getSize() {
		return this.size;
	}
	
	public T get(int index) {
		if(index >= 0 && index < size) {
			Node<T> point = new Node<T>();
			for(int i = 0; i <= index; i++) {
				if(i == 0) {
					point = head;
				}
				else {
					point = point.next;
				}
			}
			return point.data;
		}
		return null;
	}
	
	public Integer index(T member) {
		if(size <= 0) {
			return -1;
		}
		
		Node<T> point = head;
		
		for(int i = 0; i < size; i++) {
			if(member.equals(point.data)) {
				return i;
			}
			else {
				point = point.next;
			}
		}
		
		return -1;
	}
	
	public Integer remove(T member) {
		
		if(size == 0) {
			return -1;
		}
		
		Node<T> prev = null;
		Node<T> target = head;
		
		while(target != null) {
			if(target.data.equals(member)) {
				break;
			}
			prev = target;
			target = target.next;
		}
		
		//没有找到匹配的元素
		if(target == null) {
			return -1;
		}
		
		//列表中只有一个元素
		if(prev == null && target.next == null) {
			head = null;
			tail = null;
			size--;
			return 1;
		}
		
		// 是列表中的第一个元素，头节点
		if (prev == null && target.next != null) {
			head = target.next;
			size--;
			return 1;
		}
		
		//是列表中的最后一个元素，尾节点
		if(prev != null && target.next == null) {
			prev.next = null;
			tail = prev;
			size--;
			return 1;
		}
		
		prev.next = target.next;
		size--;
		
		return 1;
	}
	
	public void inverse() {
		if(size <= 1) {
			return;
		}
		
		tail = head;
		Node<T> p = head;
		Node<T> pN = p.next;
		
		while(p != null) {
			if(pN == null) {
				head = p;
				break;
			}
			Node<T> pNN = pN.next;
			pN.next = p;
			p = pN;
			pN = pNN;
		}
		
		tail.next = null;
	}
	
	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<String, Object>();
	}
}
