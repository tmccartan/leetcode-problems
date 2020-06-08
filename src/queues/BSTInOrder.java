package queues;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BSTInOrder {

    /*
    Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

    For example:

    Given binary tree [3,9,20,null,null,15,7],
        3
       / \
      9  20
        /  \
       15   7
    return its level order traversal as:
    [
      [3],
      [9,20],
      [15,7]
    ]
    */
    public class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) { val = x; }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();
        if(root ==null){
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> levelValues = new ArrayList<>();
            for(int i = 0; i< size; i++){
                TreeNode cur = queue.remove();
                levelValues.add(cur.val);
                if(cur.left != null){
                    queue.add(cur.left);
                }

                if(cur.right != null){
                    queue.add(cur.right);
                }
            }
            result.add(levelValues);
        }
        return result;
        // BFS
        // Create a linked list queue
        // if there is still items in the queue
        // loop over each item in the queue
        // add there value to the list
        // if the node has children, add them to the queue;
        // add the list of values to the result

    }
}
