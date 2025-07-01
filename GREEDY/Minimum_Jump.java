package GREEDY;

import java.util.Scanner;

public class Minimum_Jump {
    static boolean solve(int arr[]){
        int n = arr.length;
        int maxindex= 0;
        for (int i =0;i<n;i++){
            if (i>maxindex)return false;
            maxindex = Math.max(maxindex,arr[i] + i);
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Size:");
        int n = scanner.nextInt();
        System.out.println("Enter Element");
        int arr[] = new int[n];
        for (int i =0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println(solve(arr));
    }
}
