import java.util.HashMap;

public class My3 {
    public static void main(String[] args) {
        String s = new String("absab");
        System.out.println(check(s));
    }

    public static int check(String s) {
        HashMap<Character, Integer> ch = new HashMap<>();
        int left = 0, right = 0, len = 0;
        int n = s.length();
        while (right < n) {
            System.out.println(right);
            if (ch.containsKey(s.charAt(right))) {
                left = Math.max(ch.get(s.charAt(right)) + 1, left);
                System.out.println("in " + len);
            }
            ch.put(s.charAt(right), right);
            len = Math.max(len, right - left + 1);
            right++;
        }
        
        return len;

    }
}
