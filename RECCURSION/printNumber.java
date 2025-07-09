package RECCURSION;

public class printNumber {
   static int solve(int n){
        if (n>1)return 1;
        System.out.println(n);
        return  solve(n-1);
    }

    public static void main(String[] args) {
        int n = 10;
        solve(n);
    }
}
