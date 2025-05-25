package GFG_160_SERIES;

/*
  ==================================================================================================
   🧮 GFG Practice Problem – Product Array Puzzle
   📌 Problem Link: https://www.geeksforgeeks.org/batch/gfg-160-problems/track/prefix-sum-gfg-160/problem/product-array-puzzle4525
  ==================================================================================================

   🧾 Description:
   Given an array `arr[]`, construct a product array `res[]` where each element `res[i]` is the product 
   of all elements in `arr[]` except `arr[i]`.

   ✅ Constraints:
   - All products lie within the 32-bit integer range.
   - Division is not allowed.
   - Time Complexity: O(n)
   - Space Complexity: O(n) or O(1) extra space (depending on approach)

   💡 Example:

     Input:  arr[] = [10, 3, 5, 6, 2]
     Output: res[] = [180, 600, 360, 300, 900]

     Explanation:
     - res[0] = 3 * 5 * 6 * 2 = 180
     - res[1] = 10 * 5 * 6 * 2 = 600
     - res[2] = 10 * 3 * 6 * 2 = 360
     - res[3] = 10 * 3 * 5 * 2 = 300
     - res[4] = 10 * 3 * 5 * 6 = 900

  ==================================================================================================
*/
import java.util.Arrays;
import java.util.Scanner;


public class GFG_63_Product_array_puzzle {
    /// ----------------------Driver Code-----------------------------------------------//
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Element:");
        String s[] = scanner.nextLine().split(" ");
        int n = s.length;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(s[i]);
        }
        System.out.println(Arrays.toString(solve(arr)));
    }
    ///-----------Brute Force------------------------------------------------------------//
    public static int[] productExceptSelf(int arr[]) {
        int n = arr.length;
        int ans [] = new int[n];
        for (int i =0;i<n;i++){
            int product = 0;
            for (int j = 0;j<n;j++){
                if (i!=j){
                    product*=arr[j];
                }
            }
            ans[i] = product;
        }
        return ans;
    }
    /// ----------------------Better Approach--------------------------------------------------------//
    static int[] product(int arr[]){
        int n = arr.length;
        int ans[] = new int[n];
        int pref[] = new int[n];
        pref[0] = 1;
        int [] suffi = new int[n];
        suffi[n-1] = 1;
        int product = 1;
        for (int i = 1; i < n; i++) {
            pref[i] = pref[i - 1] * arr[i-1];
        }
        for (int i = n-2; i >= 0; i--) {
            suffi[i] = suffi[i + 1] * arr[i + 1];
        }
        for (int i = 0; i < n; i++) {
            ans[i] = pref[i] * suffi[i];
        }
        return ans;
    }

    ///------Optimal Approach----------------------///
  private static int[] solve(int arr[]){
        int n = arr.length;
        int ans[] = new int[n];
        ans[0] = 1;
        for (int i = 1;i<n;i++){
            ans[i] = ans[i-1] * arr[i-1];
        }
        int suffix = 1;
        for (int i = n-2;i>=0;i--){
            suffix = suffix * arr[i+1];
            ans[i] *= suffix;
        }
        return ans;
    }
}
