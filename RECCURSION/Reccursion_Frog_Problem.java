package RECCURSION;

public class Reccursion_Frog_Problem {
    static int frogproblem(int arr[] , int n ,int idx){
        if (idx == n-1)return 0;
        int opt1 = frogproblem(arr,n,idx+1) + Math.abs(arr[idx+1] - arr[idx]);
        if (idx == n-2)return opt1;
        int opt2 = frogproblem(arr,n,idx+2) + Math.abs(arr[idx+1] - arr[idx]);
        return Math.min(opt2,opt1);
    }
    public static void main(String[] args) {
        int a[] = {10,30,40,20};
        System.out.println(frogproblem(a,a.length,0));
    }
}
