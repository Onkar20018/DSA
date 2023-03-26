import java.util.*;

class Solution {
    public static void main(String[] args) {
        System.out.println(longestkSubstr("aabaacddfpl", 2));
    }

    public static int longestkSubstr(String s, int k) {
        int ans = -1;
        int start = 0;
        int end = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while (end < s.length()) {
            map.put(s.charAt(end), map.getOrDefault(s.charAt(end), 0) + 1);
            if (map.size() < k) {
                // System.out.println("Size <2 " + map.size());
                end++;
            } else if (map.size() == k) {
                // System.out.println("Size == 2 " + map.size());
                ans = Math.max(ans, end - start + 1);
                end++;
            } else if (map.size() > k) {
                // System.out.println("Size > 2 " + map.size());
                while (map.size() > k) {
                    map.put(s.charAt(start), map.get(s.charAt(start)) - 1);
                    if (map.get(s.charAt(start)) == 0) {
                        map.remove(s.charAt(start));
                    }
                    start++;
                }
                ans = Math.max(ans, end - start + 1);
                // System.out.println("Size >2 Now ==2 ans = " + ans + " " + map.size());
                end++;
            }
        }
        return ans;
    }
}