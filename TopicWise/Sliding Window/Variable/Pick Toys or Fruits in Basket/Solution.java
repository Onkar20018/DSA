import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[] a = { 0 };
        // int[] a = { 1, 1 };
        System.out.println(totalFruit(a));
    }

    public static int totalFruit(int[] fruits) {
        int end = 0;
        int start = 0;
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while (end < fruits.length) {
            map.put(fruits[end], map.getOrDefault(fruits[end], 0) + 1);
            if (map.size() == 2) {
                ans = Math.max(ans, end - start + 1);
            } else if (map.size() > 2) {
                while (map.size() > 2) {
                    map.put(fruits[start], map.get(fruits[start]) - 1);
                    if (map.get(fruits[start]) == 0) {
                        map.remove(fruits[start]);
                    }
                    start++;
                }
            }
            end++;
        }
        if (map.size() < 2) {
            return fruits.length;
        }
        return ans;
    }
}