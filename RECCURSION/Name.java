package RECCURSION;

import java.util.Scanner;

public class Name {
     static void solve(int i, int n){
        if(i>n)return;
        System.out.println("Rahul");
        solve(i+1, n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        solve(1,n);

    }
}
