package GFG_160_SERIES;
/*      * https://www.geeksforgeeks.org/batch/gfg-160-problems/track/recursion-and-backtracking-gfg-160/problem/powx-n
*       * Implement Pow
        * Implement the function power(b, e), which calculates b raised to the power of e (i.e. be).
        *   Examples:
        *   Input: b = 3.00000, e = 5
        *   Output: 243.00000*/
import java.util.Scanner;

public class GFG_76_Implement_Pow {

    /// Recursive Approach
    static double power(double b, int e){
        if (e == 0) return 1;
        return power(b, e - 1) * b;
    }

    /// Iterative Fast Power (Exponentiation by squaring)
    static double pow(double b, int e){
        int m = e;
        e = Math.abs(e);
        double ans = 1;
        while (e > 0){
            if (e % 2 == 1){
                ans *= b;
                e = e - 1;
            } else {
                b *= b;
                e /= 2;
            }
        }
        if (m < 0) ans = 1 / ans;
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter base (double): ");
        double b = sc.nextDouble();

        System.out.print("Enter exponent (integer): ");
        int e = sc.nextInt();

        // Output result
        System.out.println("Result: " + pow(b, e));

        sc.close();
    }
}
