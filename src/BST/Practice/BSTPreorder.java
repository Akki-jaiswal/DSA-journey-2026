package BST.Practice;

public class BSTPreorder {
    int i=0;
    public TreeNode bstfromPreorder(int[] preorder){
        return build(preorder, Integer.MAX_VALUE);
    }
    private TreeNode build(int[] preorder, int bound){
        if (i==preorder.length) return null;
        if (preorder[i]>bound){
            return null;
        }
        TreeNode root = new TreeNode(preorder[i]);
        i++;
        root.left = build(preorder, root.val);
        root.right = build(preorder, bound);
        return root;
    }
}
