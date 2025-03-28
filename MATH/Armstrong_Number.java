package MATH;

import java.util.Scanner;

public class Armstrong_Number {
    static void solve(int n){
        int temp = n;
        int r,sum =0;
        while (n>0){
            r = n%10;
            n = n/10;
            sum  = sum + r*r*r;
        }
        if (temp == sum){
            System.out.println("Its a Armstrong Number");
        }else System.out.println("its not a arm strong number");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solve(n);
    }
}
