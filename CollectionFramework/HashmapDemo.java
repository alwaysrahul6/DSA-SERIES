package CollectionFramework;

import java.util.HashMap;

public class HashmapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String>map = new HashMap<>();
        map.put(1,"Rahul");
        map.put(2,"Ramji");
        map.put(3,"Ujjwal");
        System.out.println(map);

        String student = map.get(1);
        System.out.println(student);
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("Rahul"));


        

    }
}
