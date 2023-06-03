public class O {
    public static void main(String[] args) {
        int[] A = { 2, 2, 2, 2, 2 };

        int first = 0;
        int last = 0;
        System.out.println(A.length);
                while (last < A.length) {
            if (A[first] == A[last]) {
                System.out.println(last);
                last++;
            }
            else if(A[first] != A[last]) {
                A[first] = A[last - 1];
                first++;
                A[first] = A[last];
                last++;
            }
        }
        System.out.println(first);
    }

    // public static int remove_duplicate(int A[], int N) {
    // int first = 0;
    // int last = 0;
    // int count = 1;
    // System.out.print(A.length);
    // while (last < N) {
    // if (A[first] == A[last]) {
    // System.out.println(last);
    // last++;
    // }
    // if (A[first] != A[last]) {
    // A[first] = A[last - 1];
    // first++;
    // A[first] = A[last];
    // last++;
    // count++;
    // }
    // }
    // return count;

    // }
}
