package ARRAYS;
/*https://www.geeksforgeeks.org/problems/third-largest-element/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card
Q-Given an array, arr of positive integers. Find the third largest element in it. Return -1 if the third largest element is not found.
Examples:
Input: arr[] = [2, 4, 1, 3, 5]
Output: 3
Explanation: The third largest element in the array [2, 4, 1, 3, 5] is 3.
* */
import java.util.Arrays;

public class Third_largest_element {
    static int thirdlargest(int arr[]) {
        int n = arr.length;
        int first = 0, sec = Integer.MIN_VALUE, third = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i]>first){
                first = arr[i];
            }
        }
        for (int i =0;i<n;i++){
            if (arr[i]>sec&& arr[i]<first){
                sec = arr[i];
            }
        }
        for (int i =0;i<n;i++){
            if (arr[i]>third&& arr[i]<sec){
               third = arr[i];
            }
        }
        return third;

    }
    static int third(int arr[]){
        int n = arr.length;
        Arrays.sort(arr);
        return arr[n-3];
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 1, 3, 5};
        System.out.println(third(arr));
    }
}
