package LinkedList.DoublyLL;


public class Insertion {
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
    public static Node insertAtHead(Node head,int val){
        Node newNode = new Node(val);
        if (head == null){
            return newNode;
        }
        newNode.next = head;
        head.back = newNode;
        return newNode;
    }
    public static Node insertAtLast(Node head, int val){
        Node newNode = new Node(val);
        if (head==null){
            return newNode;
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.back = temp;
        return head;
    }
    public static Node insertAtKthPosition(Node head, int val, int k){
        if (k<1) return head;
        if (k==1) return insertAtHead(head, val);
        Node temp = head;
        int count = 1;
        while (temp!=null && count<k){
            temp = temp.next;
            count++;
        }
        if (temp==null){
            if (count==k) return insertAtLast(head, val);
            return head;
        }
        Node prevNode = temp.back;
        Node newNode = new Node(val);
        newNode.next = temp;
        newNode.back = prevNode;
        temp.back = newNode;
        if (prevNode!=null){
            prevNode.next = newNode;
        }
        return head;
    }
    public static Node insertBeforeValue(Node head, int val, int target){
        if (head==null) return null;
        if (head.data==target){
            return insertAtHead(head, val);
        }
        Node temp = head;
        while (temp!=null){
            if (temp.data == target){
                Node prevNode = temp.back;
                Node newNode = new Node(val);

                newNode.next = temp;
                newNode.back = prevNode;
                temp.back = newNode;
                prevNode.next = newNode;
                return head;
            }
            temp = temp.next;
        }
        return head;
    }
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    static void main(String[] args) {
        Node head = null;
        System.out.println("- - - Testing DLL Insertions - - -");
        head = insertAtHead(head, 20);         // 20 -> null
        head = insertAtHead(head, 10);         // 10 <-> 20 -> null
        head = insertAtLast(head, 40);         // 10 <-> 20 <-> 40 -> null
        head = insertAtKthPosition(head, 30, 3); // 10 <-> 20 <-> 30 <-> 40 -> null
        head = insertBeforeValue(head, 25, 40); // 10 <-> 20 <-> 25 <-> 30 <-> 40 -> null

        printList(head);
    }
}
