package Graph.Basic;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean vis[] = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        vis[0] = true;
        while (!q.isEmpty()){
            Integer node = q.poll();
            bfs.add(node);
            for (Integer it:adj.get(node)){
                if (!vis[it]){
                    vis[it] = true;
                    q.add(it);
                }
            }
        }
        return bfs;
    }
    static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        // Initialize adjacency list
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Adding edges for an undirected graph:
        // 0 -- 1, 0 -- 2, 0 -- 3, 2 -- 4
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 0, 3);
        addEdge(adj, 2, 4);

        BFS sol = new BFS();
        ArrayList<Integer> traversal = sol.bfsOfGraph(V, adj);

        System.out.println("BFS Traversal: " + traversal);
    }

    private static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
}
