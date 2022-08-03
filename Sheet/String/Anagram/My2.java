/*
 *                                          APPROACH
 *              1. Here we are first checking if the length of the two strings are same or not
 *                 if not same then they cannot be ANAGRAM
 *              2. Now if same length then we will sort them ans compare if all are compared equal
 *                 means they are ANAGRAM else they are not.
 *             
 *  
 * TC= BigO(n)
 * SC = n 
 */



import java.util.Arrays;

public class My2 {

    public static void main(String[] args) {
        String s = new String("anagram");
        String t = new String("nagaram");
        System.out.println(isAnagram(s, t));
        
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0;
        while (i < arr1.length) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
