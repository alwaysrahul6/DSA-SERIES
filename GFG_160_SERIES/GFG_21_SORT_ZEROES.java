package GFG_160_SERIES;
/*https://www.geeksforgeeks.org/batch/gfg-160-problems/track/sorting-gfg-160/problem/sort-an-array-of-0s-1s-and-2s4231
* Q-Sort 0s, 1s and 2s
* Given an array arr[] containing only 0s, 1s, and 2s. Sort the array in ascending order.
* You need to solve this problem without utilizing the built-in sort function.
* Examples:
* Input: arr[] = [0, 1, 2, 0, 1, 2]
* Output: [0, 0, 1, 1, 2, 2]
* Explanation: 0s 1s and 2s are segregated into ascending order. */
import java.util.Arrays;
import java.util.Scanner;

public class GFG_21_SORT_ZEROES {
    //Driver code
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Size");
        int n = scanner.nextInt();
        System.out.println("Enter Element");
        int []arr = new int[n];

        for (int i =0;i<n;i++){
            arr[i]= scanner.nextInt();
        }
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    //Solution
    //Swap File
    static  void swap(int []arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void sort(int arr[]) {
        int low = 0, mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 2) {
                swap(arr, mid, high);
                high--;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, low, mid);
                low++;
                mid++;
//            }
            }
        }
    }

}

