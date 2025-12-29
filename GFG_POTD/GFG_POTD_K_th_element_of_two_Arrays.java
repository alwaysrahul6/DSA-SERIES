package GFG_POTD;
/*
 * https://www.geeksforgeeks.org/problems/k-th-element-of-two-sorted-array1317/1
 *
 * Given two sorted arrays a[] and b[] and an element k, the task is to find the element that would be at the kth position of the combined sorted array.
 *  Examples :
 *  Input: a[] = [2, 3, 6, 7, 9],
 *         b[] = [1, 4, 8, 10],
 *         k = 5
 *  Output: 6
 *  Explanation: The final combined sorted array would be [1, 2, 3, 4, 6, 7, 8, 9, 10]. The 5th element of this array is 6.
 * */
import java.util.Scanner;

public class GFG_POTD_K_th_element_of_two_Arrays {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Element");
        String s1[] = scanner.nextLine().split(" ");
       
        int n = s1.length;
        
        int a[] = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = Integer.parseInt(s1[i]);
        }
        System.out.println("Enter Second Element :");
        String s2[] = scanner.nextLine().split(" ");
        int m = s2.length;
        int b[] = new int[m];
        for (int i = 0; i < m; i++){
            b[i] = Integer.parseInt(s2[i]);
        }
        System.out.println("Enter K");
        int k = scanner.nextInt();
        int solution =  kthElement(a ,b,k);
        System.out.println(STR."K is \{solution}");
        
    }

    public static int kthElement(int a[], int b[], int k) {
        int n =  a.length;
        int m = b.length;
        int result[] = new int[n + m];
        int idx = 0;

        int i = 0, j = 0;
        while (i < n && j < m){
            if (a[i] <= b[j]){
                result[idx++] = a[i];
                i++;
            }else {
                result[idx++] = b[j];
                j++;
            }
        }
        while (i < n){
            result[idx++] = a[i];
            i++;
        }
        while (j < m){
            result[idx++] = b[j];
            j++;
        }
        return result[k-1];
    }
}
