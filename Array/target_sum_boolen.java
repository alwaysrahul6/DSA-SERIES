package ARRAYS;

public class target_sum_boolen {
    public static boolean target(int arr[], int target){
        int n= arr.length;
        for (int i=0;i<n;i++){
            for (int j= i+1;j<n;j++){
                if (arr[i]+arr[j]==target)
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int a[] = { -8,1,4,6,10,45};
        int target = 120;
        System.out.println(target(a,target));
    }
}
