package PATTERN_NEW;
/*      This Pattern is a forest pattern
*       Example
*       n = 5
*       Output is :
*           *
            **
            ***
            ****
            *****
*/
public class Pattern_02_Forest {
    public static void main(String[] args) {
        int n = 5;
        pattern10(n);

    }


    /// Pattern 2
    static void foreest(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    /*Pattern 3 : n = 4
     * Output : 1
     *          1 2
     *          1 2 3
     *          1 2 3 4
     *  */
    static void patten3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println(j);
            }
        }
    }

    /*  Pattern 4
     *   Example n = 4;*/


    static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    /* Pattern 5:
    * Example : n = 4
    * Output :1234
        123
        12
        1
*/

    static void pattern5(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= n - i - 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /* Pattern 7
     */

    static void pattern7(int n) {
        for (int i = 0; i < n; i++) {
            /// Space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            /// Pattern
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            /// Spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    /*  Pattern 8
     *  */
    static void pattern8(int n) {
        for (int i = 0; i < n; i++) {
            /// Space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            /// Pattern
            for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
                System.out.print("*");
            }
            /// Spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    /* Pattern 9
     * */

    static void pattern9(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            /// Pattern
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            /// Spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        for (int i = 0; i <= n; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            /// Pattern
            for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
                System.out.print("*");
            }
            /// Spaces
            for (int j = 0; j <i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    /*Pattern 10*/

    static void pattern10(int n){
        for (int i = 0 ;i <= 2*n -1;i++){
            int stars = i;
            if (i > n) stars = 2 * n -i;
            for (int j = 1;j<=stars; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
