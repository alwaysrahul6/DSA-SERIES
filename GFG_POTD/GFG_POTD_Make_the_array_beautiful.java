package GFG_POTD;
/* https://www.geeksforgeeks.org/problems/make-the-array-beautiful--170647/1
 *  Make the array beautiful
 *  Given an array of negative and non-negative integers. You need to make the array beautiful.
 *  An array is beautiful if two adjacent integers, arr[i] and arr[i+1] are either negative or positive. You can do the following operation any number of times until the array becomes beautiful.
 *  If two adjacent are different i.e. one of them is negative and other is positive, remove them.
 *  Return the beautiful array after performing the above operation.
 *  An empty array is also a beautiful array.
 *  There can be multiple beautiful output arrays. For consistencty with the test cases, scan the array from left to right for removing two adjacent.
 *  Examples:
 *  Input: arr[] = [4, 2,-2, 1]
 *  Output: [4, 1]
 *  Explanation: As at indices 1 and 2 , 2 and -2 have different sign, they are removed. And the the final array is: [4, 1].
 * */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class GFG_POTD_Make_the_array_beautiful {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Element");
        String s[] = scanner.nextLine().split(" ");
        int n = s.length;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(s[i]);
        }
        List<Integer> ans = makeBeautiful(arr);
        ans.forEach(x -> System.out.print(x + " "));
    }

    public static List<Integer> makeBeautiful(int[] arr) {
        // code here
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++){
            if (!stack.isEmpty() &&
            arr[i] >= 0 && stack.peek() < 0 ||
            arr[i] < 0 && stack.peek() >= 0
            ){
                stack.pop();
            }else stack.push(arr[i]);
        }
        return new ArrayList<>(stack);
    }


}
