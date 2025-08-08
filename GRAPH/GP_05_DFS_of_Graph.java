package GRAPH;

/*
 * http://geeksforgeeks.org/problems/depth-first-traversal-for-a-graph/1
 *
 *  # DFS of Graph
 *
 * Q. Given a connected undirected graph containing V vertices represented by a 2-d adjacency list adj[][], where each adj[i]
 *    represents the list of vertices connected to vertex i.
 *    Perform a Depth First Search (DFS) traversal starting from vertex 0, visiting vertices from left to right as per the given adjacency list, and return a list containing the DFS traversal of the graph.
 *    Note: Do traverse in the same order as they are in the given adjacency list
 *
 *   Ex.       0
 *            /|\
 *           2 1 3
 *          |
 *          4
 *
 *
 *         Output: [0, 2, 4, 3, 1]
 *         Explanation: Starting from 0, the DFS traversal proceeds as follows:
 *         Visit 0 → Output: 0
 *         Visit 2 (the first neighbor of 0) → Output: 0, 2
 *         Visit 4 (the first neighbor of 2) → Output: 0, 2, 4
 *         Backtrack to 2, then backtrack to 0, and visit 3 → Output: 0, 2, 4, 3
 *         Finally, backtrack to 0 and visit 1 → Final Output: 0, 2, 4, 3, 1
 *  */

import java.util.ArrayList;
public class GP_05_DFS_of_Graph {

    public static void main(String[] args) {

        int v = 5;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }
        //edge 0---->1
        adj.get(0).add(1);
        adj.get(1).add(0);

        //edge 1---->2
        adj.get(1).add(2);
        adj.get(2).add(1);

        //edge 2----->2

        adj.get(2).add(3);
        adj.get(3).add(2);

        //edge 3---->4
        adj.get(3).add(4);
        adj.get(4).add(3);

        // edge 1---->4

        adj.get(1).add(4);
        adj.get(4).add(1);


        ArrayList<Integer> result = dfs(adj);

        System.out.println("DFS Travesal Starting from Node 0");

        for (int i : result) {
            System.out.print(i + " ");

        }
    }

    public static ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
            int v = adj.size();
            boolean []visited = new boolean[v];
            ArrayList<Integer> result = new ArrayList<>();
            funDfs(0 ,adj , visited ,result);
            return result;
    }

    private static void funDfs(int node, ArrayList<ArrayList<Integer>> adj, boolean[] visited, ArrayList<Integer> result) {
        visited[node] = true;
        result.add(node);

        for (int i = 0; i < adj.get(node).size(); i++){
            int neight = adj.get(node).get(i);
            if (!visited[neight]){
                visited[neight] = true;
                funDfs(neight,adj,visited,result);
            }
        }
    }
}
