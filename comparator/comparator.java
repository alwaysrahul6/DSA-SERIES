package comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class comparator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(6);
        list.add(5);
        List<String>words = Arrays.asList("banana","apple","date");
        words.sort(null);
        System.out.println(words);
    }
}
