package challengeOne.symmetricTree;

import challengeOne.utils.TreeNode;

/**
 * 
 * Given a binary tree, check if it is a mirror of itself [1,2,2,3,4,4,3] - OK
 * [1,2,2,null,3,null,3] - Not OK!
 * 
 */
public class Solution {

    public boolean isSymmetric(TreeNode root) {
	if (root == null) {
	    return true;
	}

	boolean response = helper(root.getRight(), root.getLeft());

	return response;
    }

    public boolean helper(TreeNode right, TreeNode left) {

	if ((left == null) && (right == null))
	    return true;
	if ((left == null) || (right == null) || left.val != right.val)
	    return false;
	return helper(left.left, right.right) && helper(left.right, right.left);
    }

    public static void main(String[] args) {
	System.out.println("Hi");
    }
}
