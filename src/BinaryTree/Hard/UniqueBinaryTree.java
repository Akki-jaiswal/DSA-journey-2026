package BinaryTree.Hard;

public class UniqueBinaryTree {
    public static boolean isPossible(int a, int b){
        if ((a==2||b==2)&&(a!=b)){
            return true;
        }
        return false;
    }
    static void main(String[] args) {
        // 1 = Preorder, 2 = Inorder, 3 = Postorder
        // Test Case 1: Preorder (1) and Inorder (2)
        int a1 = 1, b1 = 2;
        System.out.println("Preorder + Inorder: " + isPossible(a1, b1)); // Expected: true
        // Test Case 2: Postorder (3) and Inorder (2)
        int a2 = 3, b2 = 2;
        System.out.println("Postorder + Inorder: " + isPossible(a2, b2)); // Expected: true
        // Test Case 3: Preorder (1) and Postorder (3)
        int a3 = 1, b3 = 3;
        System.out.println("Preorder + Postorder: " + isPossible(a3, b3)); // Expected: false
        // Test Case 4: Same traversals given twice e.g., Inorder (2) and Inorder (2)
        int a4 = 2, b4 = 2;
        System.out.println("Inorder + Inorder: " + isPossible(a4, b4)); // Expected: false
    }
}
