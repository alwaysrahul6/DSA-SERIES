package RECCURSION;
/*Given a number n. Find the sum of natural numbers till n but with alternate signs.
That means if n = 5 then you have to return 1-2+3-4+5 = 3 as your answer.
Constraints • 0<=n<=le6
* */
import java.util.Scanner;

public class Sumof_N {
    static int sum1(int n){
        if (n==0)return 0;
        if (n%2 ==0){
            return sum1(n-1)-n;
        }else
            return sum1(n-1)+n;
    }
    /*Sum of natural number
    * Example-  n = 5
    * Output = 15
    * Explantion - 1+2+3+4+5 = 15
    * */
    static int sum(int n){
        if (n ==0)return 0;
        return  sum(n-1)+ n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N:");
        int n = sc.nextInt();
       // System.out.println(sum(n));
        System.out.println(sum1(n));
    }
}
