package STACK;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;



public class Stack_Next_Greater_Element {
    /// Driver Code
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s[] =  scanner.nextLine().split(" ");
        int n = s.length;
        int arr[] = new int[n];
        for (int i = 0; i< n;i++){
            arr[i] = Integer.parseInt(s[i]);
        }
        System.out.println(nextGreaterElement(arr));
    }
    /// Solutions
    public static ArrayList<Integer> nextGreaterElement(int arr[]){
        Stack<Integer>stack = new Stack<>();
        for (int i = 0;i< arr.length;i++){
            for (int j = i+1;j < arr.length;j++){
                if (arr[j] > arr[i]){
                    stack.push(arr[j]);
                    break;
                }else {
                    stack.push(-1);
                }
            }
        }
        ArrayList<Integer>res = new ArrayList<>();
        while (!stack.isEmpty()){
            res.add(stack.pop());
        }
        return res;
    }
}
