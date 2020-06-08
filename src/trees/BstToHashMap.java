package trees;

import java.util.*;

public class BstToHashMap {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static void main(String[] args) {

        // Given a BST
        // Convert to hash map, where the values is a list of all nodes under the current on

        HashMap<TreeNode, List<Integer>> map = new HashMap<>();
        TreeNode head = new TreeNode(10);
        TreeNode headLeft = new TreeNode(5);
        TreeNode headRight = new TreeNode(20);
        head.left = headLeft;
        head.right = headRight;
        TreeNode childHeadLeftLeft = new TreeNode(3);
        TreeNode childHeadLeftRight = new TreeNode(7);
        headLeft.left = childHeadLeftLeft;
        headLeft.right = childHeadLeftRight;
        TreeNode childHeadRightRight = new TreeNode(30);
        headRight.right = childHeadRightRight;

        helper(head, map);

        for(TreeNode key: map.keySet()){

            System.out.println("Key "+ key.val + " values "+ Arrays.toString(map.get(key).toArray()));
        }

        /*

        For each node, get the list of nodes on the left and the right
        Add the node to the hash map.
         */

    }

    static void helper(TreeNode cur, TreeNode parent, HashMap<TreeNode, List<Integer>> map){
        if(cur != null){
            System.out.println("Visiting "+cur.val);

            if(cur.left != null){
                helper(cur.left, cur, map);
            }

            if(cur.right != null){
                helper(cur.right, cur, map);
            }
            if(parent !=null) {
                if (map.containsKey(parent)) {
                    System.out.println("Map contains parent "+parent.val);

                    List<Integer> nodes = map.get(parent);
                    nodes.add(cur.val);
                    map.put(parent, nodes);
                } else {
                    System.out.println("Map doesnt contain parent");
                    map.put(parent, new ArrayList<>());
                }
            }

        }
    }
    static List<Integer> helper(TreeNode cur, HashMap<TreeNode, List<Integer>> map){
        List<Integer> valsCombined = new ArrayList<>();
        if(cur != null){

            System.out.println("Visiting "+cur.val);
            List<Integer> leftVals = new ArrayList<>();
            List<Integer> rightVals = new ArrayList<>();

            if(cur.left != null){
                 valsCombined.add(cur.left.val);
                 leftVals.addAll(helper(cur.left, map));
            }

            if(cur.right != null){
                valsCombined.add(cur.right.val);
                rightVals.addAll(helper(cur.right, map));
            }

            valsCombined.addAll(leftVals);
            valsCombined.addAll(rightVals);

            if(!valsCombined.isEmpty()) {
                map.put(cur, valsCombined);
            }
        }
        return valsCombined;
    }
}
