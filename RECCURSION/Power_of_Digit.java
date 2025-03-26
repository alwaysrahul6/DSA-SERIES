package RECCURSION;
import java.util.Scanner;
public class Power_of_Digit {
    static int pow(int p,int q){
        if (q == 0) return 1; //base case
        return pow(p,q-1)*p; //p^q-1 * p = p^q reccursive work and self work
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = sc.nextInt();
        System.out.println("Enter power");
        int power = sc.nextInt();
        System.out.println(pow(number,power));
    }
}
