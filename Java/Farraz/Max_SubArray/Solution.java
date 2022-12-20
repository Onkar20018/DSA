
public class Solution {
    public static void main(String[] args) {
        int[] a = { -7 ,-8, -16, -4, -8, -5, -7, -11, -10, -12 ,-4 ,-6, -4, -16, -10 };
        System.out.print(maxSubarraySum(a, 15));
    }

    public static long maxSubarraySum(int[] arr, int n) {
        long check = 0;
        long ans = 0;
        for (int i = 0; i < n; i++) {
             check = Math.max(arr[i],check+arr[i]);
             ans   = Math.max(check,ans);
        }
       
        return ans;
    }

}
