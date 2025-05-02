package HashMap;

import java.util.*;

public class HashMap_08_max_Frequency_number {
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,4,6,2,4,2,6};
        HashMap<Integer,Integer>freq = new HashMap<>();
        for (int i :arr){
//            if (!freq.containsKey(i)){ // agar wo element usme nahi hai to daal do aur uska value ko bhi store kar do 1  se
//                freq.put(i,1);//
//            }else{
//                freq.put(i,freq.get(i)+1);
//                System.out.println(freq);
//            }
            freq.put(arr[i], freq.getOrDefault(arr[i],0)+1);
        }
        System.out.println(freq.entrySet());
        int maxFreq = 0, ansKey = -1;
//        for (var e: freq.entrySet()){
//            if (e.getValue()>maxFreq){
//                maxFreq = e.getValue();
//                ansKey = e.getKey();
//            }
//            System.out.print(ansKey);
//        }
        for (var key:freq.keySet()){
            if (freq.get(key)>maxFreq){
                maxFreq = freq.get(key);
                ansKey = key;
            }
        }
        System.out.print(ansKey);
    }
}
