import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        int k = 3;
        int n = 5;
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(-2);
        arr.add(3);
        arr.add(1);
        // {1,2,3,-2,3,1} ans=6

        System.out.println(maximumSumSubarray(k, arr, n));
    }

    public static long maximumSumSubarray(int K, ArrayList<Integer> Arr, int N) {

        int i = 0;
        int j = 0;
        long sum = 0;
        long max = 0;
        while (j < N) {
            sum = sum + Arr.get(j);     // Repeatative Operation Always
            if (j - i + 1 < K) {   //Checking the Condition
                j++;
            } else {      // Finding the Window 
                max = Math.max(max, sum);
                sum = sum - Arr.get(i);
                i++;
                j++;
            }
        }
        return  max; // Final Step
    }
}