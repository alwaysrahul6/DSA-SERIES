package ARRAYS;

public class Kadanes_Algorithim  {

    static int kadnes(int arr[]){
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i =0;i<n;i++){
            sum +=arr[i];
            if (sum>maxSum){
                maxSum = sum;
            }
            if (sum< 0){
                sum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = { -1,2,3,-8,-2,7,3,-1};
        long sum = kadnes(arr);
        System.out.println(sum);
    }
}