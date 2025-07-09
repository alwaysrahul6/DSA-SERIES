package RECCURSION;

import java.util.Scanner;

public class Removing_A_Particular_String {
   public static String remove(String str, int idx){
        if (idx == str.length())return "";
        String smallans = remove(str, idx+1);
        char cuurrchar = str.charAt(idx);
        if (cuurrchar !='a'){
            return cuurrchar+smallans;
        }else
            return smallans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(remove(str,0));
    }
}
