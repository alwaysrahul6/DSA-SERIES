package GFG_160_SERIES;/*
 * https://www.geeksforgeeks.org/problems/activity-selection-1587115620/1
 *
 * #Activity Selection.
 * 
 * Q.  You are given a set of activities, each with a start time and a finish time,
 *     represented by the arrays start[] and finish[], respectively. 
 *     A single person can perform only one activity at a time, meaning no two activities can overlap. 
 *     Your task is to determine the maximum number of activities that a person can complete in a day.
 * 
 * Ex. 
 *   Input: start[] = [1, 3, 0, 5, 8, 5], finish[] = [2, 4, 6, 7, 9, 9]
 *     Output: 4
 *   Explanation:
 *              A person can perform at most four activities. The maximum set of activities that can be executed is {0, 1, 3, 4}
 *  */


import java.util.ArrayList;
import java.util.Scanner;

public class GFG_134_Activity_Selection {

    public static class Pair{
        int s;
        int e;
        Pair(int s , int e){
            this.s = s;
            this.e = e;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Starting Time :");
        String [] s = scanner.nextLine().split(" ");
        int n = s.length;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(s[i]);
        }
        System.out.println("Enter Finshing Time: ");
        String s2[] = scanner.nextLine().split(" ");
        int m = s2.length;
        int f[] = new int[m];
        for (int i = 0; i < n; i++){
            f[i] = Integer.parseInt(s2[i]);
        }
        System.out.println("The Person can Perform At least :" + activitySelection(arr,f));

    }

    public static int activitySelection(int[] start, int[] finish) {
        // code here

        int n = start.length;

        ArrayList<Pair> list = new ArrayList<>();

        for (int i = 0; i <  n; i++){
            list.add(new Pair(start[i] , finish[i]));
        }
        list.sort((a,b) -> Integer.compare(a.e , b.e));

        int count  = 0;
        int last = 0;

        for (int i = 0; i < n; i++){
           Pair p = list.get(i);
           if (p.s > last){
               count++;
               last = p.e;
           }
        }
        return count;
    }
}
