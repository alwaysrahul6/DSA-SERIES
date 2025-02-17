package FUNCTION;

public class Method_Basic {
    public static void naam(){
        System.out.println("Hi Good Evening");
        for (int i =1;i<=20;i++){

            System.out.println(i);

        }
    }
    public static void dusra(){
        naam();
        System.out.println("2nd wala");

    }

    public static void main(String[] args) {
        System.out.println("Hii");
        naam();
        dusra();
        System.out.println("Last");
    }

}
