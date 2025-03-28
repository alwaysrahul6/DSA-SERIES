package MATH;

public class GCD {
    //method 1 Iteration Method
    static int  gcd(int a,int b){
        int n = Math.min(a,b);
        int ans =1;
        for (int i =1;i<n;i++){
            if (a % i == 0 && b % i == 0){
                ans = Math.max(ans,i);
            }
        }
        return ans;
    }
    //Method 2 dividend method
    static int iGCD(int n,int m){
        while (n%m!=0){
            int rem = n%m;
            n = m;
            m = rem;
        }
        return m;
    }
    //Reccursive Method
    static int rGCD(int n , int m){
        if (m ==0)return n;
        return gcd(m,n%m);
    }

    public static void main(String[] args) {
        int n  =16;
        int l =24;
        System.out.println(gcd(n,l));//Iteration Method
        System.out.println(iGCD(n,l));//Divdend Method
        System.out.println(rGCD(n,l));//Reccursion Method
        System.out.println(rGCD(n,l));//Reccursion Method
    }
}
