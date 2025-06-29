package GFG_160_SERIES;
/*      *   https://www.geeksforgeeks.org/batch/gfg-160-problems/track/stack-gfg-160/problem/parenthesis-checker2744
*       *   Parenthesis Checker
        *   Q.Given a string s, composed of different combinations of '(' , ')', '{', '}', '[', ']',
        *    verify the validity of the arrangement.
        *   An input string is valid if:
        *     1. Open brackets must be closed by the same type of brackets.
        *     2. Open brackets must be closed in the correct order.
        *   Examples :
        *   Input: s = "[{()}]"
        *   Output: true
        *   Explanation: All the brackets are well-formed.*/
import java.util.Stack;

public class GFG_99_Parenthesis_Checker {
    /// Driver Code

    public static void main(String[] args) {
        /// Sample inputs to test the Parenthesis Checker
        String[] testInputs = {
                "{[()]}",
                "((()))",
                "{[(])}",
                "()[{}()]",
                "((())",
                "][]["
        };

        /// Checking each input
        for (String input : testInputs) {
            boolean result = GFG_99_Parenthesis_Checker.isBalanced(input);
            System.out.println("Input: " + input + " --> Balanced? " + result);
        }
    }

    static boolean isBalanced(String s) {
        // code here
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (isOpening(ch)) {
                stack.push(ch);
            } else {
                if (stack.empty()) return false;
                else if (!isMatching(stack.peek(), ch)) {
                    return false;
                } else stack.pop();
            }
        }
        return stack.empty();
    }

    /// Ismatching or not

    private static boolean isMatching(char a, char b) {
        return (a == '{' && b == '}' ||
                a == '(' && b == ')' ||
                a == '[' && b == ']');
    }

    ///  isOpening

    private static boolean isOpening(char c) {
        return c == '(' ||
                c == '{' ||
                c == '[';
    }
}
