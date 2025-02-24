package STRINGS;
/*
Input: arr[] = [“geeksforgeeks”, “geeks”, “geek”, “geezer”]
Output: “gee”
Explanation: “gee” is the longest common prefix in all the given strings: “geeksforgeeks”, “geeks”, “geeks” and “geezer”.
1.arr ko sort karo
2.fir uske 1st index ko last index ke sath comapare karo
Given an array of strings arr[], the task is to return the longest common prefix among each and every strings present in the array. If there’s no prefix common in all the strings, return “”.
https://www.geeksforgeeks.org/longest-common-prefix-using-sorting/
 */
import java.util.Arrays;

public class longestCommonprefix {
    static String longest(String arr[]){
        int n = arr.length;
        String first = arr[0];
        String last = arr[arr.length-1];
        int minelement = Math.max(first.length(),last.length());
        int i=0;
        while ((i<minelement) && (first.charAt(i) == last.charAt(i))){
            i++;
        }
        return first.substring(0,i);
    }

    public static void main(String[] args) {
        String s1[] = {"geeksforgeeks", "geeks", "geek", "geezer"};
        System.out.println(longest(s1));}
}

