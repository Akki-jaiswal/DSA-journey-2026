package LinkedList.Medium;

public class SortLL {
    class Node{
        int data;
        Node next;
        Node(int data1, Node next1){
            data = data1;
            next = next1;
        }
        Node(int data1){
            data = data1;
            next = null;
        }
    }
    public Node mergeTwoSortedLinkedLists(Node list1, Node list2){
        Node dummyNode = new Node(-1, null);
        Node temp = dummyNode;
        while (list1 != null && list2 != null){
            if (list1.data <= list2.data){
                temp.next = list1;
                list1 = list1.next;
            }
            else {
                temp.next = list1;
                list2 = list2.next;
            }
            temp = temp.next;
        }
        if (list1 != null){
            temp.next = list1;
        }
        else{
            temp.next = list2;
        }
        return dummyNode.next;
    }
    public Node findMiddle(Node head) {
        // If list empty or single node
        if (head == null || head.next == null) {
            return head;
        }

        // Slow and fast pointers
        Node slow = head;
        Node fast = head.next;

        // Move fast twice as fast as slow
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Return middle node
        return slow;
    }

    // Function to perform merge sort
    public Node sort(Node head) {
        // Base case: empty or single node
        if (head == null || head.next == null) {
            return head;
        }

        // Find middle node
        Node middle = findMiddle(head);

        // Split into two halves
        Node right = middle.next;
        middle.next = null;
        Node left = head;

        // Recursively sort both halves
        left = sort(left);
        right = sort(right);

        // Merge sorted halves
        return mergeTwoSortedLinkedLists(left, right);
    }
    static void printLinkedList(Node head) {
        // Temp pointer to traverse
        Node temp = head;

        // Traverse and print nodes
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    void main(String[] args) {
        // Create linked list: 3 -> 2 -> 5 -> 4 -> 1
        Node head = new Node(3, null);
        head.next = new Node(2, null);
        head.next.next = new Node(5, null);
        head.next.next.next = new Node(4, null);
        head.next.next.next.next = new Node(1, null);

        // Print original list
        System.out.print("Original Linked List: ");
        printLinkedList(head);

        // Create Solution object
        SortLL obj = new SortLL();

        // Sort the linked list
        head = obj.sort(head);

        // Print sorted list
        System.out.print("Sorted Linked List: ");
        printLinkedList(head);
    }

}
