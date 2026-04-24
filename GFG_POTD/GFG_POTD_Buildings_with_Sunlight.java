package GFG_POTD;

import java.util.Scanner;

/* https://www.geeksforgeeks.org/problems/buildings-receiving-sunlight3032/1
 * Q. Buildings with Sunlight
 *  Given the array arr[] of heights of certain buildings that lie adjacent to each other,
 *  Sunlight starts falling from the left side of the buildings. If there is a building of a certain height,
 *  all the buildings to the right side of it having lesser heights cannot see the sun.
 *  Find the total number of buildings that receive sunlight.
 *  Examples:
 *  Input: arr[] = [6, 2, 8, 4, 11, 13]
 *  Output: 4
 *  Explanation: Only the buildings with heights 6, 8, 11, and 13 receive sunlight; therefore, the output is 4.
 * 
 *         ☼
 * 
                         █
                     █   █
             █       █   █
         █   █   █   █   █
         █   █   █   █   █
         █   █   █   █   █
--------------------------------
        6   2   8   4  11  13
 * */
public class GFG_POTD_Buildings_with_Sunlight {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Element :");
        String s[] = scanner.nextLine().split(" ");
        int n = s.length;
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(s[i]);
        }
        System.out.println(STR."Visibile Building is  :\{visibleBuildings(arr)}");
    }

    public static int visibleBuildings(int arr[]) {
        // code here
        int n = arr.length;
        int prev = arr[0];
        int count  = 1;
        for (int i = 1;  i < n; i++){
            if (arr[i] >= prev ){
                count++;
                prev = arr[i];
            }
        }
        return count;

    }
}
