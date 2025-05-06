package GFG_160_SERIES;
/*    *   https://www.geeksforgeeks.org/batch/gfg-160-problems/track/hashing-gfg-160/problem/union-of-two-arrays3538
 *  Union of Arrays with Duplicates
 *   Q.  Given two arrays a[] and b[], the task is to find the number of elements in the union between these two arrays.
 *       The Union of the two arrays can be defined as the set containing distinct elements from both arrays.
 *       If there are repetitions, then only one element occurrence should be there in the union.
 *       Note: Elements of a[] and b[] are not necessarily distinct.
 *    Examples
 *    Input: a[] = [1, 2, 3, 4, 5], b[] = [1, 2, 3]
 *    Output: 5
 *    Explanation: Union set of both the arrays will be 1, 2, 3, 4 and 5. So count is 5.
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class GFG_46_Union_of_Arrays_with_Duplicates {
/// Driver Code
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Element A:");
        String s[] = scanner.nextLine().split(" ");
        int n = s.length;
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(s[i]);
        }
        System.out.println("Enter Element B:");
        String r[] = scanner.nextLine().split(" ");
        int m = r.length;
        int b[] = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = Integer.parseInt(r[i]);
        }
        System.out.println(findUnion(a,b));
    }
    /// Solution
    public static int findUnion(int a[], int b[]) {
        int n = a.length;
        int m = b.length;
        Set<Integer>result = new HashSet<>();
        for (int i = 0;i<Math.max(n,m);i++){
            if (i<n)result.add(a[i]);
            if (i<m)result.add(b[i]);
        }
        return result.size();
    }
}
