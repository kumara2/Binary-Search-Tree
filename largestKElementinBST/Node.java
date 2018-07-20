package largestKElementinBST;

public class Node {
	private int val;
	private Node left, right;
	public Node(int val) {
		this.val = val;
	}
	public void insert(int num) {
		if(val > num) {
			if(left == null) {
				left = new Node(num);
			} else {
				left.insert(num);
			}
		} else {
			if(right == null) {
				right = new Node(num);
			} else {
				right.insert(num);
			}
		}
	}
	public void inorder() {
		if(left != null) {
			left.inorder();
		}
		System.out.print(val + " " );
		if(right != null) {
			right.inorder();
		}
	}
	public int getVal() {
		return val;
	}
	public void setVal(int val) {
		this.val = val;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
}
