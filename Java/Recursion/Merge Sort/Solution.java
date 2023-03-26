public class Solution {
    public static void main(String[] args) {
        int[] arr = { 2, 30, 4, 101, 61, 90 };
        System.out.print("Unsorted Array :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        log(arr, 0, arr.length - 1);
        System.out.print("\nSorted Array   :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void log(int[] arr, int s, int e) {
        if (s >= e) {

            return;
        }
        int mid = s + (e - s) / 2;
        // left
        log(arr, s, mid);
        // right
        log(arr, mid + 1, e);
        conqure(arr, s, e);
    }

    public static void conqure(int[] arr, int s, int e) {

        int mid = s + (e - s) / 2;
        int[] ans = new int[e - s + 1];
        int index = 0;
        int le = s;
        int ri = mid + 1;
        while (le <= mid && ri <= e) {
            if (arr[le] <= arr[ri]) {
                ans[index++] = arr[le++];
            } else {
                ans[index++] = arr[ri++];
            }
        }
        while (le <= mid) {
            ans[index++] = arr[le++];
        }
        while (ri <= e) {
            ans[index++] = arr[ri++];
        }
        // MISTEP start main arrays index with start or s
        for (int i = 0, j = s; i < ans.length; i++) {
            arr[j++] = ans[i];

        }

    }
}
