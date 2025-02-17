package ARRAYS;

public class arrayIssorted {
    public static boolean isSorted(int[] arr) {
        int n= arr.length;
        for (int i = 1; i<n;i++) {
            if (arr[i]>=arr[i-1]){

            }
            else {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        int a[] = { 1,2,3,4};
        System.out.println("is sorted or not " + isSorted(a));
    }
}
