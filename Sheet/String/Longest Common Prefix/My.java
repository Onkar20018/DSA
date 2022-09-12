/*
 *  Q:Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".
 * 
 * Input: strs = ["flower","flow","flight"]
Output: "fl"

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
//////////////////////////////////////////////////////////////////////////////////////////////
                APPROACH
                

*/


import java.util.Arrays;

public class My {
    public static void main(String[] args) {
        String[] s = { "ab", "a" };
        System.out.println(longestCommonPrefix(s));

    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        String x = "";
        char[] first = strs[0].toCharArray();
        for (int i = 0; i < first.length; i++) {
            boolean match = true;
            for (int j = 1; j < strs.length; j++) {
                System.out.println("In at i=" + i + " j =" + j );
                String check = strs[j];
                if (check.length() < i || check.charAt(i) != first[i]) {
                    match = false;
                }
            }
            if (match) {
                x = x + first[i];
            } else {
                match = false;
                break;
            }
        }
        return x;
    }

}
