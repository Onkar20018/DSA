
public class Solution {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println("Sum is=" + sum(arr, arr.length - 1));
    }

    public static int sum(int[] arr, int n) {

        if (n == 0) {
            return arr[n];
        }
        return arr[n] + sum(arr, n - 1);
    }
}
