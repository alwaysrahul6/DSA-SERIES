package ARRAYS;
//First element occurring k times in an array
//Given an array arr[] of size n, the task is to find the first element that occurs k times. If no element occurs k times, print -1. If multiple elements occur k times, the first one in the array should be the answer.
//
//        Examples:
//
//Input: arr = [1,7,4,3,4,8,7], k=2
//Output: 7
//Explanation: Both 7 and 4 occur 2 times. But 7 is the first that occurs 2 times.
//
//
//        Input: arr = [4,1,6,1,6,4], k=1
//Output: -1
//Explanation: No element occurs exactly once.




public class First_Element_occuring {
    static int occuring(int arr[] ,int k){
        int n = arr.length;

        for (int  i= 0;i<n;i++){
            int count = 0;
            for (int  j = 0; j<n;j++){
                if (arr[i] == arr[j]){
                    count++;
                }
                }
            if (count==k){
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1,7,7,2,4,4};
        int k = 2;
        System.out.println(occuring(arr,k));
    }

}
