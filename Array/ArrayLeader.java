package ARRAYS;
/*  
https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1?page=1&category=Arrays&difficulty=Basic,Easy&sortBy=submissions
You are given an array arr of positive integers.        
Your task is to find all the leaders in the array.
 An element is considered a leader if it is greater than or equal
 to all elements to its right. The rightmost element is always a leader.
Examples:
Input: arr = [16, 17, 4, 3, 5, 2]
Output: [17, 5, 2]
Explanation: Note that there is nothing greater on the right side of 17, 5 and, 2.
*/
import java.util.ArrayList;
import java.util.Collections;

public class ArrayLeader {
    static ArrayList<Integer>leader(int arr[]){
        int n = arr.length;
        int maxright = arr[n-1];
        ArrayList<Integer>sum = new ArrayList<>();
        sum.add(maxright);

        for (int i =n-2;i>=0;i--){
            if (arr[i]>=maxright){
                maxright = arr[i];
                sum.add(maxright);
            }

        }
        Collections.reverse(sum);
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = { 16, 17, 4, 3, 5, 2 };
        ArrayList<Integer> result = leader(arr);
        for (int res : result) {
            System.out.print(res + "  ");
        }
        System.out.println();
    }
    }

