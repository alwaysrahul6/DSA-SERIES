package STACK;

public class Stack_06_Implemention_StackInArray {
    static class Stack{
        private int [] arr = new int[10];
        private int idx = 0;

        /// push function in stack

        void push(int x){
            arr[idx++] = x;
        }

        /// peek function

        int peek(){
            if (idx == 0){
                System.out.println("Stack is Empty");
                return -1;
            }
            return arr[idx-1];
        }

        /// Pop Element

        int pop(){
            if (idx == 0){
                System.out.println("Stack is Empty");
                return -1;
            }
            int top = arr[idx-1];
            arr[idx-1] = 0;
            idx--;
            return top;
        }

        /// Display a Stack

        void display(){
            for (int i = 0; i<=idx-1;i++){
                System.out.print(arr[i] +  " ");
            }
            System.out.println();
        }

        /// Size of Stack

        int size(){
            return idx;
        }

        /// Full of Stack

        boolean isfull(){
            if (arr.length == idx)return true;
            return false;
        }

        /// boolean is empty

        boolean isEmpty(){
            if (idx == 0)return true;
            return false;
        }



    }
    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println(stack.isfull());
        System.out.println(stack.isEmpty());
    }
}
