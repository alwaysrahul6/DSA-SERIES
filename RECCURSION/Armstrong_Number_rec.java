package RECCURSION;

import java.util.Scanner;

public class Armstrong_Number_rec {
    static boolean solve(int n){
        int p=0;
        for (int i = n;i>0;i/=10) p++;
        return rec(n,p) ==n;
    }
    static int rec(int n,int p){
        if (n ==0)return 0;
        return rec(n/10,p)+(int)Math.pow(n%10,p);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        System.out.println(solve(n));
    }
}
