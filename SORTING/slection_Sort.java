package SORTING;

public class slection_Sort {


    static void selectionSort(int arr[]){
        int n =arr.length;
        for (int i =0;i<n; i++){//i represent the current index
            int min_Index= i;
            for (int j=i+1;j<n;j++){
                if (arr[j]<arr[min_Index]){
                    min_Index=j;
                }
            }
            //swap cuurent element and minimum element
            int temp= arr[i];
            arr[i]= arr[min_Index];
            arr[min_Index]=temp;
        }
    }


    public static void main(String[] args) {
        int arr[] = { 2,5,6,1,4,8};
        selectionSort(arr);
        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
