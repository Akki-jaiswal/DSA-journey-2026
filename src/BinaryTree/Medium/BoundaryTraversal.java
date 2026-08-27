package BinaryTree.Medium;

import java.util.ArrayList;
import java.util.List;

public class BoundaryTraversal {
    boolean isLeaf(Node root){
        return root.left == null && root.right == null;
    }
    void addLeftBoundary(Node root, List<Integer> res){
        Node curr = root.left;
        while (curr!=null){
            if (!isLeaf(curr)){
                res.add(curr.data);
            }
            if (curr.left!=null){
                curr=curr.left;
            }
            else{
                curr=curr.right;
            }
        }
    }
    void addRightBoundary(Node root, List<Integer> res){
        Node curr = root.right;
        List<Integer> temp = new ArrayList<>();
        while(curr!=null){
            if (!isLeaf(curr)){
                temp.add(curr.data);
            }
            if (curr.right!=null){
                curr=curr.right;
            }
            else{
                curr=curr.left;
            }
        }
        for (int i=temp.size()-1; i>=0; --i){
            res.add(temp.get(i));
        }
    }
    void addLeaves(Node root, List<Integer> res){
        if (isLeaf(root)){
            res.add(root.data);
            return;
        }
        if (root.left!=null){
            addLeaves(root.left, res);
        }
        if (root.right!=null){
            addLeaves(root.right, res);
        }
    }
    List<Integer> printBoundary(Node root){
        List<Integer> res = new ArrayList<>();
        if (root==null){
            return res;
        }
        if (!isLeaf(root)){
            res.add(root.data);
        }
        addLeftBoundary(root, res);
        addLeaves(root, res);
        addRightBoundary(root, res);
        return res;
    }
    void printResult(List<Integer> result) {
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
    static void main(String[] args) {
        // Creating a sample binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        BoundaryTraversal solution = new BoundaryTraversal();

        // Get the boundary traversal
        List<Integer> result = solution.printBoundary(root);

        // Print the result
        System.out.print("Boundary Traversal: ");
        solution.printResult(result);
    }
}
