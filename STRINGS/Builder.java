package STRINGS;
import java.util.*;

public class Builder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hello");
        // to add the string in existing string

//        str.append("world");
//        System.out.println(str);


        //to add a or replace a value in indexing
//     str.setCharAt(0,'m');
//     str.append(true);
//        System.out.println(str);

//        insert a string
        str.insert(0,'r');
        System.out.println(str);
        //delete a string
        str.deleteCharAt(0);
        System.out.println(str);

        //reverce
        str.reverse();
        System.out.println(str);

        //delete(i,j)
        str.delete(0,3);
        System.out.println(str);

    }
}
