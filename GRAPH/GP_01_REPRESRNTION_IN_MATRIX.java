package GRAPH;

public class GP_01_REPRESRNTION_IN_MATRIX {
    public static void main(String[] args) {

        int n = 4, m = 4;

        int adj[][] = new int[n+1][n+1];

        /// edge 1---2

        adj[1][2] = 1;
        adj[2][1] = 1;

        /// edge 2----3

        adj[2][3] = 1;
        adj[3][2] = 1;

        /// edge 3----4

        adj[3][4] = 1;
        adj[4][3] = 1;

        for (int i[] : adj){
            for (int val : i){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
