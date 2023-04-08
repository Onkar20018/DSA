import java.util.HashSet;
import java.util.Set;

/*
 *     TC: BigO(N*N)
 *     SC: BigO(N)
 */
public class Solution {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 3, 2 };
        int n = arr.length;
        System.out.println(countTriplet(arr, n));
    }

    public static int countTriplet(int[] arr, int n) {
        // Save each Value in a Set so tht it is not repeating
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int count = 0;
        // Check if the sum is present in the Set or Not
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                if (set.contains(sum)) {
                    count++;
                }
            }
        }
        return count;
    }

}