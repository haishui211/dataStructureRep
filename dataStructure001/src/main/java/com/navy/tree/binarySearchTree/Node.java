package com.navy.tree.binarySearchTree;

public class Node<T> {
	
	public Node(T data) {
		this.data = data;
	}
	
	T data;
	Node<T> left;
	Node<T> right;
}
