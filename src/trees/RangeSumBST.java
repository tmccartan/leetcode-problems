package trees;

import java.util.LinkedList;
import java.util.Queue;

public class RangeSumBST {

    public class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) { val = x; }
    }
    public int rangeSumBST(TreeNode root, int L, int R) {
        int ans =0;
        sum(root, L,R, ans);
        return ans;
    }
    //dfs
    public void sum(TreeNode node, int min, int max, int ans){
        if(node !=null){
            if(min<= node.val && node.val <= max){
                ans += node.val;
            }
            if(min < node.val){
                sum(node.left, min , max, ans);
            }
            if(max > node.val){
                sum(node.right, min ,max, ans);
            }
        }

    }


    //bfs

    public int rangeSumBSTBFS(TreeNode root, int L, int R) {
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
