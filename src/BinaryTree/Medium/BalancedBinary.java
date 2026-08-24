package BinaryTree.Medium;

public class BalancedBinary {
    public boolean isBalanced(Node root){
        return dfsHeight(root)!=-1;
    }
    public int dfsHeight(Node root){
        if (root==null) return 0;
        int leftHeight = dfsHeight(root.left);
        if (leftHeight==-1)
            return -1;
        int rightHeight = dfsHeight(root.right);
        if (rightHeight==-1)
            return -1;

        if (Math.abs(leftHeight-rightHeight)>1)
            return -1;
        return Math.max(leftHeight, rightHeight)+1;
    }
    static void main(String[] args) {
        // Creating a sample binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.right = new Node(6);
        root.left.right.right.right = new Node(7);

        // Creating an instance of the Solution class
        BalancedBinary solution = new BalancedBinary();

        // Checking if the tree is balanced
        if (solution.isBalanced(root)) {
            System.out.println("The tree is balanced.");
        } else {
            System.out.println("The tree is not balanced.");
        }
    }
}
