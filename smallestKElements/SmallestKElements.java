package smallestKElements;

import java.util.*;

import largestKElementinBST.Node;

public class SmallestKElements {
	
	/*
	 * @Parameter: root of the tree,  k - > number of elements we want in the list
	 * @return : returns a list of k smallest elements in the BST
	 */
	public List<Integer> kSmallestNodes(Node root, int k) {
		List<Integer> kSmallestNode = new ArrayList<Integer>();
		helper(root, kSmallestNode, k);
		return kSmallestNode;
	}

	private void helper(Node root, List<Integer> kSmallestNode, int k) {
		if(root == null) {
			return;
		}
		helper(root.getLeft(), kSmallestNode, k);
		if(kSmallestNode.size() < k) {
			kSmallestNode.add(root.getVal());
			helper(root.getRight(), kSmallestNode, k);
		}		
	}

	public static void main(String[] args) {
		Node root = new Node(50);
		root.insert(45);
		root.insert(55);
		root.insert(51);
		root.insert(60);
		root.insert(40);
		root.insert(30);
		root.insert(35);
		root.insert(65);
		root.insert(100);
		root.inorder();
		List<Integer> kSmallestNode = new SmallestKElements().kSmallestNodes(root, 4);
		System.out.println(kSmallestNode);
	}

}
