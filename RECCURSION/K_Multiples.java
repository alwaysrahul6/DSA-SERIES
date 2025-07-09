package RECCURSION;

import java.util.Scanner;

public class K_Multiples {
    static void multiples(int m,int n){
        if (n ==0)return;
        multiples(m,n-1);
        System.out.println(m*n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        multiples(p,q);
        System.out.println();
        multiples(4,8);

    }
}
