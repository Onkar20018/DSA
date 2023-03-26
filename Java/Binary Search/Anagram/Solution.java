class Solution {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "ccccbbbbaaaa";
        System.out.println(checkInclusion(s1, s2));

    }

    public static boolean checkInclusion(String s1, String s2) {
        int s1_value = 0;
        for (int i = 0; i < s1.length(); i++) {
            s1_value = s1_value + s1.charAt(i);
        }
        int start = 0;
        int end = 0;
        int k = s1.length();
        int val = 0;
        int length = s2.length();
        while (end <= length) {
            val = val + s2.charAt(end);
            if (k > end - start + 1) {
                end++;
            } else if (k == end - start + 1) {
                if (s1_value == val) {
                    return true;
                } else {
                    val = val - s2.charAt(start);
                    start++;
                    end++;
                }
            }
        }
        return false;

    }
}