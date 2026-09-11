package BinaryTree.Hard;

import java.util.LinkedList;
import java.util.Queue;

public class Serialization {
    public String serialize(TreeNode root){
        if (root==null) return "";
        StringBuilder s = new StringBuilder();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()){
            TreeNode curNode = q.poll();
            if (curNode==null) s.append("#,");
            else{
                s.append(curNode.val).append(",");
                q.offer(curNode.left);
                q.offer(curNode.right);
            }
        }
        return s.toString();
    }
    public TreeNode deserialize(String data){
        if (data.isEmpty()) return null;
        String[] values = data.split(",");
        TreeNode root = new TreeNode(Integer.parseInt(values[0]));
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int i=1;
        while (!q.isEmpty() && i<values.length){
            TreeNode node = q.poll();
            if (!values[i].equals("#")){
                TreeNode leftNode = new TreeNode(Integer.parseInt(values[i]));
                node.left=leftNode;
                q.offer(leftNode);
            }
            i++;
            if (!values[i].equals("#")){
                TreeNode rightNode = new TreeNode(Integer.parseInt(values[i]));
                node.right = rightNode;
                q.offer(rightNode);
            }
            i++;
        }
        return root;
    }
    public void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }
    static void main(String[] args) {

        // Manually construct the binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);

        // Create an instance of the solution class
        Serialization solution = new Serialization();

        // Print original tree using in-order traversal
        System.out.print("Orignal Tree: ");
        solution.inorder(root);
        System.out.println();

        // Serialize the tree into a string
        String serialized = solution.serialize(root);
        System.out.println("Serialized: " + serialized);

        // Deserialize the string back into a tree
        TreeNode deserialized = solution.deserialize(serialized);

        // Print tree after deserialization
        System.out.print("Tree after deserialisation: ");
        solution.inorder(deserialized);
        System.out.println();
    }
}
