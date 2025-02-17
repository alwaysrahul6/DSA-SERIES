package ARRAYS;

public class ssmallest {
    public static int smallest(int arr[]){
        int n= arr.length;
        int smallest =arr[0];;
        int ssmallest= -1;
        for (int i =1; i<n ;i++){
            if (arr[i]<smallest){
                ssmallest= smallest;
                smallest=arr[i];
            }else if (arr[i]>smallest && arr[i]< ssmallest){
                smallest = arr[i];
            }
        }
        return ssmallest;
    }
    public static void main(String[] args) {
        int arr[] = {-1 , -5 , 0, -8};
        System.out.println("The Second Largest is: "+ smallest(arr));

    }
}
