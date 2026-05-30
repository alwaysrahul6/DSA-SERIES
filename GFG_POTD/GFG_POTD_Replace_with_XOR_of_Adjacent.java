package GFG_POTD;
import java.util.Arrays;
import java.util.Scanner;

/*
 * #. Replace with XOR of Adjacent
 *
 * Q. Given an array arr[] of n integers, replace each element with the XOR of its adjacent elements.
 *    For the first element, update arr[0] = arr[0] ^ arr[1].
 *    For the last element, update arr[n-1] = arr[n-2] ^ arr[n-1].
 *    For all other elements, update arr[i] = arr[i-1] ^ arr[i+1].
 *    Note: Here, a ^ b represents the XOR operation between a and b.
 *    Examples :
 *    Input : arr[] = [2, 1, 4, 7]
 *    Output : [3, 6, 6, 3]
 *    Explanation:
 *    At index 0, arr[0] ^ arr[1] = 2 ^ 1 = 3
 *    At index 1, arr[0] ^ arr[2] = 2 ^ 4 = 6
 *    At index 2, arr[1] ^ arr[3] = 1 ^ 7 = 6
 *    At index 3, arr[2] ^ arr[3] = 4 ^ 7 = 3
 *    Thus, the updated array becomes [3, 6, 6, 3].
 * */
public class GFG_POTD_Replace_with_XOR_of_Adjacent {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Element : ");
        String s[] = scanner.nextLine().split(" ");
        int n = s.length;
        int []arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(s[i]);
        }
        replaceElements(arr);
        System.out.println(Arrays.toString(arr));
    }
 /* Solution 1 Without Using Any  Space */
    public static void replaceElements(int[] arr) {
        // code here
        int n = arr.length;
        int prev = arr[0];
        arr[0] = prev ^ arr[1];
        for (int i = 1; i < n-1; i++){
            int val = prev ^ arr[i+1];
            prev = arr[i];
            arr[i] = val;
        }

        arr[n-1] = prev ^ arr[n-1];

    }

    /* Solution 2 Using Temp Space */

    public void replaceElements2(int []arr){
        int n = arr.length;
        int []temp = new int[n];
        for (int i = 0; i < n; i++){
            if (i == 0){
                temp[i] = arr[0] ^ arr[1];
            } else if (i == n-1 ) {
                temp[n-1] = arr[n-1] ^ arr[n-2];
            }else temp[i] = arr[i-1] ^ arr[i+1];
        }
        System.arraycopy(temp, 0, arr, 0, n);
    }

}
