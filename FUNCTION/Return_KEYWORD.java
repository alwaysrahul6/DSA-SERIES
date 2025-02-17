package FUNCTION;

public class Return_KEYWORD {
    public static void greet(int time){
        if (time>12)
            System.out.println("Good AfterNoon:");
        else
            System.out.println("Good Morning:");
    }
    public static void returconcept(int x){
        if (x<0)return;
        System.out.println("Good Night");
    }

    public static void main(String[] args) {
        greet(10);
        returconcept(6 );
    }
}
