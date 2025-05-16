package GFG_160_SERIES;
/*   *   https://www.geeksforgeeks.org/batch/gfg-160-problems/track/two-pointer-technique-gfg-160/problem/count-possible-triangles-1587115620
*    *   Given an integer array arr[]. Find the number of triangles that can be formed with three different array elements as lengths of three sides of the triangle. 
     *   A triangle with three given sides is only possible if sum of any two sides is always greater than the third side.
     *   Examples:
     *   Input: arr[] = [4, 6, 3, 7]
     *   Output: 3
     *   Explanation: There are three triangles possible [3, 4, 6], [4, 6, 7] and [3, 6, 7]. Note that [3, 4, 7] is not a possible triangle.  */
import java.util.Arrays;
import java.util.Scanner;

public class GFG_55_Count_the_number_of_possible_triangles {
    /// Driver Code
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Element:");
        String s[] = scanner.nextLine().split(" ");
        int n = s.length;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        System.out.println(countTriangles(arr));
    }
    /// Solution
    static int countTriangles(int arr[]) {
        // code here
        Arrays.sort(arr);
        int n = arr.length;
        int count  = 0;
      for (int i  = n-1 ;i>=2;i--){
          int right = 0, left = i-1;
          while (left>=right){
              int sum = arr[left] + arr[right];
              if (sum>arr[i]){
                  count+=left - right;
                  left--;
              }
              else right++;
          }
      }
        return count;
    }
}
