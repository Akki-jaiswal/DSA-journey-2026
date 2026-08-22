package BinaryTree.Easy;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class IterativePreOrder {
public static List<Integer> preorderTraversal(TreeNode root){
    List<Integer> preorder = new ArrayList<>();
    if (root==null){
        return preorder;
    }
    Stack<TreeNode> st = new Stack<>();
    st.push(root);
    while (!st.isEmpty()){
        root = st.pop();
        preorder.add(root.val);
        if (root.right!=null){
            st.push(root.right);
        }
        if (root.left != null){
            st.push(root.left);
        }
    }
    return preorder;
}
    static void main(String[] args) {
        // Creating a binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Getting the preorder traversal
        java.util.List<Integer> result = IterativePreOrder.preorderTraversal(root);

        // Displaying the preorder traversal result
        System.out.print("Preorder Traversal: ");
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
