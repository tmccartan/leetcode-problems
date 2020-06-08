package trees;

public class InvertTree {

    public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
    }

    /**
     *
     *
     * Invert a binary tree.
     *
     * Example:
     *
     * Input:
     *
     *      4
     *    /   \
     *   2     7
     *  / \   / \
     * 1   3 6   9
     * Output:
     *
     *      4
     *    /   \
     *   7     2
     *  / \   / \
     * 9   6 3   1
     *
     */

    public TreeNode invertTree(TreeNode root) {

        // for each node
        // swap left with right.
        // recurse until node is null
        helper(root);
        return root;
    }

    public void helper(TreeNode node){

        if(node != null){

            TreeNode left = node.left;
            TreeNode right = node.right;

            node.left = right;
            node.right = left;

            helper(node.left);
            helper(node.right);
        }

    }
}
