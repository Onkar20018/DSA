public class Main {
    public static boolean func(int arr[], int n) {
        if (n == arr.length-1) {
            return true;
        } else {
            return arr[n] < arr[n + 1] && func(arr, n + 1);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2,6, 3, 8 };
        System.out.println(func(arr, 0));
    }
}
