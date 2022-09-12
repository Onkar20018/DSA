/*
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.

////////////////////////////////////////////////////////////////////////////////////////////////////////

 *                     APPROACH
 *              1. First to get a string with only lettters and Numbers 
 *                 We Replace all letters other than a-zA-Z0-9 with ""
 *              2. NOw we will Create a Char  array 
 *              3. Now we will store the char array and make in all Lowercase cahracter
 *              4. Now we well compare from start and end if misses then NOT a Palindrome else YES 
 *              
 */
public class My {
    public static void main(String[] args) {
        // String myinput = new String("A Man, a plan, a canal: Panama");
        String myinput = new String("0p");
        System.out.println(isPalindrome(myinput));
    }

    public static boolean isPalindrome(String s) {

        String no_spl = s.replaceAll("[^a-zA-Z0-9]", ""); // TO REPLACE
        char[] new_array = no_spl.toCharArray(); // TO CONVERT STRING INTO CHAR ARRAY
              
        for (int i = 0; i < new_array.length; i++) {
            new_array[i] = Character.toLowerCase(new_array[i]); // TO CONVERT INTO LOWERCASE
        }

        for (int i = 0, j = new_array.length - 1; i < new_array.length / 2; i++) {
            if (new_array[i] != new_array[j]) { 
                return false; // // TO VERIFY IF PALINDROME OR NOT
            }
            j--;
        }
        return true;
    }
}
