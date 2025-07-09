package CollectionFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class copyOnArrayListdemo {
    public static void main(String[] args) {
        List<String> shoppinglist = new CopyOnWriteArrayList<>();
        shoppinglist.add("Bread");
        shoppinglist.add("Egg");
        shoppinglist.add("Butter");
        System.out.println("Intial Shopping List:" + shoppinglist);
        for (String item : shoppinglist){
            System.out.println(item);

            if (item.equals("bread")){
                shoppinglist.add("mango");
                System.out.println("Added Butter while reading" );
            }
        }
        System.out.println("updated shopping list " + shoppinglist);
    }
}
