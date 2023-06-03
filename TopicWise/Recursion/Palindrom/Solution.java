
public class Solution {
    public static void main(String[] args) {
        System.out.println(check("1211", 0, 3));
    }

    public static boolean check(String n, int s, int e) {
        if (s > e) {
            return true;
        }
        if (n.charAt(s) != n.charAt(e)) {
            return false;
        } else {
            return true && check(n, s + 1, e - 1);
        }

    }
}
