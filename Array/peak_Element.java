package ARRAYS;
/*
Given an array arr[] where no two adjacent elements are same, find the index of a peak element.
An element is considered to be a peak if it is greater than its adjacent elements (if they exist).
If there are multiple peak elements, return index of any one of them.
The output will be "true" if the index returned by your function is correct; otherwise, it will be "false".
Note: Consider the element before the first element and the element after the last element to be negative infinity.
Examples :
Input: arr = [1, 2, 4, 5, 7, 8, 3]
Output: true
Explanation: arr[5] = 8 is a peak element because arr[4] < arr[5] > arr[6].
* */
import java.util.ArrayList;

public class peak_Element {
    static int peak(int[] arr){
         int n = arr.length;
        int start = 1;
        int end = arr.length-2;
        int mid;
        if ((n==1)||(arr[0]>arr[1]))return 0;
        if (arr[n-1] > arr[n-2])return n-1;
        while (start<=end){
            mid =  start+ (end - start)/2;
//           Peak Element
            if (arr[mid]>arr[mid-1] && arr[mid] >arr[mid+1]){
                return mid;
                //Right  Side Move
            } else if (arr[mid]>arr[mid-1]) {
                start = mid+1;
                //Left Side Move
            }else end = mid-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3};
        System.out.println(peak(arr));
    }
}
