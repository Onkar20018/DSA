/*
    Time Complexity: O(log(n))
    Space Complexity: O(1)

    Where 'n' is the number of elements
*/

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int n = 6;
        ArrayList<Integer> x = new ArrayList<>();
        x.add(1);
        x.add(6);
        x.add(4);
        x.add(3);
        x.add(2);
        x.add(1);
        System.out.println(findPeak(n, x));
        

    }

    public static int findPeak(int n, ArrayList<Integer> arr) {

        // Single element
        if (n == 1) {
            return arr.get(0);
        }
        // Strictly descreasing
        if (arr.get(0) >= arr.get(1)) {
            return arr.get(0);
        }
        // Strictly increasing
        if (arr.get(n - 1) >= arr.get(n - 2)) {
            return arr.get(n - 1);
        }
        // Binary search
        int l = 1, r = n - 2;
        int ans = l;
        while (l <= r) {
            int middle = (l + r) / 2;

            if (arr.get(middle) < arr.get(middle - 1)) {
                // Search the left half
                r = middle - 1;
            } else if (arr.get(middle) < arr.get(middle + 1)) {
                // Search the right half
                l = middle + 1;
            } else {
                // Ans found
                ans = middle;
                break;
            }
        }
        return arr.get(ans);

    }

};