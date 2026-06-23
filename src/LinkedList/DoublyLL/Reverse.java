package LinkedList.DoublyLL;

public class Reverse {
    static class Node {
        int data;
        Node next;
        Node back;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.back = null;
        }

        Node(int data, Node next, Node back) {
            this.data = data;
            this.next = next;
            this.back = back;
        }
    }
    public Node convert2DLL(int[] arr){
        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i=1; i<arr.length; i++){
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }
    public Node reverseDLL(Node head){
        Node current = head;
        Node last = null;
        while (current!=null){
            Node temp = current.next;
            current.next = current.back;
            current.back = temp;

            last = current;
            current = temp;
        }
        return last;
    }
    public void printDLL(Node head){
        while (head!=null){
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println("null");
    }

    static void main(String[] args) {
        Reverse rev = new Reverse();
        int[] arr = {1,2,3,4,5};
        Node head = rev.convert2DLL(arr);

        System.out.print("Original DLL: ");
        rev.printDLL(head);

        Node reversedHead = rev.reverseDLL(head);

        System.out.print("Reversed DLL: ");
        rev.printDLL(reversedHead);
    }
}
