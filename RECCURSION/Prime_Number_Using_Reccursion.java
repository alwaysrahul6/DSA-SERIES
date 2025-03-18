package RECCURSION;

import java.util.Scanner;
//Solution
public class Prime_Number_Using_Reccursion {
    static int prime(int n){
        if (n==2)return 1; //base
        System.out.println(n); //self work
        return prime(1%n); //reccursive work
    }
//Driver Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        System.out.println(prime(n));
    }
}
