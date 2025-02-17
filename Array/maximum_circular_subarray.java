package ARRAYS;

public class maximum_circular_subarray {
    public static int circular(int arr[]){
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        int max =0,min =0 ,totalSum =0;
        for (int i =0;i<n;i++){
            max +=arr[i];
            min +=arr[i];
            totalSum +=arr[i];
            maxSum = Math.max(maxSum,max);
            minSum = Math.min(minSum,min);
            if (max<0) max =0;
            if (min>0) min =0;
        }
        return Math.max(maxSum,(totalSum-minSum));
    }

    public static void main(String[] args) {
        int arr[] = {10,9,-11,10,-8,5,2};
        System.out.println(circular(arr));
    }
}
