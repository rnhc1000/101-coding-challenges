package challengeOne.utils;

public class TreeNode {

    public int val;
    public TreeNode right;
    public TreeNode left;

    TreeNode() {
    }

    TreeNode(int val) {
	this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
	this.val = val;
	this.left = left;
	this.setRight(right);
    }

    TreeNode(TreeNode left, TreeNode right) {
	this.left = left;
	this.setRight(right);
    }

    public TreeNode getRight() {
	return right;
    }

    public void setRight(TreeNode right) {
	this.right = right;
    }

    public TreeNode getLeft() {
	return left;
    }

    public void setLeft(TreeNode left) {
	this.left = left;
    }

}
