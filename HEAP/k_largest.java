package HEAP;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class k_largest {
    static ArrayList<Integer> largest(int arr[], int k){
        ArrayList<Integer>ans= new ArrayList<>(k);
        int n = arr.length;
        PriorityQueue<Integer> list = new PriorityQueue<>();
        for (int  i=0;i<n;i++){
            list.offer(arr[i]);
            if (list.size()>k){
                list.poll();
            }
        }
        while (!list.isEmpty()){
            ans.addFirst(list.poll());
        }
        return ans;
    }
}
