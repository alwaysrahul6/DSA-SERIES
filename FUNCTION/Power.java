package FUNCTION;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        double n = sc.nextDouble();
//        double m = sc.nextDouble();
      //  System.out.println(Math.pow(n,m));
      //  System.out.println(Math.sqrt(64));
        // Math.pow is built in power function or library
       int a= sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();
       int d = sc.nextInt();
       int min = Math.min(a, Math.min(b, Math.min(c, d)));
        System.out.println(min + " minimum value ");

    }
}
