package BINARY_SEARCH;
   
public class Decreasing_Binary_Search {
    static int binary(int arr[], int ele){
        int n = arr.length;
        int i = 0;
        int j = n-1;
        while (i<=j){
            int mid = i+j-i/2;
            if (ele == arr[mid]){
                return  mid;
            } else if (ele<arr[mid]) {
                i =  mid +1;
            }else
                j = mid -1;
        }
         return -1;
    } 

    public static void main(String[] args) {
        int arr[] = {20,19,18,17,15,14,12,11,5};
        int ele = 5;
        System.out.println(binary(arr,ele));
    }
}
