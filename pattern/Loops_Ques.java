package Pattern;

import java.util.Scanner;

public class Loops_Ques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int sum = 1;
        while(n!=0){
            int last_digit = n%10;
            sum  = sum * last_digit;
            n/=10;
        }
        System.out.println(sum);
    }
}
