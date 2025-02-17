package ARRAYS;

public class practice {

    //largest number in giver aaray

//    public static int largest(int arr[]){
//        int n = arr.length;
//        int largest=arr[0];
//        for (int i=0;i<n;i++){
//            if (arr[i]>largest){
//                largest=arr[i];
//            }
//        }
//        return largest;
//    }
// public static  int secondlargest(int arr[]){
//     int n =arr.length;
//     int largest = arr[0];
//     int slargest = -1;
//     for (int i= 0;i<n;i++){
//         if (arr[i]>largest){
//             slargest=largest;
//             largest=arr[i];
//         }else if (arr[i]<largest && arr[i]>slargest){
//             slargest=arr[i];
//         }
//     }
//     return slargest;
// }

    public static boolean isSorted(int[] arr){
        int n = arr.length;
        for (int i =1;i<n;i++){
            if (arr[i]>=arr[i-1]){

            }else {
                return false;
            }
        }
        return true;
    }



    public static void main(String[] args) {
        int a[] = { 3, 5, 2, 7, 6};
        int ab[] = { 1,2,3,4};
//        System.out.println("The Second Largest is : " +secondlargest(a));
       // System.out.println("The largest array is : " + largest(a));
        System.out.println(isSorted(a));
        System.out.println(isSorted(ab));
    }
}
