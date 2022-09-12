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
                WITHOUT USING LINKED LIST 
                
                 Here , since we know that we have to find a common part from starting
                 We will take the first string in the array and put it in Prefix
                 now we will update or Prefix 
                 Logic here is that Our Prefix should be there in every String 
                 if it is not there we will cut it and check if it manages to fit in
                 When it fits we check with the successors.


*/

import java.util.Arrays;

public class My2 {
    public static void main(String[] args) {
        String[] s = { "flow", "flower" };
        System.out.println(longestCommonPrefix(s));

    }

    public static String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        if (len == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }

}
