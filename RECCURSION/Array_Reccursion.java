package RECCURSION;

public class Array_Reccursion {
    static void printArray(int []n, int idx){
        if (idx == n.length)return;
        System.out.println(n[idx]);
        printArray(n,idx+1);
    }
    static int maxArray(int []arr,int idx) {
        if (idx == arr.length - 1) return arr[idx];
        int smallans = maxArray(arr, idx + 1);
        return Math.max(smallans, arr[idx]);
    }
    public static void main(String[]args) {
        int n[] = {};
//        System.out.println(maxArray(n,0));
        System.out.println(sum(n,0));
//        maxArray(n,0);
    }
    static int sum(int []arr,int idx){
        if (idx==arr.length)return 0;
        if (idx == arr.length-1)return arr[idx];
        int smallans = sum(arr,idx+1);
        return arr[idx]+smallans;
    }
}
