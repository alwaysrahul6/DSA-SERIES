package BIT_MANUPULATION;

public class Bit_BinaryToDecimal {
    public static void main(String[] args) {
        String str = "1001";
        System.out.println(convertDecimal(str));
    }

    static int convertDecimal(String s){
        StringBuilder str = new StringBuilder(s);
        int ans = 0;
        str.reverse();

        int n = s.length();

        for (int i = 0;  i < n; i++){
            char ch = str.charAt(i);
            int m = Character.getNumericValue(ch);
            ans += (int) (m * Math.pow(2 , i));
        }
        return ans;
    }
}
