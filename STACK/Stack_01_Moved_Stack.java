package STACK;

import java.util.*;

public class Stack_01_Moved_Stack {
    public static void main(String[] args) {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer>st2 = new Stack<>();
        ArrayList<Integer> temp = new ArrayList<>();
        st1.push(1);
        st1.push(2);
        st1.push(3);
        st1.push(4);
        System.out.println(st1);
        while (!st1.isEmpty()){
           temp.add(st1.pop());
        }
        Collections.reverse(temp);
        int i = 0;
        while (i < temp.size()){
            st2.push(temp.get(i));
            i++;
        }
        System.out.println(st1);
        System.out.println(st2);
    }
}
