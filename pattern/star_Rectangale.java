package Pattern;

import java.util.Scanner;

public class star_Rectangale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Row");
        int m = sc.nextInt();
        System.out.println("Enter A Cols");
        int n = sc.nextInt();


        for (int i = 0; i<=m ;i++){
            for (int j=0 ; j<=n ; j++){
                System.out.print("*");
            }
       System.out.println();
    }
}
}