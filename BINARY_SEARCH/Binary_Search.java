package BINARY_SEARCH;

import java.util.Scanner;

public class Binary_Search {
    static int binary(int arr[],int ele){
        int n = arr.length;
        int i =0,j = n-1,ans= -1; 
        while (i<j){
            int mid = i+(j-i)/2;
//            System.out.println(mid);
            if (ele == arr[mid]){
                 ans= mid;
                 j = mid -1;
            } else if (ele<=arr[mid]) {
                j = mid-1;
            }else
                i =  mid+1;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        int n = sc.nextInt();
        System.out.println("Enter Element");
        int []arr = new int[n];
        for (int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(binary(arr,3));
    }
}
