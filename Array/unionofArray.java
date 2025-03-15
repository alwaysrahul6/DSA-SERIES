package ARRAYS;
/*
* https://www.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1?page=2&category=Arrays&sortBy=submissions
* Q-Given two sorted arrays a[] and b[], where each array may contain duplicate elements , the task is to return the elements in the union of the two arrays in sorted order.
Union of two arrays can be defined as the set containing distinct common elements that are present in either of the arrays.
* Examples:
Input: a[] = [1, 2, 3, 4, 5], b[] = [1, 2, 3, 6, 7]
Output: 1 2 3 4 5 6 7
Explanation: Distinct elements including both the arrays are: 1 2 3 4 5 6 7.*/

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Union_of_2_Sorted_with_Duplicates {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        Set<Integer>set = new TreeSet<>();
        int n = Math.max(a.length,b.length);
        for (int i = 0;i<n;i++ ){
           if (i<a.length)set.add(a[i]);
           if (i<b.length)set.add(b[i]);
        }
        return new ArrayList<>(set);

    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int b[] = {1, 2, 3, 6, 7};
        System.out.println(findUnion(a,b));
    }
}
