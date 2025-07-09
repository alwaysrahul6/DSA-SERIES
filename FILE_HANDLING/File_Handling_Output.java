package FILE_HANDLING;
import java.io.*;
public class File_Handling_Output {
    public static void main(String[] args) {
        /// create the file
        try {
            File fo = new File("src/FILE_HANDLING/new-file.txt");
            fo.createNewFile();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        /// Writing the file
        try {
            FileWriter fw = new FileWriter(" ");
            fw.write("सर्वधर्मान्परित्यज्य मामेकं शरणं व्रज |\n" +
                         "अहं त्वां सर्वपापेभ्यो मोक्षयिष्यामि मा शुच:");
            fw.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        /// Reading The File

        try (BufferedReader br = new BufferedReader(new FileReader("src/FILE_HANDLING/new-file.txt"))){
            while (br.ready()){
                System.out.println(br.readLine());
            }

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
