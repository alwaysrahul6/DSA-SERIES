package CORE_JAVA;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class LAMBDA_EXPRESSION {
    public static void main(String[] args) {
        /// Lambda Expression is a anaymous function (no name, no return type , no acces modifiers )
        Thread t1 = new Thread(()-> System.out.println("hello"));
        t1.start();
        Mathopertaion sum = Integer::sum;
        Mathopertaion subtract = (a, b)->a-b;
        Mathopertaion multiply = (a, b)->a*b;
        int res = subtract.operator(2  , 4);
        System.out.println(res);
        int s = sum.operator(2,9);
        System.out.println(s);

        /// predicate --> functonal interface ( Boolean valued function)

        Predicate<Integer>IsEven  = x-> x % 2==0;
        System.out.println(IsEven.test(5));

        Predicate<String>isWordstartWithA = x -> x.toUpperCase().startsWith("A");
        Predicate<String>isWordEndWithL = x -> x.toUpperCase().endsWith("L");
        Predicate<String>ans = isWordstartWithA.and(isWordEndWithL);
        System.out.println(ans.negate().test("Anmol"));
        System.out.println(ans.hashCode());

        /// Function -->Works for you

        Function <Integer,Integer>doublet = x -> 2 * x;
        Function<Integer,Integer> triplet = x -> 3 * x;
        System.out.println(doublet.andThen(triplet).apply(2));
        System.out.println(doublet.compose(triplet).apply(2));


        /// Consumer

        Consumer<Integer> print = System.out::println;
        print.accept(51);

        /// Supplier

        Supplier<String>getHelloWorld = () ->"Hello World";
        System.out.println(getHelloWorld.get());


        /// Combined Example

        Predicate<Integer> predicate = x -> x%2==0;
        Function<Integer,Integer> function = x -> x * x;
        Consumer<Integer> consumer = System.out::println;
        Supplier<Integer> supplier = () -> 100;

        if (predicate.test(supplier.get())){
            consumer.accept(function.apply(supplier.get()));
        }

        /// BiPredicate , BiConsumer , BiFunction
        BiPredicate<Integer,Integer>isSumEven = (x , y) ->(x + y) % 2==0;
        System.out.println(isSumEven.test(5,5));


        BiConsumer<Integer,Integer> bi = (x ,y) ->{
            System.out.println(x);
            System.out.println(y);
        };
        BiFunction <String,String,Integer> bifunction = (x , y) -> (x +y).length();
        System.out.println(bifunction.apply("a" , "rahul"));


        /// Method Referecence  -->  use method without invoking & in place  of lambda expression

        List<String> name = Arrays.asList("Ram" , "Shubham" , "Aditya");
       ///  x-> this is a lambda expression
        name.forEach(x -> System.out.println(x));
        /// :: this is a method refernce by using in place of lambda expression
        name.forEach(System.out::println);
    }
 }
interface  Mathopertaion {
    int operator(int a , int b);
}
   

