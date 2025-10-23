package GFG_POTD;

import java.util.*;

/*
 * https://www.geeksforgeeks.org/problems/k-closest-points-to-origin--172242/1
 *
 * #. K Closest Points to Origin
 *
 *   Q. Given an integer k and an array of points points[][], where each point is represented as points[i] = [xi, yi] on the X-Y plane. Return the k closest points to the origin (0, 0).
 *      The distance between two points on the X-Y plane is the Euclidean distance, defined as.
 *      distance = sqrt( (x2 - x1)2 + (y2 - y1)2 )
 *      Note: You can return the k closest points in any order, the driver code will print them in sorted order.
 *      Test Cases are generated such that there will be a unique ans.
 *
 * Examples:

*       Input: k = 2, points[] = [[1, 3], [-2, 2], [5, 8], [0, 1]]
*       Output: [[-2, 2], [0, 1]]
*       Explanation: The Euclidean distances from the origin are:
*       Point (1, 3) = sqrt(10)
*       Point (-2, 2) = sqrt(8)
*       Point (5, 8) = sqrt(89)
*       Point (0, 1) = sqrt(1)
*       The two closest points to the origin are [-2, 2] and [0, 1].
*
*
 * */
public class GFG_POTD_19_K_Closest_Points_to_Origin {

    /// Driver Code

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Element");
        String s[] = scanner.nextLine().split(" ");
        int n = s.length;
        int [][]points = new int[n][2];
        for (int i = 0; i < n; i++ ){
            points[i][0] = scanner.nextInt();
            points[i][1] = scanner.nextInt();
        }

        System.out.println("Enter K");
        int k = scanner.nextInt();

        ArrayList<ArrayList<Integer>> list = kClosest(points , k);

        for (ArrayList <Integer> p : list){
            System.out.println(p);
        }
    }

//    Solutions

    public static ArrayList<ArrayList<Integer>> kClosest(int[][] points, int k) {
        // code here
        int n = points.length;
        Comparator<int[]> comp = (a,b) -> Integer.compare(b[0] , a[0]);
        PriorityQueue<int[]> pq = new PriorityQueue<>(comp);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 0; i < n; i++){
            int p1 = points[i][0];
            int p2 = points[i][1];
            int ans = (p1 * p1) + (p2 * p2);
            pq.add(new int[]{ans , p1 , p2});
            if (pq.size() > k){
                pq.poll();
            }
        }

        while (!pq.isEmpty()){
            int []queue = pq.poll();
            ArrayList<Integer> tem = new ArrayList<>();
            tem.add(queue[1]);
            tem.add(queue[2]);
            list.add(tem);
        }
        return list;
    }
}
