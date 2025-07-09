package RECCURSION;

public class RECCURSION_RAT_MAZE_PRINT {
    public static void main(String[] args) {
        int r = 3;
        int c = 2;
        print(1,1,r,c,"");
    }
    static void print(int sr, int sc, int er , int ec, String s){
        if (sr > er || sc > ec)return ;
        if (sr == er && sc == ec){
            System.out.println(s);
            return;
        }
        //down

        print(sr+1, sc, er, ec, s+"D");

        //right

        print(sr , sc + 1, er, ec,s + "R");

    }
}
