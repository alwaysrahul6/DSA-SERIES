package ARRAYS;

import java.util.Scanner;

public class Next_Permution {
    static void reverse(int[]arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i++] = arr[j];
            arr[j--] = temp;
        }
    }

    static void NextPermution(int arr[]){
        int n = arr.length;
        int index;
       for (index = n-2;index>=0;index--){
            if (arr[index]<arr[index+1]){
                break;
            }
            }
        // If break point does not exist:
        if (index == -1){
            //reverce the whole array
            reverse(arr,0,n-1);
            return;
        }
        // Step 2: Find the next greater element
        //         and swap it with arr[ind]:

        for (int i =n-1;i>=0;i--){
            if (arr[i] > arr[index]){
                int temp = arr[i];
                arr[i]  = arr[index];
                arr[index] = temp;
                break;
            }
        }
        reverse(arr,index+1,n-1);
    }
  //DRIVER CODE

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Size: ");
        int n = sc.nextInt();

        int[]arr = new int[n];

        System.out.println("Elements: ");
        for (int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }

        NextPermution(arr);

        for (int i : arr) System.out.print(i + " ");
        System.out.println();
    }
}
