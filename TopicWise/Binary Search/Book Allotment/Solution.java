
public class Solution {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int k = 3;
        System.out.println(ans(arr, k));
    }

    public static int ans(int[] arr, int k) {
        if (k > arr.length) {
            return -1;
        }
        int s = 0;
        int e = 0;
        int max = 0;
        int sum = 0;
        int index = 0;
        int ans = -1;
        // This Loop is to get the max and the Total Sum so tht we can have the Range
        while (index < arr.length) {
            sum = sum + arr[index];
            max = Math.max(max, arr[index]);
            index++;
        }
        // System.out.println(max + " " + sum);
        s = max;
        e = sum;

        while (s <= e) {
            int mid = (s + e) / 2;
            if (isValid(arr, k, mid)) { // To Check if the Max number which is MID is valid or Not
                ans = mid;
                // System.out.println(ans);
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;

    }

    public static boolean isValid(int[] arr, int k, int mid) {
        int student = 1;
        int index = 0;
        int sum = 0;
        while (index < arr.length) {
            // To check if the sum is not exceeding the mid
            if (sum + arr[index] <= mid) {
                sum = sum + arr[index++];
            }
            // When sum exceeds , we create a New Student and start the sum with the books
            // given to him
            else {
                student++;
                // System.out.println(sum);
                if (student > k) {
                    return false;
                }
                // Start sum with books given to him
                sum = arr[index++];
            }
        }
        return true;
    }
}
