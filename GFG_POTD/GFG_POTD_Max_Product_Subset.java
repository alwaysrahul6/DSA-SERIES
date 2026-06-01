package GFG_POTD;
/*
 *  Max Product Subset
 * 
 *  Given an array arr[], find and return the maximum product possible with the subset of elements present in the array.
 *  Note:
 *  The maximum product can be of a single element also.
 *  Since the product can be large, return it modulo 109 + 7.
 *  Examples:
 *  Input: arr[] = [-1, 0, -2, 4, 3]
 *  Output: 24
 *  Explanation: Maximum product will be ( -1 * -2 * 4 * 3 ) = 24
 * */
import java.util.Arrays;
import java.util.Scanner;

public class GFG_POTD_Max_Product_Subset {
    static final int mod = 10000007;
    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);
        String s[]  = scanner.nextLine().split(" ");
        int n = s.length;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(s[i]);
        }

        System.out.println(findMaxProduct(arr));
        
        
    }
    public static int findMaxProduct(int[] arr) {
        // code here
        int n = arr.length;
        int negativecount = 0;
        int zeroCount = 0;
        if (n == 1)return arr[0];


        long p = 1;

        for (int j : arr) {
            if (j < 0) negativecount++;
            else if (j == 0) zeroCount++;
            else p =(p * j) % mod;
        }
        int negative[] = new int[negativecount];
        int idx = 0;

        for (int j : arr) {
            if (j < 0) negative[idx++] = j;
        }

        Arrays.sort(negative);
        if (negativecount % 2 == 0){
            for (int i : negative){
                p = (p * i) % mod;
            }
        }else {
            for (int i = 0; i < negativecount-1; i++){
                p =(p*negative[i]) % mod;
            }
        }

        if (negativecount == 1 && zeroCount == n-1 )return 0;

        return (int)p ;

    }
    
}
