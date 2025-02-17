package ARRAYS;

public class SwapUsingopreator {
    public static void swapwithouttemp(int a ,int b){
        System.out.println("original values befor swap");
        System.out.println("a: " + a);
        System.out.println("b : " + b);
        a =a+b;
        b= a-b;
        a = a-b;
        System.out.println("swap value after swap");
        System.out.println( " a : " + a);
        System.out.println("  b: "+ b);

    }

    public static void main(String[] args) {
        int a = 9;
        int b = 3;
        swapwithouttemp(a,b);
    }
}
