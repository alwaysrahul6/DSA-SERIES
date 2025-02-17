package STRINGS;
import java.util .*;
public class stringsBasic {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
//        String str = " DSA SERIES";
//        System.out.println(str);
//        System.out.println("Hello rahul ");

        String atr = new String("hello");
        String htr = "hello";

//        System.out.println(atr.length());
        System.out.println(htr .equals(atr) );

        //finding elemen number to search the index

        System.out.println(atr.charAt(2));

        //finding index to searching of element

        System.out.println(atr.indexOf("e"));
//        atr.compareTo(htr);

//        compare two string
        System.out.println(atr.compareTo(htr));

        String mtr = "giet";
        String ntr = " GIET";
        System.out.println(mtr.compareTo(ntr));


//        contains method to serach a element present in string or not
        System.out.println(mtr.contains("gi"));


//        at the beginning of this string
        System.out.println(mtr.startsWith("gi"));
        System.out.println(mtr.startsWith("col"));

        //end of string
        System.out.println(mtr.endsWith("et"));
//        System.out.println(mtr.endsWith("it"));

        //toLowerCase() all alphabet convert lower
        System.out.println(ntr.toLowerCase());

        //toUppperCase() all alphabet convert upper

        System.out.println(mtr.toUpperCase());
        String up = " kl:>";
        System.out.println(up.toUpperCase());

        //concat()

        //Substring(i ,j )


    }
}
