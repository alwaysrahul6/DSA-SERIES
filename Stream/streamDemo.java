package Stream;

import java.util.Arrays;
import java.util.List;

public class streamDemo {
    public static void main(String[] args) {
//        feature introduced in Java 8
//        process collections of data in a functional and declarative manner
//        Simplify Data Processing
//        Embrace Functional Programming
//        Improve Readability and Maintainability
//        Enable Easy Parallelism
//        What is stream ?
//                a sequence of elements supporting functional and declarative programing
//        How to Use Streams ?
//        Source, intermediate operations & terminal operation
///      ye hai aam zindgi

        List<Integer> number  = Arrays.asList(1,2,3,4,5,6);
        int count  = 0;
        for (int i :number){
            if (i % 2 == 0)count++;
        }
        System.out.println(count);

        ///  ye hai mentos Zindgi


        System.out.println(number.stream().filter(x -> x % 2 == 0).count());
    }
}
