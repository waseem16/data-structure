package com.waseem.datastructure.tree;

public class BinaryTree {
	
	// create a binary tree from an array
	public static Node createTree(Node root, int[] arr, int i) {
		if (i < arr.length) {
			Node temp = new Node(arr[i]);
			root = temp;
			root.left = createTree(root.left, arr, 2 * i + 1);
			root.right = createTree(root.right, arr, 2 * i + 2);
		}
		return root;
	}

	public static void inorder(Node root) {
		if (root != null) {
			inorder(root.left);
			System.out.print(root.data + " -> ");
			inorder(root.right);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 ,10 , 11, 12};
		Node root = BinaryTree.createTree(null, arr, 0);
		BinaryTree.inorder(root);
	}
}
