package PATTERN_NEW;
/*      This Pattern Is Square Pattern
*       Example:
*       n = 5
*       output:
*               *****
*               *****
*               *****
*               *****
*               *****
* */
public class Pattern_01_Square {
   public static void square(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        square(n);
    }
}
