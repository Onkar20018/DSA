import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int n = arr.length;
        int s = 10;
        ArrayList<Integer> ans = subarraySum(arr, n, s);
        for (Integer integer : ans) {
            System.out.print(integer + " ");
        }
    }

    public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        int start = 0;
        int end = 0;
        int sum = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        // If the Sum is 0 then it is anyways not in the Array
        if (s == 0) {
            ans.add(-1);
            return ans;
        }

        while (end < n) {
            sum = sum + arr[end];
            // To Check if the Sum is matched
            if (sum == s) {
                ans.add(start + 1);
                ans.add(end + 1);
                return ans;
            } else if (sum < s) {    // If sum is less add
                end++;
            } else {
                while (sum > s) {        // Since Sum is greater than s , reduce till s is Larger
                    sum = sum - arr[start];
                    start++;
                }
                // Check again if Sum equals s
                if (sum == s) {
                    ans.add(start + 1);
                    ans.add(end + 1);
                    return ans;
                }
                end++;
            }
        }
        ans.add(-1);
        return ans;
    }
}
