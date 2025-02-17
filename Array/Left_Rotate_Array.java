package ARRAYS;

public class Left_Rotate_Array {
//    public static void Rotate(int arr[],int n){
//        int temp =arr[0];
//        for (int i =0;i<=n;i++){
//            arr[i] = arr[i+1];
//        }
//        arr[n-1] = temp;
//        for (int i =0;i<=n;i++){
//            System.out.print(arr[i] + " ");
//        }
//    }
//
//    public static void main(String[] args) {
//        int n= 3;
//        int ar[] = { 2,5,6,7,8,9};
//        Rotate(ar,n);
//    }
public static void solve(int[] arr, int n) {
    int temp = arr[0]; // storing the first element of array in a variable
    for (int i = 0; i < n - 1; i++) {
        arr[i] = arr[i + 1];
    }
    arr[n - 1] = temp; // assigned the value of variable at the last index
//    for (int i = 0; i < n; i++) {
//        System.out.print(arr[i]+" ");
//    }

}

    public static void main(String[] args) {
        int n =7;
        int arr[]= {1,2,3,4,5,6,7};
        solve(arr,n);
  //System.out.println(solve(arr, n));
    }

}