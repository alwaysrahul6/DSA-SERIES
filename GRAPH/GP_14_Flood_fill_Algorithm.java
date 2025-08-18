package GRAPH;/*
 * https://www.geeksforgeeks.org/problems/flood-fill-algorithm1856/1
 *
 * #. Flood fill Algorithm.
 *
 * Q.  You are given a 2D grid image[][] of size n*m, where each image[i][j] represents the color of a pixel in the image.
 *     Also provided a coordinate(sr, sc) representing the starting pixel (row and column) and a new color value newColor.
 *     Your task is to perform a flood fill starting from the pixel (sr, sc), changing its color to newColor and the color of
 *     all the connected pixels that have the same original color.
 *     Two pixels are considered connected if they are adjacent horizontally or vertically (not diagonally) and have the same original color.
 *
 *  Ex.  image[][] = [[1, 1, 1, 0],
 *                    [0, 1, 1, 1],
 *                    [1, 0, 1, 1]],
 *       sr = 1,
 *       sc = 2,
 *       newColor = 2
 *  Output: [2, 2, 2, 0]
 *          [0, 2, 2, 2]
 *          [1, 0, 2, 2]
 *          [1, 0, 2, 2]
 * */
import java.util.Arrays;

public class GP_14_Flood_fill_Algorithm {
    // Driver Code
    public static void main(String[] args) {

        int[][] image = {{1,1,1,0} ,
                         {0,1,1,1} ,
                         {1,0,1,1} ,
                         {1,0,1,1}};
        int sr = 1;
        int sc = 2;
        int newColor = 2;
        int result[][] =  floodFill(image, sr, sc, newColor);
        for (int[] row : result ){
            System.out.println(Arrays.toString(row));
        }
    }

    // Solution
    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        // Code here
        int originalColor = image[sr][sc];
        if (originalColor == newColor)return image;
        int n = image.length;
        int m =image[0].length;
        boolean [][]vis = new boolean[n][m];
        dfsFlood(sr,sc ,image,vis,newColor, originalColor);
        return image;
    }
/// Dfs Call
    private static void dfsFlood(int sr, int sc, int[][] image, boolean[][] vis,int newColor,int originalColor) {

        int n = image.length;
        int m = image[0].length;
        int r[] = {-1,0,1,0};
        int c[] = {0,1,0,-1};

        if ((sr >= 0 && sr < n && sc >= 0 && sc < m )&& (!vis[sr][sc] && image[sr][sc] == originalColor)){

            vis[sr][sc] = true;
            image[sr][sc] = newColor;
            for (int i = 0; i < 4; i++){
                int r1 = r[i] + sr;
                int c1 = c[i] + sc;
                dfsFlood(r1 ,c1 ,image ,vis ,newColor ,originalColor);
            }
        }
    }
}
