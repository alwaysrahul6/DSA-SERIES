package RECCURSION;

public class Reccursion_Rat_maze_I {
    public static void main(String[] args) {
        int  r = 2;
        int  c = 2;
        int count = maze(1,1,r,c);
        System.out.println(count);
    }

    private static int maze(int sr, int sc, int er, int ec) {
        if (sr > er || sc > ec)return 0;
        if (sr == er && sc == ec)return 1;
        int downWay = maze(sr+1, sc, er, ec);
        int rightway = maze(sr, sc+1, er, ec);
        int totalways = downWay + rightway;
        return totalways;
    }
}
