package STRINGS;
import java.util.*;

public class pallindrome_string {
    public static void main(String[] args) {
 /*       String str = "abcdcba";
        StringBuilder gtr = new StringBuilder(str);
        gtr.reverse();
        String s = gtr +"";
        if (str.equals(s)){
            System.out.println("Yes This Is Pallindrome");
        }
        else{
            System.out.println("No This is Not A Pallindrome");
        }
    }
    Two Pointer Approch to find A string is Pallindrome or not
*/
        String str = "abcdcba";
        int i =0;
        int j = str.length()-1;
        boolean flag = true; // true-> palindrome
        while (i<j){
            if (str.charAt(i)!= str.charAt(j)){
                flag= false;
                break;
            }
            i++;
            j--;
        }
        if (flag==true)
            System.out.println("palindrome");
        else System.out.println("Not Pallindrome");


    }
}
