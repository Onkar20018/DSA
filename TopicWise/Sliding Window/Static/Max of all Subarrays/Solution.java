import java.util.*;

public class Solution {
      public static void main(String[] args) {
            int[] arr = { 4, 1, 3, 2 };
            int k = 3;
            int n = arr.length;
            ArrayList<Integer> ans = max_of_subarrays(arr, n, k);
            for (Integer integer : ans) {
                  System.out.print(integer + " ");
            }
      }

      public static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
            ArrayList<Integer> ans = new ArrayList<>();
            int start = 0;
            int end = 0;
            Deque<Integer> q = new LinkedList<>();

            while (end < n) {

                  while (q.isEmpty() == false && q.peekLast() < arr[end]) {  // TO Remove the Non IMP Elements
                        q.removeLast();
                  }

                  q.addLast(arr[end]);  // Add the Next Max Element in the Queue
                 
                  if (end - start + 1 == k) {   // WINDOWS HIT   
                        ans.add((Integer) q.peek());  // Save the ans 
                        if (q.peek() == arr[start]) {  // Removing while sliding thw window if condition is HIT
                              q.removeFirst();
                        }
                        start++;
                  }
                  end++;

            }
            return ans;

      }

}
