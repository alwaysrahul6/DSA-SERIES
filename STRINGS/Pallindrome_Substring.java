package STRINGS;

public class Pallindrome_Substring {
    static boolean isPAllindrome(String str){
    int i =0;
    int j = str.length()-1;
    while (i<j){
        if (str.charAt(i)!=str.charAt(j))return false;
        i++;
        j--;
    }
        return true;

    }

    public static void main(String[] args) {
        String str = "abcdcba";
        int count  =0;
        for (int i=0;i<str.length();i++){
            for (int j=i+1;j<=str.length();j++){
                if (isPAllindrome(str.substring(i,j))==true) {
                    System.out.print(str.substring(i, j) + " ");
                    count++;
                }
            }
        }
        System.out.println("The Number of Pallindromic substring are:" + count);
    }
    



    }

