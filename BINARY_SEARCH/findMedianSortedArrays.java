package BINARY_SEARCH;
/*  * https://www.geeksforgeeks.org/problems/median-of-2-sorted-arrays-of-different-sizes/1
    * Q-Median of 2 Sorted Arrays of Different Sizes
    * Given two sorted arrays a[] and b[], find and return the
    * median of the combined array after merging them into a single sorted array.
    * Examples:
    * Input: a[] = [-5, 3, 6, 12, 15], b[] = [-12, -10, -6, -3, 4, 10]
    * Output: 3
    * Explanation: The merged array is [-12, -10, -6, -5, -3, 3, 4, 6, 10, 12, 15]. So the median of the merged array is 3.
* */

public class MedianOfTwoSortedArray {
    public static double findMedianSortedArrays(int[] num1, int[] num2) {
        //make num1 as min lenght array
        //call same function and change the param
        //if num1 is greater and num2 is smaller
        //so because swapped the num1 and num2
        // and now num1 is always smaller and num2 is always greater
        if (num1.length > num2.length) {
            return findMedianSortedArrays(num2, num1);
        }
        //if num1 is smaller and numm2 is greater.
        int n1 = num1.length;
        int n2 = num2.length;
        int N = (n1 + n2) / 2;
        int start = 0;
        int end = n1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int mid2 = N - mid;
            int l1 = (mid == 0) ? Integer.MIN_VALUE : num1[mid - 1];
            int l2 = (mid2 == 0) ? Integer.MIN_VALUE : num2[mid2 - 1];
            int r1 = (mid == n1) ? Integer.MAX_VALUE : num1[mid];
            int r2 = (mid2 == n2) ? Integer.MAX_VALUE : num2[mid2];

            if (l1 <= r2 && l2 <= r1) {
                if ((n1 + n2) % 2 != 0) {
                    return Math.min(r1, r2);
                } else {
                    return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
                }
            } else if (l1 > r2) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return 0.0;
    }

    public static void main(String[] args) {

    }
}
