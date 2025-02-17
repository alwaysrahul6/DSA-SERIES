package Pattern;

import java.util.Scanner;

public class opposite_trainglepyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Size ");
        int n =sc.nextInt();
        int nsp = 0;
        int nst = n;
        for (int i = 1;i<=n;i++){
            for (int j=1;j<=nsp;j++){
                System.out.print(""+"");
            }
            for (int j=1;j<=nst;j++){
                System.out.print((char) (64+j));
            }
            nsp++;
            nst--;
            System.out.println();
        }
    }
}
