package BIT_MANUPULATION;

public class Bit_DecimaltoBinary {
    public static void main(String[] args) {
        int n = 9;
        System.out.println(convertBinary(n));
    }

    static String convertBinary(int n){
       StringBuilder str = new StringBuilder();
        while (n > 0){
            if (n % 2 == 1)str.append("1");
            else str.append("0");
            n = n / 2;
        }
        str.reverse();
        return str.toString();
    }
}
