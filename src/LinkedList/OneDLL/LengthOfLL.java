package LinkedList.OneDLL;

// Solution class containing the method to find length
class LengthOfLL {
    // Function to find the length of the linked list
    public int lengthOfLinkedList(Node head) {
        // Initialize counter to 0
        int count = 0;

        // Initialize a temporary pointer to head
        Node temp = head;

        // Traverse the linked list
        while (temp != null) {
            // Increment count for each node
            count++;

            // Move to the next node
            temp = temp.next;
        }

        // Return the total count
        return count;
    }

    public static void main(String[] args) {
        // Creating a sample linked list: 10 -> 20 -> 30 -> null
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        LengthOfLL obj = new LengthOfLL();

        // Find and print the length of linked list
        System.out.println("Length of Linked List: " + obj.lengthOfLinkedList(head));
    }
}