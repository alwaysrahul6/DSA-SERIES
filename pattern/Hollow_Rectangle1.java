package Pattern;

import java.util.Scanner;

public class Hollow_Rectangle1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Row");
        int n = sc.nextInt();
//        System.out.println("Enter A Cols");
//        int n = sc.nextInt();


        for (int i = 1; i<=n ;i++){
            for (int j=1 ; j<=n ; j++){
               if (i==1 || i == n || j==1 || j==n){
                   System.out.print("* ");
               }else System.out.print( " ");
            }
            System.out.println( );
        }
    }
}
