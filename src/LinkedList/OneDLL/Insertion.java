package LinkedList.OneDLL;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Intro {

    // 1. Insert at the Head (Start)
    public static Node insertAtHead(Node head, int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        return newNode;
    }

    // 2. Insert at the Last (Tail)
    public static Node insertAtLast(Node head, int val) {
        Node newNode = new Node(val);
        if (head == null) {
            return newNode;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    // 3. Insert at a Specific Position (1-based indexing)
    public static Node insertAtPosition(Node head, int val, int pos) {
        if (pos < 1) {
            System.out.println("Invalid position!");
            return head;
        }
        if (pos == 1) {
            return insertAtHead(head, val);
        }

        Node newNode = new Node(val);
        Node temp = head;
        int count = 1;

        // Traverse to the node just before the insertion point
        while (temp != null && count < pos - 1) {
            temp = temp.next;
            count++;
        }

        if (temp == null) {
            System.out.println("Position out of bounds!");
            return head;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

    // 4. Insert Before a Specific Value
    public static Node insertBeforeValue(Node head, int val, int target) {
        if (head == null) {
            return null; // List is empty
        }

        // If target is found at the head
        if (head.data == target) {
            return insertAtHead(head, val);
        }

        Node temp = head;
        while (temp.next != null) {
            if (temp.next.data == target) {
                Node newNode = new Node(val);
                newNode.next = temp.next;
                temp.next = newNode;
                return head;
            }
            temp = temp.next;
        }

        System.out.println("Value " + target + " not found in the list!");
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
        Node head = null;

        System.out.println("--- Testing Insertions ---");
        head = insertAtHead(head, 20);      // 20 -> null
        printList(head);
        head = insertAtHead(head, 10);      // 10 -> 20 -> null
        printList(head);
        head = insertAtLast(head, 40);      // 10 -> 20 -> 40 -> null
        printList(head);
        head = insertAtPosition(head, 30, 3); // 10 -> 20 -> 30 -> 40 -> null
        printList(head);
        head = insertBeforeValue(head, 25, 30); // 10 -> 20 -> 25 -> 30 -> 40 -> null

        printList(head);
    }
}
