package ARRAYS;

public class MovesAllZeroesInEnd {

    public static int []moveZeroes(int n ,int a[]){

        int j =-1;
        for (int i =0;i < n;i++){
            if (a[i] == 0){
                j = i;
                  break;
            }
        }
        if(j==-1)return  a;

        for (int i =j + 1; i < n; i++){
            if (a[i] != 0){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;

            }
        }
        return a;
    }
    static void move(int[]arr){

    }
//public static int[] moveZeros(int n, int []a) {
//    int j = -1;
//    //place the pointer j:
//    for (int i = 0; i < n; i++) {
//        if (a[i] == 0) {
//            j = i;
//
//        }
//    }
//
//    //no non-zero elements:
//    if (j == -1) return a;
//
//    //Move the pointers i and j
//    //and swap accordingly:
//    for (int i = j + 1; i < n; i++) {
//        if (a[i] != 0) {
//            //swap a[i] & a[j]:
//            int tmp = a[i];
//            a[i] = a[j];
//            a[j] = tmp;
//            j++;
//        }
//    }
//    return a;
//}

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int n = 10;
//        int[] ans = moveZeroes(n, arr);
        move(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
    }






//import java.util.*;
//
//public class tUf {

//
//    public static void main(String[] args) {
//        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
//        int n = 10;
//        int[] ans = moveZeros(n, arr);
//        for (int i = 0; i < n; i++) {
//            System.out.print(ans[i] + " ");
//        }
//        System.out.println("");
//    }
//}



