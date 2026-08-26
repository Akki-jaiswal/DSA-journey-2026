package BinaryTree.Medium;

import java.util.*;

public class ZigZag {
    public List<List<Integer>> zigzagLevelOrder(Node root){
        List<List<Integer>> result = new ArrayList<>();
        if (root==null) return result;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        boolean leftToRight = true;
        while(!q.isEmpty()){
            int size = q.size();
            Integer[] level = new Integer[size];
            for (int i=0; i<size; i++){
                Node node = q.poll();
                int index = leftToRight?i:size-1-i;
                level[index] = node.data;
                if (node.left!=null) q.offer(node.left);
                if (node.right!=null) q.offer(node.right);
            }
            leftToRight = !leftToRight;
            result.add(Arrays.asList(level));
        }
        return result;
    }
    static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        // Create solution object
        ZigZag sol = new ZigZag();

        // Get zigzag traversal
        List<List<Integer>> ans = sol.zigzagLevelOrder(root);

        // Print result
        System.out.println(ans);
    }
}
