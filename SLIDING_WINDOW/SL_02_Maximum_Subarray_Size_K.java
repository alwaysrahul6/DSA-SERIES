package SLIDING_WINDOW;
 /*
  * Sliding Window Maximum
  * 
  *  Q. You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. 
  *     Each time the sliding window moves right by one position.
  *     Return the max sliding window.
  *     Example 1:
  *     Input: nums = [1,3,-1,-3,5,3,6,7], k = 
  *     Output: [3,3,5,5,6,7]
  *     Explanation: 
  *     Window position                Max
  *     ---------------               -----
  *    [1  3  -1] -3  5  3  6  7       3
  *     1 [3  -1  -3] 5  3  6  7       3
  *     1  3 [-1  -3  5] 3  6  7       5
  *     1  3  -1 [-3  5  3] 6  7       5
  *     1  3  -1  -3 [5  3  6] 7       6
  *     1  3  -1  -3  5 [3  6  7]      7
  *    Example 2:
  *    Input: nums = [1], k = 1
  *    Output: [1]
  *    Constraints:
  *    1 <= nums.length <= 105
  *   -104 <= nums[i] <= 104
  *   1 <= k <= nums.length
  * */
import java.util.*;

public class SL_02_Maximum_Subarray_Size_K {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s[] = scanner.nextLine().split(" ");
        int n = s.length;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(s[i]);
        }
        System.out.println("Enter K :");
        int k = scanner.nextInt();
        System.out.println(Arrays.toString(priorityQueueImpl(arr , k)));

    }



    // using PriorityQueue
    static int[]  priorityQueueImpl(int arr[] , int k){
        int n = arr.length;

        int ans[] = new int[n - k + 1];
        HashMap<Integer, Integer> deleted = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparingInt(a -> -a));

        for (int r = 0; r < n; r++) {
            pq.offer(arr[r]);

            cleanUp(pq, deleted);

            if (r >= k - 1) {
                int l = r - k + 1;
                ans[l] = pq.peek();

                deleted.put(arr[l], deleted.getOrDefault(arr[l], 0) + 1);
            }

        }

        return ans;
    }

    private static void cleanUp(PriorityQueue<Integer> pq, HashMap<Integer, Integer> deleted) {
        while (!pq.isEmpty() && deleted.containsKey(pq.peek())) {
            int polled = pq.poll();
            deleted.put(polled, deleted.get(polled) - 1);

            if (deleted.get(polled) == 0) {
                deleted.remove(polled);
            }
        }
    }



    // using TreeMap
    static int[]  treeMapImpl(int arr[] , int k){
        int n = arr.length;
        int ans[] = new int[n - k + 1];
        TreeMap<Integer, Integer> map = new TreeMap<>(Comparator.comparingInt(a -> -a));

        for (int r = 0; r < n; r++) {
            offer(map, arr[r]);

            if (r >= k - 1) {
                int l = r - k + 1;
                ans[l] = map.firstKey();

                remove(map, arr[l]);
            }
        }

        return ans;
    }

    private static void offer(TreeMap<Integer, Integer> map, int ele) {
        map.put(ele, map.getOrDefault(ele, 0) + 1);
    }

    private static void remove(TreeMap<Integer, Integer> map, int ele) {
        map.put(ele, map.get(ele) - 1);
        if (map.get(ele) == 0) map.remove(ele);
    }



    // using Deque
    static int[]  max(int arr[] , int k){
        int n = arr.length;

        int ans[] = new int[n - k + 1];
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        for (int r = 0; r < n; r++) {

            // put
            while (!dq.isEmpty() && dq.peekLast() < arr[r]) {
                dq.pollLast();
            }
            dq.addLast(arr[r]);

            // remove
            if (r >= k - 1) {
                int l = r - k + 1;
                ans[l] = dq.peekFirst();

                if (dq.peekFirst() == arr[l]) {
                    dq.pollFirst();
                }
            }
        }
        return ans;
    }

}
