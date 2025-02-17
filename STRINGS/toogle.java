package STRINGS;
import java.util.*;
public class toogle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println(str) ;

        //toogle
        //pHySiCs -> PhYsIcS

        //traverse all char for the help of using loop
        for (int  i =0;i<str.length();i++){
            //p->P
            //check ->alphabet -small,capital
            boolean flag = true; //capital
            char ch = str.charAt(i); //A
            if (ch==' ')continue;


            int asci = (int)ch; //65
            if(asci>=97) flag = false; //small
            if (flag == true) { // capital
                asci +=32;
                char dh = (char)asci; //a  conver number to character
                str.setCharAt(i,dh);//
            }
            else { // small
                asci -=32;
                char dh = (char) asci;
                str.setCharAt(i,dh);

            }
            if (asci>=48 && asci<=57){
                continue;
            }

        }
        System.out.println(str);



    }
}
