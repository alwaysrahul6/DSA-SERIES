package GFG_POTD;
import java.util.ArrayList;
/*  Q.Mother Vertex
 *  Given a directed graph with V vertices labeled from 0 to V-1 and a list of edges edges[][], where each edge is represented as [u, v] indicating a directed edge from vertex u to vertex v, find a Mother Vertex of the graph.
 *  A Mother Vertex is a vertex from which all other vertices can be reached.
 *  If multiple such vertices exist, return the one with the smallest value.
 *  If no such vertex exists, return -1.
 *  Examples:
 *  Input: V = 5, edges[][] = [[0, 2], [0, 3], [1, 0], [2, 1], [3, 4]]
 *  Output: 0
 *  Explanation: Vertices 0, 1, and 2 can each reach all other vertices in the graph. Among them, 0 is the smallest, so the output is 0.
 *  */
public class GFG_POTD_Mother_Vertex {

    static void printGraph(ArrayList<ArrayList<Integer>> adj) {

        for (int i = 0; i < adj.size(); i++) {

            System.out.print(i + " -> ");

            for (int neighbor : adj.get(i)) {
                System.out.print(neighbor + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        int v = 5;

        int[][] edges = {
                {0, 2},
                {0, 3},
                {1, 0},
                {2, 1},
                {3, 4}
        };

        ArrayList<ArrayList<Integer>> adj = buildGraph(v, edges);
        printGraph(adj);
    }

        public int findMotherVertex(int V, int[][] edges) {

            ArrayList<ArrayList<Integer>> adj = buildGraph(V, edges);

            boolean[] visited = new boolean[V];

            int candidate = -1;

            // Step 1:
            // Find last finished vertex
            for (int i = 0; i < V; i++) {

                if (!visited[i]) {

                    dfs(i, visited, adj);

                    candidate = i;
                }
            }

            // Step 2:
            // Verify candidate

            visited = new boolean[V];

            dfs(candidate, visited, adj);

            for (boolean val : visited) {

                if (!val) {
                    return -1;
                }
            }

            return candidate;
        }

        private void dfs(int node,
                         boolean[] visited,
                         ArrayList<ArrayList<Integer>> adj) {

            visited[node] = true;

            for (int neighbour : adj.get(node)) {

                if (!visited[neighbour]) {

                    dfs(neighbour, visited, adj);
                }
            }
        }

        private static ArrayList<ArrayList<Integer>> buildGraph(int V,
                                                         int[][] edges) {

            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

            for (int i = 0; i < V; i++) {
                adj.add(new ArrayList<>());
            }

            for (int[] edge : edges) {

                int u = edge[0];
                int v = edge[1];

                adj.get(u).add(v);
            }

            return adj;
        }
    }
}
