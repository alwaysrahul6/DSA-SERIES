package RECCURSION;
public class RECCURSION_KEYPAD_COMBINATION {
    static void keypad(String dig , String []kp , String res){
       if (dig.isEmpty()){
           System.out.print(res + " ");
           return;
       }
       int currName = dig.charAt(0) - '0';
       String currChoice  = kp[currName];
       for (int i = 0;i<currChoice.length();i++){
           keypad(dig.substring(1),kp,res + currChoice.charAt(i));
       }
    }

    public static void main(String[] args) {
        String str = "72485";
        String[] kp  = {" "," ","abc","def","ghi " , "jkl", "mno", "pqrs", "tuv","wxyz"};
        keypad(str,kp," ");
    }


}
