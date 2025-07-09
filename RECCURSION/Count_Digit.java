package RECCURSION;

public class Count_Digit {
    static int count(int n ){
        if (n<=1)return n;
        return count(n/10)+1;
    }

    public static void main(String[] args) {
        System.out.println(count(2356));
    }
}
