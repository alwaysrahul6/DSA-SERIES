package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Hashmap_06_Internal_Working {
  static void HashMap(){
      ///  syntax
      Map<String, Integer> map = new HashMap<>();

      /// Adding Element
      map.put("Akash" , 21);
      map.put("Yash" , 16);
      map.put("Luv" , 21);
      map.put("Harry" , 18);

      /// Getting value of a key from hashmap
      System.out.println(map.get("Yash"));
      System.out.println(map.get("Rahul"));//null

      //Changing , Updating value of a key in the map.

      map.put("Luv",25);
      System.out.println(map.get("Luv"));

      //removing a pair from the hashmap
      System.out.println(map.remove("Akash"));
      System.out.println(map.remove("Kasi"));

      /// Checking if a key is present map or not.

      System.out.println(map.containsKey("Akash"));//false
      System.out.println(map.containsKey("Luv"));//True

      /// adding a new entry nly if  the new key doesnt exist already.

      map.putIfAbsent("Rahul",22);// will enter
      map.putIfAbsent("Luv",25);// will doesnt enter
      System.out.println(map.get("Rahul"));
      // Get all key in the hashmap
      System.out.println(map.keySet());
      // get all the value in the hashmap.
      System.out.println(map.values());
      // get all entries in the hashmap.
      System.out.println(map.entrySet());

      //traverce the hashmap in all entries
      for (String s : map.keySet()) {
          System.out.printf("Age of %s is %d\n", s, map.get(s));
      }
      System.out.println();
      for (Map.Entry<String,Integer> e : map.entrySet()){
          System.out.printf("age of %s is %d\n", e.getKey(), e.getValue());
      }
      System.out.println();

      for (var e : map.entrySet()){
          System.out.printf("Age of %s is %d\n", e.getKey(),e.getValue());
      }

/// Q. What happens if we put a key object in a HashMap which exists?

//      allerady exist hoti hait h bas value ko update kar degi.

      ///






  }


    public static void main(String[] args) {
        HashMap();
    }

}
