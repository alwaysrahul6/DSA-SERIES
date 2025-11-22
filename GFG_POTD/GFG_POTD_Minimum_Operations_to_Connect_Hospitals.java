package GFG_POTD;

import java.util.ArrayList;
import java.util.Scanner;
/*
 * Minimum Operations to Connect Hospitals
 *
 * Q. You are given an undirected network of V hospitals numbered from 0 to V - 1, represented as a 2D array edges[][], where each element edges[i] = [u, v] denotes a direct connection between hospital u and hospital v.
 *    In one operation, you are allowed to remove any existing link and reconnect it between two hospitals that are currently not directly or indirectly connected.
 *    Your task is to determine the minimum number of operations required to make sure that all hospitals become connected, either directly or indirectly, using the given links.
 *    Note: If it is impossible to connect all hospitals into a single network, return -1.
 *    Examples:
 *    Input: V = 4, E = 3, edges[][] = [[0, 1], [0, 2], [1, 2]]
 *    Output: 1
 *    Explanation: Remove the connection between hospitals 1 and 2 and connect the hospitals 1 and 3.
 *
 * 0 -------- 1
   |        /
   |      X
   |    /
   2        3

 *
 * */
public class GFG_POTD_Minimum_Operations_to_Connect_Hospitals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of vertices
        int V = sc.nextInt();

        // Input number of edges
        int E = sc.nextInt();

        // Edge array
        int[][] edges = new int[E][2];

        // Input edges
        for (int i = 0; i < E; i++) {
            edges[i][0] = sc.nextInt();
            edges[i][1] = sc.nextInt();
        }

        // Call function
        int ans = minConnect(V, edges);

        // Output result
        System.out.println(ans);

    }

    public static int minConnect(int V, int[][] edges) {
        // code here
        int e = edges.length;
        if (e < V-1) return -1;
        ArrayList<ArrayList<Integer>> adj = adgCmd(V , edges);
        boolean []visited = new boolean[V];
        int component = 0;

        for (int i = 0;i < V; i++){
            if (!visited[i]){
                dfs(i , visited , adj);
                component++;
            }
        }
        return component-1;

    }

    static void dfs(int node,  boolean[]visited , ArrayList<ArrayList<Integer>>adj){
        visited[node] = true;

        for (int next : adj.get(node)){
            if (!visited[next]){
                dfs(next , visited , adj);
            }
        }
    }

    private static ArrayList<ArrayList<Integer>> adgCmd(int v, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i  < v; i++){
            adj.add(new ArrayList<>());
        }

        for (int i[] : edges){
            int m = i[0];
            int n = i[1];

            adj.get(m).add(n);
            adj.get(n).add(m);
        }
        return adj;
    }
}
