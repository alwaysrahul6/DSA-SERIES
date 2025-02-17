package SORTING;

public class Bubble_Sort {
//    static void bubbleSort(int [] a){
//        int n = a.length;
//        for (int i=0;i<n;i++){
//            for (int j= 0;j<n-1;j++){
//                if (a[j]>a[j+1]){
//                    //swap
//                    int temp= a[j];
//                    a[j]=a[j+1];
//                    a[j+1] = temp;
//                }
//            }
//        }
//    }

    static void bubbleSort(int arr[]){
        int n = arr.length;
        for (int i=0;i<n;i++){
            for (int j=0;j<n-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp= arr[i];
                    arr[i]=  arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
       int [] a = {2,5,4,8,9};
       bubbleSort(a);
       for (int i:a){
           System.out.print(i + " ");
       }
    }
}
