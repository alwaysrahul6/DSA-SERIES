package STRINGS;
// Better Compression of String
public class String_Compression_of_String {
    static int compress(char[] character){
        int idx = 0;
        int n = character.length;
        int i =0;
        while (i < character.length){
            int count  = 0;
            char ch = character[i];
            while (i < character.length && character[i] == ch){
                count++;
                i++;
            }
            character[idx++] = ch;
            if (count > 1){
                String num = Integer.toString(count);
                for (char chh : num.toCharArray()){
                    character[idx++] = chh;
                }
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        char[] ch = {'a', 'a', 'b', 'b', 'c', 'd'};

        int length = compress(ch);  // Call the method

        System.out.println("Compressed Length: " + length);
        System.out.print("Compressed Characters: ");
        for (int i = 0; i < length; i++) {
            System.out.print(ch[i] + " ");
        }
    }
}
