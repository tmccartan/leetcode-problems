package lists;

public class RemoveNthNodeFromList {

    public static class ListNode {
        ListNode next;
        int val;
        ListNode (int val) {
            this.val =val;
        }

    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(0);
        int length =0;
        dummy.next = head;
        ListNode first = head;
        while(first.next != null){
            length++;
            first = first.next;
        }
        length = length -n;
        first = dummy;
        while(length >=0){
            length--;
            first = first.next;
        }

        first.next = first.next.next;

        return dummy.next;
        // find the

    }

    public  static void main(String[] args){

        /*
        *
        *   Given linked list: 1->2->3->4->5, and n = 2.

            After removing the second node from the end, the linked list becomes 1->2->3->5.
        * */

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode result = removeNthFromEnd(head, 2);

        while (result!= null){
            System.out.println(result.val);
            result = result.next;
        }


    }
}
