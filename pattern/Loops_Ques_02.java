package Pattern;

import java.util.Scanner;

public class Loops_Ques_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        int original_num = n;
        while (n!=0){
            int LastDigit = n%10;
            rev *=10;
            rev += LastDigit;

            n/=10;
        }

       int add = original_num + rev;
        System.out.println("sum pf orignal num and rev num " + add);
        System.out.println("reverced number " + rev);
        System.out.println("original number" + original_num );
    }
}
