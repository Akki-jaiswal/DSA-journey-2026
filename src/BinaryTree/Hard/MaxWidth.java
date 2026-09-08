package BinaryTree.Hard;
import java.util.LinkedList;
import java.util.Queue;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public class MaxWidth {
    static class Pair{
        TreeNode node;
        int index;
        Pair(TreeNode node, int index){
            this.node = node;
            this.index = index;
        }
    }
    public int widthOfBinaryTree(TreeNode root){
        if (root==null) return 0;
        int maxWidth=0;
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root, 0));
        while (!q.isEmpty()){
            int size = q.size();
            int minIndex = q.peek().index;
            int first=0, last=0;
            for (int i=0; i<size; i++){
                Pair p = q.poll();
                TreeNode node = p.node;
                int currIndex = p.index-minIndex;
                if (i==0) first=currIndex;
                if (i==size-1) last=currIndex;
                if (node.left!=null)
                    q.offer(new Pair(node.left, 2*currIndex+1));
                if (node.right!=null)
                    q.offer(new Pair(node.right, 2*currIndex+2));
            }
            maxWidth = Math.max(maxWidth, last-first+1);
        }
        return maxWidth;
    }
    static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(9);

        MaxWidth sol = new MaxWidth();
        System.out.println("Maximum width: " +
                sol.widthOfBinaryTree(root));
    }
}
