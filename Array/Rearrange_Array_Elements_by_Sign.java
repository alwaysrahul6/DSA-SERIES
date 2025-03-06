package ARRAYS;
/*Q.Rearrange Array Elements by Sign
There’s an array ‘A’ of size ‘N’ with an equal number of positive and negative elements. Without altering the relative order of positive and negative elements,
 you must return an array of alternately positive and negative values.
 Example 1:
Input:
arr[] = {1,2,-4,-5}, N = 4
Output:
1 -4 2 -5
* */
import java.util.Arrays;

public class postive_negative {
    public static int[] rearrange(int arr[]){
        int n = arr.length;
        int pos[] = new int[n/2];
        int neg[] = new int[n/2];
        int posi =0,negi =0;
        for (int i = 0;i<n;i++){
            if (arr[i]>0){
                pos[posi++] = arr[i];
            }else neg[negi++] = arr[i];
        }

        for (int i =0;i<n/2;i++){
            arr[2*i] = pos[i];
            arr[2*i+1] = neg[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,-4,-5};
//        System.out.println(rearrange(arr));
        System.out.println(Arrays.toString(rearrange(arr)));
    }
}
