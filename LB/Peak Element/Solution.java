
public class Solution {
    public static void main(String[] args) {
        int[] x = { 18,29,38,59,98,100,99,98,90};
        System.out.println(peakIndexInMountainArray(x));
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;
        int ans = 0;
        while (start <= end) {
            if (mid>0 && arr[mid] < arr[mid - 1]) {
                end = mid - 1;
            } else if (mid<=arr.length && arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                ans = mid;
                break;
            }
            mid = start + (end - start) / 2;
        }
        return ans;
    }
}
