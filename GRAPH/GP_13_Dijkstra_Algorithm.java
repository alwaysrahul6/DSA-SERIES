package GRAPH;
/*
 * https://www.geeksforgeeks.org/batch/gfg-160-problems/track/graph-gfg-160/problem/implementing-dijkstra-set-1-adjacency-matrix
 *
 * #. Dijkstra Algorithm
 *
 * Q. Given an undirected, weighted graph with V vertices numbered from 0 to V-1 and E edges,
 *    represented by 2d array edges[][], where edges[i]=[u, v, w] represents the edge between the nodes u and v having w edge weight.
 *    You have to find the shortest distance of all the vertices from the source vertex src, and return an array of integers where the
 *    ith element denotes the shortest distance between ith node and source vertex src.
 *    Note: The Graph is connected and doesn't contain any negative weight edge.
 *
 * Ex. Input: V = 3, edges[][] = [[0, 1, 1],
 *                                [1, 2, 3],
 *                                [0, 2, 6]],
 *            src = 2
 *     Output: [4, 3, 0]
 *     Explanation: (0)
 *                1 /\ 6
 *                 /__\
 *             (1)   3   (2)
 * */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class GP_13_Dijkstra_Algorithm {
// Pair Class of Weight And Node.
    public static class Pair{
        int wt;
        int node;
        Pair(int w , int n ){
            this.wt = w;
            this.node = n;
        }
    }
  ///Driver Code 
    public static void main(String[] args) {

        int [][]edges = {{0, 1, 1},
                         {1, 2, 3},
                         {0, 2, 6}};
        int V = 3;
        int src = 2;
        System.out.println(Arrays.toString(dijkstra(V, edges, src)));
    }

    public static int[] dijkstra(int V, int[][] edges, int src) {
        ArrayList<ArrayList<Pair>> adj = adjCmd(V , edges);
        PriorityQueue<Pair> pqueue = new PriorityQueue<>((a,b) -> a.wt - b.wt);
        int []dist = new int[V];
        Arrays.fill(dist, (int) 1e9);
        dist[src] = 0;

        pqueue.add(new Pair(0,src));

        while (!pqueue.isEmpty()){
           Pair pair = pqueue.poll();
           int wt = pair.wt;
           int node = pair.node;
            for (Pair edge : adj.get(node)){
                int adjWeight = edge.wt;
                int adjNode = edge.node;

               if (adjWeight + wt < dist[adjNode]){
                   dist[adjNode] = adjWeight + wt;
                   pqueue.add(new Pair(dist[adjNode],adjNode ));
               }
            }
        }
        return dist;

    }
///Convert Edges to AdjacencyList
    private static ArrayList<ArrayList<Pair>> adjCmd(int v, int[][] edges) {

        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for (int i = 0; i < v; i++){
            adj.add(new ArrayList<>());
        }
      for (int []edge: edges){
          int s = edge[0];
          int d = edge[1];
          int w = edge[2];
          adj.get(s).add(new Pair(w, d));
          adj.get(d).add(new Pair(w, s));
        }
      return adj;
    }
}
