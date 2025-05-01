package RECCURSION;
/*   Given a Arr[] to find a subset of of sum to given Number
*    int arr[] = {2,3,5};
*    target = 7;
*    output: true.
*    Explantion : 5,2 is subset of number and sum is 7.
* */
public class Reccursion_Subset_Sum {
    static boolean subset(int arr[] , int n , int idx , int cuurSum, int target){
        if (cuurSum == target)return true;
        if (idx==n || cuurSum>target){
            return false;
        }
        if (subset(arr,n , idx+1,cuurSum + arr[idx],target)) {
            return true;
        }
       if (subset(arr,n , idx+1,cuurSum,target)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,5};
        System.out.println( subset(arr, arr.length, 0,0,4));
    }
}
