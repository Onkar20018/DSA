/*
 *   PS:Given a string you need to print the size of the longest possible substring that has exactly K unique characters. If there is no possible substring then print -1.
 *     
 *                   APPROACH
 *          Here we must use map as to keep a track on how many occurances of characters are there
 *            if an occurance of a character becomes 0 we remove it from our Map
 * 
 *       The basic idea here is to update or end each time till the size of map reaches the number of
 *      unique characcters , when that condition is hit we update pf our windows length
 *     Now , when the size of map exceeds the k we start to remove elements from start pointer till
 *     the size of the map is reduced to k
 */

import java.util.HashMap;

public class My {
    public static void main(String[] args) {
        String s = new String("abab");

        int k = 2;
        ToS(s, k);

    }

    public static void ToS(String s, int k) {
        int start = 0;
        int end = 0;
        int ans = 0;

        char[] ch = s.toCharArray();
        HashMap<Character, Integer> mp = new HashMap<>();
        while (end < ch.length) { // To Iterate through array

            int val = mp.getOrDefault(ch[end], 0); // If value exist take it else put 0
            mp.put(ch[end], val + 1); // Update map
            if (mp.size() < k) { // Condition to check if number of characters in map as less than required l
                end++;
            } else if (mp.size() == k) { // If the Size is Hit , Perform actions
                System.out.println("Size is Hit");
                ans = Math.max(ans, end - start + 1); // Update Ans and move end
                System.out.println("Size now is :" + ans + " at end=" + end);
                end++;
            } else if (mp.size() > k) { // If size of map Exceeds
                while (mp.size() > k) { // Till size of map is exceeding
                    int x = mp.get(ch[start]);
                    mp.put(ch[start], x - 1);
                    if (mp.get(ch[start]) == 0) {
                        System.out.println("Character " + ch[start] + " is removed at end=" + end);
                        mp.remove(ch[start]); // Of the character in map is not there anymore in our SLiding Window ,
                                              // then we must remove it

                    }
                    start++;
                }
                end++;
            }
        }

        System.out.println("The Max length is :" + ans);
    }
}
