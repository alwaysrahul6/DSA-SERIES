package GFG_POTD;
/*
 * Subarray Frequency Count Queries
 * 
 *  Q. Given an array arr[] of n integers and a 2D array queries[][] representing q queries, where each queries[i] consists of three integers: l, r, and x. For each query determine how many times the element x appears in the arr[] from index l to r (both inclusive).
 *     Return a list of integers where the i-th value represents the answer to the i-th query.
 *     Examples: 
 *     Input: arr[] = [1, 2, 1, 3, 1, 2, 3], queries[][] = [[0, 4, 1], [2, 5, 2], [1, 6, 3], [0, 6, 5]]
 *     Output: [3, 1, 2, 0]
 *     Explanation:
 *     query [0, 4, 1] -> Subarray = [1, 2, 1, 3, 1], 1 appears 3 times
 *     query [2, 5, 2] -> Subarray = [1, 3, 1, 2], 2 appears 1 time
 *     query [1, 6, 3] -> Subarray = [2, 1, 3, 1, 2, 3] 3 appears 2 times
 *     query [0, 6, 5] -> Subarray = [1, 2, 1, 3, 1, 2, 3],  5 appears 0 times
 * */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class GFG_POTD_Subarray_Frequency_Count_Queries {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Element :");
        String [] s = scanner.nextLine().split(" ");
        int n = s.length;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(s[i]);
        }
        System.out.println("Enter Quires :");
        int q = scanner.nextInt();
        int [][]quires = new int[q][3];
        for (int i = 0; i < q; i++){
            quires[i][0] = scanner.nextInt();
            quires[i][1] = scanner.nextInt();
            quires[i][2] = scanner.nextInt();
        }

        ArrayList<Integer> solutions = freqInRange(arr , quires);
        solutions.forEach(System.out::println);
    }

    /*Solutions */

    public static ArrayList<Integer> freqInRange(int[] arr, int[][] queries) {
        // code here
        int n = arr.length;
        int q = queries.length;
        int qR = queries[0].length;
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer , List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++){
            if (!map.containsKey(arr[i])){
                map.put(arr[i] , new ArrayList<>());
            }
            map.get(arr[i]).add(i);
        }

        for ( int [] query : queries){
            int left = query[0];
            int right = query[1];
            int target = query[2];

            if (!map.containsKey(target)){
                ans.add(0);
                continue;
            }
            ArrayList<Integer> temp = (ArrayList<Integer>) map.get(target);

            int lowerLeft = loweBound(temp , left);
            int upperRight = upperRight(temp , right);

            ans.add(upperRight - lowerLeft);
        }
        return ans;

    }

    private static int loweBound(ArrayList<Integer> temp, int target) {
        int i = 0;
        int j = temp.size()-1;
        int ans = temp.size();
        while (i <= j){
            int mid = i + (j - i)/2;
           if (temp.get(mid) >=target){
               ans = mid;
               j = mid - 1;
           }else i = mid + 1;
        }
        return ans;
    }

    private static int upperRight(ArrayList<Integer> temp, int target) {
        int i = 0;
        int j = temp.size() - 1;
        int ans = temp.size();
        while (i <= j){
            int mid = i + (j - i) / 2;
            if (temp.get(mid) <= target){
                i = mid + 1;
            }else {
                ans = mid;
                j = mid - 1;
            }
        }
        return ans;
    }
}
