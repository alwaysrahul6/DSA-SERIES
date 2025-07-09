package STACK;

import java.util.Stack;

public class Stack_03_InsertionInStack {
    public static void main(String[] args) {
        Stack<Integer> st1 = new Stack<>();
        st1.push(1);
        st1.push(2);
        st1.push(3);
        st1.push(4);
        int idx = 2;
        int x = 7;
        Stack<Integer>st2 = new Stack<>();
        while (st1.size() > idx){
            st2.push(st1.pop());
        }
        st1.push(x);
        while (!st2.isEmpty()){
            st1.push(st2.pop());
        }
        System.out.println(st1);
    }
}
