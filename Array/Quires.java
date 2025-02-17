package ARRAYS;

import java.util.Scanner;

public class Quires {
    public static int[] queries(int arr[]) {
        int n = arr.length;
        int freq[] = new int[100005];
        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }
        return freq;
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
        int freq[] = queries(arr);
        System.out.println("Enter number of quires");
        int q = sc.nextInt();
        while (q > 0){
            System.out.println("Enter Number To be searcher");
            int x= sc.nextInt();
            if (freq[x] > 0){
                System.out.println("yes");
            }else{
                System.out.println("No");
            }
            q--;
        }
    }
}
