package com.bridgelabz.binarysearchtree;

public class BinarySearchTreeUC3 {
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
	static Node root;
	BinarySearchTreeUC3(){
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
		public static boolean Search(Node node, int key) {
			if(node == null) {
				return false;
			}
			if(node.key == key) {
				return true;
			}
			return Search(node.left, key) || Search(node.right, key);
		}
		public static void main(String[]args) {
			BinarySearchTreeUC3 Obj = new BinarySearchTreeUC3();
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
			BinarySearchTreeUC3.preOrder(Obj.root);
			System.out.println(Obj.Search(root, 63));
		}
}
