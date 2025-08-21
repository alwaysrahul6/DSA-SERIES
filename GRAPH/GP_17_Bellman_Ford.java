package GRAPH;
/*
 * https://www.geeksforgeeks.org/batch/gfg-160-problems/track/graph-gfg-160/problem/distance-from-the-source-bellman-ford-algorithm
 *
 * #. Bellman-Ford
 *
 * Q. Given an weighted graph with V vertices numbered from 0 to V-1 and E edges, represented by a 2d array edges[][],
 *    where edges[i] = [u, v, w] represents a direct edge from node u to v having w edge weight. You are also given a source vertex src.
 *    Your task is to compute the shortest distances from the source to all other vertices. If a vertex is unreachable from the source, its distance should be marked as 108.
 *    Additionally, if the graph contains a negative weight cycle, return [-1] to indicate that shortest paths cannot be reliably computed.
 *
 *  Ex.
 *    Input: V = 5,
 *                 edges[][] = [[1, 3, 2],
 *                              [4, 3, -1],
 *                               [2, 4, 1],
 *                               [1, 2, 1],
 *                               [0, 1, 5]],
 *                 src = 0
 * */
import java.util.Arrays;
/// Driver Code
public class GP_17_Bellman_Ford {
    public static void main(String[] args) {

        int [][]edges = {{1, 3, 2},
                         {4, 3, -1},
                          {2, 4, 1},
                          {1, 2, 1},
                          {0, 1, 5}};

        int src = 0;
        int v = 5;
        bellmanFord(v,edges ,src);
    }
    
/// Solution
    public static int[] bellmanFord(int V, int[][] edges, int src) {

        int[] distance = new int[V];

        Arrays.fill(distance, (int) 1e9);
        distance[src] = 0;

        for (int i = 0; i < V - 1; i++) {
            for (int[] edge : edges) {
                int u = edge[0];
                int v = edge[1];
                int w = edge[2];

                if (distance[u] != 1e9 && distance[u] + w < distance[v]) {
                    distance[v] = distance[u] + w;
                }
            }
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];

            if (distance[u] != 1e9 && distance[u] + w < distance[v]) {
                return new int[]{-1};
            }
        }
        return distance;
    }
}
