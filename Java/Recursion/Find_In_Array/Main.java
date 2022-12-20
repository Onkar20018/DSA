
public class Main {
    public static int func(int arr[], int target, int n) {
        if (n == arr.length) {
            return -1;
        } else if (arr[n] == target) {
            return n;
        } else {
            return func(arr, target, n + 1);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 6, 3, 8 };
        int target = 6;
        System.out.println(func(arr, target, 0));
    }
}
