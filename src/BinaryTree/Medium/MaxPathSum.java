package BinaryTree.Medium;

public class MaxPathSum {
    int maxSum = Integer.MIN_VALUE;
    private int maxPathSum(Node root){
        dfs(root);
        return maxSum;
    }
    private int dfs(Node node){
        if (node==null) return 0;
        int left = Math.max(0, dfs(node.left));
        int right = Math.max(0, dfs(node.right));
        maxSum = Math.max(maxSum, left+right+node.data);
        return Math.max(left, right) + node.data;
    }
    static void main(String[] args) {
        // Creating test tree
        Node root = new Node(-10);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);

        MaxPathSum sol = new MaxPathSum();
        System.out.println(
                "Maximum Path Sum: " +
                        sol.maxPathSum(root)
        );
    }
}
