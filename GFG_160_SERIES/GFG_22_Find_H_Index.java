package GFG_160_SERIES;

import java.util.Scanner;

/* https://www.geeksforgeeks.org/batch/gfg-160-problems/track/sorting-gfg-160/problem/find-h-index--165609
* Q- Find H-Index
* Given an integer array citations[], where citations[i] is the number of citations a researcher received for the ith paper. The task is to find the H-index.
* H-Index is the largest value such that the researcher has at least H papers that have been cited at least H times.
* Examples:
* Input: citations[] = [3, 0, 5, 3, 0]
* Output: 3
* Explanation: There are at least 3 papers (3, 5, 3) with at least 3 citations.
* */
//Solution
public class GFG_22_Find_H_Index {
    static int ciataion(int []arr){
        int n = arr.length;
        int [] freq = new int[n+1];
        for (int j : arr) {
            if (j >= n) {
                freq[n]++;
            } else freq[j]++;
        }
        int hindex = n;
        int num = freq[n];
        while (num<hindex){
            hindex--;
            num+=freq[hindex];
        }
        return hindex;
    }
//Driver Code
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Size:");
        int n = scanner.nextInt();
        System.out.println("Enter Element");
        int []arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println(ciataion(arr));
    }
}
