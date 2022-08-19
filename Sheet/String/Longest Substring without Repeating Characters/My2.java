public class My2 {
    public static void main(String[] args) {
        String s = "busvutpwmu";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        char[] ch = s.toCharArray();
        int len = 0;
        for (int i = 0; i < ch.length; i++) { // TO Convert to Uppper case
            ch[i] = Character.toUpperCase(ch[i]);
        }
        int[] arr = new int[200]; // To Store Duplicates
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
        int max = 0;
        for (int i = 0; i < ch.length; i++) { // To Check from left
            int check = ch[i];
            if (arr[check] == 1) {
                if (ch[i - 1] == ch[i]) {
                    len = 0;
                    arr[check]--;
                    i--;
                } else {
                    len = 1;
                    arr[check]--;
                    i = i - 1;
                }

            } else {
                arr[check] = arr[check] + 1;
                len++;
                System.out.println("In for " + ch[i] + " ken is " + len);
                max = Math.max(max, len);
            }

        }
        len = 0;
        for (int i = 0; i < arr.length; i++) { // To Check from left Middle
            int check = ch[i];
            if (arr[check] == 1) {
                if (ch[i - 1] == ch[i]) {
                    len = 0;
                    arr[check]--;
                    i--;
                } else {
                    len = 1;
                    arr[check]--;
                    i = i - 1;
                }

            } else {
                arr[check] = arr[check] + 1;
                len++;
                System.out.println("In for " + ch[i] + " ken is " + len);
                max = Math.max(max, len);
            }

        }
        

        
        return max;
    }
}
