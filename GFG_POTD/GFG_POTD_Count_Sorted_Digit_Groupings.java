package GFG_POTD;
 /*
  *  Count Sorted Digit Groupings
  *
  * Q. Given a string s consisting of digits, you can split it into contiguous substrings (sub-groups). 
  *    For example, the string "112" can be split as: ["1","1","2"], ["11","2"], ["1","12"], and ["112"].
  *    A grouping is considered valid if the sums of digits of the sub-groups form a non-decreasing sequence from left to right.
  *    Determine the total number of such valid groupings for the given string.
  * 
  *  Examples: 
  *  Input: s = "1119"
  *  Output: 7
  *  Explanation: 
  *  One valid grouping is ["1", "11", "9"].
  *  The sum of digits of the first sub-group ("1") is 1,
  *  for the second sub-group ("11"), it is 2,
  *  and for the third sub-group ("9"), it is 9.
  *  Since the sums are in non-decreasing order (1 ≤ 2 ≤ 9), this is a valid grouping.
  *  The other valid groupings are: 
  *  ["1", "119"], ["1", "1", "19"], ["1", "1", "1", "9"], ["11", "19"], ["111", "9"], and ["1119"].
  *  Thus, the total number of valid groupings is 7.
  * */
import java.util.Arrays;
import java.util.Scanner;

public class GFG_POTD_Count_Sorted_Digit_Groupings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Digit :");
        String s = scanner.nextLine();
        System.out.println(STR."The Total Valid Group is  : \{validGroups(s)}");
    }

    /*Solutions */
    public static int validGroups(String s) {
        // code here
        int n = s.length();
        int [][] dp = new int[n][999];
        for (int i[]  : dp){
            Arrays.fill(i , -1);
        }

        return solveGroups(0 ,  0 , s , n , dp);

    }

    private static int solveGroups(int idx, int prevSum, String s, int n, int[][] dp) {
        if (idx == n)return 1;
        if (dp[idx][prevSum] != -1) return dp[idx][prevSum];
        int count  = 0;
        int currSum = 0;
        for (int i = idx; i < n; i++){
            currSum+= s.charAt(i) - '0';

            if (currSum >= prevSum){
                count+= solveGroups(i + 1 , currSum , s , n , dp);
            }
        }
        return count;
    }

}
