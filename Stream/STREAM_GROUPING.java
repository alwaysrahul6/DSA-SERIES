package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class STREAM_GROUPING {
    public static void main(String[] args) {
        List<String> ans = Arrays.asList("Ram is A good person", "Ravan is not a good person" , " I think shubham is a good hearted persong");
        ///  grouping by length
        System.out.println( ans.stream()
                .collect(Collectors
                .groupingBy(String::length)));

       /// Grouping by first Character
        System.out.println( ans.stream().collect(Collectors.groupingBy(word->word.charAt(0))));


        
    }
}
