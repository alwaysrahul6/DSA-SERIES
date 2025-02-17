package Pattern;

import java.util.Scanner;

public class Square_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Rows & Cols ");
        int m = sc.nextInt();
//        int n = sc.nextInt();
        for (int  i = 0; i<=m;i++){
            for (int j = 0 ;j<=m;j++){
                System.out.print(" * ");
            }
            System.out.println( );
        }
    }
}
