import java.util.*;
/*
 * TC=(n*n)
 * SC=1
 */
public class Solution2 {
    public static void main(String[] args) {
        int[] arr = { 12, 8, 2, 11, 5, 14, 10 };
        int n = arr.length;
        System.out.println(countTriplet(arr, n));
    }

    public static int countTriplet(int[] arr, int n) {
        // Save each Value in a Set so tht it is not repeating
        Arrays.sort(arr);
//     {2,5,8,10,11,12,14}
        int count = 0;
        // Check if the sum is present in the Set or Not
        int s = 0;
        int e = n;
        for (int i = n - 1; i > 1; i--) {
            s = 0;
            e = i - 1;
            while (s < e) {
                // When Combination is Detected
                if (arr[s] + arr[e] == arr[i]) {
                    count++;
                    s++;
                    e--;
                    // When combination is less Increase the start pointer
                } else if (arr[s] + arr[e] < arr[i]) {
                    s++;
                    // When the combination is Greater Increase the End Pointer
                } else {
                    e--;
                }
            }
        }

        return count;
    }

}
