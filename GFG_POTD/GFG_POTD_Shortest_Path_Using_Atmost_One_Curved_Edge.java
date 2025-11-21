package GFG_POTD;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

/*
 * Shortest Path Using Atmost One Curved Edge
 *
 * Q. Given an undirected, connected graph with V vertices numbered from 0 to V-1 and E double-edges, represented as a 2D array edges[][]. Each double-edge is represented by a tuple (x, y, w1, w2), which indicates that there are two edges between vertices x and y: a straight edge with weight w1 and a curved edge with weight w2.
 *    You are given two vertices a and b and you have to go from a to b through a series of edges such that in the entire path, you can use at most 1 curved edge. Your task is to find the shortest path from a to b satisfying the above condition.
 *    If no such path exists that satisfies this restriction, return -1.
 *    Note: It is guaranteed that the shortest path value will fit in a 32-bit integer.
 *    Examples:
 *    Input: V = 4, E = 4, a = 1, b = 3,
 *         edges[][] = [[0, 1, 1, 4],
 *                      [0, 2, 2, 4],
 *                      [0, 3, 3, 1],
 *                      [1, 3, 6, 5]]
 *
 *             (4)
     0 -------------- 1
     |\              |\
   (2)| \ (3)        | (6)
     |  \            |
     |   \           |
   (4)   \ (1)       | (5)
     |    \          |
     |     \         |
     2      \--------3
             (1)

 * */
public class GFG_POTD_Shortest_Path_Using_Atmost_One_Curved_Edge {
    static class pair{
        int node;
        int weight;

        pair(int node , int weight){
            this.node = node;
            this.weight = weight;
        }
    }

    ///  Driver Code

    public static void main(String[] args) {


        int V = 4;
        int a = 1;
        int b = 3;

        // edges[][] = [u, v, straightWeight, curvedWeight]
        int[][] edges = {
                {0, 1, 1, 4},
                {0, 2, 2, 4},
                {0, 3, 3, 1},
                {1, 3, 6, 5}
        };

        int ans = shortestPath(V, a, b, edges);

        System.out.println("Shortest path (at most one curved edge) = " + ans);
    }




    public static int shortestPath(int V, int a, int b, int[][] edges) {
        // code here
        int ab[] = djkstara(V , edges ,a);
        int ba[] = djkstara(V , edges ,b);

        int ans = ab[b];

        for (int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            int c = edge[3];
            int cost = Math.min(ab[u] + ba[v] , ab[v] + ba[u]) + c;
            ans = Math.min(cost , ans);
        }
        return ans == 1e8 ? -1 : ans;

    }



    static int[] djkstara(int V , int edges[][], int src){
        ArrayList<ArrayList<pair>> adjList = adjhelper(V , edges);
        PriorityQueue<pair> pq = new PriorityQueue<>((a , b) -> a.weight - b.weight);

        int dict[] = new int[V];
        Arrays.fill(dict, Integer.MAX_VALUE);
        dict[src] = 0;
        pq.add(new pair(src,0));

        while (!pq.isEmpty()){
            pair p = pq.poll();
            int n = p.node;
            int w = p.weight;

            for (pair neigh: adjList.get(n)){
                int neighnode = neigh.node;
                int neighwt = neigh.weight;
                if (neighwt + w < dict[neighnode]){
                    dict[neighnode] = neighwt + w;
                    pq.add(new pair(neighnode , dict[neighnode]));
                }
            }
        }
        return dict;
    }

    private static ArrayList<ArrayList<pair>> adjhelper(int v, int[][] edges) {
        ArrayList<ArrayList<pair>> adj = new ArrayList<>();
        for (int i = 0; i  < v; i++){
            adj.add(new ArrayList<>());
        }
        for (int[] p : edges){
            int s = p[0];
            int d = p[1];
            int w = p[2];
            adj.get(s).add(new pair(d, w));
            adj.get(d).add(new pair(s, w));
        }
        return adj;
    }

}
