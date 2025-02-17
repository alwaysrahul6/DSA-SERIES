package ARRAYS;

public class Largest_Element_of_Array {

    public static int largest(int arr[]){
        int n =arr.length;
        int largest= arr[0];
        for (int i=0;i<n;i++){
            if (arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int a[]= {5,78,2,56};
        System.out.println("Largest Sum is: "+ largest(a));
    }
}
