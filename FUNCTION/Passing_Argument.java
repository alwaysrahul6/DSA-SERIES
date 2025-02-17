package FUNCTION;

public class Passing_Argument {
    public static void  greet(String name){
        System.out.println("Good Morning " + name);
    }

    public static void main(String[] args) {
        greet("Rahul");
        greet("Sharma");
        sum(5,8);
        intro("Rahul",21);
//        intro("rahul","rahul");
        student("rahul",12, 8.24F);
    }

    public static  void sum(int a,int b){
        System.out.println(a+b);
    }
    public static void intro(String name,int age){
        System.out.println("hello " + name + " your age is : " + age);
    }
    public static void student(String name,int clas,float grade){
        System.out.println("Student Name " + name +  " Class is : "+ clas +  " Grade is :  " + grade );
    }
}
