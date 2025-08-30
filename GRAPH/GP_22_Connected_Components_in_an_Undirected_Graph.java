package GRAPH;
/*
 * https://www.geeksforgeeks.org/batch/gfg-160-problems/track/graph-bonus-problems/problem/connected-components-in-an-undirected-graph
 *
 *  #. Connected Components in an Undirected Graph
 *
 *   Q. Given an undirected graph with V vertices numbered from 0 to V-1 and E edges, represented as a 2D array edges[][],
 *      where each entry edges[i] = [u, v] denotes an edge between vertices u and v.
 *      Your task is to return a list of all connected components. Each connected component should be represented as a list of its vertices, with all components returned in a collection where each component is listed separately.
 *      Note: You can return the components in any order, driver code will print the components in sorted order.
 *
 *      Input: V = 7, edges[][] = [[0, 1], [6, 0], [2, 4], [2, 3], [3, 4]]
 *      Output: [[0, 1, 6], [2, 3, 4], [5]]
 *      Explanation:
 *                   1---0   3
 *                   |       |
 *                   2       4
 * */
import java.util.ArrayList;
import java.util.Arrays;

public class GP_22_Connected_Components_in_an_Undirected_Graph {
    
    //Driver Code
    public static void main(String[] args) {

        int v = 7;
        int edges[][] = {{0, 1} ,{6, 0} ,{2, 4} ,{2, 3} ,{3, 4}};
        System.out.println(Arrays.deepToString(new ArrayList[]{getComponents(v, edges)}));
    }

    //Solution

    public static ArrayList<ArrayList<Integer>> getComponents(int v, int[][] edges) {
        ArrayList<ArrayList<Integer>>adjList = adjCmd(v , edges);
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        boolean[] visite = new boolean[v];

        for (int i = 0; i < v; i++){
            ArrayList<Integer> temp = new ArrayList<>();

            if (!visite[i]){
                dfs(i , adjList ,visite , temp);
                res.add(temp);
            }
        }
        return res;
    }
        
    //dfs
    
    private static void dfs(int src ,  ArrayList<ArrayList<Integer>>adjList,boolean[]vis ,ArrayList<Integer>temp){
        vis[src] = true;
        temp.add(src);

       for (int i : adjList.get(src)){
           if (!vis[i]){
               dfs(i , adjList ,vis , temp);
           }
       }
    }

    private static ArrayList<ArrayList<Integer>> adjCmd(int v , int edges[][]){
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < v; i++){
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
