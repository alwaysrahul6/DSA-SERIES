package Pattern;

import java.util.Scanner;

public class Star_Triangle_Reverce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size :");
        int n = sc.nextInt();
        for (int i =1;i<=n;i++){
            for (int j =1;j<n+1-i;j++){
                System.out.print(" ");
            }
            for (int j =1;j<=i;j++){
//                System.out.print(j);
//                System.out.print("*");
                System.out.print((char) (64+j));
//                System.out.print((char) (64+i));
            }
            System.out.println();
        }

    }
}
