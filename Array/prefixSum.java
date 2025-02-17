package ARRAYS;
import java.util.Scanner;

public class prefixSum {
    static int[] prefixsum(int arr[]){
        int n = arr.length;

        for (int i=1;i<n;i++){
            arr[i] = arr[i-1] + arr[i];
        }
        return arr;
    }

    public static void printArray(int []arr){
        for (int i =1;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter" + n + " Element");
        for (int i = 1; i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Input Array");
        printArray(arr);
        int[] pref= prefixsum(arr);
        printArray(pref);
        System.out.println("Enter Number of Quires:");
        int q = sc.nextInt();
        while(q-->0){
            System.out.println("Enter range");
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans = pref[r] - pref[l-1];
            System.out.println(ans);
        }

    }
}
