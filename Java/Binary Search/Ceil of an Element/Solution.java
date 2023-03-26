
public class Solution {
    public static void main(String[] args) {
        int[] arr = { 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 88 };
        int n = arr.length;
        int x = 87;
        System.out.println(ceilingInSortedArray(n, x, arr));
    }

    public static int ceilingInSortedArray(int n, int target, int[] arr) {
        int ceil = -1;
        int start = 0;
        int end = n - 1;
        int mid = start + (end - start) / 2;
        while (start <= end) {
            if (arr[mid] == target) {
                return arr[mid];
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                ceil = arr[mid];  // Store the possible Ceil Value
                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }
        return ceil;
    }
}
