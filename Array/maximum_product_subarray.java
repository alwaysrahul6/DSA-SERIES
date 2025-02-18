 /* https://www.geeksforgeeks.org/problems/maximum-product-subarray3604/1
 *
 * # Maximum Product SubArray
 *
 *   Q. Given an array arr[] that contains positive and negative integers (may contain 0 as well).
 *      Find the maximum product that we can get in a sub-array of arr.
 *
 *      Note: It is guaranteed that the output fits in a 32-bit integer.
 *    Ex.
 *      Input : arr[] = [-2, 6, -3, -10, 0, 2]
 *      Output: 180
 *      Explanation: The sub-array with maximum product is {6, -3, -10} with product = 6*(-3)*(-10) = 180.
 */

public class maximum_product_subarray {
    public static int maximum(int arr[]){
        int n  = arr.length;
       int pref = 1;
       int suffi=1;
       int result = Integer.MIN_VALUE;
       for (int  i=0; i<n; i++){
           if (pref == 0) pref =1;
           if (suffi == 0) suffi =1;
           pref*=arr[i];
           suffi*=arr[n-i-1];
           result  = Math.max(pref,suffi);
       }
        return result;
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

        System.out.println(maxProduct(arr));
