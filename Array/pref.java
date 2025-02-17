package ARRAYS;

public class pref {
    public static void prefquires(int arr[]){
        int n = arr.length;
        int l = 0;
        int r = l-1;
        for (int i =1;i<=n;i++){
            l = r - (l-1);
        }
    }
}
