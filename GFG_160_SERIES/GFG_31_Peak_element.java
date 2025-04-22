package GFG_160_SERIES;

import java.util.Scanner;

/*  * https://www.geeksforgeeks.org/batch/gfg-160-problems/track/searching-gfg-160/problem/peak-element
    * Q-Peak element
    * Given an array arr[] where no two adjacent elements are same, find the index of a peak element. An element is considered to be a peak if it is greater than its adjacent elements (if they exist). If there are multiple peak elements, return index of any one of them. The output will be "true" if the index returned by your function is correct; otherwise, it will be "false".
    * Note: Consider the element before the first element and the element after the last element to be negative infinity.
    * Examples :
    * Input: arr = [1, 2, 4, 5, 7, 8, 3]
    * Output: true
    * Explanation: arr[5] = 8 is a peak element because arr[4] < arr[5] > arr[6].
* */
/// Driver Code 
public class GFG_31_Peak_element {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Size:");
        int n = scanner.nextInt();
        System.out.println("Enter Element:");
        int arr[] = new int[n];
       for (int  i=0;i<n;i++){
           arr[i] = scanner.nextInt();
       }
        int peakIndex = peakElement(arr);
        System.out.println(peakIndex != -1 ? "True" : "False");
    }
    /// Solution
    public static int peakElement(int[] arr) {
        // code here
        int n = arr.length;
        if (n ==0)return -1;
        if (n==1)return 0;
        if (arr[0]>arr[1])return 0;
        if (arr[n-1]>arr[n-2])return n-1;
        int low = 1 , high = n-2;
        while (low<=high){
            int mid = low +(high - low)/2;
            if (arr[mid]>arr[mid-1]&& arr[mid]>arr[mid+1])
                return mid;
            else if (arr[mid]>arr[mid-1]) {
                low  = mid+1;
            }else
                high = mid -1;
        }
        return -1;
    }

}
