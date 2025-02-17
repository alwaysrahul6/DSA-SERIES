package STRINGS;

import java.util.ArrayList;

public class reverceWordSentence {
    public static void main(String[] args) {
        String str= "I am a good Educator";
        String[] str2 = str.split(" ");
        String ans = "";
        for (String s:str2){
            s = reverse(s);
            ans+=s+ " ";
        }
        System.out.println(ans);
        ArrayList<Integer>ar = new ArrayList<>();
        ar.add(0,3);

}
    private static String reverse(String a){
        StringBuilder s = new StringBuilder(a);
        return s.reverse().toString();
    }
}
