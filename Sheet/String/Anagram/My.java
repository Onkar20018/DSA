/*
 *                                          APPROACH
 *              1. Here we are first checking if the length of the two strings are same or not
 *                 if not same then they cannot be ANAGRAM
 *              2. Now if same length then we will sort them ans compare if all are compared equal
 *                 means they are ANAGRAM else they are not.
 *             
 * TIP: Doing sorting on your own using temp is time consuming so use SORT method
 *       USED IN MY2.java 
 * TC= BigO(n^2)
 * SC = n 
 */



public class My {
    public static void main(String[] args) {
        String s = new String("anagram");
        String t = new String("nagaram");
        System.out.println(isAnagram(s, t));
    }
              // USING OWN SORT 
    public static boolean isAnagram(String s, String t) {
          if (s.length()!=t.length()) {
            return false;
          }
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        int i = 0;
        char temp;
        while (i < s.length()) {
            int j = i + 1;
            while (j < s.length()) {
                if (arr1[j] < arr1[i]) {
                    temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
                j++;
            }
            i++;
        }
        i=0;
        while (i < t.length()) {
            int j = i + 1;
            while (j < t.length()) {
                if (arr2[j] < arr2[i]) {
                    temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }
                j++;
            }
            i++;
        }
        System.out.println(arr1);
        System.out.println(arr2);
        i=0;
        while (i<s.length()) {
             if (arr1[i]!=arr2[i]) {
                   return false;
             }
             i++;
        }
            return true;
    }

}
