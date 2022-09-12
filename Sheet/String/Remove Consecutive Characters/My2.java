/*       
   Q: Given a string S. For each index i(1<=i<=N-1), erase it if s[i] is equal to s[i-1] in the string.
   Input:
S = aabb
Output:  ab 

Input:
S = aabaa
Output:  aba

///////////////////////////////////////////////////////////////////////////////////////////////////

 *                      HERE ,
 *                      Since we only need the Non repeating characther, no matter how much are repeated in a single go ,we need only one so we will take the last one and continue for other . Now at last element only its succesor will not match so we will add that to String
 * 
 */
public class My2 {
    public static void main(String[] args) {
        String s = new String("aabsss");
        System.out.println(removeConsecutiveCharacter(s));
    }

    public static String removeConsecutiveCharacter(String s) {
        String ne = "";
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                continue;
            } else {
                ne = ne + s.charAt(i);
            }
        }
        return ne;
    }
}
