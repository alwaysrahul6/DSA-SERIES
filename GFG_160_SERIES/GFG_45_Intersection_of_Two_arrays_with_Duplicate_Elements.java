package GFG_160_SERIES;

/* *      https://www.geeksforgeeks.org/batch/gfg-160-problems/track/hashing-gfg-160/problem/intersection-of-two-arrays-with-duplicate-elements
   *      Intersection of Two arrays with Duplicate Elements.
   *     Q. Given two integer arrays a[] and b[], you have to find the intersection of the two arrays. Intersection of two arrays is said to be elements that are common in both arrays.
   *        The intersection should not have duplicate elements and the result should contain items in any order.
   *      Examples:
   *      Input: a[] = [1, 2, 1, 3, 1], b[] = [3, 1, 3, 4, 1]
   *      Output: [1, 3]
   *      Explanation: 1 and 3 are the only common elements and we need to print only one occurrence of common elements.

 * */

import java.util.*;

public class GFG_45_Intersection_of_Two_arrays_with_Duplicate_Elements {
    /// Solution
      
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Element array 1:");
        String []s  = scanner.nextLine().split(" ");
        int n = s.length;
        int arr1[] = new int[n];
        for (int  i= 0;i<n;i++){
            arr1[i] = Integer.parseInt(s[i]);
        }
        String[] d  = scanner.nextLine().split(" ");
        System.out.println("Enter Element array 2:");
        int m = d.length;
        int arr2[] = new int[m];
        for (int  i= 0;i<m;i++){
            arr2[i] = Integer.parseInt(d[i]);
        }
        System.out.println(intersectionWithDuplicates(arr1,arr2));
    }
    
    
    ///  Approach 1
    public static ArrayList<Integer>intersectionWithDuplicates(int[] a, int[] b) {
        int n  = a.length;
        int m = b.length;
        Set<Integer>set = new HashSet<>();
        for (int k : a) {
            set.add(k);
        }
        ArrayList<Integer>result = new ArrayList<>();
        for (int j : b) {
            if (set.contains(j)) {
                result.add(j);
                set.remove(j);

            }
        }
        return result;
}
/// Approach 2
    public static ArrayList<Integer>intersectionWithDuplicates1(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        Set<Integer>result = new HashSet<>();
        int n = a.length;
        int m = b.length;
        int i = 0, j = 0;
        while (i < n &&  j < m){
            if (a[i]==b[j]){
                result.add(a[i]);
                i++;
                j++;
            }else if (a[i]>b[j])j++;
            else i++;
        }

        return new ArrayList<>(result);
    }

    
}
