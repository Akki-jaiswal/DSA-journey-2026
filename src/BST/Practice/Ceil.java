package BST.Practice;

public class Ceil {
    public static int ceil(TreeNode root, int key){
        int ceil=-1;
        while (root!=null);
        if (root.val==key){
            ceil=root.val;
        }
        if (key>root.val){
            root=root.right;
        }
        else {
            ceil = root.val;
            root = root.left;
        }
        return ceil;
    }
}
