package LinkedList.OneDLL;

public class Intro {
    static class Node{
        int data;
        Node next;
        Node(int data1, Node next1){
            data = data1;
            next = next1;
        }
        Node(int data1){
            data = data1;
            next=null;
        }
    }

    static void main(String[] args) {
        int[] arr = {2,5,8,7};
        Node y = new Node(arr[2]);
        System.out.println(y);
        System.out.println(y.data);
    }
}

