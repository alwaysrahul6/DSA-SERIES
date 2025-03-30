package BINARY_SEARCH;

import com.sun.source.tree.BreakTree;

import java.util.Scanner;

public class conditon_CheckBinary {
    static int solve(int arr[],int k){
        int n = arr.length;
        if (n==0)return -1;
        if (n ==1)return (arr[0] == k ? 0: -1) ;
        int i =0;
        int j = n-1;
//        boolean isDecending = arr[0]>arr[1];
        if (!(arr[0]>arr[1])){
            while (i<=j){
                int mid = i+(j-i)/2;
                if (arr[mid] == k) {
                    return mid;
                }
                else if (k<arr[mid]){
                    j = mid-1;
                }
                else
                    i = mid+1;
            }
        }else
             while (i<=j){
            int mid = i+(j-i)/2;
            if (k == arr[mid]){
                return mid;
            }
            else if (k<=arr[mid]){
                 i= mid+1;
            }else
                j = mid-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println("Enter Element");
        int []arr = new int[n];
        for (int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Element That You Are Find:");
        int p = sc.nextInt();
        System.out.println(solve(arr,p));

    }
}
