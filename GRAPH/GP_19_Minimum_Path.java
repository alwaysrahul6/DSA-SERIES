package GRAPH;
/*
 * https://www.geeksforgeeks.org/problems/path-with-minimum-effort/1
 *
 * #. Path With Minimum Effort
 *
 * Q.   You are a hiker preparing for an upcoming hike. You are given heights[][],
 *        a 2D array of size rows x columns, where heights[row][col] represents the height of cell (row, col).
 *        You are situated in the top-left cell, (0, 0), and you hope to travel to the bottom-right cell, (rows-1, columns-1) (i.e., 0-indexed). You can move up, down, left, or right, and you wish to find the route with minimum effort.
 *        Note: A route's effort is the maximum absolute difference in heights between two consecutive cells of the route.
 *      Ex .Input:
 *               height = 3
 *               columns = 3
 *               heights = [[1,2,2],[3,8,2],[5,3,5]]
 *               Output:
 *               2
 *               Explanation:
 *               The route 1->3->5->3->5 has a maximum absolute difference of 2 in consecutive cells.
 *               This is better than the route 1->2->2->2->5, where the maximum absolute difference is 3.
 * */
import java.util.Arrays;
import java.util.PriorityQueue;

public class GP_19_Minimum_Path {

    //Driver Code
    public static void main(String[] args) {

        int dist[][] = {{1,2,2},
                        {3,8,2},
                        {5,3,5}};
        System.out.println(MinimumEffort(3,3,dist));

    }
/// Solutions
    public static class Pair{
        int weight;
        int row;
        int cols;
        Pair(int w, int r , int c){
            this.weight = w;
            this.row = r;
            this.cols = c;
        }
    }

    public static int MinimumEffort (int n, int m,int distance[][]){
        PriorityQueue<Pair> queue = new PriorityQueue<>((x ,y) -> x.weight - y.weight);
        int dis[][] = new int[n][m];
        for (int[] x: dis){
            Arrays.fill(x , Integer.MAX_VALUE);
        }
        dis[0][0] = 0;
        queue.add(new Pair(0 , 0,0));

        int row[] = {-1 ,0 ,1 ,0};
        int cols[] = {0 ,1,0,-1};

        while (!queue.isEmpty()){
            Pair node = queue.poll();
            int w = node.weight;
            int r = node.row;
            int c = node.cols;
            if (r == n-1  && c == m-1 )return w;
            for (int i = 0;i < 4; i++){
                int newR = r + row[i];
                int newC = c + cols[i];
                if (newR >= 0 && newC >=0 && newC < m && newR < n) {
                    int newdiff = Math.max(Math.abs(distance[r][c] - distance[newR][newC]), w);
                    if (newdiff < dis[newR][newC]){
                        dis[newR][newC] = newdiff;
                        queue.add(new Pair(newdiff,newR ,newC));
                    }
                }
            }
        }
        return 0;
    }

}
