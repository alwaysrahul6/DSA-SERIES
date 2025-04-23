package GFG_160_SERIES;
/*  * https://www.geeksforgeeks.org/batch/gfg-160-problems/track/searching-gfg-160/problem/k-th-element-of-two-sorted-array1317
    * Q-Kth element of two Arrays.
    * Given two sorted arrays a[] and b[] and an element k, the task is to find the element that would be at the kth position of the combined sorted array.
    * Examples :
    * Input: a[] = [2, 3, 6, 7, 9], b[] = [1, 4, 8, 10], k = 5
    * Output: 6
    * Explanation: The final combined sorted array would be [1, 2, 3, 4, 6, 7, 8, 9, 10]. The 5th element of this array is 6.
 * */
import java.util.Scanner;

public class GFG_32_K_th_element_of_Two_Arrays {
    /// Driver Code 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Size of 1st array");
        int n1 = scanner.nextInt();
        System.out.println("Enter Size of 2nd Array");
        int n2 = scanner.nextInt();
        System.out.println("Enter Element in Array 1:");
        int []arr1 = new int[n1];
        System.out.println("Enter Element in Array 2:");
        int []arr2 = new int[n2];
        for (int i =0;i<n1;i++){
            arr1[i] = scanner.nextInt();
        }
        for (int i =0;i<n2;i++){
            arr2[i] = scanner.nextInt();
        }
        System.out.println("Enter Index Number That You Find:");
        int n = scanner.nextInt();
        System.out.println(kthElement(arr1,arr2,n));
    }
/// Solution
    public static long kthElement(int a[], int b[], int k) {
        // code here
        if (a.length>b.length){
            return kthElement(b,a,k);
        }
        int n1 = a.length;
        int n2 = b.length;
        int start = Math.max(0, k-n2);
        int end = Math.min(k,n1);
        while (start<=end){
            int mid = start + (end - start)/2;
            int mid2 = k - mid;
            int l1 = (mid == 0) ? Integer.MIN_VALUE : a[mid-1];
            int l2 = (mid2 == 0) ? Integer.MIN_VALUE : b[mid2-1];
            int r1 = (mid == n1) ? Integer.MAX_VALUE : a[mid];
            int r2 = (mid2 == n2) ? Integer.MAX_VALUE : b[mid2];
            if (l1 <= r2 && l2 <= r1){
                return Math.max(l1,l2);
            }else if (l1 > r2){
                end = mid-1;
            }else{
                start = mid + 1;
            }
        }
        return 0;
    }
    }

