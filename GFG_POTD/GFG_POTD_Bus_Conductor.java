package GFG_POTD;
/* https://www.geeksforgeeks.org/problems/bus-conductor--170647/1
 * #. Bus Conductor
 * 
 *  Q. You are conductor of a bus. You are given two arrays chairs[] and passengers[] of equal length, where chairs[i] is the position of the ith chair and passengers[j] is the position of the jth passenger. You may perform the following move any number of times:
 *      Increase or decrease the position of the ith passenger by 1 (i.e., moving the ith passenger from position x to x+1 or x-1
 *      Return the minimum number of moves required to move each passenger to get a chair.
 *      Note: Although multiple chairs can occupy the same position, each passenger must be assigned to exactly one unique chair.
 * 
 * Examples:
 *       Input: chairs[] = [3, 1, 5], passengers[] = [2, 7, 4]
 *       Output: 4
 *       Explanation: The passengers are moved as follows:
 *       - The first passenger is moved from position 2 to position 1 using 1 move.
 *       - The second passenger is moved from position 7 to position 5 using 2 moves.
 *       - The third passenger is moved from position 4 to position 3 using 1 move.
 *        In total, 1 + 2 + 1 = 4 moves were used.
 * */
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class GFG_POTD_Bus_Conductor {

    // Driver Code

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Element: ");

        String s[] = scanner.nextLine().split(" ");

        System.out.println("Enter Passenger Array :");
        String s2[] = scanner.nextLine().split(" ");
        int n = s.length;
        int m = s2.length;
        int chairs[] = new int[n];
        int passengers[] = new int[m];
        for (int i = 0; i < n; i++){
            chairs[i] = Integer.parseInt(s[i]);
        }

        for (int i = 0; i < n; i++){
            passengers[i] = Integer.parseInt(s2[i]);
        }
        System.out.println(findMoves(chairs,passengers));

    }

    //Solutions

    public static int findMoves(int[] chairs, int[] passengers) {
        // code here
        int n = chairs.length;
        Arrays.sort(chairs);
        Arrays.sort(passengers);

        int ans = 0;

        for (int i = 0; i < n; i++){
            ans+= Math.abs(chairs[i] - passengers[i]);
        }
        return ans;
    }
}
