package GRAPH;/*
 * https://www.geeksforgeeks.org/problems/alien-dictionary/1
 *
 * #. Alien Dictionary
 *
 * Q.   A new alien language uses the English alphabet, but the order of letters is unknown. You are given a list of words[] from the
 *      alien language’s dictionary, where the words are claimed to be sorted lexicographically according to the language’s rules.
 *      Your task is to determine the correct order of letters in this alien language based on the given words. If the order is valid,
 *      return a string containing the unique letters in lexicographically increasing order as per the new language's rules. If there are multiple valid orders, return any one of them.
 *      However, if the given arrangement of words is inconsistent with any possible letter ordering, return an empty string ("").
 *      A string a is lexicographically smaller than a string b if, at the first position where they differ, the character in a appears earlier in the alien language than the corresponding character in b.
 *      If all characters in the shorter word match the beginning of the longer word, the shorter word is considered smaller.
 *      Note: Your implementation will be tested using a driver code. It will print true if your returned order correctly follows the alien language’s lexicographic rules; otherwise, it will print false.
 *     Examples:
 *     Input: words[] = ["baa", "abcd", "abca", "cab", "cad"]
 *            Output: true
 *            Explanation: A possible corrct order of letters in the alien dictionary is "bdac".
 *            The pair "baa" and "abcd" suggests 'b' appears before 'a' in the alien dictionary.
 *            The pair "abcd" and "abca" suggests 'd' appears before 'a' in the alien dictionary.
 *            The pair "abca" and "cab" suggests 'a' appears before 'c' in the alien dictionary.
 *            The pair "cab" and "cad" suggests 'b' appears before 'd' in the alien dictionary.
 *            So, 'b' → 'd' → 'a' → 'c' is a valid ordering.
 * */

import java.util.*;

public class GFG_16_Alien_Dictionary {

    public static void main(String[] args) {
        String []words = {"baa", "abcd", "abca", "cab", "cad"};
        
        System.out.println("Allien Dictionary " + findOrder(words));
    }

    public static String findOrder(String[] words) {
        ///  For Unique Character Persent in words Like "["baa", "abcd", "abca", "cab", "cad"]" Unique : [b,a,c,d]
        Set<Character> uniqueCharac = new HashSet<>();
        for (String word : words) {
            for (char w : word.toCharArray()) uniqueCharac.add(w);
        }


        // Store Character To Idx && Idx To Character
        HashMap<Character, Integer> CharToIdx = new HashMap<>();
        HashMap<Integer, Character> IdxtoChar = new HashMap<>();


        // All Unique Character Map Through Integer like  "a -> 0, b -> 1" or "0 -> a , 1 -> b"
        int idx = 0;
        for (char c : uniqueCharac) {
            CharToIdx.put(c, idx);
            IdxtoChar.put(idx, c);
            idx++;
        }

        /* Size Of Unique Character  */
        int k = uniqueCharac.size();

        /// Adjacency List Store the Node and Neighbour of Node
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            adj.add(new ArrayList<>());
        }

        // String Matching
        for (int i = 0; i < words.length - 1; i++) {
            String a = words[i];
            String b = words[i + 1];
            int len = Math.min(a.length(), b.length());

            for (int j = 0; j < len; j++) {
                if (a.charAt(j) != b.charAt(j)) {
                    int u = CharToIdx.get(a.charAt(j));
                    int v = CharToIdx.get(b.charAt(j));
                    adj.get(u).add(v);
                    break;
                }
            }
        }

        /// Using Kahns Algorithim

        int[] indegree = new int[k];
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < k; i++) {
            for (int j : adj.get(i)) {
                indegree[j]++;
            }
        }

        for (int i = 0; i < k; i++) {
            if (indegree[i] == 0) queue.add(i);
        }
        StringBuilder res = new StringBuilder();

        while (!queue.isEmpty()) {
            int node = queue.poll();
            res.append(IdxtoChar.get(node));

            for (int neigh : adj.get(node)) {
                indegree[neigh]--;
                if (indegree[neigh] == 0) queue.add(neigh);
            }
        }
        if (res.length() < k) return "";
        return res.toString();
    }
}
