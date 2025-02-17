package ARRAYS;

public class slargest2 {
    public static int slargest(int arr[]){
        int n = arr.length;
        int largest= arr[0];
        int slargest= -1;
        for (int i=0;i<n;i++){
            if (arr[i]>largest){
                slargest =largest;
                largest=arr[i];
            }else if (arr[i]<largest && arr[i]>slargest){
                slargest= arr[i];
            }
        }
        return slargest;
    }
    public static void main(String[] args) {
        int ar[] = { 285,699,45,787,697};
        System.out.println(slargest(ar));

    }
}
