package RECCURSION;

public class Fibonacci_Series {
    static int fibonacci(int n){
        if (n==0 || n==1)return 1;
        return fibonacci(n-1)+fibonacci(n-2);
    }


    public static void main(String[] args) {
        for (int i =0;i<10;i++){
            System.out.println(fibonacci(i));
        }
    }
}
