package GFG_160_SERIES;
/*      * Design a data structure that works like a LRU Cache. Here cap denotes the capacity of the cache and Q denotes the number of queries. Query can be of two types:

            PUT x y: sets the value of the key x with value y
        GET x: gets the value of key x if present else returns -1.
        The LRUCache class has two methods get() and put() which are defined as follows.
        
        get(key): returns the value of the key if it already exists in the cache otherwise returns -1.
        put(key, value): if the key is already present, update its value. If not present, add the key-value pair to the cache. If the cache reaches its capacity it should remove the least recently used item before inserting the new item.
        In the constructor of the class the capacity of the cache should be initialized.
        Examples:
        
            Input: cap = 2, Q = 2, Queries = [["PUT", 1, 2], ["GET", 1]]
            Output: [2]
            Explanation: Cache Size = 2
            ["PUT", 1, 2] will insert the key-value pair (1, 2) in the cache,
            ["GET", 1] will print the value corresponding to Key 1, ie 2.*/
import java.util.HashMap;
import java.util.Map;

public class GFG_73_LRU_Cache {
    // Java program to implement LRU Least Recently Used)

    static class Node {
        int key;
        int value;
        Node next;
        Node prev;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
            this.next = null;
            this.prev = null;
        }
    }

    static class LRUCache {
        private int capacity;
        private Map<Integer, Node> cacheMap;
        private Node head;
        private Node tail;

        // Constructor to initialize the cache with a given
        // capacity
        LRUCache(int capacity) {
            this.capacity = capacity;
            this.cacheMap = new HashMap<>();
            this.head = new Node(-1, -1);
            this.tail = new Node(-1, -1);
            this.head.next = this.tail;
            this.tail.prev = this.head;
        }

        // Function to get the value for a given key
        int get(int key) {
            if (!cacheMap.containsKey(key)) {
                return -1;
            }

            Node node = cacheMap.get(key);
            remove(node);
            add(node);
            return node.value;
        }

        // Function to put a key-value pair into the cache
        void put(int key, int value) {
            if (cacheMap.containsKey(key)) {
                Node oldNode = cacheMap.get(key);
                remove(oldNode);
            }

            Node node = new Node(key, value);
            cacheMap.put(key, node);
            add(node);

            if (cacheMap.size() > capacity) {
                Node nodeToDelete = tail.prev;
                remove(nodeToDelete);
                cacheMap.remove(nodeToDelete.key);
            }
        }

        // Add a node right after the head (most recently used
        // position)
        private void add(Node node) {
            Node nextNode = head.next;
            head.next = node;
            node.prev = head;
            node.next = nextNode;
            nextNode.prev = node;
        }

        // Remove a node from the list
        private void remove(Node node) {
            Node prevNode = node.prev;
            Node nextNode = node.next;
            prevNode.next = nextNode;
            nextNode.prev = prevNode;
        }
    }


    public class Main {
        public static void main(String[] args) {
            LRUCache cache = new LRUCache(2);

            cache.put(1, 1);
            cache.put(2, 2);
            System.out.println(cache.get(1));
            cache.put(3, 3);
            System.out.println(cache.get(2));
            cache.put(4, 4);
            System.out.println(cache.get(1));
            System.out.println(cache.get(3));
            System.out.println(cache.get(4));
        }
    }
}
