package FILE_HANDLING;

import javax.imageio.IIOException;
import java.io.FileReader;
import java.io.IOException;

public class File_Handling_Read_File {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("src/FILE_HANDLING/new-file.txt")) {
            StringBuilder sb = new StringBuilder();
            while (fr.ready()){
               sb.append((char) fr.read());
            }
            System.out.println(sb.toString());
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
