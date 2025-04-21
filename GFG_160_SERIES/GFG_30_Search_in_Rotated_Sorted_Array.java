package GFG_160_SERIES;
/*
   * https://www.geeksforgeeks.org/batch/gfg-160-problems/track/searching-gfg-160/problem/search-in-a-rotated-array4618
   * Q- Search in Rotated Sorted Array.
   * Given a sorted and rotated array arr[] of distinct elements, the task is to find the index of a target key. Return -1 if the key is not found.
   * Examples :
   * Input: arr[] = [5, 6, 7, 8, 9, 10, 1, 2, 3], key = 3
   * Output: 8
   * Explanation: 3 is found at index 8.
 * */
public class GFG_30_Search_in_Rotated_Sorted_Array {
    public static void main(String[] args) {
        int arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int key = 3;
        System.out.println(search(arr,key));
    }

   static int search(int[] arr, int key) {
        // Complete this function
        int l = 0 , h = arr.length-1;
        while (l<=h) {
            int mid = l + (h - l) / 2;
            if (arr[mid] == key) return mid;
            if (arr[l] <= arr[mid]){
                if (arr[l] <= key && key < arr[mid]) {
                    h = mid - 1;
                } else
                    l = mid + 1;
            }else
                if (arr[mid] < key && key <= arr[h]){
                    l = mid+1;
                }else
                    h = mid -1;
       }
       return -1;
    }
}
