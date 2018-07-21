package preorderToBST;
import largestKElementinBST.Node;

public class PreorderToBST {
	public Node preorderToBST(int[] preorder) {
		int[] index = {0 };
		return preorderToBSTHelper(preorder, Integer.MIN_VALUE, Integer.MAX_VALUE, index);
	}
	private Node preorderToBSTHelper(int[] preorder, int minValue, int maxValue, int[] index) {
		// TODO Auto-generated method stub
		if(index[0] == preorder.length) {
			return null;
		}
		if(preorder[index[0]] > maxValue || preorder[index[0]] < minValue) {
			return null;
		}
		Node root = new Node(preorder[index[0]]);
		index[0]++;
		root.setLeft(preorderToBSTHelper(preorder, minValue, root.getVal(), index));
		root.setRight(preorderToBSTHelper(preorder, root.getVal(), maxValue, index));
		return root;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] preorder = {43, 23, 37, 29, 31, 41, 47, 53};
		Node root = new PreorderToBST().preorderToBST(preorder);
		root.inorder();
	}

}
