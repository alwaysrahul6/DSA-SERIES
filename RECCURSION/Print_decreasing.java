package RECCURSION;

public class Print_decreasing {
    static int printdecreasing(int n){
        if (n==1)return 1;


        System.out.println(n);
        return printdecreasing(n-1);

    }

    public static void main(String[] args) {
        printdecreasing(10);
    }
}
