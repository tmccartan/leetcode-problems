package trees;

/**
 * Definition for a binary tree node.
 *
 *
 **/

class ValidateBinaryTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public boolean isValidBST(TreeNode root) {
        return validateTree(root, null, null); // driver function for nulls to start with
    }

    public boolean validateTree(TreeNode node, Integer lower, Integer upper){

        if(node == null){
            return true; // reached the end and we haven't seen a problem
        }
        int currentVal = node.val;

        if(lower != null && currentVal <= lower ){
            return false; // if the current node has a lower value that the current lowest then its invalid
        }
        if(upper !=null && currentVal >= upper ){
            return false; // if the current node has a upper value that the current upper then its invalid
        }

        if(!validateTree(node.right, currentVal, upper)) return false; // look right with the highest upper
        if(!validateTree(node.left, lower, currentVal)) return false; // look left with the lowest so far

        return true;

    }

    /// https://leetcode.com/explore/interview/card/top-interview-questions-easy/94/trees/625/
}