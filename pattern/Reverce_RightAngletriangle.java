package Pattern;

import java.util.Scanner;

public class Reverce_RightAngletriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size:");
        int n = sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j =1;j<=n-i;j++){ //space
                System.out.print(" ");
            }
            for (int j =1 ; j<=n; j++){

                System.out.print("*");//stars
            }
            System.out.println();
        }


    }
}
