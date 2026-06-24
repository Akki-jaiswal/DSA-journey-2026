package LinkedList.Medium;

import java.util.List;

public class ReverseRecursive {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; next = null; }
    }
    public ListNode reverseList(ListNode head){
        if(head == null || head.next == null)
            return head;
        ListNode newHead = reverseList(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;
        return newHead;
    }
    void main(String[] args) {
        // Creating linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ReverseRecursive sol = new ReverseRecursive();
        ListNode reversed = sol.reverseList(head);

        // Printing reversed list
        while (reversed != null) {
            System.out.print(reversed.val + " ");
            reversed = reversed.next;
        }
        System.out.println();
    }
}
