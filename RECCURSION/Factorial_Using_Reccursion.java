package RECCURSION;

import java.util.Scanner;

public class Factorial_Using_Reccursion {
    static int factorial(int n ){
     //base case
        if (n==0)return 1;//
        return n*factorial(n-1) ;//reccursive work

    }
//Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
}
