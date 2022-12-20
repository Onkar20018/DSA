import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) {
        String str = "A1 person3 good2";
        System.out.println(sentenceSorting(str));
    }

    public static String sentenceSorting(String str) {
        HashMap<Integer, String> map = new HashMap<>();
        int key = str.charAt(str.length() - 1);
        int Key_Count = 1;
        for (int i = str.length() - 2; i >= 0; i--) {
            if (str.charAt(i) == ' ') {
                key = str.charAt(i - 1);
                i--;
                Key_Count++;
            } else {
                if (map.containsKey(key)) {
                    map.put(key, map.get(key) + str.charAt(i));
                    System.out.println(map.get(key) + " for i=" + i + " key=" + key);
                    // System.out.println(key);
                } else {
                    String x = "";
                    map.put(key, x + str.charAt(i));
                }
            }
        }
        String ans = "";
        int i = 50;
        System.out.println(Key_Count);
        while (i <=50+ Key_Count) {
            ans = ans + map.get(i);
            System.out.println(map.get(i));
            i++;
        }
        System.out.println(ans);
        return ans;
    }
}
