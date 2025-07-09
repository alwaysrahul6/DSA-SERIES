package STACK;

import java.util.Stack;

public class Stack_02_InsertButtom {
    public static void main(String[] args) {
        Stack<Integer> st1 = new Stack<>();
        st1.push(1);
        st1.push(2);
        st1.push(3);
        st1.push(4);
        Stack<Integer>st2 = new Stack<>();
        while (!st1.isEmpty()){
            st2.push(st1.pop());
        }
        st2.push(0);

        while (!st2.isEmpty()){
            st1.push(st2.pop());
        }
        System.out.println(st1);
    }
}
