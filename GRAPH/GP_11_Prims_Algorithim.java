package GRAPH;/*
 * https://www.geeksforgeeks.org/problems/minimum-spanning-tree/1
 *
 * # Minimum Spanning TreeMinimum Spanning Tree(Prims Algorithim)
 *
 * Q. Given a weighted, undirected, and connected graph with V vertices and E edges,
 *    your task is to find the sum of the weights of the edges in the Minimum Spanning Tree (MST) of the graph.
 *    The graph is provided as a list of edges, where each edge is represented as [u, v, w], indicating an edge between
 *    vertex u and vertex v with edge weight w.
 * Ex.
 *    Input: V = 3, E = 3,
 *           Edges =  [[0, 1, 5],
 *                    [1, 2, 3],
 *                    [0, 2, 1]]
 *     Output: 4
 *
 * */
import java.util.ArrayList;
import java.util.PriorityQueue;

public class GP_11_Prims_Algorithim {


    public static void main(String[] args) {

        int edges[][] = {{0,1,5},
                         {1,2,3},
                         {0,2,1}};
        int v = 3;
        int e = 3;

        System.out.println(spanningTree(v,edges));
    }

/// Pair Class That contain Weight And Node.
    public static class Pair {
        int w;
        int n;

        public Pair(int weight, int node) {
            this.w = weight;
            this.n = node;
        }
    }
    //Solution

    public static int spanningTree(int V, int[][] edges) {
        ArrayList<ArrayList<Pair>> adj = adjcmd(V, edges);
        PriorityQueue<Pair> queue = new PriorityQueue<Pair>((x, y) -> x.w - y.w);

        boolean[] vis = new boolean[V];
        queue.add(new Pair(0, 0));
        int sum = 0;
        while (!queue.isEmpty()) {
            int w = queue.peek().w;
            int n = queue.peek().n;
            queue.remove();
            if (vis[n]) continue;
            vis[n] = true;
            sum += w;
            for (Pair edge : adj.get(n)) {
                if (!vis[edge.n]) {
                    queue.add(new Pair(edge.w, edge.n));
                }
            }
        }
        return sum;
    }
    /// Convert The Edges To Adjacency List

    private static ArrayList<ArrayList<Pair>> adjcmd(int v, int[][] edges) {

        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int m = edge[0];
            int n = edge[1];
            int w = edge[2];
            adj.get(n).add(new Pair(w, m));
            adj.get(m).add(new Pair(w, n));
        }
        return adj;
    }
}
