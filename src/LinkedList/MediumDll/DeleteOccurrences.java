package LinkedList.MediumDll;
class Node{
    int data;
    Node prev;
    Node next;
    Node(int data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
public class DeleteOccurrences {
    public static Node deleteAll(Node head, int k){
        Node temp = head;
        while (temp!=head){
            if (temp.data == k) {
                if (temp == head) {
                    head = temp.next;
                }
                Node nextNode = temp.next;
                Node prevNode = temp.prev;
                if (prevNode != null) {
                    prevNode.next = nextNode;
                }
                if (nextNode != null) {
                    nextNode.prev = prevNode;
                }
                temp = nextNode;
            }else{
                temp = temp.next;
            }
        }
        return head;
    }
}
