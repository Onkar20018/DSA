
/* 
    Q:Given a string s, find the length of the longest substring without repeating characters.
    Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
 *             Here, We will use two pointer one Left from start and one Right from End
               Each iteration we will check if character at Right is already there is Map or not
                If the character at right is there and if it is After the index of Left then it means
                 it is repeated so now we will Update the Left and store the maz LEngth 
                 Length is stores using Max fucntion and LEft is also updated using MAx function
 */
import java.util.HashMap;

public class My3 {
    public static void main(String[] args) {
        String s = new String("absabbxvrs");
        System.out.println("Max Length is :" + check(s));
    }

    public static int check(String s) {
        HashMap<Character, Integer> ch = new HashMap<>();
        int left = 0, right = 0, len = 0;
        int n = s.length();
        while (right < n) {

            if (ch.containsKey(s.charAt(right))) {
                left = Math.max(ch.get(s.charAt(right)) + 1, left);

            }
            ch.put(s.charAt(right), right);
            len = Math.max(len, right - left + 1);
            right++;
        }

        return len;

    }
}
