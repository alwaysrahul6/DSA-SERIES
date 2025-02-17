package Pattern;

import java.util.Scanner;

public class Striver_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size: ");
        int n = sc.nextInt();
//        for (int i = 0;i<n;i++){
//            for (int j = 0; j<i; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        // 3rd pattern
//        for (int i = 1;i<=n;i++){
//            for (int j =1;j<=i;j++){
//                System.out.print(i + " ");
//            }
//            System.out.println( );
//        }
//        4th pattern
      for (int i =1;i<=n;i++){
          for (int j=i;j<=n;j++){
              System.out.print((char) (64+ j) + " ");
          }
          System.out.println( );
      }
    }
}
