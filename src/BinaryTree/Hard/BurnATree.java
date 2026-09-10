package BinaryTree.Hard;

import java.util.*;

public class BurnATree {
    public int minTime(TreeNode root, int target){
        Map<Integer, List<Integer>> graph = new HashMap<>();
        buildGraph(root, null, graph);
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(target);
        visited.add(target);
        int time=0;
        while (!queue.isEmpty()){
            int size = queue.size();
            boolean burned = false;
            for (int i=0; i<size; i++){
                int node = queue.poll();
                for (int neighbour:graph.getOrDefault(node, new ArrayList<>())){
                    if (!visited.contains(neighbour)){
                        visited.add(neighbour);
                        queue.offer(neighbour);
                        burned=true;
                    }
                }
            }if (burned) time++;
        }
        return time;
    }
    private void buildGraph(TreeNode node, TreeNode parent, Map<Integer,List<Integer>> graph){
        if (node==null) return;
        if (parent!=null){
            graph.computeIfAbsent(node.val, k->new ArrayList<>()).add(parent.val);
            graph.computeIfAbsent(parent.val, k-> new ArrayList<>()).add(node.val);
        }
        buildGraph(node.left, node, graph);
        buildGraph(node.right, node, graph);
    }
    static void main(String[] args) {
        // Build the binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.left.left.right = new TreeNode(7);

        // Create object of Solution class
        BurnATree sol = new BurnATree();

        // Define the target node to start burning
        int target = 1;

        // Print the result
        System.out.println("Minimum time to burn the tree: " + sol.minTime(root, target));
    }
}
