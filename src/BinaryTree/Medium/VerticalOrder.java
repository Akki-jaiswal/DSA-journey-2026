package BinaryTree.Medium;

import java.util.*;


public class VerticalOrder {
    public List<List<Integer>> findVertical(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;

        // Corrected type: TreeMap<Vertical (x), TreeMap<Level (y), PriorityQueue<Values>>>
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> nodes = new TreeMap<>();
        Queue<Pair> todo = new LinkedList<>();
        todo.offer(new Pair(root, 0, 0));

        while (!todo.isEmpty()) {
            Pair p = todo.poll();
            Node temp = p.node;
            int x = p.vertical;
            int y = p.level;

            // Add node value to nested map
            nodes.putIfAbsent(x, new TreeMap<>());
            nodes.get(x).putIfAbsent(y, new PriorityQueue<>());
            nodes.get(x).get(y).offer(temp.data);

            // If left child exists, push to queue (x - 1, y + 1)
            if (temp.left != null) {
                todo.offer(new Pair(temp.left, x - 1, y + 1));
            }

            // If right child exists, push to queue (x + 1, y + 1)
            if (temp.right != null) {
                todo.offer(new Pair(temp.right, x + 1, y + 1));
            }
        }

        // Iterate through map to build result column by column
        for (TreeMap<Integer, PriorityQueue<Integer>> ys : nodes.values()) {
            List<Integer> col = new ArrayList<>();
            for (PriorityQueue<Integer> pq : ys.values()) {
                while (!pq.isEmpty()) {
                    col.add(pq.poll());
                }
            }
            ans.add(col);
        }

        return ans;
    }

    // Helper class for queue elements
    static class Pair {
        Node node;
        int vertical;
        int level;

        Pair(Node n, int v, int l) {
            node = n;
            vertical = v;
            level = l;
        }
    }

    // Function to print result
    public static void printResult(List<List<Integer>> result) {
        for (List<Integer> level : result) {
            for (int val : level) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    // Main function
    public static void main(String[] args) {
        // Create sample binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(10);
        root.left.left.right = new Node(5);
        root.left.left.right.right = new Node(6);
        root.right = new Node(3);
        root.right.right = new Node(10);
        root.right.left = new Node(9);

        VerticalOrder solution = new VerticalOrder();
        List<List<Integer>> verticalTraversal = solution.findVertical(root);

        System.out.println("Vertical Traversal:");
        printResult(verticalTraversal);
    }
}