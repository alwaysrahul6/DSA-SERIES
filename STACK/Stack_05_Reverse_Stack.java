package STACK;

import java.util.Stack;

public class Stack_05_Reverse_Stack {
    /// Reverse Reccursively

    static void ReccursivReverce(Stack<Integer>st){
        if (st.size() == 1 )return;
        int x = st.pop();
        ReccursivReverce(st);
        pushBottom(st,x);
    }

    private static void pushBottom(Stack<Integer> st, int x) {
        if (st.isEmpty()){
            st.push(x);
            return;
        }
        int top = st.pop();
        pushBottom(st,x);
        st.push(top);
    }


    public static void main(String[] args) {
        Stack<Integer>st1 = new Stack<>();
        st1.push(1);
        st1.push(2);
        st1.push(3);
        st1.push(4);
        System.out.println(st1 + " st1");
        ReccursivReverce(st1);

//
//        Stack<Integer>st2 = new Stack<>();
//        while (!st1.isEmpty()){
//            st2.push(st1.pop());
//        }
//        System.out.print(st2);
//        System.out.println();
//        Stack<Integer> st3 = new Stack<>();
//        while (!st2.isEmpty()){
//            st3.push(st2.pop());
//        }
//        System.out.println(st3);
//
//        while (!st3.isEmpty()){
//            st1.push(st3.pop());
//        }
//        System.out.println(st1 + " st1");

    }
}
