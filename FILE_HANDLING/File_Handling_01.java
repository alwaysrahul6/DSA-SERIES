package FILE_HANDLING;

import java.io.*;

public class File_Handling_01 {
    public static void main(String[] args) throws FileNotFoundException {
//        try(InputStreamReader isr = new InputStreamReader(System.in)){
//            System.out.println("Enter Some Letter:");
//            int letter = isr.read();
//            while (isr.ready()){
//                System.out.println((char) letter);
//                letter = isr.read();
//            }
//            isr.close();
//            System.out.println();
//        }catch (IOException e){
//            System.out.println(e.getMessage());
//        }

//        try (FileReader fr = new FileReader("src/FILE_HANDLING/note.txt")){
//            int letter = fr.read();
//            while (fr.ready()){
//                System.out.println((char) letter);
//                letter = fr.read();
//            }
//            fr.close();
//            System.out.println();
//        }catch (IOException e){
//            System.out.println(e.getMessage());
//        }

//        try (OutputStreamWriter osw = new OutputStreamWriter(System.out)){
//            osw.write("Hello World");
//            osw.write(97);
//            osw.write(10);
//            osw.write('A');
//            osw.write('\n');
//            char [] ch = "Hello world".toCharArray();
//
//        }catch (IOException e){
//            System.out.println(e.getMessage());
//        }
        try (FileWriter fr = new FileWriter("src/FILE_HANDLING/note.txt" , true)){
            fr.write("heloo world");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
