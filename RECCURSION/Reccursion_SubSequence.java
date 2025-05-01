package RECCURSION;

import java.util.ArrayList;

public class Reccursion_SubSequence {
    static ArrayList<String> getSSQ(String s){
        ArrayList<String> ans = new ArrayList<>();
        if (s.isEmpty()){
            ans.add("");
            return ans;
        }

        char curr = s.charAt(0);
        ArrayList<String> smallans = getSSQ(s.substring(1));
        for (String ss : smallans){
            ans.add(ss);
            ans.add(curr +  ss);
        }
        return ans;
    }


    /// second approach

    static  void sub(String s ,String currAns){
        if (s.isEmpty()){
            System.out.println(currAns);
            return;
        }
        char curr = s.charAt(0);
        String remString = s.substring(1);
        sub(remString, currAns + curr);
        sub(remString, currAns);
    }

    public static void main(String[] args) {
        ArrayList<String> ans = getSSQ("abc");
        System.out.println(ans);
        String str = "abc";
        sub(str,"");
    }
}
