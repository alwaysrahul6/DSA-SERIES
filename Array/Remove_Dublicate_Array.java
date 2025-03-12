package ARRAYS;
/*https://www.geeksforgeeks.org/problems/remove-duplicate-elements-from-sorted-array/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card
Q -Given a sorted array arr. Return the size of the modified array which contains only distinct elements.
Examples :
Input: arr = [2, 2, 2, 2, 2]
Output: [2]
Explanation: After removing all the duplicates only one instance of 2 will remain i.e. [2] so modified array will contains 2 at first position and you should return 1 after modifying the array, the driver code will print the modified array elements.

* */
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
//method 1 
public class Remove_Dublicate_Array  {
    public static int dublicate (int arr[]){
        int n=arr.length;
        int i=0;
        for (int j =1;j<n;j++){
            if (arr[i] !=arr[j]){

                arr[i] =arr[j];
                i++;

            }
        }
        return i;

    }
    //method 2 using TreeSet
//    static int[] removedublicate(int[] arr){
//        int n = arr.length;
//        Set<Integer>set = new TreeSet<>();
//        for (int i =0;i<n;i++){
//            set.add(arr[i]);
//        }
//      //create a unique array to conver a set to array
//        int unique[] = new int[set.size()];
//        int index =0;
//        for (int j : set){
//            unique[index++] = j;
//
//        }
//        return unique;
//    }
    
    static int arraydublicate(int arr[]){
        int n = arr.length;
        int unique =0; // track the number of unique element
        for (int i =0;i<n;i++){
            boolean flag = false;
            for (int j =0;j<unique;j++){
                if (arr[i] == arr[j]){
                    flag = true;
                    break;
                }
            }
            if (!flag){
                arr[unique++] = arr[i];
//                unique++;
            }
        }
        return unique;
    }

    public static void main(String[] args) {
        int ar[] = { 4,5,7,3,1,2,6,6};
//        int[]result = removedublicate(ar);
//        for (int i : result){
//            System.out.print(i);

//        System.out.println();
//        System.out.println("Removing of dublicate of array : " + removedublicate(ar));
        System.out.println("Removing of dublicate of array : " + dublicate(ar));
        System.out.println("Removing of dublicate of array : " + arraydublicate(ar));
    }
    }



