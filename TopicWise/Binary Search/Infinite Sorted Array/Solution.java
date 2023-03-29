
public class Solution {
    public static void main(String[] args) {
        int s = 0;  // Start with 0
        int e = s + 1;  // Start with 1
        int mid = s + (e - s) / 2;
        int key=16;
        while (e <= key) {
            s = e;
            e = e * 2;  // Keep updating tilll the Key is in between s and e
        }
        while (s <= e) {
            mid = s + (e - s) / 2;
            if (mid == key) {
                System.out.println(mid);
                break;
            } else if (mid < key) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

    }
}
