package BST.Practice;

public class LargestBST {
    class NodeValue{
        int maxNode, minNode, maxSize;
        NodeValue(int minNode, int maxNode, int maxSize){
            this.minNode = minNode;
            this.maxNode = maxNode;
            this.maxSize = maxSize;
        }
    }
    public int largestBSTSubtree(TreeNode root) {
        return largestBSTHelper(root).maxSize;
    }
    private NodeValue largestBSTHelper(TreeNode root) {
        // An empty tree is a valid BST of size 0
        if (root == null) {
            // We return MAX_VALUE for min, and MIN_VALUE for max
            // so that the parent's check will always succeed against an empty child.
            return new NodeValue(Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
        }
        NodeValue left = largestBSTHelper(root.left);
        NodeValue right = largestBSTHelper(root.right);
        if (left.maxNode < root.val && root.val < right.minNode) {
            return new NodeValue(
                    Math.min(root.val, left.minNode),
                    Math.max(root.val, right.maxNode),
                    left.maxSize + right.maxSize + 1
            );
        }
        return new NodeValue(
                Integer.MIN_VALUE,
                Integer.MAX_VALUE,
                Math.max(left.maxSize, right.maxSize)
        );
    }
}


