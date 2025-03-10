package ARRAYS;
/*Q-SubSet
* Given two arrays a[] and b[], your task is to determine whether b[] is a subset of a[].
Examples:
Input: a[] = [11, 7, 1, 13, 21, 3, 7, 3], b[] = [11, 3, 7, 1, 7]
Output: true
Explanation: b[] is a subset of a[]*/
import java.util.HashMap;

public class subset {
    static boolean set(int a[],int b[]){
            int n = a.length;
            int m = b.length;
            // Create a hash map to store the frequencies of elements in array a
            HashMap<Integer, Integer> hm = new HashMap<>();

            // Increment the frequency of each element in array a
            for (int i = 0; i < n; i++) {
                hm.put(a[i], hm.getOrDefault(a[i], 0) + 1);
            }

            // Check if each element in array b is present in array a and decrement its
            // frequency
            for (int i = 0; i < m; i++) {
                if (hm.containsKey(b[i])) {
                    // If frequency becomes 1, remove the element from the hash map
                    if (hm.get(b[i]) == 1) {
                        hm.remove(b[i]);
                    } else {
                        // Decrement the frequency of the element
                        hm.put(b[i], hm.get(b[i]) - 1);
                    }
                } else {
                    // If an element in array b is not present in array a, return "No"
                    return false;
                }
            }

            // If all elements in array b are present in array a, return "Yes"
            return true;
    }

    public static void main(String[] args) {
        int arr1[] = {11,7,1,13,21,3,7,3};
        int arr2[] = {11,3,7,1,7};
        System.out.println(set(arr1,arr2));
    }
}
