package HARD_75_DAYS;
/* # . Minimum Number of Flips to Convert Binary Matrix to Zero Matrix
 * Q. Given a m x n binary matrix mat. In one step, you can choose one cell and flip it and all the four neighbors
 *    of it if they exist (Flip is changing 1 to 0 and 0 to 1). A pair of cells are called neighbors if they share one edge.
 *    Return the minimum number of steps required to convert mat to a zero matrix or -1 if you cannot.
 *    A binary matrix is a matrix with all cells equal to 0 or 1 only.
 *    A zero matrix is a matrix with all cells equal to 0.
 *   Example 1:
 *   Input: mat = [[0,0],[0,1]]
 *   Output: 3
 *   Explanation: One possible solution is to flip (1, 0) then (0, 1) and finally (1, 1) as shown.
* */
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Minimum_Number_of_Flips_to_Convert_Binary_Matrix_to_Zero_Matrix {
    int dir[][] = {{1,0} ,{0,-1} ,{0,1} ,{-1,0} ,{0,0}};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s[] = scanner.nextLine().split( " ");
        int n = s.length;
        int arr[][]= new int[n][];
        for (int i = 0; i < n; i++){
            for (int j = 0; j  < n;j++){
                arr[i][j] = Integer.parseInt(s[i]);
            }
        }
        System.out.println(minFlips(arr));
        
    }

    public static int minFlips(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        String target = "0".repeat(m * n);
        int count = 0;
        Queue<String> queue = new LinkedList<>();
        HashSet<String> visited = new HashSet<>();
        String s = encode(mat);
        queue.add(s);
        visited.add(s);
        while (!queue.isEmpty()){
            int size = queue.size();
            while (size-- >0){
                String s1 = queue.poll();
                if (s1.equals(target))return count;
                int [][]grid = decode(s1 , n , m);
                for (int i = 0; i < n ;i++){
                    for (int j = 0; j  < m; j++){
                         flip(grid , i , j);
                         String s2 = encode(grid);

                         if (!visited.contains(s2)){
                             queue.add(s2);
                             visited.add(s2);
                         }
                         flip(grid ,i , j);
                    }
                }
            }
            count++;
        }
        return -1;

    }

    private static String encode(int[][] mat){
        StringBuilder str = new StringBuilder();
        for (int []row : mat){
            for (int cols : row){
             str.append(cols);
            }
        }
        return str.toString();
    }

    static int[][] decode(String s , int n , int m){
        int newmat[][] = new int[n][m];
        int idx = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                newmat[i][j] = s.charAt(idx++) - '0';
            }
        }
        return newmat;
    }

    private static void flip(int[][] mat, int i, int j){
        int n = mat.length;
        int m = mat[0].length;
        for (int []d : dir){
            int ni = i + d[0];
            int nj = j + d[1];
            if (ni >= 0 && nj >= 0 && ni < n && nj < m){
                mat[ni][nj] ^= 1;
            }
        }
    }
}
