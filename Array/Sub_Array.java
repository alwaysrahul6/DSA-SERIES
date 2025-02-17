package ARRAYS;

public class Sub_Array   {
    public static int findArraySum(int arr[]){
        int n=  arr.length;
        int totalsum = 0;
        for (int i =0;i<n;i++){
            totalsum +=arr[i];
        }
        return totalsum;
    }

    public static boolean equalPartion(int arr[]){
        int n = arr.length;
        int totalSum= findArraySum(arr);
        int prefixSum = 0;
        for (int i =0;i<n;i++){
             prefixSum +=arr[i];
            int suffixSum =  totalSum - prefixSum;
            if (suffixSum==prefixSum){
                return true;
            }
        }
        return false;
    }
    static int checknumber(int arr[]){
        int n = arr.length;
        int totalSum= findArraySum(arr);
        int prefixSum = 0;
        for (int i =0;i<n;i++){
            int suffixSum =  totalSum - (prefixSum + arr[i]);
            if (suffixSum==prefixSum){
                return i;
            }
            prefixSum +=arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = { 1,7,5,9,-1};
//        equalPartion(arr);
        System.out.println(checknumber(arr));

    }
}
