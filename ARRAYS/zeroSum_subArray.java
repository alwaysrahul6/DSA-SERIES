package HashMap;
import java.util.HashMap;
import java.util.Scanner;

public class zeroSum_subArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size:");
        int n = sc.nextInt();
        int arr[] = new int [n];
        System.out.println("Enter Elements");
        for (int  i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(findSubarray(arr));
    }
    static int findSubarray(int arr[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int ans= 0;
        int sum= 0;
        for (int j : arr) {
            sum += j;
            ans+=map.getOrDefault(sum,0);
//            if (map.containsKey(sum)) {
//                ans += map.get(sum);
//            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return ans;

    }
}
