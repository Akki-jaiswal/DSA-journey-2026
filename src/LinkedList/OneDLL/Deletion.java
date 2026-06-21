public class Deletion {

}
static class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

    // 1. Delete the Head Node
    public static Node deleteHead(Node head) {
        if (head == null) return null;
        return head.next;
    }

    // 2. Delete the Last Node
    public static Node deleteLast(Node head) {
        if (head == null || head.next == null) {
            return null;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    // 3. Delete at a Specific Position (1-based indexing)
    public static Node deleteAtPosition(Node head, int pos) {
        if (head == null || pos < 1) {
            return head;
        }
        if (pos == 1) {
            return deleteHead(head);
        }

        Node temp = head;
        int count = 1;

        // Traverse to the node just before the one we want to delete
        while (temp != null && count < pos - 1) {
            temp = temp.next;
            count++;
        }

        if (temp == null || temp.next == null) {
            System.out.println("Position out of bounds!");
            return head;
        }

        temp.next = temp.next.next;
        return head;
    }

    // 4. Delete by a Specific Value
    public static Node deleteValue(Node head, int target) {
        if (head == null) return null;

        // If head contains the target value
        if (head.data == target) {
            return deleteHead(head);
        }

        Node temp = head;
        while (temp.next != null) {
            if (temp.next.data == target) {
                temp.next = temp.next.next;
                return head;
            }
            temp = temp.next;
        }

        System.out.println("Value " + target + " not found!");
        return head;
    }

    // Helper method to print the list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Constructing initial list: 10 -> 20 -> 25 -> 30 -> 40 -> null
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(25);
        head.next.next.next = new Node(30);
        head.next.next.next.next = new Node(40);

        System.out.println("Original List:");
        printList(head);

        System.out.println("\n--- Testing Deletions ---");

        head = deleteHead(head);
        System.out.print("After Deleting Head: ");
        printList(head); // Expected: 20 -> 25 -> 30 -> 40 -> null

        head = deleteLast(head);
        System.out.print("After Deleting Last: ");
        printList(head); // Expected: 20 -> 25 -> 30 -> null

        head = deleteAtPosition(head, 2);
        System.out.print("After Deleting Position 2: ");
        printList(head); // Expected: 20 -> 30 -> null

        head = deleteValue(head, 30);
        System.out.print("After Deleting Value 30: ");
        printList(head); // Expected: 20 -> null
    }
