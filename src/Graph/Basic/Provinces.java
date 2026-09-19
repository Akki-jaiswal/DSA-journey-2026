package Graph.Basic;

import java.util.ArrayList;
import java.util.List;

public class Provinces {
    private void dfs(int node, List<List<Integer>> adjList, boolean[] visited){
        visited[node] = true;
        for (int neighbour:adjList.get(node)){
            if (!visited[neighbour]){
                dfs(neighbour, adjList, visited);
            }
        }
    }
    public int numProvinces(int[][] adj, int V){
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i=0; i<V; i++){
            adjList.add(new ArrayList<>());
        }
        for (int i=0; i<V; i++){
            for (int j=0; j<V; j++){
                if (adj[i][j]==1 && i!=j){
                    adjList.get(i).add(j);
                    adjList.get(j).add(i);
                }
            }
        }
        boolean[] visited = new boolean[V];
        int count = 0;
        for (int i=0; i<V; i++){
            if (!visited[i]){
                count++;
                dfs(i, adjList,  visited);
            }
        }
        return count;
    }
    static void main(String[] args) {
        // Input adjacency matrix
        int[][] adj = {
                {1, 0, 1},
                {0, 1, 0},
                {1, 0, 1}
        };

        // Number of vertices
        int V = 3;

        // Create object of Solution class
        Provinces sol = new Provinces();

        // Call function and print result
        System.out.println(sol.numProvinces(adj, V));
    }
}
