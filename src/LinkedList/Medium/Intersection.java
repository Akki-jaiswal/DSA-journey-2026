package LinkedList.Medium;

public class Intersection {
    class Node {
        int num;
        Node next;
        Node(int val) {
            num = val;
            next = null;
        }
    }
    public void insertNode(Node head, int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public int getDifference(Node head1, Node head2) {
        int len1 = 0, len2 = 0;
        while (head1 != null || head2 != null) {
            if (head1 != null) {
                len1++;
                head1 = head1.next;
            }
            if (head2 != null) {
                len2++;
                head2 = head2.next;
            }
        }
        return len1 - len2;  // If negative, length of list2 > length of list1, else vice-versa
    }
    public Node intersectionPresent(Node head1, Node head2) {
        int diff = getDifference(head1, head2);

        if (diff < 0) {
            while (diff++ != 0) head2 = head2.next;
        } else {
            while (diff-- != 0) head1 = head1.next;
        }

        // Traverse both lists and compare node by node
        while (head1 != null) {
            if (head1 == head2) return head1;  // Intersection point found
            head2 = head2.next;
            head1 = head1.next;
        }
        return null;  // Return null if no intersection
    }
    public void printList(Node head) {
        while (head != null && head.next != null) {
            System.out.print(head.num + "->");
            head = head.next;
        }
        if (head != null) {
            System.out.print(head.num);
        }
        System.out.println();
    }
    void main(String[] args) {
        Intersection sol = new Intersection();

        // Creation of both lists
        Node head = new Node(1);
        sol.insertNode(head, 3);
        sol.insertNode(head, 1);
        sol.insertNode(head, 2);
        sol.insertNode(head, 4);
        Node head1 = head;
        head = head.next.next.next;  // Intersection point
        Node headSec = new Node(3);
        Node head2 = headSec;
        headSec.next = head;  // Creating intersection

        // Printing the lists
        System.out.print("List1: ");
        sol.printList(head1);
        System.out.print("List2: ");
        sol.printList(head2);

        // Checking if intersection is present
        Node answerNode = sol.intersectionPresent(head1, head2);
        if (answerNode == null) {
            System.out.println("No intersection");
        } else {
            System.out.println("The intersection point is " + answerNode.num);
        }
    }
}
