package BinaryTree.Easy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class IterativeInorder {
    public List<Integer> inorder(TreeNode root){
        Stack<TreeNode> st = new Stack<>();
        TreeNode node = root;
        List<Integer> inorder = new ArrayList<>();
        while (true){
            if (node!=null){
                st.push(node);
                node =  node.left;
            }
            else{
                if (st.isEmpty()){
                    break;
                }
                node = st.pop();
                inorder.add(node.val);
                node = node.right;
            }
        }
        return inorder;
    }
    static void main(String[] args) {
        // Creating a binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Initializing the Solution class
        IterativeInorder sol = new IterativeInorder();

        // Getting the inorder traversal
        List<Integer> result = sol.inorder(root);

        // Displaying the inorder traversal result
        System.out.print("Inorder Traversal: ");
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
