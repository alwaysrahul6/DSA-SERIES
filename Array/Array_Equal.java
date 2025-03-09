package ARRAYS;
/*https://www.geeksforgeeks.org/problems/check-if-two-arrays-are-equal-or-not3847/1?page=1&category=Arrays&difficulty=Basic,Easy&sortBy=submissions
Q. Given two arrays a[] and b[] of equal size,
 the task is to find whether the elements in the arrays are equal.
 Input: a[] = [1, 2, 5, 4, 0], b[] = [2, 4, 5, 0, 1]
Output: true
* */
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Array_Equal {
    static boolean isEquals(int a[],int b[]){
    int n = a.length;
    int m = b.length;
        HashMap<Integer,Integer>map = new HashMap<>();
        for (int i =0;i<n;i++){
            map.put(a[i],map.getOrDefault(a[i],0)+1);
            map.put(b[i],map.getOrDefault(b[i],0)-1);
        }
        for (Integer i: map.keySet()){
            if (map.get(i)!=0)return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 5};
        int arr1[] = {2, 4, 15};
        System.out.println(isEquals(arr,arr1));
    }
}
