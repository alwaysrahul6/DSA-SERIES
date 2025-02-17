package Pattern;

import java.util.Scanner;

public class Alphanumeric_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                if (i%2 ==0){
                    System.out.print(i);
                }else {
                    System.out.println((char)(i +64) + " " );
                }
            }
            System.out.println();
        }
    }
}
