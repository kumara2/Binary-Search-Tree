package largestKElementinBST;
import java.util.*;
public class LargestKEklements {
	
	public List<Integer> kLargestNodes(Node root, int k) {
		List<Integer> kLargestNode = new ArrayList<Integer>();
		helper(root, kLargestNode, k);
		return kLargestNode;
	}

	private void helper(Node root, List<Integer> kLargestNode, int k) {
		if(root == null) {
			return;
		}
		helper(root.getRight(), kLargestNode, k);
		if(kLargestNode.size() < k) {
			kLargestNode.add(root.getVal());
			helper(root.getLeft(), kLargestNode, k);
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
		List<Integer> kLargestNode = new LargestKEklements().kLargestNodes(root, 90);
		System.out.println(kLargestNode);
	}

}
