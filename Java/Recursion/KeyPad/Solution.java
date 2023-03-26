import java.util.*;

public class Solution {
    public static void main(String[] args) {
        String s = "5";
        List<String> x = new ArrayList<>();
        x = letterCombinations(s);
        for (String sx : x) {
            System.out.print(sx + ",");
        }
    }

    public static List<String> letterCombinations(String digits) {
        int index = 0;
        List<String> ans = new ArrayList<>();
        String output = "";
        if (digits.length() == 0) {
            return ans;
        }
        String[] map = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        keypad(digits, ans, output, map, index);
        return ans;
    }

    public static void keypad(String digits, List<String> ans, String output, String[] map, int index) {
        // Base Case
        if (index >= digits.length()) {
            ans.add(output);
            return;
        }

        // Take
        int number = digits.charAt(index) - '0';
        String value = map[number];
        for (int i = 0; i < value.length(); i++) {
            output = output + value.charAt(i);
            keypad(digits, ans, output, map, index + 1);
            output = output.substring(0, output.length() - 1);
        }
    }
}