package STRINGS;

public class printallSubstring {
    public static void main(String[] args) {
        String str = "abcd";
        for (int  i=0;i<=3;i++){
            for (int j=i+1;j<=4;j++){
                System.out.print(str.toUpperCase(). substring(i,j)+" ");
            }
        }
    }
}
