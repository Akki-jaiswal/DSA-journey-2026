package BinaryTree.Medium;

public class Identical {
    public boolean isIdentical(Node node1, Node node2){
        if (node1==null && node2==null){
            return true;
        }
        if (node1==null || node2==null){
            return false;
        }
        return (node1.data==node2.data) && isIdentical(node1.left, node2.left) && isIdentical(node1.right, node2.right);
    }
    static void main(String[] args) {
        // Creating the first binary tree (Node1)
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);

        // Creating the second binary tree (Node2)
        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);
        root2.left.left = new Node(4);

        // Creating an instance of the Solution class
        Identical solution = new Identical();

        // Check if the two binary trees are identical and output the result
        if (solution.isIdentical(root1, root2)) {
            System.out.println("The binary trees are identical.");
        } else {
            System.out.println("The binary trees are not identical.");
        }
    }
}
