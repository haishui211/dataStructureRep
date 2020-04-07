package com.navy.tree;

public class Node<T> {
	
	public Node(T data) {
		this.data = data;
	}
	
	T data;
	Node<T> left;
	Node<T> right;
}
