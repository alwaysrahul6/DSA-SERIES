package ARRAYLIST;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class REVERCE {
    static void reeverce(ArrayList<Integer> list){
        int i =0, j = list.size() -1;
        while (i<j){
            Integer temp = Integer.valueOf(list.get(i));
            list.set( i, list.get(j));
            list.set( j ,temp);
            i++;
            j--;


        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(5);
        list.add(25);
        System.out.println("original " +  list);
//        reverce(list);
        Collections.reverse(list);
        System.out.println("Revereced list" + list);
        Collections.sort(list);
        System.out.println("Ascending Order " + list);
        list.sort((x, y) -> y - x);
        System.out.println("Descending order " + list);
    }
}
