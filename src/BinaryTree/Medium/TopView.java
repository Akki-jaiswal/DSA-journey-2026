package BinaryTree.Medium;
import java.util.*;

public class TopView {
    static class Pair {
        Node node;
        int line;

        Pair(Node node, int line) {
            this.node = node;
            this.line = line;
        }
    }

    public List<Integer> topView(Node root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null) return ans;
        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root, 0));
        while (!q.isEmpty()) {
            Pair curr = q.poll();
            Node node = curr.node;
            int line = curr.line;
            if (!map.containsKey(line)) {
                map.put(line, node.data);
            }
            if (node.left != null) {
                q.offer(new Pair(node.left, line - 1));
            }
            if (node.right != null) {
                q.offer(new Pair(node.right, line + 1));
            }
        }
        for (int val : map.values()) {
            ans.add(val);
        }
        return ans;
    }
    static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(10);
        root.left.left.right = new Node(5);
        root.left.left.right.right = new Node(6);
        root.right = new Node(3);
        root.right.right = new Node(10);
        root.right.left = new Node(9);

        TopView solution = new TopView();
        List<Integer> result = solution.topView(root);

        System.out.println("Top View Traversal: " + result);
    }
}
