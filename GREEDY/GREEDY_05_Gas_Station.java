package GREEDY;
/* https://www.geeksforgeeks.org/problems/circular-tour-1587115620/1
 * [Gas Station]
 *
 * Q. There are some gas stations along a circular route.
 *     You are given two integer arrays gas[] denoted as the amount of gas present at each station and cost[]
 *     denoted as the cost of travelling to the next station. You have a car with an unlimited gas tank.
 *     You begin the journey with an empty tank from one of the gas stations.
 *     Return the index of the starting gas station if it's possible to travel around the
 *     circuit without running out of gas at any station in a clockwise direction. If there is no such starting station exists, return -1.
 *
 *    Ex.
 *       Input: gas[] = [1, 2, 3, 4, 5], cost[] = [3, 4, 5, 1, 2]
 *       Output: 3
 *    Explanation: It is possible to travel around the circuit from station at index 3. Amount of gas at station 3 is (0 + 4) = 4.
 *    Travel to station 4. Available gas = 4 – 1 + 5 = 8.
 *    Travel to station 0. Available gas = 8 – 2 + 1 = 7.
 *    Travel to station 1. Available gas= 7 – 3 + 2 = 6.
 *    Travel to station 2. Available gas = 6 – 4 + 3 = 5.
 *    Travel to station 3. The cost is 5. The gas is just enough to travel back to station 3.
 *    Note: If a solution exists, it is guaranteed to be unique.
 *  */

import java.util.Scanner;

public class GREEDY_05_Gas_Station {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Gas");
        String[] s = scanner.nextLine().split(" ");

        int n = s.length;
        int gas[] = new int[n];
        for (int i = 0; i < n; i++) {
            gas[i] = Integer.parseInt(s[i]);
        }

        System.out.println("Enter Cost: ");

        String[] s2 = scanner.nextLine().split(" ");

        int m = s2.length;

        int cost[] = new int[m];
        for (int i = 0; i < m; i++) {
            cost[i] = Integer.parseInt(s2[i]);
        }
        System.out.println(startStation(gas, cost));
    }

    public static int startStation(int[] gas, int[] cost) {
        int n = gas.length;

        int totalGas = 0, totalCost = 0;
        int start = 0, currGas = 0;

        for (int i = 0; i < n; i++) {
            totalCost += cost[i];
            totalGas += gas[i];
            currGas+= gas[i] - cost[i];

            if (currGas < 0) {
                start = i + 1;
                currGas = 0;
            }
        }
        return (totalGas < totalCost) ? -1 : start;
    }
}
