import java.util.*;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        int m = 4;
        arr.add(5);
        arr.add(17);
        arr.add(100);
        arr.add(11);
        int n = arr.size();
        System.out.println(allocateBooks(arr, n, m));
    }

    public static int allocateBooks(ArrayList<Integer> arr, int n, int m) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < n; i++) {
            end = end + arr.get(i);
            if (arr.get(i) > start) {
                start = arr.get(i);
            }
        }
        int ans = -1;
        int mid = start + (end - start) / 2;
        while (start <= end) {
            if (isvalid(mid, m, arr)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = start + (end - start) / 2;
        }
        return ans;
    }

    public static boolean isvalid(int mid, int m, ArrayList<Integer> arr) {
        int book = 1;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum = sum + arr.get(i);
            if (sum > mid) {
                book++;     
                sum = arr.get(i);
            }
        }
        if (book > m) {
                 return false;
        }
        return true;
    }
}
