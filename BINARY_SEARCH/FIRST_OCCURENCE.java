package BINARY_SEARCH;
/*Q-Find 1st Occurence of an Element?
Example: arr[2,2,4,4,6,8,9]
K = 4
Output: 3
* */
import java.util.Scanner;

public class FIRST_OCCURENCE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size:");
        int n = sc.nextInt();
        System.out.println("Enter The Element:");
        int []arr = new int[n];
        for (int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter K");
        int k = sc.nextInt();
        System.out.println(solve(arr,k));
    }
    private static int solve(int arr[],int k){
        int n = arr.length;
        int i =0,j=n-1;
        int res = -1;
        while (i<=j){
            int mid  = i+j-i/2;
            if (k == arr[mid]){
                res= mid;
                j = mid -1;
            } else if (k<arr[mid]) {
                j = mid-1;
            }else{
                i = mid+1;
            }
        }
        return res;
    }
}
  
