package GRAPH;/*
 * https://www.geeksforgeeks.org/batch/gfg-160-problems/track/graph-gfg-160/problem/bridge-edge-in-graph.
 * Bridge edge in a graph.
 *
 *  Q. Given an undirected graph with V vertices numbered from 0 to V-1 and E edges, represented by 2d array edges[][], where edges[i]=[u,v] represents the edge between the vertices u and v. Determine whether a specific edge between two vertices (c, d) is a bridge.
 *    Note:
 *        An edge is called a bridge if removing it increases the number of connected components of the graph.
 *        if there’s only one path between c and d (which is the edge itself), then that edge is a bridge.
 *  Examples :
 * 
 *  Input: V = 4, edges[][] = [[0, 1], [1, 2], [2, 3]], c = 1, d = 2
 * 
 *  Output: true
 * 
 *  Explanation: From the graph, we can clearly see that blocking the edge 1-2 will result in disconnection of the graph.
 *
 *  Hence, it is a Bridge.
 *  */
import java.util.ArrayList;

public class GP_07_Bridge_edge_in_a_Graph {

    public static void main(String[] args) {
        
        int [][]edges = {{0, 1},{1, 2},{2, 3}};
        int V = 4;
        int c = 1;
        int d = 2;
        System.out.println(isBridge(V, edges,c,d));
    }
    

    public static boolean isBridge(int V, int[][] edges, int c, int d) {
        // code here
        ArrayList<ArrayList<Integer>> adj = adjAdapt(V, edges);

        boolean []vis = new boolean[V];

       dfsbridge(c,adj,c,d,vis);
        return !vis[d];
    }

    private static void dfsbridge(int node, ArrayList<ArrayList<Integer>> adj, int c, int d, boolean[] vis) {

        vis[node] = true;

        for (int neigh :adj.get(node)){

            if ((node == c && neigh == d) || (node == d && neigh == c)) continue;

            if (!vis[neigh]){
                dfsbridge(neigh ,adj,c,d,vis);
            }
        }
    }

    private static ArrayList<ArrayList<Integer>> adjAdapt(int v, int[][] edges) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < v; i++){
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < edges.length; i++){
            int m = edges[i][0];
            int n = edges[i][1];
            adj.get(m).add(n);
            adj.get(n).add(m);
        }
        return adj;
    }
}
