package Pattern;

import java.util.Scanner;

public class Loope_Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = 1;
        for (int i = 0 ;i<n ; i++){
            if (n!=0){
                p*=n;
            }
        }
        System.out.println(p);
    }
}
