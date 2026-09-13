package BST.Practice;

public class MaxMin {
    public int findMin(TreeNode root){
        if (root==null){
            return -1;
        }
        TreeNode current = root;
        while (current.left!=null){
            current=current.left;
        }
        return current.val;
    }
    public  int findMax(TreeNode root){
        if (root==null){
            return -1;
        }
        TreeNode current = root;
        while (current.right!=null){
            current=current.right;
        }
        return current.val;
    }
}
