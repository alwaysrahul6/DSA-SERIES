package RECCURSION;

import java.util.Scanner;
/*Q-find GCD (Greatest Common Divisor)
Given two numbers x and y. Find the greatest common divisor of x and y using recursion.
Constraints : 0 x , y <= le6
Inputl •
Outputl : 1*/
public class GCD_RECU {
    static int rGCD(int n , int m){
        if (m ==0)return n;
        return rGCD(m,n%m);
    }

    public static void main(String[] args) {
        int l = 16;
        int k = 24;
        System.out.println(rGCD(l,k));
    }
}
