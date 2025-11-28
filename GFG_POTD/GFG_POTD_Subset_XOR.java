package GFG_POTD;
/*
 * Subset XOR
 *
 * Q. Given an positive integer n, find a subset of numbers from 1 to n (inclusive),
 *    where each number can be used at most once, such that:
 *    The XOR of all elements in the subset is exactly n.
 *    The size of the subset is as large as possible.
 *    If multiple such subsets exist, choose the lexicographically smallest one.
 *    Lexicographical Order : A subset A[] is lexicographically smaller than subset B[] if at the first index where they differ, A[i] < B[i] (based on character ASCII/Unicode values).
 *    If all elements match but one subset ends earlier, the shorter subset is considered smaller.
 *
 *   Examples:
 *   Input: n = 4
 *   Output: [1, 2, 3, 4]
 *   Explanation: We choose all the elements from 1 to 4. Its xor value is equal to n.
 *   This is the maximum possible size of the subset.
 * */
import java.util.ArrayList;

public class GFG_POTD_Subset_XOR {
    public static void main(String[] args) {
        int n = 4;
        ArrayList<Integer> ans = subsetXOR(n);
        System.out.println(ans);
    }

    public static ArrayList<Integer> subsetXOR(int n) {
        ArrayList<Integer> result = new ArrayList<>();
        int totalXOR = 0;
        for (int i = 1; i <= n; i++) {
            totalXOR ^= i;
        }
        if (totalXOR == n) {

            for (int i = 1; i <= n; i++) {
                result.add(i);
            }
        } else {

            int removeElement = totalXOR ^ n;
            for (int i = 1; i <= n; i++) {
                if (i != removeElement) {
                    result.add(i);
                }
            }
        }

        return result;
    }
}
