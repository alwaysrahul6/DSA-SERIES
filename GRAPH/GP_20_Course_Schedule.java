package GRAPH;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/*
 * https://www.geeksforgeeks.org/batch/gfg-160-problems/track/graph-bonus-problems/problem/course-schedule
 *
 * #. Course Schedule
 *
 *  Q. There are a total of n tasks you have to pick, labelled from 0 to n-1. Some tasks may have prerequisites[][] tasks,
 *     for example to pick task 0 you have to first finish tasks 1, which is expressed as a pair: [0, 1]
 *     Given the total number of n tasks and a list of prerequisite pairs of size m. Find a ordering of tasks you should pick to finish all tasks.
 *
 *      Note: There may be multiple correct orders, you just need to return any one of them. If it is impossible to finish all tasks,
 *            return an empty array. Returning any correct order will give the output as true, whereas any invalid order will give the output false.
 *
 * Ex.
 *     Input: n = 4, prerequisites[][] = [[1, 0], [2, 0], [3, 1], [3, 2]
 *     Output: true
 *     Explanation: There are a total of 4 tasks to pick. To pick task 3 you should have finished both tasks 1 and 2. Both tasks 1 and 2 should be pick after you finished task 0. So one correct task order is [0, 1, 2, 3]. Another correct ordering is [0, 2, 1, 3]. Returning any of these order will result in an output of true.
 *

 * */
public class GP_20_Course_Schedule {

    public static void main(String[] args) {
         int n[][] = {{1, 0}, {2, 0}, {3, 1}, {3, 2}};
        System.out.println(Arrays.deepToString(new ArrayList[]{findOrder(4, n)}));

    }

    /// Solutions

    public static ArrayList<Integer> findOrder(int n, int[][] prerequisites) {
        // code here
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }
        ArrayList<Integer> result = new ArrayList<>();

        int[] indegree = new int[n];

        for (int neigh[] : prerequisites){
            int task = neigh[0];
            int des = neigh[1];
            adj.get(des).add(task);
            indegree[task]++;
        }
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++){
            if (indegree[i] == 0){
                queue.offer(i);
            }
        }

        while (!queue.isEmpty()){
            int curr = queue.poll();
            result.add(curr);
            for (int next : adj.get(curr)){
                indegree[next]--;
                if (indegree[next] == 0){
                    queue.add(next);
                }
            }
        }
        if (result.size() == n)return result;
        return new ArrayList<>();
    }
    
    
    public static int[]courceShedule(int n, int[][]edges){
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }
        
        int[]indegree = new int[n];
        int []result = new int[n];
        int idx = 0;
        
        for (int[] edge: edges){
            int s = edge[0];
            int d = edge[1];
            adj.get(d).add(s);
            indegree[s]++;
        }
        
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i = 0; i < n; i++){
            if (indegree[i] == 0){
                queue.add(i);
            }
        }
        
        while (!queue.isEmpty()){
            int node = queue.poll();
            result[idx++] = node;
            for (int i : adj.get(node)){
                indegree[i]--;
                if (indegree[i] == 0){
                    queue.add(i);
                }
            }
        }
        if (idx == n)return result;
        return new int[]{0};
    }
}
