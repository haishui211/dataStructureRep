package com.navy.tree.binarySearchTree;

/**
 * 二叉查找树
 * 在树中的任意一个节点，其左子树中的每个节点的值，都要小于这个节点的值，而右子树节点的值都大于这个节点的值。
 * @author haishui211
 *
 */
public class BinarySearchTree {
	
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

	/**
	 * 前序遍历
	 * 打印它本身，再打印左子树、右子树
	 */
	public void preOrder(){
		pre(tree);
	}

	private void pre(Node<Integer> tree){
		if(tree == null){
			return;
		}
		System.out.print(tree.data + " ");
		pre(tree.left);
		pre(tree.right);
	}

	/**
	 * 中序遍历
	 * 先打印左子树，再打印它本身，然后打印右子树
	 */
	public void inOrder(){
		inOrder(tree);
	}

	private void inOrder(Node<Integer> tree){
		if(tree == null) return;
		inOrder(tree.left);
		System.out.print(tree.data+ " ");
		inOrder(tree.right);
	}

	/**
	 * 后序遍历
	 * 先打印左子树、右子树，再打印它本身
	 */
	public void postOrder(){
		postOrder(tree);
	}

	private void postOrder(Node<Integer> tree){
		if(tree == null) return;
		postOrder(tree.left);
		postOrder(tree.right);
		System.out.print(tree.data+ " ");
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
