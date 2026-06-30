package LinkedList.MediumDll;

public class RemoveDuplicates {
    class Node {
        int data;
        Node prev;
        Node next;

        // Constructor to initialize node with given value
        Node(int value) {
            data = value;
            prev = null;
            next = null;
        }
    }
    Node head = null;
    public void insertAtEnd(int value){
        Node newNode = new Node(value);
        if (head==null){
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next!=null){
            current = current.next;
        }
        current.next = newNode;
        newNode.prev = current;
    }
    public Node removeDuplicates(){
        if (head==null) return null;
        Node current = head;
        while (current!=null && current.next!=null){
            Node nextDistinct = current.next;
            while (nextDistinct!=null && nextDistinct.data==current.data){
                nextDistinct = nextDistinct.next;
            }
            current.next = nextDistinct;
            if (nextDistinct!=null){
                nextDistinct.prev = current;
            }
            current = current.next;
        }
        return head;
    }
    public void printList() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public  static void main(String[] args){
        RemoveDuplicates sol = new RemoveDuplicates();
        int[] values = {1,2,2,2,3,4,4,5,5,6};
        for (int value:values){
            sol.insertAtEnd(value);
        }
        System.out.println("Original List:");
        sol.printList();
        sol.removeDuplicates();
        System.out.println("After Removing Duplicates:");
        sol.printList();
    }
}
