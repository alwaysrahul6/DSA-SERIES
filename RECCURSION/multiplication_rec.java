package RECCURSION;

public class multiplication_rec {
   public static int solve(int n ,int m){
        if (n == 1)return n;
        return solve(n-1 ,m)*m;
    }

    public static void main(String[] args) {
        int n = 4556;
        int m = 2;
        System.out.println(solve(n,m));
    }
}
