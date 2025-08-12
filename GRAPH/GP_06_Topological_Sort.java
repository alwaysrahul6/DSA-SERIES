package GRAPH;/*
 * https://www.geeksforgeeks.org/problems/topological-sort/1
 *
 *   #  Topological sort.
 *   Q. Given a Directed Acyclic Graph (DAG) of V (0 to V-1) vertices and E edges represented as a 2D list of edges[][],
 *      where each entry edges[i] = [u, v] denotes a directed edge u -> v. Return the topological sort for the given graph.
 *      Topological sorting for Directed Acyclic Graph (DAG) is a linear ordering of vertices such that for every directed edge u -> v, 
 *      vertex u comes before v in the ordering.
 *      Note: As there are multiple Topological orders possible, you may return any of them. 
 *      If your returned Topological sort is correct then the output will be true else false.
 * 
 *      Ex.
 *         Input: V = 6, E = 6, 
 *                edges[][] = [[1, 3],
 *                             [2, 3], 
 *                             [4, 1], 
 *                             [4, 0], 
 *                             [5, 0],
 *                             [5,2]]
 *        Output: true
 *        Explanation: The output true denotes that the order is valid. Few valid Topological orders for the graph are:
 *        [4, 5, 0, 1, 2, 3] 
 *        [5, 2, 4, 0, 1, 3]
 *  */
import java.util.ArrayList;
import java.util.Stack;

public class GP_06_Topological_Sort {
    public static void main(String[] args) {

        int[][] edges = {{3,0},
                         {1,0},
                         {2,0}};
        int V = 0;
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            V = Math.max(V, Math.max(v, u));
        }
        V+=1;
        System.out.println(topoSort(V ,edges));
    }
    static void dfs(int node, ArrayList<ArrayList<Integer>> edges, Stack<Integer> stack, boolean[]vis){
        vis[node] = true;
      for (int nbr : edges.get(node)){
          if (!vis[nbr]){
              dfs(nbr , edges ,stack ,vis);
          }
      }
        stack.push(node);
    }

    public static ArrayList<Integer> topoSort(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < edges.length; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            adj.get(u).add(v);
        }
        Stack<Integer> stack = new Stack<>();

        boolean[]vis = new boolean[V];
///     Store The Result
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < V; i++){
            if (!vis[i]){
                dfs(i , adj , stack , vis);
            }
        }
        while (!stack.isEmpty()){
           res.add(stack.peek());
            stack.pop();
        }
        return res;
    }
}
