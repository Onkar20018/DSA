import java.util.LinkedList;
import java.util.Queue;

class Compute {
    public static void main(String[] args) {
        long[] A = { 12, -1, -7, 8, -15, 30, 16, 28 };
        int N = 8;
        int k = 3;
        long[] ans = printFirstNegativeInteger(A, N, k);
        System.out.println();
        for (long l : ans) {
            System.out.print(l + " ");
        }
    }

    public static long[] printFirstNegativeInteger(long A[], int N, int K) {
        long[] ans = new long[N - K + 1];
        int start = 0;
        int end = 0;
        int index = 0;
        Queue<Long> q = new LinkedList<>();
        while (end < N) {
            if (A[end] < 0) {
                System.out.println("Added " + A[end]);
                q.add(A[end]);
            }
            if (end - start + 1 < K) {
                end++;
            }

            else if (end - start + 1 == K) {
                if (q.isEmpty() == true) {
                    ans[index++] = 0;
                    start++;
                    end++;
                } else {
                    ans[index++] = q.peek();
                    if (q.peek() == A[start]) {
                        System.out.println("Removed " + q.peek());
                        q.remove();
                        start++;
                        end++;
                    } else {
                        end++;
                        start++;
                    }
                }
            }
        }
        return ans;
    }
}