package GFG_160_SERIES;
/*https://www.geeksforgeeks.org/batch/gfg-160-problems/track/string-gfg-160/problem/add-binary-strings3805
* Q-Add Binary Strings
* Given two binary strings s1 and s2 consisting of only 0s and 1s. Find the resultant string after adding the two Binary Strings.
* Note: The input strings may contain leading zeros but the output string should not have any leading zeros.
* Input: s1 = "1101", s2 = "111"
* Output: 10100
* Explanation:
*    1101
*   + 111
*   10100
 */

public class GFG_15_Add_Binary_Strings {
    private static String addbinary(String s1,String s2){
        int i = s1.length()-1;
        int j = s2.length()-1;
        StringBuilder ans = new StringBuilder();
        int carry =0;
        while (i>=0 || j>=0){
            int count =0;
            if (i>=0 && s1.charAt(i)=='1')count++;
            if (j>=0 && s2.charAt(i)=='1')count++;
            int sum = count + carry;
            if (sum==0){
                ans.append('0');
                carry=0;
            }
            else if (sum==1){
                ans.append('1');
                carry=0;
            }
            else if (sum==2){
                ans.append('0');
                carry=1;
            }
            else if (sum==3){
                ans.append('1');
                carry=1;
            }
            i--;
            j--;
        }
        if (carry ==1){
           ans.append('1');
        }
        return ans.reverse().toString();
    }

    public static void main(String[] args) {
        String str[][] = {{"1101","111"},{"100","000"},{"010","00"},{"111","1111"}};
        for (String []s:str){
            String result = addbinary(s[0],s[0]);
            System.out.printf("%s + %s = %s\n", s[0], s[1], result);
        }
    }
}
