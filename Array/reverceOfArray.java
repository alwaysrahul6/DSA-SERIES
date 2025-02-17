package ARRAYS;

public class reverceOfArray {
//    public static int[] reverced(int[] arr){
//        int n =arr.length;
//        int [] ans= new int [n];
//        int j =0;
//        for (int i =n-1;i>=0;i--){
//            ans[j++] = arr[i];
//        }
//        return ans;
//    }

 public static void printArray(int []arr){
     for (int i =0;i< arr.length;i++){
         System.out.print(arr[i] + " ");
     }
     System.out.println();
 }


//AAPROCH 2
//    public static void swapInarray(int arr[] ,int i,int j){
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j]= temp;
//
//    }
    public static void approch(int arr[]){
         int i =0;
         int j = arr.length-1;
        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j]= temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        approch(arr);
        printArray(arr);


    }
}

