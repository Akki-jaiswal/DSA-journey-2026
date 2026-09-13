package BST.Practice;
class TreeNode{
    int val;
    TreeNode left, right;
    TreeNode(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public class Searching {
    public TreeNode search(TreeNode root, int val){
        while(root!=null && root.val!=val){
            root = val<root.val ? root.left:root.right;
        }
        return root;
    }
}
