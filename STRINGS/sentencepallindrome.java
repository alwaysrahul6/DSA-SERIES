/*
* Palindrome Sentence
 Given a single string s, the task is to check if it is a palindrome sentence or not.
 * A palindrome sentence is a sequence of characters, such as word, phrase,
 *  or series of symbols that reads the same backward as forward after converting all uppercase letters to lowercase and removing all non-alphanumeric characters.
Examples:
Input: s = "Too hot to hoot"
Output: true
Explanation: If we remove all non-alphanumeric characters and convert all uppercase letters to lowercase, string s will become “toohottohoot” which is a palindrome.*/
// Solution
public boolean sentencepallindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {

            if (!Character.isLetterOrDigit(str.charAt(i)))
                i++;
                //skip non alphabet chararcter from right side
            else if (!Character.isLetterOrDigit(str.charAt(j)))
                j--;

            else if (Character.toLowerCase(str.charAt(i))==Character.toLowerCase(str.charAt(j))) {
                i++;
                j--;
            }
            else return false;

        }
        return true;
    }
// Driver Code
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    System.out.println(sentencepallindrome(str) + " ");
}
