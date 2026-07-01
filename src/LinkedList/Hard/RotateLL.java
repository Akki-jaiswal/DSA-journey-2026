package LinkedList.Hard;

public class RotateLL {
    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val=x;
            next=null;
        }
    }
    public ListNode rotateRight(ListNode head, int k){
        if (head==null || head.next == null || k==0){
            return head;
        }
        int length = 1;
        ListNode tail = head;
        while (tail.next != null){
            tail = tail.next;
            length++;
        }
        tail.next = head;
        k=k%length;
        int stepToNewTail = length - k;
        ListNode newTail = head;
        for (int i =1; i<stepToNewTail; i++){
            newTail = newTail.next;
        }
        ListNode newHead = newTail.next;
        newTail.next = null;
        return newHead;
    }
    void main(String[] args) {
        // Creating linked list: 1->2->3->4->5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int k = 2;

        RotateLL obj = new RotateLL();
        ListNode newHead = obj.rotateRight(head, k);

        // Print rotated list
        while (newHead != null) {
            System.out.print(newHead.val + " ");
            newHead = newHead.next;
        }
        System.out.println();
    }
}
