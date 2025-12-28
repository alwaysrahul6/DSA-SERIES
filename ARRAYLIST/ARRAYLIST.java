package ARRAYLIST;

import java.util.ArrayList;  
  
public class ARRAYLIST {
    public static void main(String[] args) {
//        Integer i = Integer.valueOf(4); 
//        System.out.println(i);
//        Float k = Float.valueOf(8.2F);
//        System.out.println(k);


        //arraylist defin


        ArrayList<Integer> l1 = new ArrayList<>();
        //add new element
        l1.add(5);
        l1.add(6);
        l1.add(8);
        l1.add(7);

        //get an element at index i
//        System.out.println(l1.get(0));


        //print with for loop
        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }
        //printing the array at some index i
        System.out.println(l1);

        //Addinfg element at some index i //
        l1.add(1, 100);
        System.out.println(l1);

        //modefying element at index i
        l1.set(1, 10);
        System.out.println(l1);

        //removing element at index i
        l1.remove(1);
        System.out.println(l1);

        //removing an element at index i
        l1.remove(Integer.valueOf(7));
        System.out.println(l1);

        //checking if an element exists:

        boolean ans = l1.contains(Integer.valueOf(5));
        System.out.println(ans);

        l1.lastIndexOf(2);
        System.out.println(l1);
    }
}
