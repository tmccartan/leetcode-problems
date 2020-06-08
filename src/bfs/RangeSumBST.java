package bfs;

import java.util.LinkedList;
import java.util.Queue;

public class RangeSumBST {


    /*
    Given the root node of a binary search tree, return the sum of values of all nodes with value between L and R (inclusive).

    The binary search tree is guaranteed to have unique values.

    Example 1:

    Input: root = [10,5,15,3,7,null,18], L = 7, R = 15
    Output: 32
    Example 2:

    Input: root = [10,5,15,3,7,13,18,1,null,6], L = 6, R = 10
    Output: 23

    * */
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public int rangeSumBST(TreeNode root, int L, int R) {
        int sum = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){

            TreeNode node = queue.remove();

            if(node.val >= L && node.val <= R){
                sum += node.val;
            }
            if(node.left != null && L < node.val){
                queue.add(node.left);
            }
            if(node.right != null && R > node.val){
                queue.add(node.right);
            }
        }
        return sum;
    }
}
