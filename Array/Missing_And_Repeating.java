package ARRAYS;

import java.util.ArrayList;

public class Missing_And_Repeating {
    public static ArrayList<Integer> repeating(int arr[]){
        ArrayList<Integer>ans = new ArrayList<>();
        long n = arr.length;
        long s = 0,sn;
        long snq,sq = 0;
        sn = (long)n*(n+1)/2;
        snq = (long)n*(n+1)*(2L *n+1)/6;
        for (int i =0;i<n;i++){
            s += arr[i];
            sq += (long) arr[i] *arr[i];
        }
        long missing =0,repeating =0;
        repeating = ((sq -snq)/(s -sn)+(s-sn))/2;
        missing = repeating-(s-sn);
        ans.add((int)missing);
        ans.add((int)repeating);
        return ans;
    }

    public static void main(String[] args) {
        int arr[] ={1,2,2,4,5};
        System.out.println(repeating(arr));
    }
}
