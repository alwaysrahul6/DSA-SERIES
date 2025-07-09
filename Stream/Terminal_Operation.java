package Stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Terminal_Operation {
    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(1,2,3,4,5);

        // 1. Collect

        System.out.println( A.stream().skip(1).toList());

        // 2. forEach

        A.forEach(System.out::println);

        /// 3 . reduce : combine elements to produce  a single result

//        Optional<Integer> reduce = A.stream().reduce(Integer.sum());

        /// 4 anyMatch ,  allMatch , noneMatch

        boolean b = A.stream().anyMatch(x -> x % 2 == 0);
        System.out.println(b);

        boolean b1 = A.stream().allMatch(x -> x > 0);
        System.out.println(b1);

        boolean b2 = A.stream().noneMatch(x -> x < 0);
        System.out.println(b2);

        /// Findfirst and FindAny

        System.out.println(A.stream().findAny());
        System.out.println(A.stream().findFirst());


        /// Example

        List<String> name = Arrays.asList("Rahul" , "Shubham" , "Karan" , "Raj");

        System.out.println(name.stream().filter(x -> x.length()>3).toList());


        ///  Example 2

        List<Integer> number = Arrays.asList(1,2,3,4,5,6);
        System.out.println(number.stream().map(x -> x * x).sorted().toList());

        System.out.println();
        System.out.println(number.stream().toList());


        /// count occurence of a Character

        String Sentence = "Hey Buudy How Are You";

        System.out.println(Sentence.chars().filter((x -> x =='H')).count());

        int numbe = 23455666;
        long count =  String.valueOf(numbe).chars().map(x ->x-'0').filter(d ->d ==6).count();
        System.out.println(count);

        ///  max & min opertion

        System.out.println(  Stream.of(2,4,6,8,10).max((x1,x2)->x1-x2));

        /// FlatMap
        ///flatMap is used to flatten a stream of collections (like List of Lists) into a single stream.
        ///
        /// Think of it like: "flatten then map".
        ///
        /// It breaks nested structures into flat streams so you can process individual elements.

        List<List<String>> fruits = Arrays.asList(
                Arrays.asList("Apple" , "Kiwi"),
                Arrays.asList("Mango" , "Orange"),
                Arrays.asList("Guava" ,"PineApple")
        );
        System.out.println(fruits.stream().flatMap(x -> x.stream()).map(String::toUpperCase).toList());
        /// Lambda can be replaced with method reference
        System.out.println(fruits.stream().flatMap(Collection::stream).map(String::toUpperCase).toList());


        List<String> ans = Arrays.asList("Tiger is Carnivorus" ,
                "Fish is a Carnivourous" ,
                "cow is a herbibourus" ,
                "Human is a all borus");
        System.out.println(ans.stream().
                flatMap(anss ->Arrays.stream(anss.split(" "))
                        .map(String::toUpperCase)).
                        toList());

    }
}
