package ARRAYS;
/*https://www.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card
Q-Given an array arr, rotate the array by one position in clockwise direction.
Examples:
Input: arr[] = [1, 2, 3, 4, 5]
Output: [5, 1, 2, 3, 4]
Explanation: If we rotate arr by one position in clockwise 5 come to the front and remaining those are shifted to the end.
* */
import java.util.Arrays;

public class Rotae_In_One_Place {
    public static void rotate(int []arr){
            int i =0,j = arr.length-1;
            while (i!=j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
    }

    public static void main(String[] args) {
        int arr[]={1 ,2,3,4,5};
        rotate(arr);
        System.out.println(Arrays.toString(arr));
    }
}
