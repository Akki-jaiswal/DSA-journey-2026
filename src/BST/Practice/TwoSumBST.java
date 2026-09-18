package BST.Practice;

import java.util.Stack;
public class TwoSumBST {

    // 1. Separate BSTIterator helper class
    static class BSTIterator {
        private Stack<TreeNode> stack = new Stack<>();
        private boolean reverse;

        public BSTIterator(TreeNode root, boolean isReverse) {
            this.reverse = isReverse;
            pushAll(root);
        }

        public boolean hasNext() {
            return !stack.isEmpty();
        }

        public int next() {
            TreeNode tmpNode = stack.pop();
            if (!reverse) {
                pushAll(tmpNode.right); // Normal inorder: left -> root -> right
            } else {
                pushAll(tmpNode.left);  // Reverse inorder: right -> root -> left
            }
            return tmpNode.val;
        }

        private void pushAll(TreeNode node) {
            while (node != null) {
                stack.push(node);
                if (reverse) {
                    node = node.right;
                } else {
                    node = node.left;
                }
            }
        }
    }

    // 2. Main algorithm method
    public boolean findTarget(TreeNode root, int k) {
        if (root == null) return false;

        // Two iterators: l = forward (next), r = backward (before)
        BSTIterator l = new BSTIterator(root, false);
        BSTIterator r = new BSTIterator(root, true);

        int i = l.next();
        int j = r.next();

        while (i < j) {
            if (i + j == k) return true;
            else if (i + j < k) i = l.next();
            else j = r.next();
        }

        return false;
    }

    // 3. Driver main method
    public static void main(String[] args) {
        TreeNode root = new TreeNode(7);
        root.left = new TreeNode(3);
        root.right = new TreeNode(15);
        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(20);

        TwoSumBST solution = new TwoSumBST();
        int target = 26;

        boolean exists = solution.findTarget(root, target);

        if (exists) {
            System.out.println("Pair with sum " + target + " exists.");
        } else {
            System.out.println("Pair with sum " + target + " does not exist.");
        }
    }
}