public class BS {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 2, 2, 3 };
        System.out.println(count(arr, 7, 2));
    }

    public static int count(int[] arr, int n, int x) {
        int s = 0;
        int e = n - 1;
        int f = -1;
        int l = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == x) {
                f = fr(arr, mid, x);
                l = ls(arr, mid, x);
                System.out.println(f + "f");
                System.out.println(l + "l");
                return l - f + 1;
            }
            if (arr[mid] < x) {
                s = mid + 1;
            }
            if (arr[mid] > x) {
                e = mid - 1;
            }

        }
        return -1;

    }

    public static int fr(int[] arr, int n, int x) {
        // System.err.println(n + " u");
        int f = n;
        while (n != -1 && arr[n] == x) {
            f = n--;
            // System.out.println("U");
        }
        return f;
    }

    public static int ls(int[] arr, int n, int x) {
        int l = n;
        // System.out.println(n + " v");
        while (n != arr.length && arr[n] == x) {
            l = n++;
            // System.out.println("V");
        }
        return l;
    }
}