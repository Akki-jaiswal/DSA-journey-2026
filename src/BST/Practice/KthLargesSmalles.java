package BST.Practice;

import java.util.ArrayList;
import java.util.List;

public class KthLargesSmalles {
    private int k;
    private int result;
    public int kthSmallest(TreeNode root, int k){
        this.k = k;
        this.result = -1;
        inorder(root);
        return result;
    }
    public void inorder(TreeNode node){
        if (node!=null){
            inorder(node.left);
            if (--k==0){
                result=node.val;
                return;
            }
            inorder(node.right);
        }
    }
    public int kthLargest(TreeNode root, int k){
        this.k = k;
        this.result = -1;
        reverseInorder(root);
        return result;
    }
    private void reverseInorder(TreeNode node){
        if (node!=null){
            reverseInorder(node.right);
            if (--k==0){
                result=node.val;
                return;
            }
            reverseInorder(node.left);
        }
    }
    public List<Integer> kLargesSmall(TreeNode root, int k){
        List<Integer> result = new ArrayList<>();
        result.add(kthSmallest(root,k));
        result.add(kthLargest(root, k));
        return result;
    }
    static void main(String[] args) {
        // Constructing the tree: [3, 1, 4, null, 2]
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.left.right = new TreeNode(2);
        root.right = new TreeNode(4);

        KthLargesSmalles solution = new KthLargesSmalles();
        int k = 1;
        List<Integer> result = solution.kLargesSmall(root, k);

        // Output the result
        System.out.println(result); // Output: [1, 4]
    }
}
