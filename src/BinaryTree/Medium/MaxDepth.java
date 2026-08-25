package BinaryTree.Medium;

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left;
    Node right;
    Node(int val){
        data=val;
        left=null;
        right=null;
    }
}
public class MaxDepth {
    int maxDepth(Node root){
        if (root==null){
            return 0;
        }
        Queue<Node> q = new LinkedList<>();
        int level = 0;
        q.add(root);
        while (!q.isEmpty()){
            int size = q.size();
            for (int i=0; i<size; i++){
                Node front = q.poll();
                if (front.left!=null){
                    q.add(front.left);
                }
                if (front.right!=null){
                    q.add(front.right);
                }
            }
            level++;
        }
        return level;
    }
    static void main(String[] args) {
        // Creating a sample binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.right = new Node(6);
        root.left.right.right.right = new Node(7);

        MaxDepth solution = new MaxDepth();
        int depth = solution.maxDepth(root);

        System.out.println("Maximum depth of the binary tree: " + depth);
    }
}
