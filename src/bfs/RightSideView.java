package bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightSideView {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public List<Integer> rightSideView(TreeNode root) {


        return buildRightSideView(root);

    }

    private List<Integer> buildRightSideView(TreeNode node){
        List<Integer> output = new ArrayList<>();

        if(node == null){
            return output;
        }

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(node);

        while(!queue.isEmpty()){
            int nodeCount = queue.size();

            for(int i = 0; i< nodeCount; i++){
                TreeNode current = queue.remove();
                if(i == nodeCount - 1){
                    output.add(current.val);
                }
                if(current.left != null){
                    queue.add(current.left);
                }
                if(current.right != null){
                    queue.add(current.right);
                }
            }
        }

        return output;
    }
}
