package BinaryTree.Hard;

import java.util.HashMap;
import java.util.Map;

import static BinaryTree.Hard.TreeFromInAndPre.printInorder;

public class TreeFromInAndPost {
    public TreeNode buildTree(int[] inorder, int[] postorder){
        if (inorder.length!=postorder.length) return null;
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i=0; i<inorder.length; i++){
            hm.put(inorder[i], i);
        }
        return build(inorder, 0, inorder.length-1, postorder, 0, postorder.length-1, hm);
    }
    private TreeNode build(int[] inorder, int is, int ie, int[] postorder, int ps, int pe, Map<Integer, Integer> hm){
        if (ps>pe || is>ie) return null;
        TreeNode root = new TreeNode(postorder[pe]);
        int inRoot = hm.get(postorder[pe]);
        int numsLeft = inRoot-is;

        root.left = build(inorder, is, inRoot-1, postorder, ps, ps+numsLeft-1, hm);
        root.right = build(inorder, inRoot+1, ie, postorder, ps+numsLeft, pe-1, hm);
        return root;
    }
    static void main(String[] args) {
        int[] inorder = {40, 20, 50, 10, 60, 30};
        int[] postorder = {40, 50, 20, 60, 30, 10};

        TreeFromInAndPost sol = new TreeFromInAndPost();
        TreeNode root = sol.buildTree(inorder, postorder);

        System.out.println("Inorder of Unique Binary Tree Created:");
        printInorder(root);
    }
}
