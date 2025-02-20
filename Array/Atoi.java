package STRINGS;
/*
Given a string s, the objective is to convert it into integer format without utilizing any built-in functions. Refer the below steps to know about atoi() function.

Cases for atoi() conversion:

Skip any leading whitespaces.
Check for a sign (‘+’ or ‘-‘), default to positive if no sign is present.
Read the integer by ignoring leading zeros until a non-digit character is encountered or end of the string is reached. If no digits are present, return 0.
If the integer is greater than 231 – 1, then return 231 – 1 and if the integer is smaller than -231, then return -231.
Examples:

Input: s = "-123"
Output: -123
Explanation: It is possible to convert -123 into an integer so we returned in the form of an integer
 */
public class Atoi {
    public static int myAtoi(String s) {
        int n =  s.length();
        long ans =0;
        int i;
        for(i=0;i<n;i++){
            if(s.charAt(i) != ' ') break;
        }
        s = s.substring(i);
        boolean flag = false;
        if(s.charAt(0) == '-'){
            flag = true;
            s = s.substring(1);
            n = s.length();
        }
        for(i =0 ;i<n;i++){
            if(!Character.isDigit(s.charAt(i))){
                break;
            }
            int temp = s.charAt(i) - '0';
            ans = ans *10+ temp;
            if(ans >2147483647){
                ans = flag ? 2147483648L : 2147483647;
                break;
            }
        }

        return flag ? (int)ans * -1 : (int)ans;
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("21474836460"));
    }
}
