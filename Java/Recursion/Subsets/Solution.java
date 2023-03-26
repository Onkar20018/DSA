import java.util.*;

public class Solution {
    public static void main(String[] args) {
        List<List<Integer>> ans = new ArrayList<>();
        int[] nums = { 1, 2, 3 };
        ans = subsets(nums);
        for (List<Integer> i : ans) {
            System.out.print(i + ",");
        }
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> output = new ArrayList<>();
        int index = 0;
        predict(nums, ans, output, index);
        return ans;

    }

    public static void predict(int[] nums, List<List<Integer>> ans, List<Integer> output, int index) {
        // Base Case
        if (index == nums.length) {
            ans.add(new ArrayList<Integer>(output));
            return;
        }
        // Take
        output.add(nums[index]);
        predict(nums, ans, output, index + 1);
        output.remove(output.size() - 1);
        // Not Take
        predict(nums, ans, output, index + 1);

    }
}