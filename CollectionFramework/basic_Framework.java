package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class basic_Framework {
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        System.out.println(list.get(2));
//        System.out.println(list.size());
//        for (int  i =0;i< list.size();i++){
//            System.out.println(list.get( i));
  //      }
//        ArrayList<Integer> list = new ArrayList<>(10000);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        System.out.println(list.size());
        List<Integer> list = new ArrayList<>();
        System.out.println(list.getClass().getName());



        List<String> list1 = Arrays.asList("Monday" , "tuesday");
        list1.set(0,"wedensday");
        System.out.println(list1.get(0));
        System.out.println(list1.getClass().getName());
        List<String>list4 = new ArrayList<>(list1);
        list4.add("mango");
//        list4.add(0,5);
        System.out.println(list4);




        String[] array = {"Apple" , " Banana" , " cherry"};
        List<String> list2 = Arrays.asList(array);

        List<Integer> list5 = Arrays.asList(1,2,3,4);
//        list5.add(0,10);
        System.out.println(list5);

        //add new array list//

        ArrayList<Integer> list6 = new ArrayList<>();
        list6.add(10);
        list6.add(20);
        list6.add(0,40);
        System.out.println(list6);

//        adding a new array list

        List<Integer> list7 = List.of(44,45,46,47,48);
//        list5.addAll(list7);
        list7.get(5);
        System.out.println(list7);
//        System.out.println(list7);
        List<String> list8 = List.of("Organs"," TRansplant");
//        list8.add("surgury");
        System.out.println(list8);

    }
}
