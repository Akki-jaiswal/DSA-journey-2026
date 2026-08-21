package BinaryTree.Easy;

import java.util.ArrayList;
import java.util.List;

public class InOrder {
    private void recursiveInorder(Node root, List<Integer> arr){
        if (root==null) return;
        recursiveInorder(root.left, arr);
        arr.add(root.data);
        recursiveInorder(root.right, arr);
    }
    public  List<Integer> inorder(Node root){
        List<Integer> arr = new ArrayList<>();;
        recursiveInorder(root, arr);
        return arr;
    }
}
