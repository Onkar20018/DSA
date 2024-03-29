/*
 *        Q: Convert a sentence into its equivalent mobile numeric keypad sequence
 * Input : GEEKSFORGEEKS
Output : 4333355777733366677743333557777
For obtaining a number, we need to press a
number corresponding to that character for 
number of times equal to position of the 
character. For example, for character C, 
we press number 2 three times and accordingly.

Input : HELLO WORLD
Output : 4433555555666096667775553
////////////////////////////////////////////////////////////////////////////
                            APPROACH
                            
 * 
 */
public class My {
    public static void main(String[] args) {
        String S = new String("AE");
        System.out.println(printSequence(S));
    }

    public static String printSequence(String S) {
        String[] ints = { "2", "22", "222", "3", "33", "333", "4", "44", "444", "5", "55", "555", "6", "66", "666", "7",
                "77", "777", "7777", "8", "88", "888", "9", "99", "999", "9999" };
        char[] ch = S.toCharArray();
        String s = "";
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == ' ') {
                s = s + "0";
            } else {
                int index = ch[i] - 'A';
                s = s + ints[index];
            }
        }
        return s;
    }

}
