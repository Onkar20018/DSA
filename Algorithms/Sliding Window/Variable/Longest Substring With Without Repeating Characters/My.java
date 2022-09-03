/*
 *      PS: Given a string s, find the length of the longest substring without repeating characters.
 *            APPPROACH
 *      Here we are using Map again 
 *          But to know when a character is repeating in a window or to check if all characters in the windows are Unique or not we must represent it in a Mathe,atical way to check == or < or >
 *            IN pervios prpblem we had K as a number to comapare but here we dont have amy K
 *    So we know that all characters in the Windows must be diff than each other as if size of window
  is  4 then abcd must b there, now if a charcater is repating sych as aabc so size of windows is 4 but
    size of the map will be 3 , so we compare of the size of window is same as size of map or not
    if size of map is less we will remove character from previous till size of map equals length of window
             Once the windows size is hit with map size update the Length  
   */

import java.util.HashMap;

import javax.swing.LayoutStyle;

public class My {
    public static void main(String[] args) {
        String s = "bbbb";
        Tos(s);
    }

    public static void Tos(String s) {
        int start = 0;
        int end = 0;
        int length = s.length();
        int max = 0;
        HashMap<Character, Integer> mp = new HashMap<>();
        while (end < length) {                // Initialize
            char ch = s.charAt(end);
            int val = mp.getOrDefault(ch, 0); // to add value in Map
            mp.put(ch, val + 1);

            int latest = end - start + 1; // Store the length of Window
            if (mp.size() == latest) {   // Check if All Characters are Unique or Not
                max = Math.max(max, latest);
                end++;
            } else if (mp.size() < latest) { // To check if length is exceeding 
                while (mp.size() < latest) {  // TO make length of window less and remove all duplicate characters
                    char c = s.charAt(start);
                    int vals = mp.get(c);

                    mp.put(c, vals - 1);

                    if (mp.get(c) == 0) { /// To Remove the character from Map
                        mp.remove(c);
                    }
                    start++;
                    latest = end - start + 1; // Update window size after removinig start element
                }
                end++;
            }
        }
        System.out.println("MAX is : " + max);
    }
}
