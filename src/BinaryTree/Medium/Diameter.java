package BinaryTree.Medium;

public class Diameter {
    public int diameterOfBinaryTree(Node root){
        int[] diameter = new int[1];
        diameter[0]=0;
        height(root, diameter);
        return diameter[0];
    }
    private int height(Node node, int[] diameter){
        if (node==null){
            return 0;
        }
        int[] lh = new int[1];
        int[] rh = new int[1];
        lh[0] = height(node.left, diameter);
        rh[0] = height(node.right, diameter);
        diameter[0] = Math.max(diameter[0], lh[0]-rh[0]);
        return 1+Math.max(lh[0], rh[0]);
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
        Diameter solution = new Diameter();

        // Calculate the diameter of the binary tree
        int diameter = solution.diameterOfBinaryTree(root);

        System.out.println("The diameter of the binary tree is: " + diameter);
    }
}
