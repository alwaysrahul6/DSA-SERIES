package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmap_02_Demo {
    public static void main(String[] args) {

        //HashMap Implement
        HashMap<Integer,String>map = new HashMap<>();
        //Hashmap Print
        map.put(1 ,"Rahul");
        map.put(2 ,"Raghu");
        map.put(3 ,"Ram");
        System.out.println(map.getOrDefault(4,"Shayam"));

//        System.out.println(map);

        //Hashmap print through index number

        String student = map.get(3);
        System.out.println(student);
        //to check the key isPresent or not in hasmap

        System.out.println(map.containsKey(2));

//        check value isPresent or Not  contains value
        System.out.println(map.containsValue("Ram"));

 //f    loop  chalane ke liye

        Set<Integer> keys = map.keySet();
        for (int i : keys){
            System.out.println(map.get(i));
        }

        // another method to iterate the loop

        Set<Map.Entry<Integer, String>>Entries = map.entrySet();
        for (Map.Entry<Integer, String> entry :Entries){
            System.out.println(entry.getKey() + " " + entry.getValue());
            entry.setValue((entry.getValue()).toUpperCase());//all char goes to capital letter
        }
        System.out.println(map);
        map.remove(2);
        System.out.println(map);

        //Internal Structure Of Hashmap


    }
}
