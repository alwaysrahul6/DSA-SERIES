package GRAPH;/*
 * https://www.geeksforgeeks.org/batch/gfg-160-problems/track/graph-gfg-160/problem/implementing-floyd-warshall2042
 * Floyd Warshall.
 *
 * Q. You are given an weighted directed graph, represented by an adjacency matrix, dist[][] of size n x n, where dist[i][j] represents the weight of the edge from node i to node j. If there is no direct edge, dist[i][j] is set to a large value (i.e., 108) to represent infinity.
 *    The graph may contain negative edge weights, but it does not contain any negative weight cycles.
 *    Your task is to find the shortest distance between every pair of nodes i and j in the graph.
 *    Note: Modify the distances for every pair in place.
 *    Examples :
 *              Input: dist[][] = [[0, 4, 108, 5, 108],
 *                                 [108, 0, 1, 108, 6],
 *                                 [2, 108, 0, 3, 108],
 *                                 [108, 108, 1, 0, 2],
 *                                 [1, 108, 108, 4, 0]]
 *
 *                       OutPut: [[0, 4, 5, 5, 7],
 *                                [3, 0, 1, 4, 6],
 *                                [2, 6, 0, 3, 5],
 *                                [3, 7, 1, 0, 2],
 *                                [1, 5, 5, 4, 0]]
 *
 * */


public class GP_18_Floyd_Warshall {

    //Solution
    public static void main(String[] args) {
        int INF = (int) 1e8;
        int [][]dict =  { {0, 4, 108, 5, INF},
                          {INF, 0, 1, INF, 6},
                          {2, INF, 0, 3, INF},
                          {INF, INF, 1, 0, 2},
                          {1, INF, INF, 4, 0}};

        floydWarshall(dict);
        int n = dict.length;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(dict[i][j] + "\t");
            }
            System.out.println();
        }
    }
/// Solution

  /*   Time and Space Complexity O(n³) and O(1)*/

    public static void floydWarshall(int[][] dist) {
        // Code here
        int n = dist.length;
        int INF = (int) 1e8;

        for (int var = 0; var < n; var++){
            for (int i = 0; i < n; i++){
                for (int j = 0; j < n; j++){
                    if (dist[i][var] != INF && dist[var][j] != INF) {
                        dist[i][j] = Math.min(dist[i][j], dist[i][var] + dist[var][j]);
                    }
                }
            }
        }
    }
}


