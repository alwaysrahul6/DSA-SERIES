package Stream;

import javax.swing.*;
import java.util.*;
import java.util.stream.Collectors;

public class CollectorDemos {
    public static void main(String[] args) {
        ///  Collectors is a utility class
        /// provides a set of method  to create to common collectors

        ///  1. Collecting to the list
        List<String> names = Arrays.asList("Rahul", "Ankit", "Shubham", "Akhilesh");
        List<String> res = names.stream().filter(x -> x.startsWith("A")).collect(Collectors.toList());
        System.out.println(res);

        /// 2. Collecting to Set

        List<Integer>num = Arrays.asList(1,2,34,4,2,4,23,2,1,23);
        Set<Integer> res2 = num.stream().collect(Collectors.toSet());
        Set<Integer> res3 = new HashSet<>(num);
        Set<Integer> res4 = new TreeSet<>(num);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res4);

        ///  3.Collecting to a Specific Condition
        ArrayDeque<String> collect = names.stream()
                .collect(Collectors.toCollection(ArrayDeque::new));
        System.out.println(collect);

        // 4. Joining Strings
        // Concatenates stream elements into a single String

        String concatename = names.stream().map(String::toUpperCase).collect(Collectors.joining(" "));
        System.out.println(concatename);

        // 5. Summarizing Data
        // Generates statistical summary (count, sum, min, average, max).

        List<Integer>numbe = Arrays.asList(1,2,3,4,5);
        IntSummaryStatistics collect1 = numbe.stream().collect(Collectors.summarizingInt(x -> x));
        System.out.println("Sum " + collect1.getSum());
        System.out.println("Max " + collect1.getMax());
        System.out.println("Min " + collect1.getMin());
        System.out.println("Average " + collect1.getAverage());
        System.out.println("Count " + collect1.getCount());
        System.out.println("Class " + collect1.getClass());

        /// 7.Average
        System.out.println(numbe.stream().collect(Collectors.averagingInt(x ->x)));


        /// 8.Grouping Elements

        List<String > namess = Arrays.asList("Rahul" , "kumar", "Sharma", "Arun","Basudev", " Parvesh");
//        System.out.println(namess.stream().collect(Collectors.groupingBy(String::length)));
        System.out.println(
                namess.stream()
                        .collect(Collectors.groupingBy(String::length, Collectors.counting()))
        );
        System.out.println(
                namess.stream()
                        .collect(Collectors.groupingBy(String::length, Collectors.joining(" ,")))
        );

        // 9. Partitioning Elements
        // Partitions elements into two groups (true and false) based on a predicate.

        System.out.println(namess.stream().collect(Collectors.partitioningBy(x ->x.length() >=5)));


        // 10. Mapping and Collecting
        // Applies a mapping function before collecting

        System.out.println( namess.stream().collect(Collectors.mapping(x->x.toUpperCase(),Collectors.toList())));
    }
}
