package LeetCode;

public class LE_04_Detect_Cycles_in_2D_Grid {
   static int dir[][] = {{-1,0},{0,1},{1,0},{0,-1}};
    public static void main(String[] args) {


    }

    public boolean containsCycle(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean [][] visited = new boolean[n][m];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (!visited[i][j] && dfsCycle(i , j , i , j ,n,m, visited , grid)){
                     return true;
                }
            }
        }
        return false;
    }

    private static boolean dfsCycle(int i, int j, int prevI, int prevJ,int n , int m, boolean[][] visited, char[][] grid) {
        if (visited[i][j]== true) return true;
        visited[i][j] = true;
        for (int[] d : dir){
            int newr = i + d[0];
            int newc = j + d[1];

            if (newr >= 0 && newr < n && newc >= 0 && newc < m  && grid[newr][newc] == grid[i][j]){
                if (newr == prevI && newc == prevJ)continue;
                if (dfsCycle(newr , newc , i , j , n , m , visited , grid))return true;
            }
        }
        return false;

    }

}
