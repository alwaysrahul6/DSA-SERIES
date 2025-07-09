package EXCEPTIONS;

public class Exceptions_stackTracee {
    public static void main(String[] args) {
      try {
          level1();
      }catch (Exception e){
         e.printStackTrace();
      }
    }

    private static void level3() {
        int arr[] = new int[10];
        arr[10] = 10;
    }

    private static void level2() {
       level3();
    }

    private static void level1() {
    level2();
    }
}
