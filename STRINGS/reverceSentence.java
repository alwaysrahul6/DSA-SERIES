package STRINGS;
/*https://www.geeksforgeeks.org/program-to-reverse-a-sentence/
Write a program to reverse a sentence.
Examples:
Input: "Practice with GFG"
Output: "GFG htiw ecitcarP"
Input: "Programming is fun"
Output: "nuf si gnimmargorP"
 */
public class reverceSentence {
    static String rev(String s){
        StringBuilder sentence = new StringBuilder();
        for (int i=s.length()-1;i>= 0;i--){ //n-1 to 0
            sentence.append(s.charAt(i));//last element store in firstly
        }
        return sentence.toString();
     }

    public static void main(String[] args) {
        String str = "GFG htiw ecitcarP";//Practice with GFG
        System.out.println(rev(str));
    }
}
