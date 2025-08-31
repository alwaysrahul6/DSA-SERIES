package TRIES;/*
 * https://www.geeksforgeeks.org/batch/gfg-160-problems/track/tries-gfg-160/problem/trie-insert-and-search0651
 *
 *   #.  Implement Trie
 *
 *  Q.  Implement Trie class and complete insert(), search() and isPrefix() function for the following queries :
 *      Type 1 : (1, word), calls insert(word) function and insert word in the Trie
 *      Type 2 : (2, word), calls search(word) function and check whether word exists in Trie or not.
 *      Type 3 : (3, word), calls isPrefix(word) function and check whether word exists as a prefix of any string in Trie or not.
 *
 *     Ex. Input: query[][] = [[1, "abcd"], [1, "abc"], [1, "bcd"], [2, "bc"], [3, "bc"], [2, "abc"]]
 *
 *     Output: [false, true, true]
 *     Explanation: string "bc" does not exist in the trie, "bc" exists as prefix of the word "bcd" in the trie, and "abc" also exists in the trie.
 *
 * */

public class Tries_Implemention {
    static class Node {
        Node[] links = new Node[26];
        boolean flag = false;

        boolean containsKey(char ch) {
            return links[ch - 'a'] != null;
        }

        void put(char ch, Node node) {
            links[ch - 'a'] = node;
        }

        Node get(char ch) {
            return links[ch - 'a'];
        }

        void setEnd() {
            flag = true;
        }

        boolean isEnd() {
            return flag;
        }


    }


    static class Trie {

        private static Node root;

        public Trie() {
            root = new Node();
        }

        // Insert a word into the Trie
        public void insert(String word) {
            Node node = root;
            for (int i = 0; i < word.length(); i++) {
                char ch = Character.toLowerCase(word.charAt(i));
                if (!node.containsKey(ch)) {
                    node.put(ch, new Node());
                }
                node = node.get(ch);
            }
            node.setEnd();
        }

        // Search for a word in the Trie
        public boolean search(String word) {
            Node node = root;

            for (int i = 0; i < word.length(); i++) {
                char ch = Character.toLowerCase(word.charAt(i));
                if (!node.containsKey(ch)) {
                    return false;
                }
               node  = node.get(ch);
            }
            return node.isEnd();
        }

        // Check if a prefix exists in the Trie
        public boolean isPrefix(String word) {
            Node node = root;

            for (int i = 0; i < word.length(); i++) {
                char ch = Character.toLowerCase(word.charAt(i));
                if (!node.containsKey(ch)) {
                    return false;
                }
                node = node.get(ch);
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Trie trie = new Trie();

        trie.insert("cat");
        trie.insert("RaHuL");
        System.out.println(trie.search("rahul"));
        System.out.println(trie.search("cat"));
        System.out.println(trie.search("apple"));
        System.out.println(trie.isPrefix("app"));

    }

}
