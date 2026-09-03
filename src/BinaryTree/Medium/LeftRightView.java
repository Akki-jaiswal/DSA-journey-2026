package BinaryTree.Medium;

import java.util.ArrayList;
import java.util.List;

class TreeNode{
    int val;
    TreeNode left, right;
    TreeNode(int val){
        this.val = val;
        left=right=null;
    }
}
public class LeftRightView {
    public void leftDFS(TreeNode node, int level, List<Integer> res){
        if (node==null) return;
        if (res.size()==level)
            res.add(node.val);
        leftDFS(node.left, level+1, res);
        leftDFS(node.right, level+1, res);
    }
    public void rightDFS(TreeNode node, int level, List<Integer> res) {
        if (node == null) return;
        if (res.size() == level)
            res.add(node.val);
        rightDFS(node.right, level + 1, res);
        rightDFS(node.left, level + 1, res);
    }
    public List<Integer> leftView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        leftDFS(root, 0, res);
        return res;
    }
    public List<Integer> rightView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        rightDFS(root, 0, res);
        return res;
    }
    static void main(String[] args) {
        // Create binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.left.right.right = new TreeNode(5);
        root.left.right.right.right = new TreeNode(6);

        // Create solution instance
        LeftRightView sol = new LeftRightView();

        // Get left and right views
        List<Integer> left = sol.leftView(root);
        List<Integer> right = sol.rightView(root);

        // Print left view
        System.out.print("Left View: ");
        for (int val : left)
            System.out.print(val + " ");

        // Print right view
        System.out.print("\nRight View: ");
        for (int val : right)
            System.out.print(val + " ");
    }
}
