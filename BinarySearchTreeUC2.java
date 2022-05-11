package com.bridgelabz.binarysearchtree;

public class BinarySearchTreeUC2 {
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
	BinarySearchTreeUC2(){
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
			BinarySearchTreeUC2 Obj = new BinarySearchTreeUC2();
			Obj.insert(56);
			Obj.insert(30);
			Obj.insert(22);
			Obj.insert(11);
			Obj.insert(3);
			Obj.insert(16);
			Obj.insert(40);
			Obj.insert(70);
			Obj.insert(60);
			Obj.insert(65);
			Obj.insert(63);
			Obj.insert(67);
			Obj.insert(95);
			BinarySearchTreeUC2.preOrder(Obj.root);
		}
}
