
public class Solution {
    public static void main(String[] args) {
        int[] x = { 1, 3, 5, 6 };
        int target = -1;
        System.out.println(searchInsert(x, target));
    }

    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = start + (end - start) / 2;
        while (start <= end) {
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                if (mid == 0) {
                    return 0;
                }
                if (nums[mid - 1] < target) {
                    return mid;
                } else {
                    end = end - 1;
                }
            } else if (nums[mid] < target) {
                if (mid == nums.length - 1) {
                    return nums.length;
                }
                if (nums[mid + 1] > target) {
                    return mid + 1;
                } else {
                    start = start + 1;
                }
            }
            mid = start + (end - start) / 2;
        }
        return 0;
    }
}
