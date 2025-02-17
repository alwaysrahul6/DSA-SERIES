package ARRAYS;

public class WAveArray {
    static int []waveArray(int arr[]){
        int n = arr.length;
        for (int  i=0;i<n; i +=2){
            int ttemp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = ttemp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int a[] ={ 1,2,3,4,5,6};
        waveArray(a);
        for (int i =0;i<=a.length;i++){
            System.out.print(a[i] + " ");
        }
    }
}
