package BST.Practice;

public class InorderPredecessor {
    public TreeNode inorderPredecessor(TreeNode root, int key){
        TreeNode predecessor = null;
        while (root!=null){
            if (root.val<key){
                predecessor = root;
                root = root.right;
            }else{
                root = root.left;
            }
        }
        return predecessor;
    }
}
