package ARRAYS;

public class Linerasearch {
    public static  int linear(int arr[], int n){
        for (int i = 0; i<arr.length;i++){
            if (arr[i]== n){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2,4,6,8,9,10};
        int n = 2;
        System.out.println(linear(arr,n));
    }

}
