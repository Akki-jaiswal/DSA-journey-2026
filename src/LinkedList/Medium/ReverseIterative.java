package LinkedList.Medium;

public class ReverseIterative {
    class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
            this.val = val;
            this.next = next;
        }
    }
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode temp = head;
        while (temp!=null){
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
    void main(String[] args) {
        // Creating a linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

       ReverseIterative sol = new ReverseIterative();
        // Reversing the list
        ListNode newHead = sol.reverse(head);

        // Printing the reversed list
        while (newHead != null) {
            System.out.print(newHead.val + " ");
            newHead = newHead.next;
        }
        System.out.println();
    }

}
