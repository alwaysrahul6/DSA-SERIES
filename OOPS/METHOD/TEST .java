package OOPS.METHOD;

public class TEST {
    public static void main(String[] args) {
   String a = "Vipul";
   System.out.println(upperCase(a));
   System.out.println(a);
        System.out.println(sum(1 ,2,3,4));

        System.out.println(sum(1,2,3,4,5,6));

    }
    public  static int sumOfArray(int []arr){
        int res = 0;
        for (int  i: arr){
            res+=i;
        }
        return res;
    }


    private  static  String upperCase(String s){
        return s.trim().toUpperCase();
    }


    private  static  int sum (int a , int b){
        return a+b;
    }

    private  static  int sum (int a , int b , int c){
        return a+b+c;
    }

    private static int sum(int ...a){
       int  sum = 0;
        for (int i: a){
            sum+=i;
        }
        return sum;
    }

    /// Isprime No

    private  static boolean isPrime(int x){
        int res = 0;
        for (int i = 0;i<x/2;i++){
            if (x%i==0){
                res++;
            }
        }


        return res==2;
    }



}
