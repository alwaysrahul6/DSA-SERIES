package GFG_POTD;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

/* https://www.geeksforgeeks.org/problems/asteroid-collision/1
 *  Q. Opposite Sign Pair Reduction
 *
 *  Given an array arr[] , return the final array by repeatedly apply the following operation from left to right until no more valid operations can be performed.
 *  If two adjacent elements have opposite signs:
 *  If their absolute values are different, remove both elements and insert the one with the greater absolute value, preserving its sign.
 *  If their absolute values are equal, remove both elements without inserting any new element.
 *  Examples :
 *  Input: arr[] = [10, -5, -8, 2, -5]
 *  Output: [10]
 *  Explanation:
 *  At Index 0 : Element 10 has positive sign.
 *  At Index 1 : -5  has lesser absolute value than 10. Replace both of them with 10.
 *  At Index 2 : -8  has lesser absolute value than 10. Replace both of them with 10.
 *  At Index 3 : 2 has positive sign. So it will be in the array.
 *  At Index 4 : -5  has greater absolute value than 2. Replace both of them with 5.
 *  Now -5  has lesser absolute value than 10. Replace both of them with 10.
 * */
public class GFG_POTD_Opposite_Sign_Pair_Reduction {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Element :");
        String s[] = scanner.nextLine().split(" ");
        int n = s.length;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(s[i]);
        }
        System.out.println(reducePairs(arr));

    }

    public static ArrayList<Integer> reducePairs(int[] arr) {
        // code here

        ArrayList<Integer> st = new ArrayList<>();
        for (int j : arr) {
            st.add(j);
            while ((st.size()>= 2)){
                int sz = st.size();
                int top = st.get(sz-1);
                int secTop = st.get(sz-2);
                if (top * secTop < 0){
                    st.removeLast();
                    st.removeLast();
                    if (Math.abs(top) == Math.abs(secTop)){
                        continue;
                    }else if (Math.abs(top) > Math.abs(secTop)){
                        st.add(top);
                    }else st.add(secTop);
                }else break;
            }
        }
        return st;
    }

}
