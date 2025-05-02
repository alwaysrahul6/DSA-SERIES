package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMap_01_Counting_Frequencies_of_Array_Elements {
    public static int frequency(int arr[]){
        int n = arr.length;
        HashMap<Integer,Integer>map = new HashMap<>();
        for (int i  = 0;i<n;i++){
            //Insert A data
            if (map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else {
               map.put(arr[i],1 );
            }
        }
        //traverce A data
        for (Map.Entry<Integer, Integer> i :map.entrySet()){
            System.out.println(i.getKey() + " " +  i.getValue());
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner   = new Scanner(System.in);
        System.out.println("Enter Size:");
        int n = scanner.nextInt();
        System.out.println("Enter Element");
        int arr[] = new int [n];
        for (int i =0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        frequency(arr);
    }
}
