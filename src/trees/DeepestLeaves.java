package trees;

import java.util.LinkedList;
import java.util.Queue;

public class DeepestLeaves {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public int deepestLeavesSum(TreeNode root) {

        return helper(root);

    }

    public int helper(TreeNode node){

        Queue<TreeNode> nodeList = new LinkedList<>();
        nodeList.add(node);
        int res=0;

        while(!nodeList.isEmpty()){
            int size = nodeList.size();
            res=0;
            for(int i =0;i < size; i++){
                TreeNode n = nodeList.poll();
                res += n.val;
                if(n.left != null){
                    nodeList.add(n.left);
                }
                if(n.right != null){
                    nodeList.add(n.right);
                }
            }

        }
        return res;
    }
}
