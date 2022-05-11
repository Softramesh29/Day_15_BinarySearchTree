package com.bridgelabz.binarysearchtree;

public class BinarySearchTreeUC1 {
	class Node {
			int key;
			Node left;
			Node right;
		public Node(int item) {
			key = item;
			left = null;
			right =null;
		}
	}
	Node root;
	BinarySearchTreeUC1(){
		root = null;
	}
	
	void insert(int key) {
		root = insertRec(root, key);
	
	}
	Node insertRec(Node root, int key) {
		if (root == null) {
			root = new Node(key);
			return root;
		}
		if (key < root.key)
			root.left = insertRec(root.left,key);
		else if (key > root.key)
			root.right = insertRec(root.right,key);
			
		return root;
		
	}
	public static void preOrder(Node root) {
		if(root != null) {
			System.out.print(root.key+" ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	public static void main(String[]args) {
		BinarySearchTreeUC1 Obj = new BinarySearchTreeUC1();
		Obj.insert(56);
		Obj.insert(30);
		Obj.insert(70);
		BinarySearchTreeUC1.preOrder(Obj.root);
	}
}
