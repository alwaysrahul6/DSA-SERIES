package Pattern;

import java.util.Scanner;

public class StarPyramid {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Size:");
        int n =sc.nextInt();
        int nsp = n-1;
        for (int i=1;i<=n; i++){
            for (int j =1;j<n+1-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
