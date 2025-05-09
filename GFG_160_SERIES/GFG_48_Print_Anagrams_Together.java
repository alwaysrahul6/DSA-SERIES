package GFG_160_SERIES;
/*      * https://www.geeksforgeeks.org/batch/gfg-160-problems/track/hashing-gfg-160/problem/print-anagrams-together
        * Print Anagrams Together
        * Q . Given an array of strings, return all groups of strings that are anagrams. The strings in each group must be arranged in the order of their appearance in the original array. Refer to the sample case for clarification.
        *    Examples:
        *    Input: arr[] = ["act", "god", "cat", "dog", "tac"]
        *    Output: [["act", "cat", "tac"], ["god", "dog"]]
        *    Explanation: There are 2 groups of anagrams "god", "dog" make group 1. "act", "cat", "tac" make group 2.
 * */
import java.util.*;
public class GFG_48_Print_Anagrams_Together {

    /// main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Words: ");
        String[] arr = sc.nextLine().split(" ");
        System.out.println(anagrams(arr));
    }
    /// Solution
    static ArrayList<ArrayList<String>> anagrams(String[] arr) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for (String s : arr){
            String code = hashCode(s);
            map.putIfAbsent(code, new ArrayList<>());
            map.get(code).add(s);
        }

        return new ArrayList<>(map.values());
    }
    private static String hashCode (String s){
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        return "#" + new String(ch);
    }
}
