
public class Solution {
    public static void main(String[] args) {
        char[] arr = { 'b', 'f', 'g', 'h' };
        char ch = 'a';
        System.out.println(find(arr, ch));

    }

    public static int find(char[] arr, char ch) {
        int s = 0;
        int e = arr.length - 1;
        int mid = 0;
        int ans = -1;
        while (s <= e) {
            mid = s + (e - s) / 2;
            if ((int) arr[mid] <= (int) ch) {
                s = mid + 1;
            } else {
                ans = mid;             // Store the Possible ans(Greater than Letter)
                e = mid - 1;
            }
        }
        return ans;
    }
}
