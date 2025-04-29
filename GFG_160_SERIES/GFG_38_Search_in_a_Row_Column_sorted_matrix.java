package GFG_160_SERIES;
/*      * https://www.geeksforgeeks.org/batch/gfg-160-problems/track/matrix-gfg-160/problem/search-in-a-matrix17201720
        * Search in a Row-Column sorted matrix.
        *
        * Q . Given a 2D integer matrix mat[][] of size n x m, where every row and column is sorted in increasing order and a number x,
        *     the task is to find whether element x is present in the matrix.
        * Ex:Input:
        *       mat[][] = [[3, 30, 38],
        *                 [20, 52, 54],
        *                 [35, 60, 69]],
        *  target  = 62
        *  Output:
        *         false
        *  Explanation:
        *             62 is not present in the matrix, so output is false.
**/
public class GFG_38_Search_in_a_Row_Column_sorted_matrix {
    public static void main(String[] args) {
        int [][]mat = {{18, 21, 27},
                       {38, 55, 67}};
        int x=  55;
        System.out.println(matSearch(mat,x));
    }

    public static boolean BruteForce(int mat[][], int x) {
        // your code here
        int n = mat.length;
        for (int i= 0;i<n;i++){
            for (int j = 0; j < n; j++){
                if (mat[i][j]==x)return true;
            }
        }
        return false;
    }


    /// Binary Search Apply

    static boolean matS(int mat[][] , int x){
        int n = mat.length;
        for (int i =0;i<n;i++){
            int start = 0 ,  end =mat[i].length-1;
            while (start<=end){
                int mid = start  + (end - start)/2;
                if (mat[i][mid]==x)return true;
                else if (mat[i][mid]<x)  start = mid +1;
                else end = mid -1;
            }
        }
        return false;
    }

    public static boolean matSe(int mat[][], int x) {
        // your code here
        int n = mat.length;
        int m = mat[0].length;
       long start  = 0 , end =(long) n * m -1;

        while (start<= end){
            long mid = start + (end - start)/2;
            int row_index  =(int) mid / m;
            int cols_index  =(int) mid % m;
            if (mat[row_index][cols_index]==x)return true;
            else if (mat[row_index][cols_index]<x)start = mid + 1;
            else end = mid - 1;
        }
        return false;
    }

    public static boolean matSearch(int mat[][], int x){
        int n = mat.length;
        int m = mat[0].length;
       int i = 0, j = m-1;
       while (i<n &&  j>=0){
           if (mat[i][j] == x)return true;
           else if (x<mat[i][j]) j--;
           else i++;
       }
       return false;
    }
}
