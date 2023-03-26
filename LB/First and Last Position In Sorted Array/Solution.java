public class Solution {

    public static void main(String[] args) {
        int[] x = { 1, 2, 2,3,5};
        int target = 2;
        int[] ans = searchRange(x, target);
        System.out.println(ans[0] + " " + ans[1]);
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = occr1(nums, target);
        ans[1] = occr2(nums, target);
        return ans;
    }

    public static int occr1(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = start + (end - start) / 2;
        int index = -1;
        while (start <= end) {
            if (target == nums[mid]) {
                index = mid;
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }
        return index;
    }

    public static int occr2(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = start + (end - start) / 2;
        int index = -1;
        while (start <= end) {
            if (target == nums[mid]) {
                index = mid;
                start = mid + 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }
        return index;
    }
}