package com.navy.tree;

/**
 * 二叉查找树
 * @author haishui211
 *
 */
public class BiTree {
	
	private Node<Integer> tree;
	
	public void insert(Integer data) {
		if(tree == null) {
			tree = new Node<Integer>(data);
			return;
		}
		Node<Integer> p = tree;
		while(p != null) {
			if(data < p.data) {
				if(p.left == null) {
					Node<Integer> node = new Node<Integer>(data);
					p.left = node;
					return;
				}
				p = p.left;
			}
			else {
				if(p.right == null) {
					Node<Integer> node = new Node<Integer>(data);
					p.right = node;
					return;
				}
				p = p.right;
			}
		}
	}
	
	public Node<Integer> find(Integer data) {
		if(tree == null) {
			return null;
		}
		Node<Integer> p = tree;
		while(p != null) {
			if(data < p.data) {
				p = p.left;
			}
			else if(data > p.data) {
				p = p.right;
			}
			else {
				return p;
			}
		}
		return null;
	}
	
	public void del(Integer data) {
		if(tree == null) {
			return;
		}
		
		Node<Integer> p = tree;
		
		Node<Integer> pp = null;
		
		while(p != null) {
			if(data == p.data) {
				return;
			}
			pp = p;
			if(data < p.data) {
				p = p.left;
			}
			else if(data > p.data) {
				p = p.right;
			}
		}
		
		//只有一个节点
		if(pp == null) {
			tree = null;
		}
		Node<Integer> child = null;
		//被删除节点没有孩子
		if(p.left == null && p.right == null) {
			child = null;
		}
		//被删除节点有且仅有一个孩子
		else if(p.left != null && p.right == null) {
			child = p.left;
		}
		else if(p.right != null && p.left == null) {
			child = p.right;
		}
		else {
			
		}
		
		if(pp.left != null && pp.left.data == p.data) {
			pp.left = child;
		}
		else {
			pp.right = child;
		}
	}
}
