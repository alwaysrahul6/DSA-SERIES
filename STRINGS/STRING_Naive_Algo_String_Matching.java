package STRINGS;
/*  * Q. String Matching in Naive Algorithm.
    *  Example :
    *          Input : String Text  : abcdbdef.
    *                  String Pat : bdef
    *           Outpu: 4
* */
import java.util.Scanner;
///Driver Code
public class STRING_Naive_Algo_String_Matching {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Text:");
        String  text = scanner.nextLine();
        System.out.println("Enter Pattern:");
        String pat = scanner.nextLine();
        System.out.println(naiveSearch(text,pat));
    }
///Solution
    public static int naiveSearch(String text, String pattern) {
        int n = text.length(); // n = 15
        int m = pattern.length(); // m = 5
        for (int i = 0;i<=n-m;i++){
            int first  = i , second  = 0;
            while (second<m){
                if (text.charAt(first)!= pattern.charAt(second))break;
                else {
                    first++;
                    second++;
                }
            }
            if (second == m)return i;
        }
        return -1;
    }
}
