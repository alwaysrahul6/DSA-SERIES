package STACK;

import java.util.Stack;

public class learnStack {
    public static void main(String[] args) {
        Stack<String>animals = new Stack<>();

        animals.push("lion");
        animals.push("Dog");
        animals.push("Horse");

        animals.push("Cat");
        animals.push("Cow");
        System.out.println("Stack" + animals);
        System.out.println(animals.peek());   //to check which element has first
        animals.pop(); // delete a element
        System.out.println(animals.contains("Cat"));



    }
}
