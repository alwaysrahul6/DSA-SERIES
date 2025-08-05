package GREEDY;

import java.util.Arrays;

public class GREEDY_01_ALGORITHIM {
    static int assigncookies(int []g,int []s){
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0,j =0,count =0;
        while (i<g.length && j < s.length){
            if (g[i]<=s[j]){
                count++;
                i++;
                j++;
            }else
                j++;
        }

        return count;
    }

    public static void main(String[] args) {
        int a[] = {1,2,3};
        int b[] = {1,1,2};
        System.out.println(assigncookies(a,b));
    }
}
