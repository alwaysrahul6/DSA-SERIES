package ARRAYS;/*
 *  Q. Given an array of integers arr[] representing non-negative integers, 
       arrange them so that after concatenating all of them in order, it results in the largest possible number.
       Since the result may be very large, return it as a string.
 *  Examples:
 *  Input: arr[] = [3, 30, 34, 5, 9]
 *  Output: 9534330
 *  Explanation: Given numbers are [3, 30, 34, 5, 9], the arrangement [9, 5, 34, 3, 30] gives the largest value.
 *
 *
 * */
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class Form_the_Largest_Number {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Element :");
        String[]s = scanner.nextLine().split(" ");
        int n = s.length;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(s[i]);
        }
    }

    /*Solutions*/

    public String findLargest(int[] arr) {
        int n = arr.length;
        String []temp = new String[n];
        for (int i = 0; i < n; i++){
            temp[i] = Integer.toString(arr[i]);
        }

        Arrays.sort(temp, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String first  = a + b;
                String second = b + a;
                return second.compareTo(first);
            }
        });

        if (temp[0].equals("0"))return "0";
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < n; i++){
            s.append(temp[i]);
        }
        return s.toString();
    }

}
