package ARRAYS;

public class majority_element {
    static int majority(int arr[]){
        int n = arr.length;
        int freq= 0;
        for (int i =0;i<n;i++){

            for (int j =0;j<n;j++){
                if (arr[i]==arr[j]){
                    freq++;
                    if (freq>n/2) return i;
                }
            }



        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1 ,2 ,1,1,1,1,1};
        majority(arr);
        System.out.println(majority(arr));
//       for (int i =0;i<arr.length;i++){
//
//         System.out.println(arr[i]);     }
    }
}
