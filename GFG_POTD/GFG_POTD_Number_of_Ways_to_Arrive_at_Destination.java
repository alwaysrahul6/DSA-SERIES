package GFG_POTD;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;
/*
 * https://www.geeksforgeeks.org/problems/number-of-ways-to-arrive-at-destination/1
 *
 * Q. You are given an undirected weighted graph with V vertices numbered from 0 to V-1 and E edges, represented as a 2D array edges[][], where edges[i] = [ui, vi, timei] means that there is an undirected edge between nodes ui and vi that takes timei minutes to reach.
 *    Your task is to return in how many ways you can travel from node 0 to node V - 1 in the shortest amount of time.
 *    Examples:
 *    Input: V = 4, edges[][] = [[0, 1, 2],
 *                               [1, 2, 3],
 *                               [0, 3, 5],
 *                               [1, 3, 3],
 *                               [2, 3, 4]]
 *
 *  Output: 2
 *  Explanation: The shortest path from 0 to 3 is 5.
 *               Two ways to reach 3 in 5 minutes are:
 *               0 -> 3
 *               0 -> 1 -> 3
 *        3
 *      / | \
 *    4/  |3 \5
 *    /   |   \
 *   2 ---|--- 0
 *    \   |   /
 *    3\  |2 /
 *      \ | /
 *        1

 * */
public class GFG_POTD_Number_of_Ways_to_Arrive_at_Destination {
  static class pair{
        int val;
        int weight;
        pair(int val , int wight){
            this.val = val;
            this.weight = wight;
        }
    }
    ///  Driver Code
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Example Input:
        // 7 10
        // 0 6 7
        // 0 1 2
        // 1 2 3
        // 1 3 3
        // 6 3 3
        // 3 5 1
        // 6 5 1
        // 2 5 1
        // 0 4 5
        // 4 6 2

        System.out.print("Enter number of vertices: ");
        int V = sc.nextInt();

        System.out.print("Enter number of edges: ");
        int E = sc.nextInt();

        int[][] edges = new int[E][3];

        System.out.println("Enter edges (u v w):");
        for (int i = 0; i < E; i++) {
            edges[i][0] = sc.nextInt();
            edges[i][1] = sc.nextInt();
            edges[i][2] = sc.nextInt();
        }

        int result = countPaths(V, edges);
        System.out.println("Number of ways to reach destination node " + (V - 1) + " = " + result);
    }
    
    
///  Solutions

    public static int countPaths(int V, int[][] edges) {
        int []dict = new int[V];
        int []way = new int [V];
        int n = way.length;
        for (int i = 0; i < V;i ++){
            dict[i]  = Integer.MAX_VALUE;
            way[i] = 0;
        }
        way[0] = 1;
        ArrayList<ArrayList<pair>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
        }

        for (int []i : edges){
            adj.get(i[0]).add(new pair(i[1] , i[2]));
            adj.get(i[1]).add(new pair(i[0] , i[2]));
        }

        PriorityQueue<pair> pq = new PriorityQueue<>(Comparator.comparingInt(p->p.weight));
        pq.add(new pair(0 ,0));
        while (!pq.isEmpty()){
            pair p = pq.poll();
            int wght = p.weight;
            int val = p.val;
            for (pair i : adj.get(val)){
                int adjNode = i.val;
                int adjWeight = i.weight;

                if (wght + adjWeight < dict[adjNode]){
                    dict[adjNode] = wght + adjWeight;
                    pq.add(new pair(adjNode , adjWeight + wght));
                    way[adjNode] = way[val];
                } else if (wght + adjWeight == dict[adjNode]) {
                    way[adjNode] = way[adjNode] + way[val];
                }
            }
        }
        return way[n-1];
    }
}
