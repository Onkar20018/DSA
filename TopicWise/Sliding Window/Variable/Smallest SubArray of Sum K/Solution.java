import java.util.*;
// X+K = Sum
// X   = Sum-K
public class Solution {
    public static void main(String[] args) {
        int[] A = { 1, 12, 18, 13, 8, -2, 12, -1, -10, 6, 3, -14, 0, 4, 10, 0, -7, 3, -12, 18 };
        int K = 30;
        int N = A.length;
        System.out.println(lenOfLongSubarr(A, N, K));
    }

    public static int lenOfLongSubarr(int A[], int N, int K) {
       
        
            int sum = 0;
            int i = 0;
            int ans = Integer.MAX_VALUE;
            HashMap<Integer, Integer> map = new HashMap<>();
           
            while (i < N) {
                  sum = sum + A[i];
                if (sum==K) {                      //IF We find Sum with K 
                    ans=Math.min(ans, i+1);
                }
                else if (map.containsKey(sum - K)) {                // If we find diff as a Prev Sum somewhere
                    ans = Math.min(ans, i - map.get(sum - K) );
    
                } 
                    if (!map.containsKey(sum)) {   // To store the unique Sum
                        map.put(sum, i);
                    }
                
                i++;
            }
            return ans;
    }
}

