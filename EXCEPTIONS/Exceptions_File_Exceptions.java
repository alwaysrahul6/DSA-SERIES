package EXCEPTIONS;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exceptions_File_Exceptions {
    public static void main(String[] args)throws Exception {
        System.out.println(divide(1,0));
    }
    public static void method1() throws FileNotFoundException {
        FileReader fileReader = new FileReader("A.txt");
    }
    public static void method3() throws FileNotFoundException {
        try{
            method1();
        }catch (Exception e){
            System.out.println("File Exception");
            throw new FileNotFoundException(); /// ForceFully Exception Create
        }
    }

    /// Finaly keyword

    public static int divide(int a , int b){
        try {
            return a/b;
        }catch (Exception e){
            return -1;
        }
        finally {
            System.out.println("Exceptin Handled Succefully: ");
        }
    }
}
