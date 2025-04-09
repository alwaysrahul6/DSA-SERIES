package GFG;
/* https://www.geeksforgeeks.org/problems/longest-prefix-suffix2527/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card
* Q-Longest Prefix Suffix
* Given a string of characters s, find the length of the longest prefix which is also a suffix.
* Note: Prefix and suffix can be overlapping but they should not be equal to the entire string.
* Examples :
* Input: s = "abab"
* Output: 2
* Explanation: "ab" is the longest prefix and suffix.
 */
public class GFG_Longest_Prefix_Suffix {
    private static int solve(String s){
        int n = s.length();
        int lps[] = new int[n];
        int i =1;
        int pre =0;
        lps[0] = 0;
        while (i<n){
            if (s.charAt(i)==s.charAt(pre)){
                lps[i] = pre+1;
                i++;
                pre++;
            }else
                if (pre==0){
                    lps[i] =0;
                    i++;
                }else {
                    pre = lps[pre-1];
                }
        }
        return lps[i-1];
    }

    public static void main(String[] args) {
        String str = "abab";
        System.out.println(solve(str));

    }
}
