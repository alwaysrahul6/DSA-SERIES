package ARRAYS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Repeted_value {
    public static ArrayList<Integer> repeated(int arr[]){
        int n = arr.length;
        for (int i =0;i < n;i++){
            for (int j=i+1;j < n;j++){
                if (arr[i] == arr[j]){
//                    System.out.println( arr[i]);
                }
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        ans.addAll(List.of(1, 2, 3));
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " Element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(repeated(arr));
    }
}
