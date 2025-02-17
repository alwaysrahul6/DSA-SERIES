package FUNCTION;

import java.util.Scanner;

public class Combination {
    public static int fact(int x){
        int xfact=1;
        for (int i=1;i<=x;i++){
            xfact *=i;
        }
        return xfact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println("Enter r");
        int r = sc.nextInt();
        int nfact = fact(n);
        int rfact = fact(r);
        int nmrfact = fact(n-r);
        int ncr= nfact/(rfact*nmrfact);
        System.out.println(ncr);
    }
}
