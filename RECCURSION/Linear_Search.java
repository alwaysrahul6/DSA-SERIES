package RECCURSION;

import org.ietf.jgss.GSSManager;

import java.net.Inet4Address;
import java.util.ArrayList;

public class Linear_Search {
    /*Return A True Or false If a Present Or Not Present A target In A Given Array.
     *Example: int[] arr = {1,5,4,8,2,1]
     * target = True
     * output: 1
     * Explanation :  5 is found 1st index.That's why return True return.
     *  */
    static boolean linear(int []arr,int target,int idx){
        if (idx==arr.length)return false;
        if (arr[idx]== target)return true;
        return linear(arr,target,idx+1);
    }
    /*Return A Index If a Present A target In A Given Array.
    *Example: int[] arr = {1,5,4,8,2,1]
    * target = 5
    * output: 1
    * Explanation :  5 is found 1st index.That's why return 1st index return.
     *  */
    static int linearIndex(int []arr,int target,int idx){
        if (idx==arr.length)return -1;
        if (arr[idx]== target)return idx;
        return linearIndex(arr,target,idx+1);
    }
    /*
    * Return Last Index of Target Element
    * Example : int []arr = {1,2,4,5,4,5,6]
    * target = 5;
    * output :  5*/
    static int lastIndex(int []arr,int target,int index){
        if (index==-1)return -1;
        if (arr[index]==target)return index;
        return lastIndex(arr,target,index-1);
    }
    //return ALl indx of target example:
    /*
    * Example :
    * int [] arr = {15,6,4,4,1,4,2];
    * int target = 4;
    * output :  2,3,5
    * Explantion 4 is found of 2 index, 3rd index and 5th index
     */
    static void linearSearch(int []arr,int target, int indx){
        if (indx== arr.length)return;
        if (arr[indx]==target){
            System.out.println(indx);
        }
        linearSearch(arr,target,indx+1);
    }
    static ArrayList<Integer>list(int []arr,int target,int index){
        ArrayList<Integer>ans = new ArrayList<>();
        if (index>=arr.length)return ans;
        if (arr[index]== target){
            ans.add(index);
        }
        ArrayList<Integer>smallans= list(arr,target,index+1);
        ans.addAll(smallans);
        return ans;

    }
    static boolean sorted(int []arr, int n, int index){
        if (index==n)return true;
        if (arr[index - 1] > arr[index])return false;
        return sorted(arr,n,index+1);
    }

    public static void main(String[] args) {
//        int [] arr = {1,2,3,4};
//        int target = 33;
//        sorted(arr,0,1);
//        if (sorted(arr, 4,1)) {
//            System.out.println("Sortde");
//        }else {
//            System.out.println("Not Sorted");
//        }
//        if (linear(arr,target,0)){
//            System.out.println("found");
//        }else System.out.println("Not Found");
//        System.out.println(linearIndex(arr,target,0));
//        linearSearch(arr,target,0);
//        ArrayList<Integer>ans = list(arr,target,0);
//        for (int i:ans){
//            System.out.println(i);
//        }
        int []last = {1,5,2,1,5,15,4,5,23};

        System.out.println(lastIndex(last,5,last.length-1));
    }
}
