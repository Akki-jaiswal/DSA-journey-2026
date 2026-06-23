package LinkedList.DoublyLL;

public class Deletion {
    static class Node{
        int data;
        Node next;
        Node back;

        Node(int data){
            this.data = data;
            this.next = null;
            this.back = null;
        }
    }
    public static Node deleteHead(Node head){
        if (head==null || head.next==null) return null;
        Node prev = head;
        head = head.next;
        head.back = null;
        prev.next = null;
        return head;
    }
    public static Node deleteLast(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node prevNode = temp.back;
        prevNode.next = null;
        temp.back = null; // Sever links
        return head;
    }
    public static Node deleteAtKthPosition(Node head, int k) {
        if (head == null || k < 1) return head;
        Node temp = head;
        int count = 1;
        while (temp != null && count < k) {
            temp = temp.next;
            count++;
        }
        if (temp == null) return head;
        Node prevNode = temp.back;
        Node nextNode = temp.next;

        if (prevNode == null && nextNode == null) { // Single node deletion
            return null;
        } else if (prevNode == null) { // Deleting head
            return deleteHead(head);
        } else if (nextNode == null) { // Deleting tail
            return deleteLast(head);
        }

        // Deleting an inner node
        prevNode.next = nextNode;
        nextNode.back = prevNode;
        temp.next = null;
        temp.back = null;

        return head;
    }
    public static Node deleteValue(Node head, int target) {
        if (head == null) return null;

        Node temp = head;
        while (temp != null) {
            if (temp.data == target) {
                Node prevNode = temp.back;
                Node nextNode = temp.next;

                if (prevNode == null && nextNode == null) {
                    return null;
                } else if (prevNode == null) {
                    return deleteHead(head);
                } else if (nextNode == null) {
                    return deleteLast(head);
                }

                // Node found in the middle
                prevNode.next = nextNode;
                nextNode.back = prevNode;
                temp.next = null;
                temp.back = null;
                return head;
            }
            temp = temp.next;
        }
        return head; // Value not found
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        // Constructing initial DLL: 10 <-> 20 <-> 25 <-> 30 <-> 40 -> null
        Node head = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(25);
        Node n4 = new Node(30);
        Node n5 = new Node(40);

        head.next = n2; n2.back = head;
        n2.next = n3; n3.back = n2;
        n3.next = n4; n4.back = n3;
        n4.next = n5; n5.back = n4;

        System.out.println("Original List:");
        printList(head);

        System.out.println("\n--- Testing DLL Deletions ---");
        printList(head);
        head = deleteHead(head);
        System.out.print("After Deleting Head: ");
        printList(head); // Expected: 20 <-> 25 <-> 30 <-> 40 -> null

        head = deleteLast(head);
        System.out.print("After Deleting Last: ");
        printList(head); // Expected: 20 <-> 25 <-> 30 -> null

        head = deleteAtKthPosition(head, 2);
        System.out.print("After Deleting Position 2: ");
        printList(head); // Expected: 20 <-> 30 -> null

        head = deleteValue(head, 30);
        System.out.print("After Deleting Value 30: ");
        printList(head); // Expected: 20 -> null
    }
}
