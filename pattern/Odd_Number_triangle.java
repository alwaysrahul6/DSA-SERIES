package Pattern;

import java.util.Scanner;

public class Odd_Number_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Row");
        int n = sc.nextInt();
        for (int i =1;i<=n; i++){
            for (int j = 1; j<=i; j++){
                int odd = 2*j-1;
                System.out.print(odd);
            }
            System.out.println( );
        }
    }
}
