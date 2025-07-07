package GFG_160_SERIES;
/*      *    Given an encoded string s, the task is to decode it. The encoding rule is :
        *    k[encodedString], where the encodedString inside the square brackets is being repeated exactly k times.
        *    Note that k is guaranteed to be a positive integer, and encodedString contains only lowercase english alphabets.
        *    Note: The test cases are generated so that the length of the output string will never exceed 105 .
        *    Examples:
        *    Input: s = "1[b]"
        *    Output: "b"
        *    Explanation: "b" is present only one time.*/
import java.util.Stack;

public class GFG_107_Decode_the_string {
    /// Driver Code
    public static void main(String[] args) {
        String s = "3[b2[ca]]";
        System.out.println(decodeString(s));
    }
    /// Solution

    static String decodeString(String s) {
        // code here
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ']') {
                st.push(s.charAt(i));
            } else {
                StringBuilder word = new StringBuilder();
                while (!st.isEmpty() && st.peek() != '[') {
                    word.append(st.pop());
                }
                word.reverse();

                st.pop();

                StringBuilder k = new StringBuilder();
                while (!st.isEmpty() && Character.isDigit(st.peek())) {
                    k.append(st.pop());
                }
                k.reverse();
                int num = Integer.parseInt(k.toString());

                StringBuilder repeated = new StringBuilder();
                for (int j = 0; j < num; j++) {
                    repeated.append(word);
                }

                for (char c : repeated.toString().toCharArray()) st.push(c);
            }
        }
        StringBuilder ans = new StringBuilder();
        while (!st.isEmpty()) {
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }
}
