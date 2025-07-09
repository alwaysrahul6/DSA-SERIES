package CollectionFramework;

import java.util.ArrayList;
import java.util.Vector;

public class Vectordemo {
    public static void main(String[] args) {
        Vector<Integer>vector = new Vector<>(5,3);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.set(1,4);
        System.out.println(vector);
        System.out.println(vector.size());
        System.out.println(vector.isEmpty());
        System.out.println(vector.contains(4));
       vector.clear();
        System.out.println(vector);
        System.out.println(vector.capacity());


        Vector<Integer>list = new Vector<>();
        Thread t1 = new Thread(() -> {
            for (int i=0;i<1000;i++){
                list.add(i);
            }
        });
        Thread t2 = new Thread(() ->{
            for (int i = 0;i<1000;i++){
                list.add(i);
            }
        });
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Size of list " + list.size());
    }

}
