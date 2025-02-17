package ARRAYS;

public class zeroesAndOnec {
    public static void zeroesandone(int arr[]){
        int n= arr.length;
        int left = 0;
        int right = n-1;
        while (left<right){
            if (arr[left] ==1 && arr[right] == 0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int n[] = { 1,1,0,1,1,0,0,1,0};
  //    int[] ans =zeroesandone(n);
    //    System.out.println(ans);


    }
}
