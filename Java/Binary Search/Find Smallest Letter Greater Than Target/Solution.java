
public class Solution {
    public static void main(String[] args) {
        char[] l = { 'c', 'd', 'f', 'x' };
        char target = 'y';
        System.out.println(nextGreatestLetter(l, target));
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int ch = target;
        int s = 0;
        int e = letters.length - 1;
        char ans = letters[0];
        int mid = s + (e - s) / 2;
        if (ch == 'z') {
            return ans;
        }
        while (s <= e) {

            if ((int) letters[mid] <= (int) target) {
                s = mid + 1;
            } else {
                ans = letters[mid];  // Save possible Character (CEIL VALUE)
                e = mid - 1;
            }
            mid = s + (e - s) / 2;
        }
        return ans;
    } 
} 
