package ARRAYS;
/*
https://www.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1
Given an array arr[] containing only 0s, 1s, and 2s. Sort the array in ascending order.
You need to solve this problem without utilizing the built-in sort function.
Examples:
Input: arr[] = [0, 1, 2, 0, 1, 2]
Output: [0, 0, 1, 1, 2, 2]
Explanation: 0s 1s and 2s are segregated into ascending order.
 */
public class sort_zeroes {
    public static void  zeroes(int arr[]){
        int n = arr.length;
        int ans[] = new int[n];
        int c1 =0 ,c2 =0, c3 =0;
        for (int i =0;i<n;i++){
            if (arr[i] == 0)
                c1 +=1;
            else if (arr[i] ==1)
                c2+=1;
            else
                c3+=1;
        }

       int c =0;
        for (int x=0; x < c1; x++){
            arr[c++] = 0;
        }
        for (int x =0;  x<c2; x++){
            arr[c++] = 1;
        }
        for (int x =0; x<c3; x++){
            arr[c++] = 2;
        }

    }

    public static void main(String[] args) {
        int arr[] = {0,0,2,1,0,2,0};
        int n = arr.length;
        zeroes(arr);
        for (int  i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
//        System.out.println(zeroes(arr));

        }

}
