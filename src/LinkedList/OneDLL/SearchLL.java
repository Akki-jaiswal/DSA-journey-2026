package LinkedList.OneDLL;

public class SearchLL {
    static class Node{
        int data;
        Node next;
        Node(int val){
            data = val;
            next = null;
        }
    }
    public boolean searchValue(Node head, int key){
        Node current = head;
        while (current != null){
            if (current.data == key){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        SearchLL obj = new SearchLL();

        // Search for value
        if (obj.searchValue(head, 20))
            System.out.println("Found");
        else
            System.out.println("Not Found");
    }

    }

