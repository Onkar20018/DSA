import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        String s = "afasdgvfyweof";
        System.out.println(s.length());
        System.out.println(longestSubstrDistinctChars("afasdgvfyweof"));
    }

    public static int longestSubstrDistinctChars(String S) {
        int s = 0;
        int e = 0;
        int ans = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while (e < S.length()) {
            if (map.containsKey(S.charAt(e))) {
                while (map.containsKey(S.charAt(e))) {
                    map.remove(S.charAt(s++));
                }
                map.put(S.charAt(e), 1);
                ans = Math.max(ans, map.size());         
                e++;
            } else {
                map.put(S.charAt(e), 1);
                ans = Math.max(ans, map.size());
              //  System.out.println(s + " " + e + " At Else " + (e - s) + " ans=" + ans + " map=" + map.size());
                e++;
            }
        }
        return ans;
    }
}
