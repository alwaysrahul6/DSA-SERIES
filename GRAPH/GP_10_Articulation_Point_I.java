package GRAPH;/*
 * https://www.geeksforgeeks.org/problems/articulation-point-1/1
 *
 * # Articulation Point - I
 *
 * Given an undirected connected graph with V vertices and adjacency list adj.
 * You are required to find all the vertices removing which (and edges through it) disconnects
 * the graph into 2 or more components and return it in sorted manner.
 * Note: Indexing is zero-based i.e nodes numbering from (0 to V-1). There might be loops present in the graph.
 *
 * Example 1:
 *          Input:
 *               V = 5,
 *               edges[][] = [[0, 1],
 *                            [1, 4],
 *                            [4, 3],
 *                            [4, 2],
 *                            [2, 3]]
 *
 *           Output: [0]
 *  */
import java.util.ArrayList;
import java.util.Arrays;

public class GP_10_Articulation_Point_I {

    private static int timer = 1;

    public static void main(String[] args) {
        int[][] edges = {{0, 1}, {0, 2}};
        int v = 4;
        System.out.println(articulationPoints(v, edges));
    }

    static ArrayList<Integer> articulationPoints(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = adgFacade(V, edges);

        int[] vis = new int[V];
        int[] tin = new int[V];
        int[] low = new int[V];
        int[] mark = new int[V];

        for (int i = 0; i < V; i++) {
            if (vis[i] == 0) {
                dfsArti(i, -1, vis, tin, low, mark, adj);
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            if (mark[i] == 1) {
                ans.add(i);
            }

        }
        return ans.isEmpty() ? new ArrayList<>(Arrays.asList(-1)) : ans;
    }

    private static void dfsArti(int node, int parent, int[] vis, int[] tin, int[] low, int[] mark, ArrayList<ArrayList<Integer>> adj) {

        vis[node] = 1;

        tin[node] = low[node] = timer;
        timer++;
        int child = 0;

        for (Integer i : adj.get(node)) {
            if (i == parent) continue;

            if (vis[i] == 0) {
                dfsArti(i, node, vis, tin, low, mark, adj);
                low[node] = Math.min(low[node], low[i]);

                if (low[i] >= tin[node] && parent != -1) {
                    mark[node] = 1;
                }
                child++;
            } else {
                low[node] = Math.min(low[node], tin[i]);
            }
            if (child > 1 && parent == -1) {
                mark[node] = 1;
            }
        }
    }

    private static ArrayList<ArrayList<Integer>> adgFacade(int v, int[][] edges) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int m = edge[0];
            int n = edge[1];
            adj.get(m).add(n);
            adj.get(n).add(m);
        }
        return adj;
    }
}
