package SORTING;

public class BubbleSort1 {
    static void bubble(int arr []){
        int n =arr.length;
        for (int i = n-1; i>=0;i--){
            for (int j=0;j<i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int a[]= { 2,6,4,5,9,3};
        bubble(a);
        for (int i:a){
            System.out.print(i + " ");
        }
    }
}
