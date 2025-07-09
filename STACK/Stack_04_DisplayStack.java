package STACK;

import java.util.Stack;

public class Stack_04_DisplayStack {
    public static void main(String[] args) {
        Stack<Integer> st1 = new Stack<>();
        st1.push(1);
        st1.push(2);
        st1.push(3);
        st1.push(4);
//        st1.push(5);
//        System.out.println(st1);
//        Stack<Integer>st2 = new Stack<>();
//        while (!st1.isEmpty()){
//            int x = st1.pop();
//            System.out.print(x + " ");
//            st2.push(x);
//        }
//        System.out.println( );
//        while (!st2.isEmpty()){
//            int y = st2.pop();
//            System.out.print(y + " ");
//            st1.push(y);
//        }
        insertatbootom(st1);
        System.out.println();
        displayrec(st1);
    }
    /// Using Reccursion

    static void insertatbootom(Stack<Integer>st){
        if (st.isEmpty()){
            st.push(7);
            return;
        }
        int x = st.pop();
        System.out.print(x + " ");
        insertatbootom(st);
        st.push(x);
    }

    ///  display reverce order

    static void displayrec(Stack<Integer>st){
        if (st.isEmpty())return;
        int x = st.pop();
        displayrec(st);
        System.out.print(x + " ");
        st.push(x);
    }
}
