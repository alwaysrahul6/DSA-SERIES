package HashMap;

import java.util.HashMap;

public class HashMap_04_HAshing {
    public static void main(String[] args) {
        HashMap<Integer,Integer>map = new HashMap<>(10,5);
        map.put(0,1);
        map.put(1,2);
        map.put(2,3);
//        map.put(3,4);
//        map.put(4,5);
//        map.put(5,6);
//        map.put(6,7);
//        map.put(7,8);
//        map.put(8,9);
//        map.put(10,11);
//        map.put(11,12);
//        map.put(12,13);
//        map.put(13,15);//change value using put method
//        map.put(14,15);
//        map.remove(14);  //remove element with a key
//     System.out.println(map.containsValue(13));
//        System.out.println(map.containsKey(14));
//        System.out.println(map);
//        System.out.println(map.entrySet());
//        System.out.println(map.keySet());
//        for (Map.Entry<Integer,Integer>e:map.entrySet()){
//            System.out.println(" key " + e.getKey()+ " value " + e.getValue());
//        }
//        Set<Integer>key = map.keySet();
//        System.out.println(map.keySet());     // only key print
//        System.out.println(map.entrySet());   // key and value both print
//        Set<Integer>key1 = map.keySet();
//       for (int i : key){
//           System.out.println(map.get(i));
//       }

//        System.out.println(map.entrySet());

        HashMap<Integer,Integer>map2= new HashMap<>();
        map2.put(0,1);
        map2.put(1,2);
        map2.put(2,3);
        map2.putIfAbsent(5,4);
//        System.out.println(map2);
//
////        map2.put(3,4);
//        System.out.println(map.equals(map2));
//        HashMap<String,Integer>map3 = new HashMap<>();
//        map3.put("Rahul" ,1);
//        map3.put("Sharma" ,1);
//        int a = map3.getOrDefault("Sharma",0)+1;
//        System.out.println(a);
//        map3.putIfAbsent("kumar",2);
//        map3.putIfAbsent("hjkh",2);
//        System.out.println(map3);
//        System.out.println(map.get(2));
        System.out.println(map2.get(1)+1);
//        System.out.println( map2.put(1,map2.get(1)+1));

    }

}
