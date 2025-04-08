package GFG_160_SERIES;
/*Q-Non Repeating Character
* Given a string s consisting of lowercase English Letters. Return the first non-repeating character in s.
* If there is no non-repeating character, return '$'.
* Note: When you return '$' driver code will output -1.
* Examples:
* Input: s = "geeksforgeeks"
* Output: 'f'
* Explanation: In the given string, 'f' is the first character in the string which does not repeat.*/
import java.util.Arrays;
import java.util.HashMap;
public class GFG_17_NON_REPEATING {
    //Method 1 time complexity(nlogn)
    private static char solve(String s){
        int n = s.length();
        char a[] = s.toCharArray();
        Arrays.sort(a);
        for (int i =0;i< a.length;i+=2){
            if (a[i]!=a[i+1])return a[i];
        }
        return '$';
    }
//    method 2 using Hashmap time complexity O(n)
    private static char nonRepeatingChar(String str) {
            int n = str.length();
            HashMap<Character,Integer>map = new HashMap<>();
            for (int i =0;i<n;i++){
                map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
            }
            for (int i =0;i<n;i++){
                if (map.get(str.charAt(i))==1){
                    return str.charAt(i);
                }
            }
            return '$';
    }

    public static void main(String[] args) {
        String str = "geekforgeek";
//        System.out.println(solve(str));
        System.out.println(nonRepeatingChar(str));
    }
}
