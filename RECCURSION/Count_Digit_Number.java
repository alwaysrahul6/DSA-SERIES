package RECCURSION;

public class Count_Digit_Number {
    static int count(int n){
        if ( n<=0)return n;
        return count(n/10)+1;
    }

    public static void main(String[] args) {
        int n = 40545;
        System.out.println(count(n));
    }
}
