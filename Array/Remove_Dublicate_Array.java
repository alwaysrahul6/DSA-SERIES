package ARRAYS;

public class Remove_Dublicate_Array  {
    public static int dublicate (int arr[]){
        int n=arr.length;
        int i=0;
        for (int j =1;j<n;j++){
            if (arr[i] !=arr[j]){
                arr[i+1] =arr[j];
                i++;
            }
        }
        return i+1;

    }

    public static void main(String[] args) {
        int ar[] = { 4,5,7,3,1,2,6};
        System.out.println("Removing of dublicate of array : " + dublicate(ar));
    }

}
