package Pattern;

import java.util.Scanner;

public class opposite_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a N Value");
        int n = sc.nextInt();
        for (int i = 1;i<n;i++){
            for (int j = 1;j<n+1-i;j++){
//                System.out.print(j);
                System.out.print("*");
//                System.out.print((char) ( i+ 64) + " ");
            }
            System.out.println( );
        }

     }
}
