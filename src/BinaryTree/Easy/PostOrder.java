package BinaryTree.Easy;

import java.util.ArrayList;
import java.util.List;

public class PostOrder {
    public void postorderTraversal(TreeNode root, List<Integer> result){
        if (root==null) return;
        postorderTraversal(root.left, result);
        postorderTraversal(root.right, result);
        result.add(root.val);
    }
    static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        // Object of solution
        PostOrder sol = new PostOrder();
        List<Integer> result = new ArrayList<>();

        // Call postorder traversal
        sol.postorderTraversal(root, result);

        // Print result
        for (int val : result) System.out.print(val + " ");
    }
}
