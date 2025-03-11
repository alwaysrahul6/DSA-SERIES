package ARRAYS;
/*https://www.geeksforgeeks.org/problems/search-an-element-in-an-array-1587115621/1?page=2&category=Arrays,Strings&sortBy=submissions
*Q- Array Search
* Given an array, arr of n integers, and an integer element x, find whether element x is present in the array.
  Return the index of the first occurrence of x in the array, or -1 if it doesn't exist.
Examples:
Input: arr[] = [1, 2, 3, 4], x = 3
Output: 2
Explanation: There is one test case with array as [1, 2, 3 4] and element to be searched as 3.
* Since 3 is present at index 2, the output is 2.
 */
public class Array_Search {
    static int search(int arr[],int n){
        for (int i =0;i< arr.length;i++){
            if (arr[i]==n){
                return i;
            }
        }
        return -1;
    
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int n = 3;
        System.out.println(search(arr,n));
    }
}
