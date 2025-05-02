package HashMap;

import org.w3c.dom.Node;

import java.util.HashMap;
import java.util.LinkedList;

public class HashMap_Implemention {
    static class MyHashmap<K,V> {
        public static final int Default_Capacity = 4;
        public static final float Default_Load_Factor = 0.75f;

        private class Node {
            K key;
            V value;

            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n;
        private LinkedList<Node>[]buckets;
        public MyHashmap(){
            initBuckets(Default_Capacity);

        }
        public void rehash(){
            LinkedList<Node>[] oldBuckets = buckets;
            initBuckets( oldBuckets.length*2);
            n = 0;
            for (var buckets: oldBuckets){
                for (var node :buckets){
                    put(node.key, node.value);
                }

            }

        }


        private void initBuckets (int N){// n - capacity /size of buckets array
            buckets = new LinkedList[N];
            for (int  i= 0;i<buckets.length;i++){
                buckets[i] = new LinkedList<>();
            }

        }
        private int HashFunc(K key){
            int hc = key.hashCode();
            return (Math.abs(hc)) % buckets.length;
        }
        ///  Traverce the ll and looks for a node with key, if found it return its's index otherwise it return null
        ///
        private int searchbucket(LinkedList<Node> ll, K key) {
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key==key) {
                    return i; // Found the key
                }
            }
            return -1; // Key not found
        }


        public int size(){
            return n;
        }

        public void put(K key ,V value ){  // insert and update
        int bi = HashFunc(key);
        LinkedList<Node> currBucket = buckets[bi];
        int ei = searchbucket(currBucket,key);
        if (ei==-1){ //key doesn't exist , we have to insert a new node.
            Node node = new Node(key,value);
            currBucket.add(node);
            n++;
        }else {
            Node currNode = currBucket.get(ei);
            currNode.value = value;
        }

        }

        public V get (K key){
            int bi = HashFunc(key);
            LinkedList<Node> currbucket = buckets[bi];
            int ei = searchbucket(currbucket,key);
            if (ei != -1){
            Node currNode = currbucket.get(ei);
            return currNode.value;
            }
            return null;


        }

        public V remove(K  key){
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchbucket(currBucket,key);{
                if (ei != -1){ // key exist.
                Node currNode = currBucket.get(ei);
                V val = currNode.value;
                currBucket.remove(ei);
                n--;
                return val;
                }

            }
            return null;
        }

    }

    public static void main(String[] args) {
        MyHashmap<String,Integer>map = new MyHashmap<>();
        System.out.println("Testing");
        map.put("a",1);
        map.put("b",2);
        map.put("c",4);
        map.put("x",44);
        map.put("y",46);
        System.out.println(map.size());
        map.put("c",30);
        System.out.println("Testing Size" + map.size());
        System.out.println(map.get("x"));
        System.out.println(map.get("y"));


    }

}
