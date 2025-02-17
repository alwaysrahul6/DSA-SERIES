package Pattern;

import java.util.Scanner;

public class opposite_triangle_Reverce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size :");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (i + j <= n) {
                    System.out.print(" ");
                } else System.out.print("*");
            }
            System.out.println( );
        }
    }

}
