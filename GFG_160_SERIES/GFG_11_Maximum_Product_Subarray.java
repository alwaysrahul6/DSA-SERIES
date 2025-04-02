package GFG_160_SERIES;
/* https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/maximum-product-subarray3604
* Q-Maximum Product Subarray
* Given an array arr[] that contains positive and negative integers (may contain 0 as well).
* Find the maximum product that we can get in a subarray of arr[].
* Examples
* Input: arr[] = [-2, 6, -3, -10, 0, 2]
* Output: 180
* Explanation: The subarray with maximum product is {6, -3, -10} with product = 6 * (-3) * (-10) = 180.
 */
import java.util.Scanner;

public class GFG_11_Maximum_Product_Subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size:");
        int n = sc.nextInt();
        System.out.println("Enter Element:");
        int [] arr = new int[n];
        for (int i=0;i<=n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(solve(arr));
    }

    private static int solve(int arr[]) {
        int n = arr.length;
        int pre = 1, suff = 1,ans =Integer.MIN_VALUE;
        for (int i =0;i<n;i++){
           if (pre ==0)pre =1;
           if (suff ==0)suff =1;
           pre*=arr[i];
           suff*=arr[n-1-i];
           ans = Math.max(ans,Math.max(pre,suff));
        }
        return ans;
    }
}
