package LinkedList.MediumDll;

import java.util.ArrayList;

public class PairsSum {
    private static Node findTail(Node head){
        Node temp = head;
        while (temp != null && temp.next != null){
            temp = temp.next;
        }
        return temp;
    }
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (head==null || head.next == null){
            return result;
        }
        Node left = head;
        Node right = findTail(head);
        while (left!=null && right!=null && left!=right && right.next!=left){
            int currentSum = left.data + right.data;
            if (currentSum==target){
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(left.data);
                pair.add(right.data);
                result.add(pair);

                left = left.next;
                right = right.prev;
            } else if (currentSum<target) {
                left = left.next;
            }
            else {
                right = right.prev;
            }
        }
        return result;
    }
    private static Node insertAtTail(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            return newNode;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        return head;
    }
    public static void main(String[] args) {
        Node head = null;

        // Creating a sorted Doubly Linked List: 1 <=> 2 <=> 3 <=> 4 <=> 9
        head = insertAtTail(head, 1);
        head = insertAtTail(head, 2);
        head = insertAtTail(head, 3);
        head = insertAtTail(head, 4);
        head = insertAtTail(head, 9);

        int target = 5;

        System.out.println("Finding pairs that sum up to: " + target);
        ArrayList<ArrayList<Integer>> pairs = findPairsWithGivenSum(target, head);

        // Printing the output pairs
        if (pairs.isEmpty()) {
            System.out.println("No pairs found.");
        } else {
            System.out.println("Pairs found: " + pairs);
        }
    }
}
