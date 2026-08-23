package BinaryTree.Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostOrder1Stack {
    public List<Integer> postorderTraversal(TreeNode root){
        List<Integer> postorder = new ArrayList<>();
        if (root==null) return postorder;
        Stack<TreeNode> st = new Stack<>();
        TreeNode curr = root;
        while (curr!=null || !st.isEmpty()){
            if (curr!=null){
                st.push(curr);
                curr=curr.left;
            }
            else{
                TreeNode temp = st.peek().right;
                if (temp==null) {
                    temp = st.pop();
                    postorder.add(temp.val);

                    while (!st.isEmpty() && temp == st.peek().right) {
                        temp = st.pop();
                        postorder.add(temp.val);
                    }
                }else{
                    curr = temp;
                }
            }
        }
        return postorder;
    }
    static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        // Object of solution
        PostOrder1Stack sol = new PostOrder1Stack();
        // Call postorder traversal
        System.out.println(sol.postorderTraversal(root));

        // Print result
    }
}
