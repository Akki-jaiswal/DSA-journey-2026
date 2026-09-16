package BST.Practice;

public class InorderSuccessor {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p){
        TreeNode successor = null;
        while (root!=null){
            if (p.val>=root.val){
                root=root.right;
            }
            else{
                successor=root;
                root=root.left;
            }
        }
        return successor;
    }
    static void printInOrder(TreeNode root) {
        // base case
        if (root == null) return;
        printInOrder(root.left);
        System.out.print(root.val + " ");
        printInOrder(root.right);
    }
    static void main(String[] args) {
        // construct BST
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(7);

        // show inorder
        System.out.print("BST: ");
        printInOrder(root);
        System.out.println();

        // target node p
        TreeNode p = root.left.right;

        // find successor
        InorderSuccessor solution = new InorderSuccessor();
        TreeNode successor = solution.inorderSuccessor(root, p);

        // print result
        if (successor != null) {
            System.out.println("Inorder Successor of " + p.val + " is: " + successor.val);
        } else {
            System.out.println("Inorder Successor of " + p.val + " does not exist.");
        }
    }
}
