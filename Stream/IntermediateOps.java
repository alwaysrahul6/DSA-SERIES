package Stream;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOps {
    public static void main(String[] args) {
        // Intermediate operations transform a stream into another stream
        // They are lazy, meaning they don It execute until a terminal operation is invoked.

        ///  1. Filter Method
        List<String> names = Arrays.asList("rahul" , "Shyam" , "Rohan" , "Ajay");

        System.out.println(names.stream().filter(x ->x.startsWith("A")).count());

        ///  2.Map Method

        Stream<String> stringStream = names.stream().map(String::toUpperCase);
        names.stream().map(String::toUpperCase).forEach(System.out::println);


        /// Sorted Stream
        List<Integer> number = Arrays.asList(2,5,1,9,7,12,11);
        names.stream()
                .sorted((a, b) -> a.length() - b.length())
                .forEach(System.out::println);


        ///  skip Opertion

        System.out.println(Stream.iterate(1, x-> x+1).skip(10).limit(100).count());
        Stream.iterate(1, x-> x+1).skip(10).limit(10).forEach(System.out::println);

        /// Peak operation
        ///  perform an action on each and every element as it consumbed
        Stream.iterate(1, x-> x+1).skip(10).limit(10).peek(System.out::println).count();

        List<Integer> lis = Arrays.asList(123456,4,67,8,9,5,6,7,8);
        /// take while
//        lis.stream().takeWhile(n ->n!=67).forEach(System.out::println);
        lis.stream().takeWhile(n -> n % 2==0).forEach(System.out::println);





    }

}
