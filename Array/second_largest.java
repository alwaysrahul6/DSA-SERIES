package ARRAYS;

public class second_largest {
    public static int secondlargest(int []arr){
        int n = arr.length;
        int largest= arr[0];
        int slargest= -1;
        for (int i=0;i<n;i++){
            if (arr[i]>largest){
                slargest=largest;//previous largest become small largest
                largest=arr[i]; //new largest
            } else if (arr[i]<largest && arr[i]>slargest) {
                    slargest =arr[i];
            }
        }
        return slargest;
    }

    public static void main(String[] args) {
        int arr[] = { 285,699,45,787,697};
        System.out.println("The Second Largest is: "+ secondlargest(arr));

    }
}
