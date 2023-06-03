public class Solution {
    
    public static void main(String[] args) {
        System.out.println(fib(7));
    }

    public static int fib(int n) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        int sum = 0;
        sum = sum + fib(n - 1) + fib(n - 2);
        return sum;
    }
}
