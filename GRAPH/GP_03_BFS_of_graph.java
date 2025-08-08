package GRAPH;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GP_03_BFS_of_graph {
    /// Driver Code
    public static void main(String[] args) {
        int v = 5;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < v; i++){
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


        ArrayList<Integer> result =bfs(adj);

        System.out.println("BFS Travesal Starting from Node 0");

        for (int i : result ){
            System.out.print(i + " ");
        }
    }

    /// Solution

    public static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        int v = adj.size();

        Queue<Integer> queue = new LinkedList<>();

        boolean visited[] = new boolean[v];

        ArrayList<Integer> ans = new ArrayList<>();

        queue.add(0);
        visited[0] = true;
        while (!queue.isEmpty()){
            int node  = queue.poll();
            ans.add(node);

            for (int j = 0; j < adj.get(node).size(); j++){
                int neigh = adj.get(node).get(j);

                if (!visited[neigh]){
                    visited[neigh] = true;
                    queue.add(neigh);
                }
            }
        }
        return ans;
    }
}
