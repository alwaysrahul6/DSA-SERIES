package ARRAYS;
/*https://www.geeksforgeeks.org/problems/check-if-two-arrays-are-equal-or-not3847/1?page=2&category=Arrays&sortBy=submissions
Q-Given two arrays a[] and b[] of equal size, the task is to find whether the elements in the arrays are equal.
Two arrays are said to be equal if both contain the same set of elements, arrangements (or permutations) of elements may be different though.
Example- Input: a[] = [1, 2, 5, 4, 0], b[] = [2, 4, 5, 0, 1]
Output: true
Explanation: Both the array can be rearranged to [0,1,2,4,5]
* * */
import java.util.HashMap;

public class Check_Array_equal {
    public static boolean checkEqual(int[] a, int[] b) {
        // Check if arrays have the same length
        if (a.length != b.length) {
            return false;
        }
        // using a HashMap to store frequency of elements.
        HashMap<Integer, Integer> hm = new HashMap<>();
        // incrementing frequencies of elements present in first array in HashMap.
        for (int num : a) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        for (int num : b) {
            if (hm.containsKey(num)) {
                hm.put(num, hm.get(num) - 1);
            } else {
                return false;
            }
        }
        for (int count : hm.values()) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 5, 4, 0};
        int arr1[] = {2, 4, 5, 0, 1};
        System.out.println(checkEqual(arr,arr1));
    }
}
