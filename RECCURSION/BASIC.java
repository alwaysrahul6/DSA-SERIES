package RECCURSION;

import java.util.Scanner;

public class BASIC {
//    static void printIncreasing(int n){
//        if (n==1){
//            System.out.println(1);
//            return;
//        }
//        printIncreasing(n-1);
//        System.out.println(n);
//    }
     static void  fun1(){
        int x =1;
        fun2();
          
    }
   static void fun2(){
        int x =2;
        fun3();
        System.out.println(x);
    }
   static void fun3(){
        int x =3;

        System.out.println(x);
    }

    public static void main(String[] args) {
       fun1();
    }
}
