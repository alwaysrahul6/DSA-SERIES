package HashMap;

import java.util.HashMap;

public class Hashmap_03_Frequency_Of_number {
    public static void main(String[] args) {
        int []arr= {1,1,1,2,1,3,1};
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int ele:  arr){
            if (!map.containsKey(ele)){
              map.put(ele,1);
            }else  {
                map.put(ele,map.get(ele)+1);
            }
        }
        System.out.println("Map");
        System.out.println(map.entrySet());
       int maxFreq = -1, anskey = -1;
       for (var e :map.entrySet()){
           if (e.getValue()>maxFreq){
               maxFreq = e.getValue();
               anskey = e.getKey();
           }
       }
        System.out.println(anskey);

    }
}
