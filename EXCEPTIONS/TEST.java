package EXCEPTIONS;

public class TEST {
    public static void main(String[] args) {
        int[] numerators = {10, 200, 30, 40};
        int[] denominators = {1, 2, 0, 4};
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(divide(numerators[i] , denominators[i]));
            }catch (Exception e){
                System.out.println("out of index");
            }

        }
        System.out.println("Good job:");
        }
        public static int divide(int a, int b){
       try{

           return a/b;
       } catch (ArithmeticException e) {
           System.out.println("Arthimatic Exception");
           return -1;
       }catch (Throwable e){
           System.out.println(e);
           return -1;
       }
        }
    }
