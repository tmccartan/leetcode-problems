package trees;


public class Traversals {

    public class ListNode{

        ListNode left;
        ListNode right;
        int val;

        public ListNode(int val){
            this.val = val;
        }
    }

    public void inOrder(ListNode node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.println(node.val);
        inOrder(node.right);
    }

    public void preOrder(ListNode node){
        if(node == null){
            return;
        }
        System.out.println(node.val);
        preOrder(node.left);
        preOrder(node.right);
    }

    public void postOrder(ListNode node){
        if(node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.val);
    }
}
