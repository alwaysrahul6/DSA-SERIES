package GRAPH;
/*
 * https://www.geeksforgeeks.org/problems/clone-graph/1
 *
 * #. Clone an Undirected Graph
 *
 * Q. Given a connected undirected graph represented by adjacency list, adjList[][] with n nodes, having a distinct label from 0 to n-1, where each adj[i] represents the list of vertices connected to vertex i.
 *    Create a clone of the graph, where each node in the graph contains an integer val and an array (neighbors) of nodes, containing nodes that are adjacent to the current node.
 *     class Node {
 *          val: integer
 *          neighbors: List[Node]
 *      }
 *     Your task is to complete the function cloneGraph( ) which takes a starting node of the graph as input and returns the copy of the given node as a reference to the cloned graph.
 *     Note: If you return a correct copy of the given graph, then the driver code will print true; and if an incorrect copy is generated or when you return the original node, the driver code will print false.
 *
 * Ex. Input: n = 4, 
 *            adjList[][] = [[1, 2], 
 *                           [0, 2], 
 *                           [0, 1, 3], 
 *                           [2]]
 *     Output: true
 *     Explanation: 

 * */
import java.util.*;

public class GFG_15_Clone_an_Undirected_Graph {

    public static void main(String[] args) {

        // Create a sample graph:
        //  1 -- 2
        //  |    |
        //  4 -- 3

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        //Connected Node For Undirected Graph
         node1.neighbors.add(node2);
         node1.neighbors.add(node4);

         node2.neighbors.add(node1);
         node2.neighbors.add(node3);

         node3.neighbors.add(node2);
         node3.neighbors.add(node4);

         node4.neighbors.add(node1);
         node4.neighbors.add(node3);

        System.out.println(cloneGraph(node1));



    }

    static class Node {
        int val;
        ArrayList<Node> neighbors;

        public Node() {
            val = 0;
            neighbors = new ArrayList<>();
        }

        public Node(int val) {
            this.val = val;
            neighbors = new ArrayList<>();
        }

        public Node(int val, ArrayList<Node> neighbors) {
            this.val = val;
            this.neighbors = neighbors;
        }
    }

    static Node cloneGraph(Node node) {
        if (node == null) return node;

        Node cloneNode = new Node(node.val);

        HashMap<Node, Node> map = new HashMap<>();

        map.put(node, cloneNode);

        dfsNode(node, cloneNode, map);
        return cloneNode;
    }

    private static void dfsNode(Node node, Node cloneNode, HashMap<Node, Node> map) {

        for (Node n : node.neighbors) {
            if (!map.containsKey(n)) {
                Node clone = new Node(n.val);
                map.put(n, clone);
                cloneNode.neighbors.add(clone);
                dfsNode(n, clone, map);
            } else {
                cloneNode.neighbors.add(map.get(n));
            }
        }
    }
    // Using BFS

    static Node bfs(Node node) {

        if (node == null) return node;

        HashMap<Node, Node> map = new HashMap<>();
        Node cloneNode = new Node(node.val);
        map.put(node, cloneNode);

        Queue<Node> nodeQueue = new LinkedList<>();
        nodeQueue.add(node);

        bfsNode(nodeQueue, map);
        return cloneNode;
    }

    private static void bfsNode(Queue<Node> nodeQueue, HashMap<Node, Node> map) {
        while (!nodeQueue.isEmpty()) {
            Node node = nodeQueue.poll();
            Node cloneNode = map.get(node);
            for (Node n : node.neighbors) {
                if (!map.containsKey(n)) {
                    Node clone = new Node(n.val);
                    map.put(n, clone);
                    cloneNode.neighbors.add(clone);
                    nodeQueue.add(n);
                } else {
                    cloneNode.neighbors.add(map.get(n));
                }

            }
        }
    }
}
